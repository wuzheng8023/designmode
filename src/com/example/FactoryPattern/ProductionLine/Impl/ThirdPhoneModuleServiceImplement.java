package com.example.FactoryPattern.ProductionLine.Impl;

import com.example.FactoryPattern.ProductionLine.ModuleService;

public class ThirdPhoneModuleServiceImplement implements ModuleService {

    public ThirdPhoneModuleServiceImplement() {
    }

    @Override
    public void accessInstrument() {
        System.out.println("优质支架");
    }
}
