public class Rectangle implements TwoDShape{

    double l,w;
    Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }
    @Override
    public void area() {
        double area = l * w;
        System.out.println("Area of Rectangle is: " +area+ " Sq. Unit");
    }
    @Override
    public void perimeter(){
        double perimeter = 2*(l+w);
        System.out.println("Perimeter of Rectangle is: " +perimeter+ " Unit");
    }

}
