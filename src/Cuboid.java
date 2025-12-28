public class Cuboid implements ThreeDShape{
    double l,b,h;
    Cuboid(double l,double b,double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    @Override
    public void volume(){
        double vol = l*b*h;
        System.out.println("Volume of Cuboid is: " +vol+ " Cu. Unit");
    }
    @Override
    public void lsa(){
        double lsa = 2*h*(l+b);
        System.out.println("LSA of Cuboid is: " +lsa+ " Sq. Unit");
    }
    @Override
    public void tsa(){
        double tsa = 2*((l*b)+(b*h)+(h*l));
        System.out.println("TSA of Cuboid is: " +tsa+ " Sq. Unit");
    }
}
