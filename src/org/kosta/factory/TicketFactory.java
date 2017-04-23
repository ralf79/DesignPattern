package org.kosta.factory;

import org.kosta.product.Product;
import org.kosta.product.Ticket;

public class TicketFactory implements ProductAbstractFactory {
    private String name;
    private int price;
 
    public TicketFactory (String name, int price) {
        this.name = name;
        this.price = price;
    }
 
    public Product createProduct() {
        return new Ticket(name, price);
    }
}


