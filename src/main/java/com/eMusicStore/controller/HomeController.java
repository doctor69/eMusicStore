package com.eMusicStore.controller;

import com.eMusicStore.dao.ProductDao;
import com.eMusicStore.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class HomeController {

    private ProductDao productDao = new ProductDao();

    @RequestMapping ("/")
    public String home() {
        return "Home";

    }

    @RequestMapping ("/productList")
    public String getProducts(Model model) {

    List<Product> productList = productDao.getProductList();
    Product product = productList.get(0);
    model.addAttribute(product);

    return "productList";

    }
}
