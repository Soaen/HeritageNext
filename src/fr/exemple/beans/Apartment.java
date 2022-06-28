package fr.exemple.beans;

public class Apartment extends House{

    public Apartment() {
        super(50);
    }

    public void display()
    {
        System.out.println("Je suis un appartement, ma surface est " + surface + " m²");
    }
}
