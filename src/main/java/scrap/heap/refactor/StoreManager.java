package scrap.heap.refactor;

public class StoreManager {

    public void completeOrder(Order order) {
        Customer customer = getCustomer();
        Double cost = order.getCost();
        customer.payOrder(cost);
        order.checkout();
    }

    private Customer getCustomer() {
        Customer customer = new Customer();
        customer.setPayment(new Payment());
        return customer;
    }
}
