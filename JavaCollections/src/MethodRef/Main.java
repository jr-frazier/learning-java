package MethodRef;

public class Main {
    public static void main(String[] args) {
        Square s = new Square(4);

        // Old way
//        Shapes shapes = (Square square) -> {
//            return square.calculateArea();
//        };

        // Method Ref
        Shapes shapes = Square::calculateArea;


        System.out.println("Area: " + shapes.getArea(s));
    }
}
