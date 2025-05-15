package StructuralDesignPattern.Composite;

/*
 *      
 *      
 *     
 *     
 */

public class Main {
   public static void main(String[] args) {
    
    Container mainContainer = new Container();
    
    Graphic rectangle1 = new Rectangle();

    Container container1 = new Container();
    Container container2 = new Container();
    Container container3 = new Container();



    Graphic square1 = new Square();
    Graphic square2 = new Square();
    Container container4 = new Container();

    Graphic square3 = new Square();
    Container container5 = new Container();


    Graphic line1 = new Line();
    Graphic line2 = new Line();
    Graphic line3 = new Line();   

    container4.add(line1);
    container4.add(line2);

    container5.add(line3);

    container1.add(square1);

    container2.add(square2);
    container2.add(container4);

    container3.add(square3);
    container3.add(container5);

    mainContainer.add(rectangle1);
    mainContainer.add(container1);
    mainContainer.add(container2);
    mainContainer.add(container3);

   } 
    
}
