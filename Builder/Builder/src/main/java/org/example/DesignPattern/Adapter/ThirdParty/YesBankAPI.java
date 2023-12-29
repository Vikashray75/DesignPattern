package org.example.DesignPattern.Adapter.ThirdParty;

public class YesBankAPI {

    public String sendMoney(String from,String to, double amt)
    {
        return "transferred using Yesbank";
    }

    public double balance(String account)
    {
        return 50000;
    }
}
