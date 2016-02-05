package murach.customer;

import java.text.NumberFormat;

public class Customer {

    private String name;
    private String address;
    private String city;
    private String state;
    private String postalCode;

    public Customer() {
        name = "";
        address = "";
        city = "";
        state = "";
        postalCode = "";
    }

    public void setName(String name){
        this.name = name;
    }

    public void getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(price);
        return priceFormatted;
    }    
}