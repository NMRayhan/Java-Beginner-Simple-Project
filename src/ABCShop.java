
public class ABCShop {
    String name;
    double salery,k,l;
    int id;
    

    public ABCShop(int id, String name, double salery) {
        this.id = id;
        this.name = name;
        this.salery = salery;
    }
    double calculatesalery(double s){
        return k = s*30;
    }
    double Bonus(int p){
        
        if(p>100){
            int pl = p/100;
            return l = pl*500.0;
        }
        else 
            return 0;
    }
    double total(){
        return k+l;
    }
}
