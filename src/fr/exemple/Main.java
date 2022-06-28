package fr.exemple;

import fr.exemple.beans.Apartment;
import fr.exemple.beans.Person;
import fr.exemple.beans.Student;
import fr.exemple.beans.Teacher;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.sayHello();
//        Student student = new Student();
//        student.setAge(15);
//        student.sayHello();
//        student.goToClasses();
//        student.displayAge();
//        Teacher teacher = new Teacher();
//        teacher.setAge(40);
//        teacher.sayHello();
//        teacher.explain();

        Apartment apart = new Apartment();
        Person person = new Person();
        person.setHouse(apart);
        person.display();
    }
}
