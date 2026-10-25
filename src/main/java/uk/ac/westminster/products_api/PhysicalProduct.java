package uk.ac.westminster.products_api;


public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){

    }
    public PhysicalProduct(String name, double weightKg, String dimensions) {
        super(id,name,price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }
    public double getWeightKg() {
        return weightKg;
    }
    public void setWeightKg() {
        this.weightKg = weightKg;
    }
    //Task 9
    // A PhysicalProduct IS-A Product because it
    // has the common properties of every Product.
    
    // A ShoppingCart is NOT a Product because
    // it contains products (HAS-A relationship).
}