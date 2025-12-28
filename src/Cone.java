public class Cone implements ThreeDShape{
    double r,h,l;
    Cone(double r, double h,double l){
        this.r = r;
        this.h = h;
        this.l = l;
    }
    @Override
    public void volume(){
        double vol = (1/3)*Math.PI*r*r*h;
        System.out.println("Volume of Cone is: " +vol+ " Cu. Unit");
    }
    @Override
    public void lsa(){
        double lsa = Math.PI*r*l;
        System.out.println("LSA of Cone is: " +lsa+ " Sq. Unit");
    }
    @Override
    public void tsa(){
        double tsa = Math.PI*r*(r+l);
        System.out.println("TSA of Cone is: " +tsa+ " Sq. Unit");
    }
}
