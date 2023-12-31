package text05;

public class Customer {
 protected int customerId;
 protected String customerName;
 protected String customerGrade;

 int bonusPoint;
 double bonusRatio;

 public Customer(){

 }

 public Customer(int customerId, String customerName) {
  this.customerId=customerId;
  this.customerName=customerName;

  customerGrade="SILVER";
  bonusRatio=0.01;
  System.out.println("Customer() 생성자 호출");

 }

 // public Customer(int customerId, String customerGrade) {
//  this.customerId = customerId;
//  this.customerGrade = customerGrade;
// }
 public int calcPrice(int price){
  bonusPoint += price*bonusRatio;
  return price;
 }

 public int getCustomerId() {
  return customerId;
 }

 public void setCustomerId(int customerId) {
  this.customerId = customerId;
 }

 public String getCustomerName() {
  return customerName;
 }

 public void setCustomerName(String customerName) {
  this.customerName = customerName;
 }

 public String getCustomerGrade() {
  return customerGrade;
 }

 public void setCustomerGrade(String customerGrade) {
  this.customerGrade = customerGrade;
 }

 public int getBonusPoint() {
  return bonusPoint;
 }

 public void setBonusPoint(int bonusPoint) {
  this.bonusPoint = bonusPoint;
 }

 public double getBonusRatio() {
  return bonusRatio;
 }

 public void setBonusRatio(double bonusRatio) {
  this.bonusRatio = bonusRatio;
 }
 public String showCustomerInfo(){
  String showInfo=customerName+"님의 등급은" + customerGrade + "이며 , 보너스 포인트는"+ bonusPoint +"입니다";
  return showInfo;
 }
}
