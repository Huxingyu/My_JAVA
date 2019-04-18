public class Hero{  //类

    String name;    //属性
    int hp;
    int armor;
    int movespeed;

    void keng(){    //方法
        System.out.println("noobs");
    }
    float armor(){
        return armor;
    }
    void addspeed(int speed){
        movespeed = movespeed +speed;
    }

    public static void main(String args[]){
        Hero invoker = new Hero();
        invoker.name = "祈求者";
        invoker.armor = 5;
        invoker.hp = 600;
        invoker.movespeed = 350;
        System.out.println(invoker.movespeed);
        invoker.addspeed(150);
        System.out.println(invoker.movespeed);
    }
}   