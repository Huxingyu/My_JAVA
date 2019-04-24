class hero{
    String name;
    int hp;
}

public class reload_hero extends hero{
    public void attck(){
        System.out.println(name);
    }
    public void attck(hero h1){
        System.out.println(name+" "+h1.name);
    } 
    public static void main(String[] args){
        reload_hero invoker = new reload_hero();
        invoker.name = "invoker";

        hero riki = new hero();
        riki.name = "riki";
        
        invoker.attck();
        invoker.attck(riki);
    }
} 