package org.example.DesignPattern.Adapter;

public interface BankAdapterAPI {

    String SendMoney(String from, String to,double amt);
    double checkBalance(String account);

}
