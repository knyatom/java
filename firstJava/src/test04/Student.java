package test04;

import java.util.ArrayList;

public class Student {
 int studentID;
 String studentName;
 ArrayList<Subject> subjectList ;

 public Student(int studentID, String studentName) {
  this.studentID = studentID;
  this.studentName = studentName;
  subjectList=new ArrayList<Subject>();
 }
 public void addSubject(String name, int score) {
     Subject subject= new Subject();
     subject.setName(name);
     subject.setScorePoint(score);
     subjectList.add(subject);
 }
 public void showStudentInfo() {
  int 총점=0;
   for(Subject s: subjectList){
     총점 += s.getScorePoint();
     System.out.println(studentName+" => " +s.getName()+" : " + s.getScorePoint());
   }
  System.out.println(studentName+"의 총점은" + 총점+"입니다.");
 }
}
