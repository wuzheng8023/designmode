package com.example.BuilderPattern.entity.entity;

public class Phone {
    //    手机由，CPU，内存，电池，屏幕4个必须部件，以及摄像头，GPS，指纹识别，NFC，4个可选部件组成。

    //必须项
    private String CPU;
    private String memory;
    private String battery;
    private String screen;

    //选填项
    private String camera;
    private String GPS;
    private String fingerPrint;
    private String NFC;


    private Phone(Builder builder){

        this.CPU = builder.CPU;
        this.memory = builder.memory;
        this.battery = builder.battery;
        this.screen = builder.screen;
        this.camera = builder.camera;
        this.GPS = builder.GPS;
        this.fingerPrint = builder.fingerPrint;
        this.NFC = builder.NFC;

    }
    public String getCPU() {
        return CPU;
    }

    public String getMemory() {
        return memory;
    }

    public String getBattery() {
        return battery;
    }

    public String getScreen() {
        return screen;
    }

    public String getCamera() {
        return camera;
    }

    public String getGPS() {
        return GPS;
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public String getNFC() {
        return NFC;
    }
    public static class Builder{

        //必须项
        private String CPU;
        private String memory;
        private String battery;
        private String screen;

        //选填项
        private String camera;
        private String GPS;
        private String fingerPrint;
        private String NFC;


        public Builder(String CPU, String memory, String battery, String screen) {
            this.CPU = CPU;
            this.memory = memory;
            this.battery = battery;
            this.screen = screen;
        }
//        private String camera;
//        private String GPS;
//        private String fingerPrint;
//        private String NFC;

        public Builder camera(String camera) {

            this.camera = camera;
            return this;
        }

        public Builder GPS(String GPS){
            this.GPS = GPS;
            return this;
        }

        public Builder fingerPrint(String fingerPrint){
            this.fingerPrint = fingerPrint;
            return this;
        }

        public Builder NFC(String NFC){
            this.NFC = NFC;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }



}
