package GaragePackage;

public class VW extends Vehicle implements BasicFeatures {

    private String model;


    public VW(int price, int hp, String color,String model){
        super(price, hp, color);
        this.model=model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }


    @Override
    public void starts() {
        System.out.println("merge bine");
    }
    @Override
    public void stops() {
        System.out.println("opreste bine");
    }
}
