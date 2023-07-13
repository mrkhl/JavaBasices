package om.gov.omantax;

import om.gov.omantax.entity.Order;
import om.gov.omantax.entity.OrderStatus;
import om.gov.omantax.entity.Product;
import om.gov.omantax.entity.User;
import om.gov.omantax.entity2.*;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import static om.gov.omantax.entity.OrderStatus.PLACED;

public class Main {

    public static void main(String[] args) {

/*        <<<<<<<<<< write in file using stream fileWriter>>>>>>>>>>>>>>>>>>
        try {
            FileWriter fileWriter = new FileWriter("hamada.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Mohammed finished his assignments");
            bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

/*
                        <<<<<<InputStream&OutPutStream>>>>>>>>>>>
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("hamada.png");
            byte[] buffer = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream("cover.png");
            while (fileInputStream.read(buffer) != -1){
                fileOutputStream.write(buffer);
            }
            fileOutputStream.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


/*
                               <<<<<<<< Read from txt file using stream FileReader>>>>>>>>>>>
        try {
            FileReader fileReader = new FileReader("hamada.txt");
            BufferedReader bufferedReader =new BufferedReader(fileReader);

            String line1 = bufferedReader.readLine();
            System.out.println(line1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        //Collection and Map >>>>>>>>>>


/*        List<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        System.out.println(list);*/


        //Collection and Map >>>>>>>>>>




        //polymorphism,interference,Generics>>>>>>>
//        Rectangle rec = new Rectangle(10.0,10.0);
//        Triangle tri = new Triangle(5.0,5.0);
//        Square sqr = new Square(10.0);
//        Circle cir = new Circle(2.5);
//
//        Shape[] shapes1 = new Shape[4];
//        shapes1[0] = rec;
//        shapes1[1] = tri;
//        shapes1[2] = cir;
//        shapes1[3] = sqr;
//
//        double sum = sumOfAres(shapes1);
//        System.out.println(sum);
    //             <<<<<<<<<polymorphism,interference,Generics>>>>>>>>>>>

//
//        Product pro = new Product(12,"hammd",1.0);
//        Order ord = new Order(11, LocalDateTime.now(),15.5,15.5, OrderStatus.OUT_FOR_DELIVERY,new User());
//        ord.setStatus(PLACED);
//
//        System.out.println(pro);
//        System.out.println(ord);
//        System.out.println(ord.getStatus());


    }
    //                   <<<<<<<<<<<<polymorphism,interference,Generics>>>>>>>
//    public static double sumOfAres(Shape[] shapes){
//        double sum =0;
//        for (Shape sh: shapes){
//            sum+=sh.calcArea();
//        }
//        return sum;
//    }
    //polymorphism,interference,Generics<<<<<<<
}