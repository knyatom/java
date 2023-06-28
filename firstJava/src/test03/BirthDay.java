package test03;
public class BirthDay {
 private int day;  // 정보은닉
 private int month;
 private int year;
 private boolean isValid;
 public BirthDay(){
   isValid=true;
 }
 public int getDay() {
  return day;
 }
 public void setDay(int day) {
  if(month==2){
   if(day>28){
    System.out.println("날짜 오류입니다.");
   }
  }
  if(day<1){
   isValid=false;
   return;
  }
  this.day = day;
 }
 public int getMonth() {
  return month;
 }
 public void setMonth(int month) {
  if(month<1 || month>12){
    isValid=false;
    return;
  }
  this.month = month;
 }
 public int getYear() {
  return year;
 }
 public void setYear(int year) {
  if(year<0){
   isValid=false;
   return;
  }
  this.year = year;
 }
 public boolean isValid() {
  return isValid;
 }
 public void setValid(boolean valid) {
  isValid = valid;
 }
 public void printDay() {
  if(isValid==false){
   System.out.println("유효하지 않는 날짜입니다.");
   return;
  }
  System.out.println(year+ "년 : " + month+"월 : "+ day +" 일");
 }
}
