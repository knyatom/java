package text05;

public class AICar extends Car {

 @Override
 public void drive() {
  System.out.println("자율주행을 합니다. 스스로 운전합니다.");
 }

 @Override
 public void stop() {
  System.out.println("스스로 멈춥니다...");
 }

 @Override
 public void fuel() {
  System.out.println("자동주행차에 연료를 주입합니다.");
 }
}
