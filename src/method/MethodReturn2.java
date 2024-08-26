package method;

public class MethodReturn2 {
    public static void main(String[] args) {
     checkage(20);
    }
    public static void checkage(int age){
        if(age>=18)
        {
            System.out.println("입장하세요.");
        }
        else {
            System.out.println("출입 불가합니다.");
        }
    }
}
