import java.util.Arrays;

public class copyof{
    public static void main(String[] args){
        int a[]=new int[]{1,2,3,4,5};
        int b[]=Arrays.copyOfRange(a,0,3);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}