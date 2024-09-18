package mypack2;

public class Main {
    public static void main(String[] args) {
Person myObj = new Person(); //Create an instance of Person

//Set values using setter methods
myObj.setName("Lumbini");
myObj.setAge(23);
myObj.setCountry("Sri Lanka");

//Get values using getter methods
String name = myObj.getName();
int age = myObj.getAge();
String country = myObj.getCountry();

//print the values
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Country: "+country);
    }
}