package test03;
// 학생이 지하철과 버스타는 과정
// 학생-이름,돈
// 버스타다(Bus bus) bus.take(), 돈이차감
// 지하철타다(Subway subway) subway.take(), 돈이차감
// 학생이 남은돈이 얼마다.
// 버스-버스번호, 승객수, 돈
// 100번 버스의 승객의 승객수는 몇명이고 수입은 얼마이다.
public class TakeTransTest {
 public static void main(String[] args) {
  Teacher  t1= new Teacher("Mike", 5000);
  Teacher  t2= new Teacher("Brown", 10000);
  Bus bus100= new Bus(100);
  Subway greenLine=new Subway(2);

  t1.takeBus(bus100);
  t2.takeSubway(greenLine);

  t1.showInfo();
  t2.showInfo();
  bus100.showBusInfo();
  greenLine.showSubwayInfo();
  t1.takeBus(bus100);
  t2.takeSubway(greenLine);
  bus100.showBusInfo();
  greenLine.showSubwayInfo();
  t1.showInfo();
  t2.showInfo();
 }
}
