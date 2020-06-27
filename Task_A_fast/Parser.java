import Nodes.*;

public class Parser {
    public Parser(String expression) {
        this.expression = expression;
        this.position = 0;
    }

    public void startParse() {
        root = impl();
    }

    public Node getRoot() {
        return root;
    }

    private int getFinishOfVar(int start) {
        int lastIndex = start;
        while(lastIndex < expression.length() && (
                expression.charAt(lastIndex) <= 'Z' && expression.charAt(lastIndex) >= 'A' ||
                expression.charAt(lastIndex) <= '9' && expression.charAt(lastIndex) >= '0' ||
                expression.charAt(lastIndex) == '\'')) {
            ++lastIndex;
        }
        return lastIndex;
    }

    private void nextToken() {
        if (position >= expression.length()) {
            lastToken = Tokens.END;
        } else {
            char currentChar = expression.charAt(position);
            switch (currentChar) {
                case '&' : {
                    lastToken = Tokens.AND;
                    break;
                }
                case '|' : {
                    lastToken = Tokens.OR;
                    break;
                }
                case '!' : {
                    lastToken = Tokens.NOT;
                    break;
                }
                case '(' : {
                    lastToken = Tokens.LB;
                    break;
                }
                case ')' : {
                    lastToken = Tokens.RB;
                    break;
                }
                case '-' : {
                    lastToken = Tokens.IMPL;
                    ++position;
                    break;
                }
                default: {
                    lastToken = Tokens.VAR;
                    int start = position;
                    int end = getFinishOfVar(position);
                    lastVar = expression.substring(start, end);
                    position = end - 1;
                }
            }
            ++position;
        }
    }

    private Node node() {
        nextToken();
        Node result = null;

        switch (lastToken) {
            case VAR : {
                result = new Var(lastVar);
                nextToken();
                break;
            }
            case LB : {
                result = impl();
                nextToken();
                break;
            }
            case NOT : {
                result = new Not(node());
                break;
            }
        }
        return result;
    }

    private Node and() {
        Node result = node();

        while (lastToken == Tokens.AND) {
            result = new And(result, node());
        }

        return result;
    }

    private Node or() {
        Node result = and();

        while (lastToken == Tokens.OR) {
            result = new Or(result, and());
        }

        return result;
    }

    private Node impl() {
        Node result = or();
        while (lastToken == Tokens.IMPL) {
            result = new Implication(result, impl());
        }

        return result;
    }

    private final String expression;
    private int position;
    private Node root;

    private String lastVar;
    private Tokens lastToken;
}
