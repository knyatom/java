package text05;

public class Bird extends Pet{
 String type;
 boolean flightYN ;  // 날수있다.
 boolean getFlight(){
  return flightYN;
 }

 @Override
 public void move() {
  //super.move();
  String flight=flightYN ? "새가 날아간다" : "새가 빨리 걸어간다.";
  System.out.println(type+ " " + flight);
 }
}
