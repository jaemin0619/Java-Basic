package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] arr=
        {
            {1,2,3},
            {4,5,6}
        };

        for(int row=0;row<arr.length;row++)
        {
            for(int column=0;column<3;column++)
            {
                System.out.println(arr[row][column]+" ");
            }
            System.out.println(); //한 행이 끝나면 라인을 변경한다.
        }
    }
}
