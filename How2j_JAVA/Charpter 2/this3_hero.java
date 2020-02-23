public class this3_hero{
    String name;
    int hp;

    public this3_hero(String name){
        this.name = name;
    }
    public this3_hero(String name,int hp){
        this(name);
        this.hp = hp;
    }

    public static void main(String[] args){
        this3_hero riki = new this3_hero("riki",500);
        System.out.println(riki.name);
        System.out.println(riki.hp);
    }
}