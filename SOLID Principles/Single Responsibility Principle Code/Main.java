class Main{

    public static void main(String[] args){
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Iphone", 100000);

        ShoppingCart cart = new ShoppingCart();

        cart.add(p1);
        cart.add(p2);

        System.out.println(cart.getTotal());

        PrintInvoice print = new PrintInvoice(cart);

        print.print();

        Persist persist = new Persist(cart);
        persist.persist();
    }
}