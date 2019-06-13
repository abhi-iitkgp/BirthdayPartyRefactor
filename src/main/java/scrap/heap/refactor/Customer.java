package scrap.heap.refactor;


public class Customer {

    Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public boolean payOrder(Double cost) {
        return payment.debit(cost);
    }
}
