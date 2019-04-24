//构造方法

public class build_hero{
    String name;
    int hp;
    int movespeed;
    //构造方法，默认是无参构造（隐式）
    
    public build_hero(){
        System.out.println("卧槽，好几把炫酷");
    }
    public static void main(String[] args){
        build_hero invoker = new build_hero();
        invoker.name = "祈求者";
        invoker.hp = 700;
        invoker.movespeed = 320;
        System.out.print(invoker.name);
    }
}