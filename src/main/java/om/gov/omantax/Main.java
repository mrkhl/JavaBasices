package om.gov.omantax;

import om.gov.omantax.entity.Order;
import om.gov.omantax.entity.OrderStatus;
import om.gov.omantax.entity.Product;
import om.gov.omantax.entity.User;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Product pro = new Product(12,"hammd",1.0);
        Order ord = new Order(11, LocalDateTime.now(),15.5,15.5, OrderStatus.OUT_FOR_DELIVERY,new User());

        System.out.println(pro);
        System.out.println(ord);
    }
}