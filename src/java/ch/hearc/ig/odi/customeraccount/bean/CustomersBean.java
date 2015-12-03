/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Bean lié à la page customersList.xhtml, qui affiche la liste des clients
 * @author ajtene.kurtaliq
 */
@Named(value = "customersBean")
@RequestScoped
//session on en a besoin quand on veut enregistrer en mémoire quelque chose
public class CustomersBean implements Serializable {

    @Inject Services services;

    public CustomersBean() {
    }

    
     /**
     * Retourne une liste de clients
     * @return Une liste de clients
     */   
    public List<Customer> getCustomers() {
        return services.getCustomersList();
    }

}
