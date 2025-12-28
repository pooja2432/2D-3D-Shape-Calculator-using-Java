public class Triangle implements TwoDShape{

    double a,b,c;

    Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void area() {
        double s = (a + b + c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle is: " +area+ " Sq. Unit");
    }
    @Override
    public void perimeter(){
        double perimeter = a+b+c;
        System.out.println("Perimeter of Triangle is: " +perimeter+ " Unit");
    }

}
