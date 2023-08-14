package proverkaLms;

import proverkaLms.Milk;
import proverkaLms.Product;
import proverkaLms.Salt;
import proverkaLms.Stew;

public class Main {
    public static void main(String[] args) {
        Product[]products = new Product[]{
                new Milk("Milk",60),
                new Milk("Milk",60),
                new Milk("Milk",60),
                new Milk("Milk",60),
                new Milk("Milk",60),
                new Corn("Corn",150),
                new Corn("Corn",150),
                new Corn("Corn",150),
                new Corn("Corn",150),
                new Corn("Corn",150),
                new Fish("Fish",20),
                new Fish("Fish",20),
                new Fish("Fish",20),
                new Fish("Fish",20),
                new Fish("Fish",20),
                new Stew("Stew",180),
                new Stew("Stew",180),
                new Stew("Stew",180),
                new Stew("Stew",180),
                new Stew("Stew",180),
                new Salt("Salt",0),
                new Salt("Salt",0),
                new Salt("Salt",0),
                new Salt("Salt",0),
                new Salt("Salt",0),
        };
        Stor stor = new Stor();
        stor.setProducts(products);
        stor.doInspection();
    }
}