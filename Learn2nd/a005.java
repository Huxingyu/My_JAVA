public class a005{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int x = a.length;
        int[] b = new int[x];
        for(int i=0;i<x;i++){
            b[a.length-1-i] = a[i];     //a.length=5,but b[x],x.max=4
        }
        for(int i=0;i<x;i++){
            System.out.println(b[i]);
        }
    }
}