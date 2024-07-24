package array;
import java.util.Scanner;
/*
사용자에게 5개의 정수를 입력받아서 배열에 저장, 입력 순서대로 출력
출력시 출력 포맷은 1,2,3,4,5와 같이 , 쉼표 사용해서 구분, 마지막에는 쉼표를 넣지
않아야 함
 */
public class ArrayEx1 {
    public static void main(String[] args) {
  Scanner scanner=new Scanner(System.in);
        int [] numbers=new int[5];
        System.out.println("정수를 입력하세요: ");
        for(int i=0;i<numbers.length;i++)
        {
         numbers[i]=scanner.nextInt();
        }
        System.out.println("출력");
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]);
            if(i< numbers.length-1)
            {
                System.out.print(",");
            }
        }
    }
}
