package com.example.AdapterPattern.Micro.Impl;

import com.example.AdapterPattern.Adapter;
import com.example.AdapterPattern.Micro.MicroService;

public class MicroServiceImpl implements MicroService {

    Adapter adapter;

    public MicroServiceImpl() {
    }

    @Override
    public void readFile(String clazz) {
        if(clazz.equalsIgnoreCase("Micro")){
            System.out.println("以Micro方式读取文件");
        }else {
            adapter = new Adapter(clazz);
            adapter.readFile(clazz);
        }

    }

    @Override
    public void recharge(String clazz) {
        if (clazz.equalsIgnoreCase("Micro")) {
            System.out.println("以Micro普通充电方式充电！");
        }else{
            adapter = new Adapter(clazz);
            adapter.recharge(clazz);
        }
    }
}
