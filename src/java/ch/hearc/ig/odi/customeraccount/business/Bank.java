/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

import java.util.ArrayList;

/**
 *
 * @author ajtene.kurtaliq
 */
public class Bank {

    private int number;
    private String name;
    private ArrayList<Customer> customers;
    private ArrayList<Account> accounts;

    public Bank (int number, String name) {
        this.number = number;
        this.name = name;
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public Account getAccountByNumber (String number) {
        Account accountTemp = null;
        for (Account a : accounts) {
            if (a.getNumber().equals(number)) {
            accountTemp = a;
            }
        }
        return accountTemp;
    }
    
    public Customer getCustomerByNumber (int number) {
        Customer customerTemp = null;
        for (Customer c : customers) {
            if (number == c.getNumber()) {
                customerTemp = c;
            }
        }
        return customerTemp;
    }
    
    public void addCustomer (int number, String fn, String ln) {
        this.customers.add(new Customer(number, fn, ln));
    }
    
    public void addAccount (String number, String name, double rate, Customer customer) {
         this.accounts.add(new Account(number, name, rate, customer));
    }
    
    
    
}
