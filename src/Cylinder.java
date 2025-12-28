public class Cylinder implements ThreeDShape{
    double r,h;
    Cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }
    @Override
    public void volume(){
        double vol = Math.PI*r*r*h;
        System.out.println("Volume of Cylinder is: " +vol+ " Cu. Unit");
    }
    @Override
    public void lsa(){
        double lsa = 2*Math.PI*r*h;
        System.out.println("LSA of Cylinder is: " +lsa+ " Sq. Unit");
    }
    @Override
    public void tsa(){
        double tsa = 2*Math.PI*r*(r+h);
        System.out.println("TSA of Cylinder is: " +tsa+ " Sq. Unit");
    }
}
