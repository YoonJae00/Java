package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn;   // 시동 상태 초기에는 시동이 꺼진 false 상태이다.

    private int speed;     //

    // 시동이 걸려있는 상태인 경우 할 일이 없고 시동이 걸려있지 않으면 시동을 건다.
    public void startUp() {
        if (isOn) System.out.println("이미 시동이 걸려있습니다.");
        else {
            System.out.println("시동을 걸었습니다.");
            this.isOn = true;
        }
    }

    public void go() {
        if (isOn) {
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;   // 기본값 0 이다.
            System.out.println("현재 차의 시속은" + this.speed + "km/h 입니다.");
        } else System.out.println("차의 시동이 걸려있지 않습니다.");
    }

    public void stop() {
        if (isOn) {
            if (this.speed == 0) System.out.println("이미 멈춰있는 상태입니다.");
            else {
                System.out.println("브레이크를 밟았습니다. 차가 멈췄습니다.");
                this.speed = 0;
            }
        }else System.out.println("시동 꺼져있습니다.");

    }


    // 시동이 걸려 있는 상태인 경우 시동을 끄고, 이미 꺼진 상태라면 끌 수 없다.
    public void turnOff() {
        if (isOn) {
            if (speed > 0) {
                System.out.println("달리는 상태에서는 시동을 끌 수 없습니다.");
            }
            else {
                System.out.println("시동을 끕니다. 다시 운행하려면 시동을 켜주세요");
                this.isOn = false;
            }
        }else System.out.println("이미 시동이 꺼져 있습니다.");
    }
}
