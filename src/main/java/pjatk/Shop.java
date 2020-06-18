package pjatk;
import java.math.*;
import java.util.*;
import java.util.ArrayList;
import java.lang.annotation.*;

public class Shop {

    //@ShopAnn(key = "- 1")
    String shopName;
    int prodId;
    String prodName;
    Product product;

    public List<Product> productListToSale = new ArrayList<>();
    public List<Product> prodListSold = new ArrayList<>();

    public Shop(int prodId, String prodName, List<Product> productListToSale, List<Product> prodListSold, String shopName) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.productListToSale = productListToSale;
        this.prodListSold = prodListSold;
        this.shopName = shopName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProductListToSale() {
        return productListToSale;
    }

    public void setProductsStock(List<Product> productListToSale) {
        this.productListToSale = productListToSale;
    }

    public List<Product> getProductsSold() {
        return prodListSold;
    }

    public void setProductsSold(List<Product> prodListSold) {
        this.prodListSold = prodListSold;
    }
}
