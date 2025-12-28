public class Circle implements TwoDShape{

    double r;

    Circle(double r){
        this.r = r;
    }
    @Override
    public void area() {
        double area = Math.PI*r*r;
        System.out.println("Area of Circle is: " +area+ " Sq. Unit");
    }
    @Override
    public void perimeter(){
        double perimeter = 2*Math.PI*r;
        System.out.println("Perimeter of Circle is: " +perimeter+ " Unit");
    }

}
