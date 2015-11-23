/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ajtene.kurtaliq
 */
public class Bank {

    private final Integer number;
    private final String name;
    private final ArrayList<Account> accounts;
    private final Map<Integer, Customer> customers;

    public Bank (int number, String name) {
        this.number = number;
        this.name = name;
        this.customers = new HashMap<>();
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
        for (Customer cus : this.customers.values()) {
            if (cus.getNumber() == number) {
                return cus;
            }
        }
        return customerTemp;
    }
    
    public void addCustomer (Integer number, String fn, String ln) {
        this.customers.put(number, new Customer (number, fn, ln));
    }
    
    public void addAccount (String number, String name, double rate, Customer customer) {
         this.accounts.add(new Account(number, name, rate, customer));
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public Map<Integer, Customer> getCustomers() {
        return customers;
    }
    
    
    
    
    
}
