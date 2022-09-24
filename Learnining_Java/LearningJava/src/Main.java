import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Triangle traingleA = new Triangle(15, 8, 15, 8, 17);
//        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
//
//        double traingleAArea = traingleA.findArea();
//        System.out.println(traingleAArea);
//
//        double traingleBArea = triangleB.findArea();
//        System.out.println(traingleBArea);
//
//        System.out.println(traingleA.sideLenThree);
//        System.out.println(triangleB.base);
//
//        System.out.println(Triangle.numOfSides);

        StudentProfile studentProfileA = new StudentProfile("Bob", "TIm", 2022, 3.5, "Computer Science");
        StudentProfile studentProfileB = new StudentProfile("Sara", "Ben", 2023, 4.0, "CS");

        System.out.println(studentProfileA.heldBack(2024));

    }


}
