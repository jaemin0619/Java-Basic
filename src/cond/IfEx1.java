package cond;

public class IfEx1 {
    public static void main(String[] args) {
        int score=70;
        if(score>=95)
        {
            System.out.println("학점은 A입니다.");
        }
        else if(score>=85)
        {
            System.out.println("학점은 B입니다.");
        }
        else if(score>=75)
        {
            System.out.println("학점은 C입니다.");
        }
        else if(score>=65)
        {
            System.out.println("학점은 D입니다.");
        }
        else if(score<60)
        {
            System.out.println("학점은 F입니다.");
        }

    }
}
