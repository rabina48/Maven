package com.rasello.springdemo.BankServices;

import com.rasello.springdemo.Book.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BankInfo {

    public List<BankCustomersInfo> getBankData(){

        List<BankCustomersInfo> bankInfos = new ArrayList<>();
        BankCustomersInfo bankInfo = new BankCustomersInfo();
        bankInfo.setCheckId(1234258);
        bankInfo.setName("hari");
        bankInfo.setAmount(20000000.48);


        BankCustomersInfo bankInfo1 = new BankCustomersInfo();
        bankInfo1.setCheckId(12342);
        bankInfo1.setName("hari");
        bankInfo1.setAmount(20004747000.48);

        BankCustomersInfo bankInfo2 = new BankCustomersInfo();
        bankInfo2.setAmount(20000000.48);
        bankInfo2.setCheckId(1234);
        bankInfo2.setName("hari");

        BankCustomersInfo bankInfo3 = new BankCustomersInfo();
        bankInfo3.setAmount(20000000.48);
        bankInfo3.setCheckId(123);
        bankInfo3.setName("hari");


        bankInfos.add(bankInfo);
        bankInfos.add(bankInfo1);

        bankInfos.add(bankInfo2);

        bankInfos.add(bankInfo3);

        return bankInfos;
}}
