package scrap.heap.refactor;

public class Balloon implements SellableItem {

    Color color;
    String material;
    Integer count;

    public Balloon(Color color, String material, Integer count) {
        this.color = color;
        this.material = material;
        this.count = count;
    }

    @Override
    public Double getCost() {
        return 0.0;
    }

    @Override
    public void checkout() {
        System.out.println("Balloons ordered; " + color.getName() + ", " + material  + ", " + count);
    }
}
