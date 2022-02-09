package me.OohBen;

import java.util.Scanner;

public class Account {
int balance;
int previousTransaction;
String customerName;
String customerId;
Scanner sc = new Scanner(System.in);
public Account(String cname, String cid){
    customerName = cname;
    customerId = cid;
}
public String toString(){
    return(customerId+customerName);
}
}
