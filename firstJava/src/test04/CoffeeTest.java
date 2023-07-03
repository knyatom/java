package test04;

//import test01.Person;

public class CoffeeTest {
 public static void main(String[] args) {
   StarCoffee starCoffee= new StarCoffee();
   BeanCoffee beanCoffee= new BeanCoffee();

  System.out.println(starCoffee.bewing(4000));
  System.out.println(starCoffee.bewing(4300));
  System.out.println(beanCoffee.bewing(4100));
  System.out.println(beanCoffee.bewing(4500));

  System.out.println(starCoffee.bewing(Menu.STARAMERICANO));
  System.out.println(beanCoffee.bewing(Menu.BEANLATTE));
  // 사람이 있고, 그 사람이 커피를 산다.
  Person kim=new Person("kim",10000);
  Person Lee=new Person("lee",20000);

  kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
  Lee.buyBeanCoffee(beanCoffee, Menu.BEANAMERICANO);
  System.out.println("남은돈 : "+ kim.money);
  kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
  Lee.buyBeanCoffee(beanCoffee, Menu.BEANAMERICANO);
  System.out.println("남은돈 : "+ Lee.money);
  System.out.println("남은돈 : "+ kim.money);
 }
}
