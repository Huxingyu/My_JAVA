public class shuzu2{
    public static void main(String[] args){
        int[] a=new int[5];
        System.out.println(a[1]);   //没有赋值，使用默认值
        for(int i=0;i<5;i++){
            a[i]=i;
        }
        System.out.println(a[1]);
    }
}