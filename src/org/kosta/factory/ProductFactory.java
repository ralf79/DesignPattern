package org.kosta.factory;

import org.kosta.product.Product;

public class ProductFactory {
    public static Product getProduct(ProductAbstractFactory product) {
        return product.createProduct();
    }
}


