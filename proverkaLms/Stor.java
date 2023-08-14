package proverkaLms;


        import java.util.Random;

public class Stor {
    private Product[]products;

    public void doInspection(){
        int a = 1;
        System.out.println("=======================  Inspection result  =======================\n" +
                "Product      | Produced On   | Storage place   |  life days   | Fresh\n" +
                "\n" +
                "-----------+---------------+---------------+--------------+------------+\n");

        Random random = new Random();
        for (int i = 0; i < getProducts().length; i++) {
            int index = random.nextInt(i + 1);
            Product product = products[index];
            products[index]=products[i];
            products[i]=product;
        }
        for (Product p :this.products) {
            System.out.printf("%d| %s   | %s      | %s     | %d     | %s \n", a, p.getProductName(), p.getProducedOn(), p.getPlaceOfProducts(), p.getExpDay(), p.getIsFresh());
            a++;
        }
    }
    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}