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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    
    
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
        getCustomers().add(new Customer(number, fn, ln));
    }
    
    public void addAccount (String number, String name, double rate, Customer customer) {
        getAccounts().add(new Account(number, name, rate, customer));
    }
    
    
    
}
