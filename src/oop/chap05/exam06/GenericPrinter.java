package oop.chap05.exam06;

public class GenericPrinter<T> {
    private T material;  // T 자료형으로 선언

    public void setMaterial(T material) {
        this.material = material;
    }
    public  T getMaterial() {
        return material;
    }
    public String getString() {
        return material.toString();
    }
}
