package scrap.heap.refactor;

public enum  Color {

    BROWN("brown"),
    YELLOW("yellow"),
    RED("red"),
    BLUE("blue");

    String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
