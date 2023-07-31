package org.example.modle;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @Column(name = "pid")
    int productId;
    @Column(name = "pname")
    String productname;
    @Column(name = "price")
    float productPrice;
    @Column(name = "qty")
    int quantity;
    @Column(name = "tax")
    float productTax;
    @Column(name = "totalPrice")
    float totalPrice;

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getProductTax() {
        return productTax;
    }

    public void setProductTax(float productTax) {
        this.productTax = productTax;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productname='" + productname + '\'' +
                ", productPrice=" + productPrice +
                ", quantity=" + quantity +
                ", productTax=" + productTax +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public Product(int productId, String productname, float productPrice, int quantity, float productTax, float totalPrice) {
        this.productId = productId;
        this.productname = productname;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.productTax = productTax;
        this.totalPrice = totalPrice;
    }
}
