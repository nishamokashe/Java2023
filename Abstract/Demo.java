// Program to demonstrate the abstraction using abstract class
abstract class Shape {
    abstract void draw();
}
// In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
    public static void main(String args[]) {
        Shape s = new Rectangle();
        s.draw();
    }
}
