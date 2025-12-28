import java.util.*;

public class Game {
    Scanner sc = new Scanner(System.in);
    {
        System.out.println("!!======Game has started======!!");
    }
    public void selectShape(){
        System.out.println("Press 1 For==> 2D Shape");
        System.out.println("Press 2 For==> 3D Shape");
        int choice = sc.nextInt();
        if(choice==1) {
            System.out.println("You have selected 2D Shape");
            TwoDShape t1 = selectTwoDShape();
            t1.area();
            t1.perimeter();
        }else if(choice==2) {
            System.out.println("You have selected 3D Shape");
            ThreeDShape t1 = selectThreeDShape();
            t1.volume();
            t1.lsa();
            t1.tsa();
        }else {
            System.out.println("You have selected Invalid Choice!");
            selectShape();
        }
    }

    public TwoDShape selectTwoDShape(){
        System.out.println("Press 1 For==> Circle");
        System.out.println("Press 2 For==> Rectangle");
        System.out.println("Press 3 For==> Square");
        System.out.println("Press 4 For==> Triangle");
        int choice = sc.nextInt();
        if(choice==1) {
            System.out.println("You have selected Circle");
            System.out.println("Enter the Radius: ");
            double r = sc.nextDouble();
        return new Circle(r);
        }else if(choice==2) {
            System.out.println("You have selected Rectangle");
            System.out.println("Enter the Length: ");
            double l = sc.nextDouble();
            System.out.println("Enter the Width: ");
            double w = sc.nextDouble();
        return new Rectangle(l, w);
        }else if(choice==3) {
            System.out.println("You have selected Square");
            System.out.println("Enter the Side: ");
            double a = sc.nextDouble();
        return new Square(a);
        }else if(choice==4) {
            System.out.println("You have selected Triangle");
            System.out.println("Enter 1st Side: ");
            double a = sc.nextDouble();
            System.out.println("Enter 2nd Side: ");
            double b = sc.nextDouble();
            System.out.println("Enter 3rd Side: ");
            double c = sc.nextDouble();
        return new Triangle(a,b,c);
        }else {
            System.out.println("You have selected Invalid Choice!");
        return selectTwoDShape();
        }
    }

    public ThreeDShape selectThreeDShape(){
        System.out.println("Press 1 For==> Cube");
        System.out.println("Press 2 For==> Cuboid");
        System.out.println("Press 3 For==> Cone");
        System.out.println("Press 4 For==> Sphere");
        System.out.println("Press 5 For==> Cylinder");
        int choice = sc.nextInt();
        if(choice==1) {
            System.out.println("You have selected Cube");
            System.out.println("Enter the Side: ");
            double a = sc.nextDouble();
        return new Cube(a);
        }else if(choice==2) {
            System.out.println("You have selected Cuboid");
            System.out.println("Enter the Length: ");
            double l = sc.nextDouble();
            System.out.println("Enter the Width: ");
            double b = sc.nextDouble();
            System.out.println("Enter the Height: ");
            double h = sc.nextDouble();
        return new Cuboid(l, b, h);
        }else if(choice==3) {
            System.out.println("You have selected Cone");
            System.out.println("Enter the Length: ");
            double l = sc.nextDouble();
            System.out.println("Enter the Width: ");
            double b = sc.nextDouble();
            System.out.println("Enter the Height: ");
            double h = sc.nextDouble();
        return new Cone(l, b, h);
        }else if(choice==4) {
            System.out.println("You have selected Sphere");
            System.out.println("Enter the Radius: ");
            double r = sc.nextDouble();
        return new Sphere(r);
        }else if(choice==5) {
             System.out.println("You have selected Cylinder");
            System.out.println("Enter the Radius: ");
            double r = sc.nextDouble();
            System.out.println("Enter the Height: ");
            double h = sc.nextDouble();
        return new Cylinder(r, h);
        }else {
            System.out.println("You have selected Invalid Choice!");
        return selectThreeDShape();
        }
    }
}
