public class a004{
    public static void main(String[] args){
        int[] x = {1,2,3,4};
        int sum = 0; 
        for(int i=0;i<x.length;i++){
            sum += x[i];
        }
        System.out.println(sum/x.length);
        double y = sum/x.length;
        System.out.printf("%.2f",y);
        System.out.printf("\n");
    }
}