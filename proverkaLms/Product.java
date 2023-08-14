package proverkaLms;

import java.time.LocalDate;
import java.util.Random;

public class Product {
    private String productName;
    private int expDay;
    private boolean isFresh;
    private LocalDate producedOn;
    private String placeOfProducts;

    public Product(String productName, int expDay) {
        this.productName = productName;
        this.expDay = expDay;
        generateDate();
        setPlace();
        isFresh();
    }

    public String getProductName() {
        return productName;
    }
    public void isFresh(){
        int ex = 0;
        if (this.placeOfProducts.equalsIgnoreCase("Show-Case")){
            ex = this.expDay/2;
        }else{
            ex = this.expDay;
        }
        if(LocalDate.now().isAfter(this.producedOn.plusDays(ex))){
            this.isFresh = false;
        }else{
            this.isFresh = true;
        }
    }
    public void generateDate(){
        Random random = new Random();
        this.producedOn=LocalDate.of(2023,random.nextInt(8)+1,random.nextInt(30)+1);
    }
    public void setPlace(){
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if(randomNumber==1){
            this.placeOfProducts = "Show-Case";
        }else{
            this.placeOfProducts = "Ise-Box";
        }
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getExpDay() {
        return expDay;
    }

    public boolean getIsFresh() {
        return this.isFresh;
    }

    public LocalDate getProducedOn() {
        return producedOn;
    }

    public void setProducedOn(LocalDate producedOn) {
        this.producedOn = producedOn;
    }

    public String getPlaceOfProducts() {
        return placeOfProducts;
    }

    public void setPlaceOfProducts(String placeOfProducts) {
        this.placeOfProducts = placeOfProducts;
    }
}