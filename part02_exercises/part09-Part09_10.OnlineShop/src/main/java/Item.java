
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class Item {
    private String productName;
    private int qty;
    private int unitPrice;

    public Item(String productName, int qty, int unitPrice) {
        this.productName = productName;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return unitPrice * qty;
    }
    
    public void increaseQuantity() {
        qty++;
    }
    
    public String toString() {
        return productName + ": " + qty;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.productName);
        hash = 83 * hash + this.unitPrice;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.unitPrice != other.unitPrice) {
            return false;
        }
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
