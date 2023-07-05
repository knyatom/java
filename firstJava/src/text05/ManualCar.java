package text05;

public class ManualCar extends Car {

 @Override
 public void drive() {
  System.out.println("사람이 운전하고 핸들을 조작한다.");
 }

 @Override
 public void stop() {
  System.out.println("브레이크를 밝아서 정지한다.");
 }

 @Override
 public void fuel() {
  System.out.println("연료를 주입합니다.");
 }

 @Override
 public void washCar() {
  System.out.println("매뉴얼카를 세차를 합니다. ");
 }
}
