class item{
    String name;
    int price; 
}

public class weapon extends item{
    int damage;
    public static void main(String[] args){
        weapon deadalus = new weapon();
        deadalus.name = "deadalus";
        deadalus.price = 5200;
        deadalus.damage = 80;
    }
}

//继承