package org.example.DesignPattern.Adapter;

import org.example.DesignPattern.Adapter.ThirdParty.YesBankAPI;

public class YesBankAdapterAPI implements BankAdapterAPI{

    YesBankAPI yesBankAPI;

    public YesBankAdapterAPI(YesBankAPI yesBankAPI) {
        this.yesBankAPI = yesBankAPI;
    }

    @Override
    public String SendMoney(String from, String to, double amt) {
       return yesBankAPI.sendMoney(from,to,amt);
    }

    @Override
    public double checkBalance(String account) {
        return yesBankAPI.balance(account);
    }
}
