import java.util.Arrays;

public class array_fill_and_equal{
    public static void main(String[] args){
        int a[]=new int[3];
        Arrays.fill(a, 5);
        System.out.println(Arrays.toString(a));
        int b[]=new int[3];
        Arrays.fill(b, 4);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.equals(a, b));
    }
}