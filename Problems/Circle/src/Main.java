class Circle {

    double radius;

    // write methods here

    public double getLength() {

        double length = this.radius * 2 * Math.PI;
        return length;
    }

    public double getArea() {
        double area = this.radius * this.radius * Math.PI;
        return area;
    }
}