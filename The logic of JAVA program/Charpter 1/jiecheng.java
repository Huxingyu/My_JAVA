import java.util.Scanner;

public class jiecheng{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int temp = x.nextInt();
        long  ans = 1;
        while(temp>0){
            ans = ans * temp;
            temp--;
        }
        System.out.println(ans);
    }
}