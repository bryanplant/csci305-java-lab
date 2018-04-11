package csci305.javalab;

//serves as a parent to the 5 element classes
public abstract class Element {
    private String name;  //name of element

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //method to create the outcome based on the comparison of two elements
    public abstract Outcome compareTo(Element other);
}