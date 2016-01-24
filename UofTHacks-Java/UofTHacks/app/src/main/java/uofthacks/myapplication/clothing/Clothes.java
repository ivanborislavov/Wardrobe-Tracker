package uofthacks.myapplication.clothing; /**
 * 
 */

/**
 * @author Harshil, Frank
 *
 */
public class Clothes {
	private String brand;
	private String colour;
	private String size;

	public Clothes(String brand, String colour, String size) {
		this.brand = brand;
		this.colour = colour;
		this.size = size;
	}

	public String getBrand() {return brand;}

	public String getColour() {return colour;}

	public String getSize() {return size;}

	public void setBrand(String newBrand) {this.brand = newBrand;}

	public void setColour(String newColour) {this.colour = newColour;}

	public void setSize(String newSize) {this.size = newSize;}
}