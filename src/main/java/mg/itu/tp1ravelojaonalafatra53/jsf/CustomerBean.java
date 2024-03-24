/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tp1ravelojaonalafatra53.jsf;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;
import mg.itu.tp1ravelojaonalafatra53.entities.Customer;
import mg.itu.tp1ravelojaonalafatra53.service.CustomerManager;

/**
 *
 * @author USER
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
    @Inject
    private CustomerManager customerManager;
    
    private List<Customer> customerList;
    
    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }
    
    /** 
    * 
    * @return la liste des clients pour affichage dans une DataTable.liste de clients
    */  
    public List<Customer> getCustomers() {
        if (customerList == null) {
          customerList = customerManager.getAllCustomers();
        }
        return customerList;
    }
    
}
