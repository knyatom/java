package test01;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        // 조건문
//        int i=10;
//        if(i>5){
//            System.out.println("참이다");
//        }else{
//            System.out.println("거짓이다");
//        }
//        // 중첩조건문
//        if(i>5){
//            System.out.println("참이다");
//        }else if(i<5){
//            System.out.println("거짓이다");
//        }else{
//            System.out.println("나머지입니다.");
//        }
//        // 삼항연산자 ?
//        boolean isMarried=true;
//        String str;
//        str=isMarried ? "결혼했다" : "미혼";
//        System.out.println(str);
//
//        if(isMarried){
//            str="welcome to ..";
//        }else{
//            str="NONE";
//        }
//        System.out.println(str);
//
//        boolean isMan=false;
//        if(isMarried || isMan){  // OR
//            str=" hi happy day";
//        }else{
//            str=" blue day";
//        }
//        System.out.println(str);
//
//        if(isMarried && isMan){  // AND
//            str=" hi happy day";
//        }else{
//            str=" blue day";
//        }
//        System.out.println(str);
//
//        str="결혼했다";
//        switch (str){
//            case "결혼했다":
//                System.out.println("OOOO");
//                break;
//            case "미혼":
//                System.out.println("XXXX");
//                break;
//            default:
//                System.out.println("????");
//        }
//        // 반복문
//        for(int a=0;a<10;a++){
//            System.out.println(a);
//        }
//        int j=0;
//        while(j<10){
//            System.out.print(j+" ");
//            j++;
//        }
//        int k=0;
//        do{
//            System.out.print(k+ " ");
//            k++;
//        }while(k<10);
//        // break, continue
//        for(int bb=0;bb<10;bb++){
//            System.out.print(bb+ "-");
//            if(bb==6) break;
//        }

        for(int cc=0;cc<10;cc++){
            //if(cc == 5) { continue;}  // CC 가 5일때만 실행하지 않는다.
            if(cc % 2 == 1)  continue;  // 건너띄다.
            System.out.print(cc + " :  ");
        }
        // 배열
        int[] score = new int[5]; // 초기화는 모두 0으로 되어있다.
        System.out.println(score);
        int count=score.length;
        System.out.println(count);
        System.out.println(score[0]);
        score[2]=10;
        for(int a=0;a<count;a++){
            System.out.print(score[a] + " ");
        }
        int[] score2=new int[]{10,20,30,40,50};
        System.out.println(score2);
        for(int a=0;a<count;a++){
            System.out.print(score2[a] + " ");
            //java.lang.ArrayIndexOutOfBoundsException
        }
        int[] score3={100,200,300,400,500};
        for(int a=0;a<count;a++){
            System.out.print(score3[a] + " ");
        }
        String[] name={"홍길동","강감찬","을지문덕"};
        System.out.println(name[1]);
        String[] name2=new String[2]; // 초기화안하면 null
        System.out.println(name2.length);
        System.out.println(name2[0]);
        System.out.println(name2[1]);
        //System.out.println(name2[0].length()); // Null Point Exception
        System.out.println(name[1].length()); // 3글자
        System.out.println(name[2].length()); // 4글자

        // <> wrapper 클래스 ->자료형, Integer, String
        ArrayList<Integer> scoreList=new ArrayList<>();
        scoreList.add(10);
        scoreList.add(50);
        scoreList.add(30);
        scoreList.add(40);
        System.out.println(scoreList.get(1));
        scoreList.add(2,200);
        System.out.println(scoreList);
        scoreList.remove(1);
        System.out.println(scoreList);

        add(10,20);
        add(100,200);
        add(100,200, 300);
        mul(10,4);
        System.out.println("더하기 : " + add(1,10,30,50));
    }  // Main

    public static int add(int... num){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i]; // sum=sum+1,20,30,50
        }
        return sum;
    }

    private static void mul(int a, int b) {
        System.out.println(a*b);
    }

    // 멤버함수/멤버 메소드
    public static void add(int x, int y) {
        System.out.println(x+y);
    }
    // 메소드 오버로딩 : 함수명은 같고, 매개변수가 다른함수
    public static void add(int x, int y,int z) {
        System.out.println(x+y+z);
    }
// static 이 붙어있으면 메모리에 프로그램이 실행될때
// 처음으로 로드가 되는 부분이다.
// 별도의 영역에 메모리를 차지한다. static 메모리영역



} //Main2 Class
