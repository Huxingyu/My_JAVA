//参数name名字和属性name名字一样，只能访问到参数name

public class this2_hero{

    String name;

    public void print(String _name){
        name = _name;
    }
    public void print2(String name){
        this.name = name+name;
    }
    public static void main(String[] args){

        this2_hero riki = new this2_hero();

        riki.print("力丸");
        System.out.println(riki.name);

        riki.print2("力丸");
        System.out.println(riki.name);
    }   
}