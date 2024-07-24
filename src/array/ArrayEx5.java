package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요:");
        int count= scanner.nextInt();
        int numbers[]=new int[count];
        int big;
        int small;
        System.out.println(+count+"개의 정수를 입력하세요");
        for(int i=0;i<count;i++)
        {
          numbers[i]=scanner.nextInt();
        }
        small=big=numbers[0];
        for(int i=1;i<count;i++)
        {
            if(numbers[i]<small)
            {
                small=numbers[i];
            }
            if(numbers[i]>big)
            {
                big=numbers[i];
            }
        }


        System.out.println("가장 적은 정수:"+small);
        System.out.println("가장 큰 정수: "+big);
    }
}
