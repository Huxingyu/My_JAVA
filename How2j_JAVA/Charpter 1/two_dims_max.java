import java.util.Random;

public class two_dims_max{
    public static void main(String[] args){
        int x[][]=new int[5][5];
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                x[i][j]=(int)(Math.random()*100);
            }
        }
        for(int[] raw:x){
            for(int temp:raw){
                System.out.println(temp);
            }
        }
        int max=-1;
        int target_i=-1,target_j=-1;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(x[i][j]>max){
                    max=x[i][j];
                    target_i=i;
                    target_j=j;
                }
            }
        }
        System.out.println(max);
        System.out.println(target_i);
        System.out.println(target_j);
    }
}