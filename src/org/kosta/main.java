package org.kosta;

import org.kosta.factory.ComputerFactory;
import org.kosta.factory.ProductFactory;
import org.kosta.factory.TicketFactory;
import org.kosta.product.Product;

	public class main {
	    public static void main(String[] args) {
	        Product com = ProductFactory.getProduct(new ComputerFactory("com1", 2000));
	        Product tk = ProductFactory.getProduct(new TicketFactory("°ø¿¬", 100000));
	        System.out.println( com.toString() );
	        System.out.println( tk.toString() );
	    }
	}

