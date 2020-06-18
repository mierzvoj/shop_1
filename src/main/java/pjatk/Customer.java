package pjatk;

import java.util.*;

public class Customer {
    int clientId;
    public List<Product> productsPurchase = new ArrayList<>();

    public Customer(int clientId) {
        this.clientId = clientId;
        this.productsPurchase = productsPurchase;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public List<Product> getProductsPurchase() {
        return productsPurchase;
    }

    public void setProductsPurchase(List<Product> productsPurchase) {
        this.productsPurchase = productsPurchase;
    }
}
