//this代表普通话之中的“我”

//在JAVA中，this即代表当前对象

public class this_hero{
    public void ShowAdderssInMemory(){
        System.out.println(this);
    }
    
    public static void main(String[] args){
        this_hero riki = new this_hero();

        for(int i=0;i<2;i++){
            System.out.println(riki);
            riki.ShowAdderssInMemory();
        }
    }
}