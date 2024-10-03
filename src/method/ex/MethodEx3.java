package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
     int balance=10000;

     //입금 1000
        int depositAmount=1000;
        balance=deposit(balance,depositAmount);
        balance+=depositAmount;

    }

    public static int deposit(int balance,int amount)
    {
balance=amount;
        System.out.println(amount+"원을 입금하였습니다. 현재 잔액: "+balance+"원");
   return balance;

    }

}
