//但是，构造方法是可以重载的

//学着学着好像到了C++的一些东西了

public class build_2{
    String name;
    int hp;
    //int movespeed;

    public build_2(int movespeed){
        movespeed = movespeed;
        System.out.println(movespeed);
    }
    public build_2(String heroname,int herohp){
        name = heroname;
        hp = herohp;
        System.out.println(name);
        System.out.println(hp);
    }

    public static void main(String[] args){

        //当设置了一个含有参数的构造方法之后，无参的方法失效:
        //build_2 invoker = new build_2();

        build_2 invoker = new build_2(320);
        
        build_2 riki = new build_2("riki", 500);
    }
}