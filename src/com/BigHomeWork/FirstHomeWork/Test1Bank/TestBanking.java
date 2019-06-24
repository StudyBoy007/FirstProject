package com.BigHomeWork.FirstHomeWork.Test1Bank;

import com.BigHomeWork.FirstHomeWork.Test1Bank.bean.*;

/**
 * Create by czq
 * time on 2019/5/31  15:18
 */
public class TestBanking {
    public static void main(String[] args) {

//        Customer customer = new Customer("LeBron", "James");
//        customer.setAccount(new Account(10000));
//        customer.getAccount().withdraw(1000);
//        customer.getAccount().deposit(5000);
//        customer.getAccount().withdraw(15000);
//        customer.getAccount().getBalance(customer);

        //4
//        Bank bank = new Bank(new Customer[10]);
//        bank.addCustomer("LeBron", "James");
//        bank.addCustomer("刘", "梦昊");
//        bank.addCustomer("李", "飞");
//        bank.addCustomer("蔡", "泽球");
//        System.out.println("银行共有：" + bank.getNumOfCustomers() + "客户，分别是：");
//        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
//            Customer customer = bank.getCustomer(i);
//            System.out.println("Customer [" + (i + 1) + "] is\t" + customer.getFirstName() + "," + customer.getLastName());
//5
//        Bank bank = new Bank(new Customer[10]);
//        Customer customer = new Customer("LeBron", "James");
//        SavingAccount savingAccount = new SavingAccount(500, 0.03);
//        customer.setAccount(savingAccount);
//        bank.addCustomer(customer);
//
//        Customer customer1 = new Customer("Kobi", "Bryant");
//        CheckingAccount checkingAccount = new CheckingAccount(500, 0);
//        customer1.setAccount(checkingAccount);
//        bank.addCustomer(customer1);
//
//        Customer customer2 = new Customer("Tim", "Soley");
//        CheckingAccount checkingAccount2 = new CheckingAccount(500, 500);
//        customer2.setAccount(checkingAccount2);
//        bank.addCustomer(customer2);
//
//        Customer customer3 = new Customer(" Maria", "Soley");
//        customer3.setAccount(checkingAccount2);
//        System.out.println("Maria shares her Checking Account with her husband Tim.");
//        bank.addCustomer(customer3);


//        customer.getAccount().withdraw(150);
//        customer.getAccount().deposit(22.5);
//        customer.getAccount().withdraw(47.62);
//        customer.getAccount().withdraw(400);
//        customer.getAccount().getBalance(customer);


        //5
//        for (int i = 0; i < bank.getCustomers().length; i++) {
//            if (bank.getCustomers().get(i) != null) {
//                System.out.println("Retrieving the customer Jane Smith with her savings account");
//                bank.getCustomers().get(i).getAccount().withdraw(150);
//                bank.getCustomers().get(i).getAccount().deposit(22.5);
//                bank.getCustomers().get(i).getAccount().withdraw(47.62);
//                bank.getCustomers().get(i).getAccount().withdraw(400);
//                bank.getCustomers().get(i).getAccount().getBalance(bank.getCustomers().get(i));
//                System.out.println();
//            } else {
//                break;
//            }
//        }

        //6.0
        Bank bank = Bank.getBanking();
        Customer customer = new Customer("LeBron", "James");

        SavingAccount savingAccount = new SavingAccount(500, 0.03);
        customer.setSavingaccount(savingAccount);
        CheckingAccount checkingAccount = new CheckingAccount(200, 0.03);
        customer.setCheckingaccount(checkingAccount);
        bank.addCustomer(customer);

        Customer customer1 = new Customer("Kobi", "Bryant");

        CheckingAccount checkingAccount1 = new CheckingAccount(200, 0);
        customer1.setCheckingaccount(checkingAccount1);
        bank.addCustomer(customer1);

        Customer customer2 = new Customer("Tim", "Soley");
        SavingAccount savingAccount1 = new SavingAccount(1500, 0.03);
        customer2.setSavingaccount(savingAccount1);

        CheckingAccount checkingAccount2 = new CheckingAccount(200, 500);
        customer2.setCheckingaccount(checkingAccount2);
        bank.addCustomer(customer2);

        Customer customer3 = new Customer(" Maria", "Soley");
        SavingAccount savingAccount2 = new SavingAccount(200, 0.03);
        customer3.setSavingaccount(savingAccount2);

        CheckingAccount checkingAccount3 = new CheckingAccount(150, 500);
        customer3.setCheckingaccount(checkingAccount3);
//        System.out.println("Maria shares her Checking Account with her husband Tim.");
        bank.addCustomer(customer3);

        for (int i = 0; i < bank.getCustomers().size(); i++) {
            StringBuilder sb = new StringBuilder("Customer [" + bank.getCustomers().get(i).getFirstName() + "," + bank.getCustomers().get(i).getLastName() +
                    "] ");
            if (bank.getCustomers().get(i).getCheckingaccount() == null && bank.getCustomers().get(i).getSavingaccount() == null) {
                sb.append("\n-该客户没有账户");
                bank.getCustomerReport().getReports().add(sb.toString());
                break;
            }

            if (bank.getCustomers().get(i).getSavingaccount() != null && bank.getCustomers().get(i).getCheckingaccount() == null) {
                sb.append("\n").append(bank.getCustomers().get(i).getSavingaccount().getBalance(bank.getCustomers().get(i)));
                bank.getCustomerReport().getReports().add(sb.toString());
            }

            if (bank.getCustomers().get(i).getSavingaccount() == null && bank.getCustomers().get(i).getCheckingaccount() != null) {
                sb.append("\n").append(bank.getCustomers().get(i).getCheckingaccount().getBalance(bank.getCustomers().get(i)));
                bank.getCustomerReport().getReports().add(sb.toString());
            }

            if (bank.getCustomers().get(i).getSavingaccount() != null && bank.getCustomers().get(i).getCheckingaccount() != null) {
                sb.append("\n" + bank.getCustomers().get(i).getSavingaccount().getBalance(bank.getCustomers().get(i)));
                sb.append("\n" + bank.getCustomers().get(i).getCheckingaccount().getBalance(bank.getCustomers().get(i)));
                bank.getCustomerReport().getReports().add(sb.toString());
            }

        }
        bank.getCustomerReport().displayReport();

        //7.0
//        Bank bank = Bank.getBanking();
//        Customer customer = new Customer("LeBron", "James");
//
//
//        CheckingAccount checkingAccount = new CheckingAccount(200, 500);
//        customer.setCheckingaccount(checkingAccount);
//        try {
//            customer.getCheckingaccount().withdraw(150);
//            customer.getCheckingaccount().deposit(22.50);
//            customer.getCheckingaccount().withdraw(147.62);
//            customer.getCheckingaccount().withdraw(470.00);
//        } catch (OverdraftException e) {
//            System.out.println(e.getMessage()+e.getDeficit());
//        }
//        System.out.println(customer.getCheckingaccount().getBalance(customer));
//
//
//        Customer customer1 = new Customer("Kobi", "Bryant");
//
//        CheckingAccount checkingAccount1 = new CheckingAccount(200, 0);
//        customer1.setCheckingaccount(checkingAccount1);
//        try {
//            customer1.getCheckingaccount().withdraw(100);
//            customer1.getCheckingaccount().deposit(25);
//            customer1.getCheckingaccount().withdraw(175);
//        } catch (OverdraftException e) {
//            System.out.println(e.getMessage()+e.getDeficit());
//        }
//        System.out.println(customer1.getCheckingaccount().getBalance(customer1));

    }
}
