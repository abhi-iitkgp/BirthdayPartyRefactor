package scrap.heap.refactor;

public class Cake implements SellableItem {

    String flavor;
    String frostingFlavor;
    Shape shape;
    Size size;
    Color color;

    public Cake(String flavor, String frostingFlavor, Shape shape, Size size, Color color) {
        this.flavor = flavor;
        this.frostingFlavor = frostingFlavor;
        this.shape = shape;
        this.size = size;
        this.color = color;
    }

    @Override
    public Double getCost() {
        return 0.0;
    }

    @Override
    public void checkout() {
        System.out.println("cake ordered; " + flavor + ", " + frostingFlavor  + ", " + shape + ", " + size + ", " + color);
    }
}
