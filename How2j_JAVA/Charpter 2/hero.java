//直接引用+间接引用
//notice this format,ninth raw.

public class hero{
    String name;
    int hp;
    public static void main(String[] args){
        hero invoker = new hero();
        hero _invoker = invoker;
    } 
}