public class Circle extends Shape{
    private double r;
    
    public Circle(double r_){
        this.r = r_;
    } 

    @Override
    public double area() {
        return 3.14*(r*r);
    }

    @Override
    public double perimeter() {
        return 2*3.14*r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}