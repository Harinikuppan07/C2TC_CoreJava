package com.tns.daythree;



public class Customer {

    // Fields

    private String customerName;

    private int customerId;

    private String customerCity;

    

    // Default Constructor

    public Customer() {

        System.out.println("Default Constructor");

    }

    

    // Parameterized Constructor

    public Customer(String customerName, int customerId, String customerCity) {

        this(); // Calling default constructor

        System.out.println("Parameterized Constructor");

        this.customerName = customerName;

        this.customerId = customerId;

        this.customerCity = customerCity;

    }

    

    // Getter and Setter for customerName

    public String getCustomerName() {

        return customerName;

    }

    

    public void setCustomerName(String customerName) {

        this.customerName = customerName;

    }

    

    // Getter and Setter for customerId

    public int getCustomerId() {

        return customerId;

    }

    

    public void setCustomerId(int customerId) {

        this.customerId = customerId;

    }

    

    // Getter and Setter for customerCity

    public String getCustomerCity() {

        return customerCity;

    }

    

    public void setCustomerCity(String customerCity) {

        this.customerCity = customerCity;

    }

    

    @Override

    public String toString() {

        return "Customer [customerName=" + customerName + 

               ", customerId=" + customerId + 

               ", customerCity=" + customerCity + "]";

    }

    

    // Main method to test the Customer class

    public static void main(String[] args) {

        // Creating a Customer object using the parameterized constructor

        Customer parameterizedCustomer = new Customer("John Doe", 123, "New York");

        

        // Printing the details of the parameterized customer

        System.out.println(parameterizedCustomer.toString());

    }

}

