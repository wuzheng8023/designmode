package com.example.AdapterPattern.TypeC.Impl;

import com.example.AdapterPattern.TypeC.TypeCService;

public class TypeCServiceImpl implements TypeCService {



    public TypeCServiceImpl() {
    }

    @Override
    public void readFile() {
        System.out.println("以Type-c方式读取文件");
    }

    @Override
    public void recharge() {

        System.out.println("以Type-c快速充电方式充电！");
    }
}
