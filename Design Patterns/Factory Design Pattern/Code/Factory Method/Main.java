public class Main{

    public static void main(String[] args){

        BurgerFactory factory = new BurgerFactory2();

        Burger burger = factory.createBurger("premium");

        burger.prepare();

    }
}

abstract class Burger{

    abstract void prepare();
}

class BasicBurger extends Burger{

    public void prepare(){
        System.out.println("You Basic Burger");
    }
}

class StandardBurger extends Burger{

    public void prepare(){
        System.out.println("You Standard Burger");
    }
}

class PremiumBurger extends Burger{

    public void prepare(){
        System.out.println("You Premium Burger");
    }
}

interface BurgerFactory{

    Burger createBurger(String type);

}

class BurgerFactory1 implements BurgerFactory{

    public Burger createBurger(String type){

        if(type == null || type == "") return null;

        if(type == "standard"){
            return new StandardBurger();
        }
        
        return new BasicBurger();
    }
    
}

class BurgerFactory2 implements BurgerFactory{

    public Burger createBurger(String type){

        if(type == null || type == "") return null;

        return new PremiumBurger();
    }
    
}