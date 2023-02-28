package org.example;

public class Main {
    public static void main(String[] args) {
        //set
        Product product1 = new Product();
        product1.setName("Delongi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(15);
        product1.setImageUrl("image.jpg");

        Product product2 = new Product();
        product2.setName("Smack Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitInStock(15);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Starbucks Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitInStock(15);
        product3.setImageUrl("image2.jpg");

        Product product4 = new Product();
        product4.setName("Kaft Kahve Makinesi");
        product4.setDiscount(7);
        product4.setUnitPrice(7500);
        product4.setUnitInStock(15);
        product4.setImageUrl("image2.jpg");

        Product[] products = {product1, product2, product3, product4};
        for (Product product : products) {
            System.out.println(product.getName());

        }
        IndividualCustomer individualCustomer=new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("05454190265");
        individualCustomer.setCustomerNumber("123456789");
        individualCustomer.setFirstName("Burak");
        individualCustomer.setLastName("Güner");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Guner Inc.");
        corporateCustomer.setPhoneNumber("5465162");
        corporateCustomer.setTaxNumber("12345678975");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers={individualCustomer,corporateCustomer};

    }
}