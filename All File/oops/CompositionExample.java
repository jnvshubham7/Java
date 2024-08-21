// The Address class represents a basic address
class Address {
    private String street;
    private String city;
    private String state;
    
    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
    
    // Getters and setters
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
}

// The Person class represents a person with an address
class Person {
    private String name;
    private Address address;
    
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
}

// Main class to demonstrate composition
public class CompositionExample {
    public static void main(String[] args) {
        // Create an Address object
        Address address = new Address("123 Main St", "Cityville", "State");
        
        // Create a Person object with the Address object
        Person person = new Person("John Doe", address);
        
        // Access and display the person's name and address
        System.out.println("Person: " + person.getName());
        System.out.println("Address: " + person.getAddress().getStreet() + ", " +
                           person.getAddress().getCity() + ", " +
                           person.getAddress().getState());
    }
}
