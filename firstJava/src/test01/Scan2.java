package test01;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] aa= new int[4] ;
        int hap = 0;
//        System.out.printf("첫번째숫자입력=> ");
//        aa[0]=s.nextInt();
//        System.out.printf("두번째숫자입력=>");
//        aa[1]=s.nextInt();
//        System.out.printf("세번째숫자입력=> ");
//        aa[2]=s.nextInt();
//        System.out.printf("네번째숫자입력=>");
//        aa[3]=s.nextInt();
        for(int i=0;i<=3;i++){
            System.out.printf("%d번째숫자입력=> ", i+1);
            aa[i]=s.nextInt();
        }
        int k=0;
        while(k<=3){
            hap+=aa[k];
            k++;
        }
        //hap=aa[0]+aa[1]+aa[2]+aa[3];
        System.out.printf("합계=> %d \n", hap);
        s.close();

        int score=100;
        char grade;
        if(score >= 90){
            grade = 'A';
        }
        else{
            grade = 'B';
        }
       // 삼항연산자로 변경하기
        grade = (score>=90) ? 'A' :'B';

    }
}
