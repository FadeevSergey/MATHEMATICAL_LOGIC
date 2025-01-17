package Nodes;

public class And implements Node {
    private final Node leftNode;
    private final Node rightNode;

    public And(Node leftNode, Node rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public void getStringRepresentation() {
        System.out.print("(&,");
        leftNode.getStringRepresentation();
        System.out.print(",");
        rightNode.getStringRepresentation();
        System.out.print(")");
    }
}