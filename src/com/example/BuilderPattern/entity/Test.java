package com.example.BuilderPattern.entity;

import com.example.BuilderPattern.entity.entity.Phone;

public class Test {
    //    手机由，CPU，内存，电池，屏幕4个必须部件，以及摄像头，GPS，指纹识别，NFC，4个可选部件组成。
//    基于不同部件可以组装出不同类型手机。例如，P1为适合最简功能的老年机，
//    仅需要基本部件即可；P2适合拍照爱好者；P3为旗舰版，等等。
//    手机为抽象的，手机类型为具体的。在增加新手机类型时，无需创建新组装线。


        Phone p1 = new Phone.Builder("p1-1", "P1-2", "p1-3", "p1-4").build();
        Phone p2 = new Phone.Builder("p2-1", "p2-2", "p2-3", "p2-4")
                .camera("p2-5")
                .build();
        Phone p3 = new Phone.Builder("p3-1", "P3-2", "p3-3", "p3-4")
                .camera("p3-5")
                .fingerPrint("p3-6")
                .GPS("p3-7")
                .NFC("p3-7")
                .build();





}
