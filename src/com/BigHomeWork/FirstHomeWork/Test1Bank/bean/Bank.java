package com.BigHomeWork.FirstHomeWork.Test1Bank.bean;

import sun.swing.plaf.synth.DefaultSynthStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by czq
 * time on 2019/5/31  16:11
 */
public class Bank {
    private static Bank bank = new Bank(new ArrayList<>());
    private List<Customer> customers;
    private CustomerReport customerReport;

    private Bank(List<Customer> customers) {
        this.customers = customers;
        this.customerReport = new CustomerReport();
    }

    //添加成员
    public void addCustomer(String fistName, String lastName) {
        Customer customer = new Customer(fistName, lastName);
        customers.add(customer);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public int getNumOfCustomers() {
        return customers.size();
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    public CustomerReport getCustomerReport() {
        return customerReport;
    }

    public void setCustomerReport(CustomerReport customerReport) {
        this.customerReport = customerReport;
    }

    public List<Customer> getCustomers() {
        return this.customers;
    }

    public static Bank getBanking() {
        return bank;
    }

}
