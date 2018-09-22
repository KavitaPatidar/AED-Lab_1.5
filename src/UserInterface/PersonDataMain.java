/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Address; 
import Business.Person;

/**
 *
 * @author Kavita
 */
public class PersonDataMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person();
        person.setFirstName("Kavita");
        person.setLastName("Patidar");
        person.setDob("1989/06/05");
        person.setStreetAddress("360 huntington avenue");
       
        
              
        Address localAddress=new Address();
        localAddress.setStreetLine1("18 Burney Street");
        localAddress.setStreetLine2("Apartment 1");
        localAddress.setCity("Boston");
        localAddress.setState("MA");
        localAddress.setZipCode("02120");
        localAddress.setCountry("USA");
        
        Address homeAddress=new Address();
        homeAddress.setStreetLine1("55 Palda");
        homeAddress.setStreetLine2("District Neemuch");
        homeAddress.setCity("Neemuch");
        homeAddress.setState("Madhya Pradesh");
        homeAddress.setZipCode("458118");
        homeAddress.setCountry("India");
        
        Address workAddress=new Address();
        workAddress.setStreetLine1("360 Huntington Avenue");
        workAddress.setStreetLine2("Snell Engineering");
        workAddress.setCity("Boston");
        workAddress.setState("MA");
        workAddress.setZipCode("02115");
        workAddress.setCountry("USA");
        
        
        person.setLocalAddress(localAddress);
        person.setHomeAddress(homeAddress); 
        person.setWorkAddress(workAddress);
        
        
               
                
        
        System.out.println("1. First Name: "+person.getFirstName()
                +"\n2. Last Name: "+person.getLastName()
                +"\n3. DOB: "+person.getDob()
                +"\n4. Street Address: "+person.getStreetAddress()
                +"\n5. Work Address:"+person.getWorkAddress().getStreetLine1()+"\n                "+person.getWorkAddress().getStreetLine2()+"\n                "+person.getWorkAddress().getCity()+"\n                "+person.getWorkAddress().getState()+"\n                "+person.getWorkAddress().getZipCode()+"\n                "+person.getWorkAddress().getCountry()
                +"\n6. Local Address:"+person.getLocalAddress().getStreetLine1()+"\n                 "+person.getLocalAddress().getStreetLine2()+"\n                 "+person.getLocalAddress().getCity()+"\n                 "+person.getLocalAddress().getState()+"\n                 "+person.getLocalAddress().getZipCode()+"\n                 "+person.getLocalAddress().getCountry()
                +"\n7. Home Address:"+person.getHomeAddress().getStreetLine1()+"\n                "+person.getHomeAddress().getStreetLine2()+"\n                "+person.getHomeAddress().getCity()+"\n                "+person.getHomeAddress().getState()+"\n                "+person.getHomeAddress().getZipCode()+"\n                "+person.getHomeAddress().getCountry());
        
        
        
    }
    
}
