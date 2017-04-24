package org.kosta;

public class CoffeeFlavor implements CoffeeOrder {
    private final String flavor;
      
    public CoffeeFlavor(String newFlavor) {
        this.flavor = newFlavor;
    }
  
    public String getFlavor() {
        return this.flavor;
    }
  
    public void serveCoffee(CoffeeOrderContext context) {
        System.out.println("커비 맛은..." + flavor + " 이고 테이블 번호는  " + context.getTable());
    }
}
