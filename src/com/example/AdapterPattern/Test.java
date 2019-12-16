package com.example.AdapterPattern;

import com.example.AdapterPattern.Micro.Impl.MicroServiceImpl;
import com.example.AdapterPattern.Micro.MicroService;

public class Test {
    public static void main(String[] args) {

        MicroService microService = new MicroServiceImpl();

        microService.readFile("Micro");
        microService.readFile("Type-c");
        microService.recharge("Micro");
        microService.recharge("Type-c");
    }
}
