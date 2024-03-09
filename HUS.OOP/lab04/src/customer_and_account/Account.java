package customer_and_account;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return getCustomerName() + "(" + this.id + ")" + "balance=$" + balance;
    }

    public String getCustomerName() {
        return this.customer.getName();
   }

   public Account deposit(double amount) {
        Account account = new Account(this.id,this.customer,this.balance);

        account.setBalance(account.getBalance() + amount);

        return account;
   }

   public Account withdraw(double amount) {
       Account account = new Account(this.id,this.customer,this.balance);
        if (account.getBalance() > amount) {
            account.setBalance(account.getBalance() - amount);
        } else {
            System.out.println("amount withdraw exceeds the current balance!");
        }
        return account;
   }

}
