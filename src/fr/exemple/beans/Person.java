package fr.exemple.beans;

public class Person {

// Exo Person/Student/Teacher
//    int age;
//    public void setAge(int n){
//        age = n;
//    }
//
//    public void sayHello(){
//        System.out.println("Hello");
//    }

    protected String name;
    protected House house;

    public Person()
    {
        name = "Thomas";
        house = new House(150);
    }

    public Person(String name, House house)
    {
        this.name = name;
        this.house = house;
    }
    
    public void setHouse(House h)
    {
        house = h;
    }

    public void display()
    {
        System.out.println("Je m'appelle "+ name +".");
        house.display();
        house.door.display();
    }
}
