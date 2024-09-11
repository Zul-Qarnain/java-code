class Appliance {
    String brand;
    int warranty;
    double power;

    Appliance(String brand, int warranty, double power) {
        this.brand = brand;
        this.warranty = warranty;
        this.power = power;
    }
    public String getBrand() {
        return brand;
    }

    public int getWarranty() {
        return warranty;
    }

    public double getPower() {
        return power;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public void setPower(double power) {
        this.power = power;
    }
    void showApplianceinfo(){
    	System.out.println("Brand :"+getBrand());
    	System.out.println(getWarranty()+" Years");
    	System.out.println("Power: "+getPower());
    }
}
class Refrigerator extends Appliance {
    double price;
    boolean hasFreezer;
    Refrigerator(String brand, int warranty, double power, double price, boolean hasFreezer) {
        super(brand, warranty, power);
        this.price = price;
        this.hasFreezer = hasFreezer;
    }
    public double getPrice() {
        return price;
    }

    public boolean isHasFreezer(){
        return hasFreezer;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setHasFreezer(boolean hasFreezer) {
        this.hasFreezer = hasFreezer;
    }
  double monpowercon() { 
        return super.getPower() * 30; 
    }

    int calculatebill() {
        return (int) monpowercon() * 8;
    }
    void showRefinfo(){
    	showApplianceinfo();
    	System.out.println("Price: "+getPrice());
    	System.out.println("Frezzer: "+isHasFreezer());
    	monpowercon();
    	System.out.println("monthly bill: "+calculatebill());
    }
}
public class Main{
	public static void main(String[] args){
		Refrigerator R1 = new Refrigerator("Samsung",5,100.00,300.00,true);
		Refrigerator R2 = new Refrigerator("Walton",5,200.00,100.00,false);
		R1.showRefinfo();
		System.out.println(" ");
		R2.showRefinfo();
	}
}