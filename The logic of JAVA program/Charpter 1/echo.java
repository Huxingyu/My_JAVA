public class echo{
    public static void main(String[] args){
        int a[]=new int[]{3,1,7,4,5};
        int max=-1;
        for(int each:a){
            if(each > max){
                max=each;
            }
        }
        System.out.println(max);
    }
}