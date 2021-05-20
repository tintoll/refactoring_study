package oop.chap05.exam08;

public class Point <T, V>{
    T x;
    V y;
    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }
    public T getX() {
        return x;
    }
    public V getY() {
        return y;
    }
}
