package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

    private Collection<Account> accounts;
    private int number;
    private String firstName;
    private String lastName;

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @param number
     * @param firstName
     * @param lastName
     */
    //Constructeur Customer
    public Customer(int number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new ArrayList<>();
    }

    /**
     *
     * @param number
     * @return
     */
    //retourne le compte dont le numéro est passé en paramètre
    public Account getAccountByNumber(String number) {
        Account account = new Account(null, null, 0, this);
        for (Account accountTemp : accounts) {
            if (accountTemp.getNumber() == null ? number == null : accountTemp.getNumber().equals(number)) {
                account = accountTemp;
            }
        }  
        return account;
    }


    /**
     *
     * @param number
     * @param name
     * @param rate
     */
    //ajout d'un compte à la liste des comptes du Customer
    public void addAccount(String number, String name, double rate) {
        accounts.add(new Account(number, name, rate, this));
    }

}
