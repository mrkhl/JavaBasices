package om.gov.omantax.entity;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private LocalDateTime dateTime;
    private double price;
    private double totalDue;
    private OrderStatus status;
    private User user;

    public Order(int id, LocalDateTime dateTime, double price, double totalDue, OrderStatus status, User user) {
        this.id = id;
        this.dateTime = dateTime;
        this.price = price;
        this.totalDue = totalDue;
        this.status = status;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", price=" + price +
                ", totalDue=" + totalDue +
                ", status=" + status +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(double totalDue) {
        this.totalDue = totalDue;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
