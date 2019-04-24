public class class_Hero{

    String name;
    int hp;

    public class_Hero(String name,int hp){    //实例化优雅化JAVA代码
        this.name = name;
        this.hp = hp;
    }

    public void attack(class_Hero hero,int num){
        //hero.hp = hp - num;       //注意，如果直接用hp的话，数值为实例化的数值
        hero.hp = hero.hp -num;     //在这里，hp=500,hero.hp=600
    }

    public static void main(String[] args){
        class_Hero invoker = new class_Hero("祈求者",600);
        class_Hero riki = new class_Hero("力丸",500);

        riki.attack(invoker,100);
        System.out.println(invoker.hp);
    }
}