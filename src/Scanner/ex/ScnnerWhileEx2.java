package Scanner.ex;

import java.util.Scanner;

public class ScnnerWhileEx2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while(true)
        {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료):");
            int price=input.nextInt();
            System.out.print("구마해려는 수량을 입력하세요:");
            int num= input.nextInt();
            System.out.println("총 비용: "+price*num);

            if(price==-1)
            {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
