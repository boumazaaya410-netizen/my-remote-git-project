package com.l3.gl.controller;

import com.l3.gl.Product;
import com.l3.gl.User;
// import com.l3.gl.view.Ui; // علقناه مؤقتًا إذا Ui غير موجودة

public class Controller {

    // private Ui view; // مؤقت
    private Product product;
    private User user;

    public Controller(Product product, User user) {
        this.product = product;
        this.user = user;
    }

    public String sayHello() {
        return "Hello from Controller";
    }
}
