/* Lab 8:Polymorphism
This is Step 1 of the program in Lab6 and carried over to Lab 7 and 8: Build the address class using UML
* @author ravneetkaur0125
 */
package cma;

public class Address {

    //Declaring the parameters of Address class as per the UML
    private String street;
    private String city;
    private String province;
    private String postalCode;

    public Address() {
        /* Creating an empty constructor to initialize the class as compiler will not generate itself
        since we have a constructor defined in the program */
    }

    //Defining the constructor to initialize the parameters of the Address class
    public Address(String street, String city, String province, String postalCode) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    //Getter for street field
    public String getStreet() {
        return street;
    }

    //Setter for street field
    public void setStreet(String street) {
        this.street = street;
    }

    //Getter for city field
    public String getCity() {
        return city;
    }

    //Setter for city field
    public void setCity(String city) {
        this.city = city;
    }

    //Getter for Province field
    public String getProvince() {
        return province;
    }

    //Setter for Province field
    public void setProvince(String province) {
        this.province = province;
    }

    //Getter for Postal Code field
    public String getPostalCode() {
        return postalCode;
    }

    //Setter for Postal Code field
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    //Getter for Full Address field with definition - using all other getters in the class
    public String getFullAddress() {
        return getStreet() + "," + getCity() + "," + getProvince() + "," + getPostalCode();
    }
}
