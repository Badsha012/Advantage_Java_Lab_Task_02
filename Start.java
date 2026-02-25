public class Start {
    public static void main(String[] args) {
        // Demonstrate Rectangle
        Rectangle rect = new Rectangle();
        rect.setLength(10.0);
        rect.setWidth(5.0);
        System.out.println("Rectangle: Length=" + rect.getLength() + 
                           ", Width=" + rect.getWidth() + 
                           ", Area=" + rect.getArea());

        // Demonstrate Triangle
        Triangle tri = new Triangle();
        tri.setBase(8.0);
        tri.setHeight(12.0);
        System.out.println("Triangle: Base=" + tri.getBase() + 
                           ", Height=" + tri.getHeight() + 
                           ", Area=" + tri.getArea());

        // Demonstrate Circle
        Circle circ = new Circle();
        circ.setRadius(7.0);
        System.out.println("Circle: Radius=" + circ.getRadius() + 
                           ", Area=" + String.format("%.2f", circ.getArea()));

        // Demonstrate Square
        Square sq = new Square();
        sq.setSide(4.0);
        System.out.println("Square: Side=" + sq.getSide() + 
                           ", Area=" + sq.getArea());
    }
}