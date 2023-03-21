package BookMyShowLLD;

import BookMyShowLLD.Enums.SeatCategory;

public class Seat {
    private int seatId;
    private SeatCategory seatCategory;
    private int row;
    private int price;
    
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getSeatId() {
        return seatId;
    }
    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }
    public SeatCategory getSeatCategory() {
        return seatCategory;
    }
    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }

    
}
