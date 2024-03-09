package customer_and_invoice;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return this.customer.getId();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return this.amount - this.amount * (double) getCustomerDiscount() / 100;
    }

    @Override
    public String toString() {
        return "Invoice[" +
                "id=" + id +
                ", customer=" + getCustomerName() +
                "(" + getCustomerID() +")" +
                "(" + getCustomerDiscount() +"%)" +
                ", amount=" + amount +
                ']';
    }

}
