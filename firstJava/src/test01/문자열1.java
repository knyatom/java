package test01;

public class 문자열1 {
    // compareTo, contains, equals
    public static void main(String[] args) {
        String str1="Java Programming";    // 80
        String str2="Java IT Programming";  // 73
        String str3="Java Programming";
        System.out.println("str1 : "+ str1 );
        System.out.println("str2 : "+ str2 );
        System.out.println("str3 : "+ str3 );
        System.out.println(str1.compareTo(str2));  // 7 문자코드값을 빼기
        System.out.println(str1.compareTo(str3));  // 0
        System.out.println(str1.contains("Java"));  // true
        System.out.println(str1==str2);  //false
        System.out.println(str1==str3);  // true
        System.out.println(str1.equals(str2));  // false
        System.out.println(str1.equals(str3));  // true
  // length()
        System.out.println("문자열1의 길이 " + str1.length());
  // startsWith, endsWith
        System.out.println(str1.startsWith("J")); // 문자열의 시작단어
        System.out.println(str1.endsWith("g"));  // 문자열의 끝단어
  // indexOf(), lastIndexOf()
        System.out.println(str1.indexOf("Java"));
        System.out.println(str2.lastIndexOf("IT"));
     // replace()
        System.out.println(str1.replace("Java","자바"));
    // substring()
        System.out.println(str2.substring(0,4));
        // split()
        String str4[]=str1.split(" ");
        System.out.println(str4[1]);
        for(int i=0;i<str4.length;i++){
            System.out.println("분리한 문자열"+ i + "=>"+ str4[i]);
        }
      // toUpperCase(), toLowerCase(), trim()
        System.out.println(str3.toUpperCase());

        String str5="welcome";
        String str6=new String("welcome");
        String str7="welcome";
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str5==str6); // false  메모리 주소가 다르다.
        System.out.println(str5==str7);  // true
        System.out.println(str5.equals(str6));  // 내용만 비교하기
        String str8=new String("welcome");
        System.out.println(str6==str8); //false
        System.out.println(str6.equals(str8));
        // str6, str8 -> 인스턴스변수

    }
}
