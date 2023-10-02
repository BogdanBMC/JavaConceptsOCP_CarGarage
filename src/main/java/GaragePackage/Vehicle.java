package GaragePackage;

public class Vehicle {

    private int price;
    private int hp;
    private String color;

    public Vehicle(int price, int hp, String color){
        this.price = price;
        this.hp = hp;
        this.color=color;
    }

    public Vehicle() {

    }

    //setter
    public void setPrice(int price){
        this.price=price;
    }
    public void setHp(int hp){
        this.hp=hp;
    }
    public void setColor(String color){
        this.color=color;
    }
//getters
  public int getPrice(){
        return price;
  }
  public int getHp(){
        return hp;
  }
  public String getColor(){
        return color;
  }

}
