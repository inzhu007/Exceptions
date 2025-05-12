import java.util.InputMismatchException;

public class Task3{
    public static void main(String[] args) {
        try {
            Triangle triangle1 = new Triangle(3, 4, 5);
            System.out.println(triangle1);
            Triangle triangle2 = new Triangle(2, 2, 4);
            System.out.println(triangle2);
            Triangle triangle3 = new Triangle(7, 10, 5);
            System.out.println(triangle3);

        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Triangle {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1,double side2,double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {throw new IllegalTriangleException();}
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getSide1(){return side1;}
    public double getSide2(){return side2;}
    public double getSide3(){return side3;}
    public void setSide1(double side1){this.side1=side1;}
    public void setSide2(double side2){this.side2=side2;}
    public void setSide3(double side3){this.side3=side3;}

    @Override
    public String toString() {
        return "Triangle" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 ;
    }

}

class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        System.out.println("Triangle can not be created using these sides");
    }
}

