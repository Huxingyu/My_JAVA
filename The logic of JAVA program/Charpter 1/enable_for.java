public class enable_for{
    public static void main(String[] args){
        int a[]=new int[]{2,3,1,5,4};
        for(int i=0;i<a.length;i++){
            int each=a[i];
            System.out.println(each);
        }
        for(int _each:a){
            System.out.println(_each);
        }   
    }
}