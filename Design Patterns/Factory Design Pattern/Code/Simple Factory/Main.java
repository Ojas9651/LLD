public class Main{

    public static void main(String[] args){

        BurgerFactory factory = new BurgerFactory();

        Burger burger = factory.createBurger("Standard");

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

class BurgerFactory{

    public Burger createBurger(String type){

        if(type == null || type == "" || type != "basic" || type != "standard" || type != "premium") return null;

        if(type == "standard") return new StandardBurger();
        else if(type == "basic") return new BasicBurger();

        return new PremiumBurger();
    }

}