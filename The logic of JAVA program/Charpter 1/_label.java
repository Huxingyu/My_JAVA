import java.util.Scanner;

public class _label{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int temp = x.nextInt();
        outloop:
        for(int i=0;i<temp;i++){
            for(int j=0;j<temp;j++){
                System.out.println(i+":"+j);
                if(j%2==0){
                    break outloop; 
                }
            }            
        }
    }
}