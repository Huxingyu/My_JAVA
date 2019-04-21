import java.util.Random;

public class sort_maopao{
    public static void main(String[] args){
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=(int)(Math.random()*100);
        }
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4-i;j++){ //冒泡，自己先玩一轮
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}