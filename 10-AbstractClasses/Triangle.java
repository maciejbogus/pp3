public class Triangle extends Shape{
    private double a;
    private double h;
    
    public Triangle(double a_, double h_){
        this.a = a_;
        this.h = h_;
    } 

    @Override
    public double area() {
        return (a*h)/2;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setH(double h) {
        this.h = h;
    }
}