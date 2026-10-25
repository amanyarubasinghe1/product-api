package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct(){

    }
    public DigitalProduct(String downloadUrl, double fileSizeMB) {
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }
    public String getDownloadUrl() {
        return downloadUrl;
    }
    public double getFileSizeMB() {
        return fileSizeMB ;
    }

}
