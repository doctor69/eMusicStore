package com.eMusicStore.dao;

import com.eMusicStore.model.Product;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();
        product1.setProductId("P110");
        product1.setProductName("Guitar");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("This is a Fender Guitar");
        product1.setProductPrice(1200);
        product1.setProductCondition("New");
        product1.setProductManufacturer("Fender");
        product1.setUnitInStock(100);
        product1.setProductStatus("Active");

        Product product2 = new Product();
        product2.setProductId("P120");
        product2.setProductName("Record");
        product2.setProductCategory("Records");
        product2.setProductDescription("This is Awesome 20th Century Record");
        product2.setProductPrice(25);
        product2.setProductCondition("New");
        product2.setProductManufacturer("EMI");
        product2.setUnitInStock(20);
        product2.setProductStatus("Active");

        Product product3 = new Product();
        product3.setProductId("P130");
        product3.setProductName("Speaker");
        product3.setProductCategory("Accessory");
        product3.setProductDescription("This is a Marshall's Boom Speaker");
        product3.setProductPrice(235);
        product3.setProductCondition("New");
        product3.setProductManufacturer("Marshall");
        product3.setUnitInStock(100);
        product3.setProductStatus("Active");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }

    public Product getProductById(String productId) throws IOException{
        for (Product product: getProductList()) {
            if (product.getProductId().equals(productId)){
                return product;
            }
        }
        throw new IOException("No Product Found");


    }
}
