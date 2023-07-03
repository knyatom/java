package test04;

public class CommandCenterTest {
 public static void main(String[] args) {
  CommandCenter comand=CommandCenter.getInstance();
  
   Factory tank=comand.createFactory("탱크");
   Factory golliat=comand.createFactory("골리앗");
  //Factory tank2=comand.createFactory();

  System.out.println(tank.getUnit());
  System.out.println(tank.getUnitCount());
  System.out.println(golliat.getUnit());
  System.out.println(golliat.getUnitCount());
 }
}
