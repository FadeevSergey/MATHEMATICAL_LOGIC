package Nodes;

public class Implication implements Node {
    private final Node leftNode;
    private final Node rightNode;

    public Implication(Node leftNode, Node rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public void getStringRepresentation() {
        System.out.print("(->,");
        leftNode.getStringRepresentation();
        System.out.print(",");
        rightNode.getStringRepresentation();
        System.out.print(")");
    }
}
