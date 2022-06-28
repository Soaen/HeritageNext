package fr.exemple.beans;

public class House {
    protected int surface;
    protected Door door;

    public House(int surface) {
        this.surface = surface;
        door = new Door();
    }
    public void display(){
        System.out.println("Je suis une maison, ma surface est de " + surface + " m²");
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }
    public Door getDoor(){
        return door;
    }
}
