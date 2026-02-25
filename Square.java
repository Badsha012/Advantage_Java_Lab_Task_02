class Square {
    private double side;

    public Square() {}

    public void setSide(double side) { this.side = side; }
    
    public double getSide() { return side; }
    
    public double getArea() {
        return side * side;
    }
}