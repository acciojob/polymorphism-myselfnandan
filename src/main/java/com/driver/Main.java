package com.driver;

public class Main {
        public static class Product {

        public int product(int x, int y) {
                System.out.println("Product of x and y: " + x*y);
        }

        public int product(int x, int y, int z) {
            System.out.println("Product of x , y and z : " + x * y * z);
        }
  
        public double product(double x, double y) {
            System.out.println("Product of double x and y: " + x*y);
        }
    }

    public static void main(String[] args) {

        Product p = new Product();
        p.product(2, 3);
        p.product(2, 3, 4);
        p.product(2.5, 4.0);
    }
}
