import java.util.List;

class PrintInvoice{

    ShoppingCart cart;

    public PrintInvoice(ShoppingCart cart){
        this.cart = cart;
    }

    public void print(){
        List<Product> p = cart.get();


        System.out.println("Invoice");
        
        for(Product pr : p){
            System.out.println(pr.name + " : " + pr.price);
        }

        System.out.println("Total : " + cart.getTotal());
    }
}