package org.example.DesignPattern.Adapter.ThirdParty;

import java.util.Random;

public class ICICIBankAPI {
    public String transfer(String from, String to, double amt)
    {
        System.out.println("Sending money using ICICI Bank");
        return "transfered Successfully";
    }

    public double getAmount(String account)
    {
        System.out.println("Account no");

        return 15000;
    }


}
