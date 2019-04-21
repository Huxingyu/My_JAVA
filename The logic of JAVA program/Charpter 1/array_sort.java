import java.util.Arrays;

public class array_sort{
    public static void main(String[] args){
        int a[]=new int[]{1,3,6,2,4,5};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}