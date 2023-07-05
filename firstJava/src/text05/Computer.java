package text05;

public abstract class Computer {
 abstract void display();
 abstract void typing();

 public void turnOn() {
  System.out.println("전원을 켭(ON)니다.");
 }

 public void turnOff() {
  System.out.println("전원을 끕(off)니다.");
 }

}
