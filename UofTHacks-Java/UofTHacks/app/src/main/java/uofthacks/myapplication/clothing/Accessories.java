package uofthacks.myapplication.clothing;

public class Accessories
{
    private String brand;
    private String type;

    public Accessories(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getType() {return type;}

    public String getBrand() {return brand;}

    public void setBrand(String newBrand) {this.brand = newBrand;}

    public void setType(String type) {this.type = type;}
}
