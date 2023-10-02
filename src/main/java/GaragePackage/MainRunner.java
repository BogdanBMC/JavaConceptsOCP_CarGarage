package GaragePackage;

public class MainRunner {

    public static void main(String[] args){

        VW s = new VW(6000,200,"blue", "scirocco");

        testDrive(s);

    }


static void testDrive(VW vw){
    System.out.println(vw.getModel()+ " costa "+ vw.getPrice()+ " in culoareaa " + vw.getColor()+ " cu " + vw.getHp()+ "cai");
    vw.starts();
    vw.stops();
}


}
