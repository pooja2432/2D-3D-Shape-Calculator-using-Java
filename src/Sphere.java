public class Sphere implements ThreeDShape{
    double r;
    Sphere(double r){
        this.r = r;
    }
    @Override
    public void volume(){
        double vol = (4/3)*Math.PI*r*r*r;
        System.out.println("Volume of Sphere is: " +vol+ " Cu. Unit");
    }
    @Override
    public void lsa(){
        double lsa = 4*Math.PI*r*r;
        System.out.println("LSA of Sphere is: " +lsa+ " Sq. Unit");
    }
    @Override
    public void tsa(){
        double tsa = 4*Math.PI*r*r;
        System.out.println("TSA of Sphere is: " +tsa+ " Sq. Unit");
    }
}
