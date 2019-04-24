class Iteam{
    String name;
    int price;
}
//继承->extends
public class weapon extends Iteam{
    int damage;
    public static void main(String[] args){
        weapon deadalus = new weapon();
        deadalus.name = "代达罗斯之殇";
        deadalus.price = 5530;
        deadalus.damage = 80;
    }
}
