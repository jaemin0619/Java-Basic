package array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요:");
        Scanner scanner=new Scanner(System.in);
        int numbers[]=new int[5];
        int total=0;
        double average;
        for(int i=0;i<5;i++)
        {
numbers[i]=scanner.nextInt();
            total=total+numbers[i];

        }
        average=(double)total/5;
        System.out.println("입력한 정수의 합계: "+total);
        System.out.println("입력한 정수의 평균: "+average);
    }
}
