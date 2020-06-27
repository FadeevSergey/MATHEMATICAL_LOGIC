package Nodes;

public class Not implements Node {
    private final Node node;

    public Not(Node node) {
        this.node = node;
    }

    @Override
    public void getStringRepresentation() {
        System.out.print("(!");
        node.getStringRepresentation();
        System.out.print(")");
    }
}
