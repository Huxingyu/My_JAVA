public class a006 {
    public static int cal(int x){
        x=2;
        return x;
    }
    public static void main(String[] args){
        int x=1;
        System.out.println(x);
        cal(x);
        System.out.println(x);
        int y=cal(x);
        System.out.println(y);
    }
}