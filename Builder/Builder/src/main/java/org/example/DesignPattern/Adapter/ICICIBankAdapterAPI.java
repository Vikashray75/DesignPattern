package org.example.DesignPattern.Adapter;

import org.example.DesignPattern.Adapter.ThirdParty.ICICIBankAPI;

public class ICICIBankAdapterAPI implements BankAdapterAPI{
    ICICIBankAPI iciciBankAPI;

    public ICICIBankAdapterAPI(ICICIBankAPI iciciBankAPI) {
        this.iciciBankAPI = iciciBankAPI;
    }

    @Override
    public String SendMoney(String from, String to, double amt) {
       return iciciBankAPI.transfer(from,to,amt);
    }

    @Override
    public double checkBalance(String account) {
       return iciciBankAPI.getAmount(account);
    }
}
