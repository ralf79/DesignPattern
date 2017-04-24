package org.kosta;

public class Main {

	public static void main(String[] args) {
		Seller cupSeller = new CupSeller();
        Seller phoneSeller = new PhoneSeller();
        
        Mart mart1 = new Mart(cupSeller);
        mart1.order();
        Mart mart2 = new Mart(phoneSeller);
        mart2.order();
	}

}
