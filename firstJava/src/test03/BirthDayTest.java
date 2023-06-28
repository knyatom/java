package test03;

public class BirthDayTest {
 public static void main(String[] args) {
   BirthDay day=new BirthDay();
   day.setYear(2023);
   day.setMonth(1);
   day.setDay(30);
   System.out.println(day.isValid());
  // System.out.println(day);
   day.printDay();

   day.setYear(2025);
   day.setMonth(15);
   day.setDay(30);
   System.out.println(day.isValid());
  // System.out.println(day);
   day.printDay();
 }
}
