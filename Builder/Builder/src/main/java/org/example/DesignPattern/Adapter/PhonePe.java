package org.example.DesignPattern.Adapter;

public class PhonePe {

        BankAdapterAPI bankAdapterAPI;

    public PhonePe(BankAdapterAPI bankAdapterAPI) {
        this.bankAdapterAPI = bankAdapterAPI;
    }

    String transaction(String from, String to, double amount)
    {
        return bankAdapterAPI.SendMoney(from,to,amount);
    }

    double checkBanlance(String Account)
    {
        return bankAdapterAPI.checkBalance(Account);
    }
}
