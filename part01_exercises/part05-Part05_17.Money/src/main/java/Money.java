
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
       

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money adition) {
        Money newAmount = new Money(this.euros + adition.euros, this.cents + adition.cents);
        
        return newAmount;
    }
    
    public boolean lessThan(Money compared) {
        if(this.euros > compared.euros) {
            return false;
        } else if(this.euros == compared.euros) {
            if(this.cents > compared.cents) {
                return false;
            } else {
                return true;
            }
        }
        
        return true;
    }
    
    public Money minus(Money decreaser) {
        
        if(this.lessThan(decreaser)) {
            Money noMoney = new Money(0,0);
            return noMoney;
        }
        
        if(this.cents - decreaser.cents < 0) {
            Money newMoney = new Money(this.euros - decreaser.euros - 1, 100 + (this.cents - decreaser.cents));
            return newMoney;
        }
        
        Money newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        
        return newMoney;
    }

}
