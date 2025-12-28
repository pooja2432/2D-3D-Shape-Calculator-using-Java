public class Cube implements ThreeDShape{
    double a;
    Cube(double a){
        this.a = a;
    }
    @Override
    public void volume(){
        double vol = a*a*a;
        System.out.println("Volume of Cube is: " +vol+ " Cu. Unit");
    }
    @Override
    public void lsa(){
        double lsa = 4*a*a;
        System.out.println("LSA of Cube is: " +lsa+ " Sq. Unit");
    }
    @Override
    public void tsa(){
        double tsa = 6*a*a;
        System.out.println("TSA of Cube is: " +tsa+ " Sq. Unit");
    }
}
