package Nodes;

public class Var implements Node {
    private final String name;

    public Var(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getStringRepresentation() {
        System.out.print(name);
    }
}
