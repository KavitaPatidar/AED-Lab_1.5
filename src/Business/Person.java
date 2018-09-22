/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Kavita
 */
public class Person {
    private String firstName, lastName, dob,streetAddress;
    private Address workAddress, localAddress, homeAddress;

    public Person() {
    }

    public Person(String firstName, String lastName, String dob, String streetAddress, Address workAddress, Address localAddress, Address homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.streetAddress = streetAddress;
        this.workAddress = workAddress;
        this.localAddress = localAddress;
        this.homeAddress = homeAddress;
    }

    
   
         
       public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
            }
    
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public Address getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(Address localAddress) {
        this.localAddress = localAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
    
}
