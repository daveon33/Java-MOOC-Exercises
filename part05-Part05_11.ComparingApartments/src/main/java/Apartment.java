
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
       if(this.squares > compared.getSquares()) {
           return true;
       }
       
       return false;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs((squares * princePerSquare) - (compared.getSquares() * compared.getPrincePerSquare()));
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if(squares * princePerSquare > compared.getSquares() * compared.getPrincePerSquare()) {
            return true;
        }
        
        return false;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getSquares() {
        return squares;
    }

    public void setSquares(int squares) {
        this.squares = squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }

    public void setPrincePerSquare(int princePerSquare) {
        this.princePerSquare = princePerSquare;
    }
    
    

}
