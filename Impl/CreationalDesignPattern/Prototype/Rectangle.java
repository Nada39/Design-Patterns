package Prototype;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(){}

    public Rectangle(Rectangle source)
    {
        super(source);
        this.height = source.height;
        this.width = source.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
    
    
}
