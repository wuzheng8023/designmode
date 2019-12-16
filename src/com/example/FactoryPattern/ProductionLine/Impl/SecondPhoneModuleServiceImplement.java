package com.example.FactoryPattern.ProductionLine.Impl;

import com.example.FactoryPattern.ProductionLine.ModuleService;

public class SecondPhoneModuleServiceImplement implements ModuleService {

    public SecondPhoneModuleServiceImplement() {
    }

    @Override
    public void accessInstrument() {
        System.out.println("高效蓝牙");
    }
}
