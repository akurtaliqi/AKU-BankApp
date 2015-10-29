package ch.hearc.ig.odi.customeraccount.business;

public class Account {

    private Customer customer;
    private String number;
    private String name;
    private double balance = 0;
    private double rate = 0.001;

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     *
     * @param number
     * @param name
     * @param rate
     * @param customer
     */
    //Constructeur Account
    public Account(String number, String name, double rate, Customer customer) {
        this.number = number;
        this.name = name;
        this.rate = rate;
        this.customer = customer;
    }

    /**
     *
     * @param amount
     */
    //crédit du compte du montant passé en paramètre
    public void credit(double amount) {
        this.balance = balance + amount;
    }

    /**
     *
     * @param amount
     */
    //débit du compte du montant passé en paramètre
    public void debit(double amount) {
        if ((this.balance - amount) >= 0) {
            this.balance = balance - amount;
        } else {
            System.out.println("Ceci est une erreur");
        }
    }

    /**
     *
     * @param amount
     * @param source
     * @param target
     */
    //transfère de la somme depuis le compte source jusqu'au compte target
    public static void transfer(double amount, Account source, Account target) {
        source.debit(amount);
        target.credit(amount);
    }

}
