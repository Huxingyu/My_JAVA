public class basic_hero{
    String name;
    int hp;

    public basic_hero(){
    }

    public basic_hero(String name,int hp){
        this.name = name;
        this.hp = hp;
    }

    public void recovy(int add_hp){
        hp = hp + add_hp;
    }

    public static void main(String[] args){
        basic_hero riki = new basic_hero("力丸",500);
        System.out.println(riki.hp);
        riki.recovy(100);
        System.out.println(riki.hp);
    }
}