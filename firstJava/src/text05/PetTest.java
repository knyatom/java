package text05;

public class PetTest {
 public static void main(String[] args) {
  Dog dog1=new Dog();
  dog1.age=25;
  dog1.name="누렁이";
  dog1.weight=10;
  System.out.println(dog1.name+" :" + dog1.getWeight());
  dog1.move();

  Bird bird1=new Bird();
  bird1.age=5;
  bird1.type="앵무새";
  bird1.flightYN=false;
  bird1.move();
  String flight= bird1.getFlight() ? "날수있다." : "날수없다" ;
  System.out.println(bird1.type+ " : "+  flight);

 }
}
