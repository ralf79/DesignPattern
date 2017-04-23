package framework.idcard;

import java.util.ArrayList;
import java.util.List;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory {
    
    private List owners = new ArrayList<>();
 
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
        //IDCard들을 생산한다.
    }
 
    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
 
    public List getOwners() {
        return owners;
    }
}


