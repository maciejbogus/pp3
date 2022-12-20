public class Rectangle extends Shape{
    private double a;
    private double b;
    
    public Rectangle(double a_, double b_){
        this.a = a_;
        this.b = b_;
    } 

    @Override
    public double area() {
        return (a*b);
    }

    @Override
    public double perimeter() {
        return 2*a+2*b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}