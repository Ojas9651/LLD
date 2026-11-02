import java.util.*;
import java.util.ArrayList;

class ShoppingCart{

    List<Product> p;
    double total = 0;

    public ShoppingCart(){
        this.p = new ArrayList<>();
    }

    public void add(Product p){
        this.p.add(p);
        total += p.getPrice();
    }

    public List<Product> get(){
        return p;
    }

    public double getTotal(){
        return total;
    }

}