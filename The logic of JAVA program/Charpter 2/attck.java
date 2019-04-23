class hero{
    String name;
    int hp;
    int mp;
    int danmege;
}

public class attck extends hero{
    public void fuck(){
        System.out.println(name);
    }
    public void fuck(hero h1){
        System.out.println(name + h1.name);
    }
    public static void main(String args[]){
        attck invoker = new attck();
        invoker.name = "祈求者";

        hero h1 = new hero();
        h1.name = "力丸";

        invoker.fuck();
        invoker.fuck(h1);
    }
}

//重载