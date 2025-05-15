package Prototype;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(Rectangle source)
    {
        super(source);
        this.height = source.height;
        this.width = source.width;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
    
    
}
