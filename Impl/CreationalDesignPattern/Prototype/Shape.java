package Prototype;

public abstract class Shape {
    private int x = 1;
    private int y = 2;
    private String color;

    Shape(){}
    Shape(Shape source){
        this();
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract Shape clone();
}
