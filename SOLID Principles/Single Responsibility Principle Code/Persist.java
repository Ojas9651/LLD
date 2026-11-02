class Persist{

    ShoppingCart cart;

    public Persist(ShoppingCart cart){
        this.cart = cart;
    }

    public void persist(){
        System.out.println("Cart data saved");
    }
}