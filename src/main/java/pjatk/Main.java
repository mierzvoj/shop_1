package pjatk;

public class Main {
    public static void main(String [] args){

        Customer cust1 = new Customer(123);

        ShopService ss1 = new ShopService();
        ss1.addProd(1234, "foo", 1000 );
        ss1.addProd(12345, "foo1", 10000 );

        ss1.addSold(1234, "foo", 123);

        ss1.shopList(123);
        ss1.shoppingList(123);
        

    }
}
