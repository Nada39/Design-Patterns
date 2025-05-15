package Prototype;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    Shape(Shape source){
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();
}
