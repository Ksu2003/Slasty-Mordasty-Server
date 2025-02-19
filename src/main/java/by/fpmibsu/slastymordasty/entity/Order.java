package by.fpmibsu.slastymordasty.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order extends Entity{
    private long userId;
    private List<Item> basket = new ArrayList<Item>();
    private double cost;
    private String comment;
    private Date orderDate;
    private Date deliveryDate;

    public Order(long userId, Item item, double cost, String comment, Date orderDate, Date deliveryDate) {
        this.userId = userId;
        this.basket = basket;
        this.cost = cost;
        this.comment = comment;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
    }

    public Order() {

    }

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Item> getBasket() {
        return basket;
    }

    public void setBasket(List<Item> list) {
        this.basket = list;
    }

    public void setItem(Item item) {
        this.basket = basket;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if(id != order.id) return false;
        if (userId != order.userId) return false;
        if (Double.compare(order.cost, cost) != 0) return false;
        if (!basket.equals(order.basket)) return false;
        if (!comment.equals(order.comment)) return false;
        if (!orderDate.equals(order.orderDate)) return false;
        return deliveryDate.equals(order.deliveryDate);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + basket.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + comment.hashCode();
        result = 31 * result + orderDate.hashCode();
        result = 31 * result + deliveryDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        String s = id + " user: " + userId + '\n';
        for(Item i: basket){
            s += i.toString() + '\n';
        }
        return s;
    }
}
