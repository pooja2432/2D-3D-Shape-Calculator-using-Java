public class Square implements TwoDShape{

    double a;

    Square(double a){
        this.a = a;
    }
    @Override
    public void area() {
        double area = a*a;
        System.out.println("Area of Square is: " +area+ " Sq. Unit");
    }
    @Override
    public void perimeter(){
        double perimeter = 4*a;
        System.out.println("Perimeter of Square is: " +perimeter+ " Unit");
    }

}
