package csci305.javalab;

public abstract class Element {
    private String name;  //name of element

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Outcome compareTo(Element other);
}