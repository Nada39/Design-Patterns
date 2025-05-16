package Prototype;

public class Circle extends Shape{
    private int radius;

    public Circle(){}

    public Circle(Circle source)
    {
        super(source);
        this.radius = source.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
    
    
}
