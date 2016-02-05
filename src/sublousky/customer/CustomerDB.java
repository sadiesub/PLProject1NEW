package sublousky.customer;

public class CustomerDB {

    public static Customer getCustomer(String custNum) {
        // In a more realistic application, this code would
        // get the data for the product from a database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
        Customer customer = new Customer();

        // fill the Customer object with data
        customer.setCustNum(custNum);
        if (custNum.equalsIgnoreCase("1001")) {
            customer.setName("Barbara White");
            customer.setAddress("3400 Richmond Parkway #3423");
            customer.setCity("Bristol");
            customer.setState("CT");
            customer.setPostalCode("06010");
        } else if (custNum.equalsIgnoreCase("1002")) {
            customer.setName("Karl Vang");
            customer.setAddress("327 Franklin Street");
            customer.setCity("Edina");
            customer.setState("MN");
            customer.setPostalCode("55435");
        } else if (custNum.equalsIgnoreCase("1003")) {
            customer.setName("Ronda Chavan");
            customer.setAddress("518 Comanche Dr.");
            customer.setCity("Greensboro");
            customer.setState("NC");
            customer.setPostalCode("27410");
        } else {
            customer.setName("Unknown");

        }
        return customer;
    }
}