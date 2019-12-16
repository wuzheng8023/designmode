package com.example.FactoryPattern;

import com.example.FactoryPattern.ProductionLine.ModuleService;

public class Test {

   public static void main(String[] args) {

      AssemblyLine assemblyLine = new AssemblyLine();

      ModuleService moduleService1 = assemblyLine.getPhone("NFC");
      moduleService1.accessInstrument();

      ModuleService moduleService2 = assemblyLine.getPhone("GPS");
      moduleService2.accessInstrument();

      ModuleService moduleService3 = assemblyLine.getPhone("支架");
      moduleService3.accessInstrument();

      ModuleService moduleService4 = assemblyLine.getPhone("蓝牙");
      moduleService4.accessInstrument();

      ModuleService moduleService5 = assemblyLine.getPhone("摄像头");
      moduleService5.accessInstrument();

   }

}
