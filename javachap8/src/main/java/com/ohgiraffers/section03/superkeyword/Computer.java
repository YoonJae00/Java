package com.ohgiraffers.section03.superkeyword;

import java.util.Date;

public class Computer extends Product {

    // 컴퓨터는 하나의 제품이지만, 모든 제품이 컴퓨터는 아니다. (IS-A)

    private String cpu;
    private int hdd;
    private int ram;
    private String os;

    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출함...");
    }

    public Computer(String cpu, int hdd, int ram, String os) {
        // 부모의 기본생성자 호출
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;

        System.out.println("Computer 클래스의 모든 필드를 초기화 하는 생성자 호출함...");
    }

    public Computer(String code, String brand, String name, int pirce, Date menufacturingDate,
            /* 자식의 필드 */              String cpu, int hdd, int ram, String os) {
        super(code, brand, name, pirce, menufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;

    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String getInfo() {

        return super.getInfo() + "Computer : " +cpu + hdd + ram + os;
    }
}
