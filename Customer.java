package com.mybank.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mat613 on 22/01/16.
 */
public class Customer {
    List<Account> accounts = new ArrayList<>();
    private String firstName;
    private String secondName;

    public Customer(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public void addAccount(Account acct){
        accounts.add(acct);
        int x=accounts.indexOf(acct);
        System.out.println("The account "+acct+"has been added to accounts at the index "+x);
    }
    public int getNumAccounts(){
        return accounts.size();
    }
    public Account getAccount(int index){
        return accounts.get(index);
    }


}
