package org.example.DesignPattern.Adapter;

import org.example.DesignPattern.Adapter.ThirdParty.ICICIBankAPI;
import org.example.DesignPattern.Adapter.ThirdParty.YesBankAPI;

public class Client {
    public static void main(String[] args) {
       // YesBankAPI yesBankAPI=new YesBankAPI();
        BankAdapterAPI yesBankAdapter=new ICICIBankAdapterAPI(new ICICIBankAPI());
        PhonePe phonePe=new PhonePe(yesBankAdapter);
        phonePe.transaction("7878787","121212121",8000);

    }
}
