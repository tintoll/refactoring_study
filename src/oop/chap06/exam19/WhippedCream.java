package oop.chap06.exam19;

public class WhippedCream extends Decorator{
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }
    public void brewing() {
        super.brewing();
        System.out.print("Adding WhippedCream ");
    }
}

