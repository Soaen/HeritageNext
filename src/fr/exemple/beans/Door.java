package fr.exemple.beans;

public class Door {
    String color = "bleu";

    public void display(){
        System.out.println("Je suis une porte, ma couleur est " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
