package om.gov.omantax;

import om.gov.omantax.entity.Order;
import om.gov.omantax.entity.OrderStatus;
import om.gov.omantax.entity.Product;
import om.gov.omantax.entity.User;
import om.gov.omantax.entity2.*;

import java.time.LocalDateTime;

import static om.gov.omantax.entity.OrderStatus.PLACED;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10.0,10.0);
        Triangle tri = new Triangle(5.0,5.0);
        Square sqr = new Square(10.0);
        Circle cir = new Circle(2.5);

        Shape[] shapes1 = new Shape[4];
        shapes1[0] = rec;
        shapes1[1] = tri;
        shapes1[2] = cir;
        shapes1[3] = sqr;

        double sum = sumOfAres(shapes1);
        System.out.println(sum);

//
//        Product pro = new Product(12,"hammd",1.0);
//        Order ord = new Order(11, LocalDateTime.now(),15.5,15.5, OrderStatus.OUT_FOR_DELIVERY,new User());
//        ord.setStatus(PLACED);
//
//        System.out.println(pro);
//        System.out.println(ord);
//        System.out.println(ord.getStatus());


    }
    public static double sumOfAres(Shape[] shapes){
        double sum =0;
        for (Shape sh: shapes){
            sum+=sh.calcArea();
        }
        return sum;
    }
}