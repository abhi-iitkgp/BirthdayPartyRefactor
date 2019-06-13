package scrap.heap.refactor;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        StoreManager manager = new StoreManager();

        Balloon balloon = new Balloon(Color.RED, "mylar", 4);
        Cake cake = new Cake("chocolate", "chocolate", Shape.CIRCLE, Size.LARGE, Color.BROWN);
        Order order = new Order();
        order.addItem(balloon);
        order.addItem(cake);
        manager.completeOrder(order);

        balloon = new Balloon(Color.BLUE, "latex", 7);
        cake = new Cake("vanilla", "chocolate", Shape.SQUARE, Size.MEDIUM, Color.BROWN);
        order = new Order();
        order.addItem(balloon);
        order.addItem(cake);
        manager.completeOrder(order);

        balloon = new Balloon(Color.YELLOW, "mylar", 4);
        cake = new Cake("vanilla", "vanilla", Shape.SQUARE, Size.SMALL, Color.YELLOW);
        order = new Order();
        order.addItem(balloon);
        order.addItem(cake);
        manager.completeOrder(order);
    }

    private static void order(String balloonColor, String material, String number, String flavor, String frostingFlavor, String shape, String size, String cakeColor){
        orderBalloons(balloonColor, material, number);
        orderCake(frostingFlavor, flavor, shape, size, cakeColor);
    }

    private static void orderBalloons(String balloonColor, String material, String number){

        //for the purposes of this exercise, pretend this method works and adds balloons to the order
        System.out.println("Balloons ordered; " + balloonColor + ", " + material  + ", " + number);

    }

    private static void orderCake(String flavor, String frostingFlavor, String shape, String size, String cakeColor){

        //for the purposes of this exercise, pretend that this method adds a cake to the order
        System.out.println("cake ordered; " + flavor + ", " + frostingFlavor  + ", " + shape + ", " + size + ", " + cakeColor);

    }

}
