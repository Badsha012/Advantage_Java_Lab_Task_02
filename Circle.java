class Circle {
    private double radius;

    public Circle() {}

    public void setRadius(double radius) { this.radius = radius; }
    
    public double getRadius() { return radius; }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}