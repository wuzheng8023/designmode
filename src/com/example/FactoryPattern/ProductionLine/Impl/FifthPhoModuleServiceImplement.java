package com.example.FactoryPattern.ProductionLine.Impl;

import com.example.FactoryPattern.ProductionLine.ModuleService;

public class FifthPhoModuleServiceImplement implements ModuleService {

    public FifthPhoModuleServiceImplement() {
    }

    @Override
    public  void accessInstrument() {
        System.out.println("清晰摄像头");
    }
}
