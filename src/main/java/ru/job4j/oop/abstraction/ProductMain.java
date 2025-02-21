package ru.job4j.oop.abstraction;

public class ProductMain {
    public static void main(String[] args) {
        TimesTwo timesTwo = new TimesTwo(3);
        System.out.println(timesTwo.mutiply(5));
        Product product = new Product(5) {
            @Override
            public int mutiply(int val) {
                return super.mutiply(val * val);
            }
        };
        System.out.println(product.mutiply(3));
        System.out.println(Product.mutiplyStatic(3));
    }
}
