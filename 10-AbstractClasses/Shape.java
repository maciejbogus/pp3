public abstract class Shape{
    public abstract double area();
    public abstract double perimeter();

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4);
        Rectangle r1  = new Rectangle(3, 3);
        Circle c1 = new Circle(4);
        System.out.println(t1.area());
    }
}