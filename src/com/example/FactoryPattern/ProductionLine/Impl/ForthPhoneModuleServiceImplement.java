package com.example.FactoryPattern.ProductionLine.Impl;

import com.example.FactoryPattern.ProductionLine.ModuleService;

public class ForthPhoneModuleServiceImplement implements ModuleService {

    public ForthPhoneModuleServiceImplement() {
    }

    @Override
    public void accessInstrument() {
        System.out.println("快速NFC");
    }
}
