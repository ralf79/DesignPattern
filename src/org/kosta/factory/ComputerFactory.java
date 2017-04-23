package org.kosta.factory;

import org.kosta.product.Computer;
import org.kosta.product.Product;

public class ComputerFactory implements ProductAbstractFactory {
    private String name;
    private int price;
    
    public ComputerFactory(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Product createProduct() {
        return new Computer(name, price);
    }
}


