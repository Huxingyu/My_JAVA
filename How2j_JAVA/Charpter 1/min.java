import java.util.Random;

public class min{
    public static void main(String[] args){
        int[] x=new int[5];
        for(int i=0;i<5;i++){
            x[i]=(int)(Math.random()*100);
        }
        int min=100;
        for(int i=0;i<5;i++){
            if(x[i]<min){
                min=x[i];
            }
        }
        System.out.println(min);
    }
}