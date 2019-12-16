package com.example.FactoryPattern.ProductionLine.Impl;

import com.example.FactoryPattern.ProductionLine.ModuleService;

public class FirstPhoneModuleServiceImpl implements ModuleService {

    public FirstPhoneModuleServiceImpl() {
    }

    @Override
    public void accessInstrument() {
        System.out.println("精准GPS定位");

    }
}
