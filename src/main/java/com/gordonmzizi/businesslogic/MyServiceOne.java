package com.gordonmzizi.businesslogic;

import org.springframework.stereotype.Service;

@Service
public class MyServiceOne {
    private String accountNum;

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void moreBusines(){
        System.out.println("More Business");
    }
}
