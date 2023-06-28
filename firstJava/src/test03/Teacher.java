package test03;
// 학생이 지하철과 버스타는 과정
// 학생-이름,돈
// 버스타다(Bus bus) bus.take(), 돈이차감
// 지하철타다(Subway subway) subway.take(), 돈이차감
public class Teacher {
 String name;
 int money;
 public Teacher(String name, int money) {
  this.name = name;
  this.money = money;
 }
 public void takeBus(Bus bus) {  // 승차
   bus.take(1000); // 버스가 태워준다.
   this.money-=1000;
 }
 public void takeSubway(Subway subway) {
  subway.take(1200);
  this.money-=1200;
 }
 public void showInfo() {
  System.out.print(name+"님의 남은돈은 ");
  System.out.println(money+"원 입니다.");
 }
}
