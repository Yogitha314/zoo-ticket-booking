public class Ticket {
    private String ticketName;
    private int totalQuantity;
    private int available;
    private double price;

    public Ticket(String ticketName, int totalQuantity, double price) {
        this.ticketName = ticketName;
        this.totalQuantity = totalQuantity;
        this.available = totalQuantity;
        this.price = price;
    }

    public String getTicketName() { return ticketName; }
    public int getAvailable()     { return available; }
    public double getPrice()      { return price; }

    public boolean book(int count) {
        if (count <= 0 || count > available) return false;
        available -= count;
        return true;
    }

    public boolean cancel(int count) {
        if (count <= 0 || count > totalQuantity - available) return false;
        available += count;
        return true;
    }
}