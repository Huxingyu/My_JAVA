public class array_copy{
    public static void main(String[] args){
        int a[]=new int[]{1,2,3};
        int b[]=new int[]{4,5,6};
        int c[]=new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        for(int i:c){
            System.out.println(i);
        }
    }
}