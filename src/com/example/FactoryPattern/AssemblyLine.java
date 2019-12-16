package com.example.FactoryPattern;

import com.example.FactoryPattern.ProductionLine.Impl.*;
import com.example.FactoryPattern.ProductionLine.ModuleService;

public class AssemblyLine {


    public ModuleService getPhone(String module){

        if (module.equalsIgnoreCase("GPS")){
            return new FirstPhoneModuleServiceImpl();
        }
        if (module.equalsIgnoreCase("蓝牙")){
            return new SecondPhoneModuleServiceImplement();
        }
        if (module.equalsIgnoreCase("支架")) {
            return new ThirdPhoneModuleServiceImplement();
        }

        if (module.equalsIgnoreCase("NFC")){
            return new ForthPhoneModuleServiceImplement();
        }
        if (module.equalsIgnoreCase("摄像头")){
            return new FifthPhoModuleServiceImplement();
        }

        return null;
   }

}
