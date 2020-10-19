package com.rasello.springdemo.BankServices;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomersRepositoryImpl implements CustomersRepository {

    protected List<CustomersInfo> customersInfoList = new ArrayList<>();


    @Override
    public void add(CustomersInfo customersInfo) {

        customersInfoList.add(customersInfo);
    }

    @Override
    public void update(CustomersInfo customersInfo) {
        if (customersInfo.getCheckid() == 0) return;
        for (int i = 0; i < customersInfoList.size(); i++) {
            CustomersInfo info = customersInfoList.get(i);

            if (info.getCheckid() == customersInfo.getCheckid()) {
                customersInfoList.remove(info);
                customersInfoList.add(customersInfo);
            }


        }
    }

    @Override
    public void delete(long checkId) {
        for (int i = 0; i < customersInfoList.size(); i++) {
            CustomersInfo info = customersInfoList.get(i);

            if (info.getCheckid() == checkId) {

                customersInfoList.remove(info);
            }


        }

    }


    @Override
    public CustomersInfo getById(long checkId) {

        for (int i = 0; i < customersInfoList.size(); i++) {
            CustomersInfo info = customersInfoList.get(i);

            if (info.getCheckid() == checkId) {

                return info;
            }


        }
        return null;
    }


    @Override
    public List<CustomersInfo> getAllData() {

        return customersInfoList;
    }

}
