package uofthacks.myapplication; /**
 * 
 */

/**
 * @author Harshil, Frank
 *
 */
public class Clothes {

//	String name = "";
//	String description = "";
//	String clothesPic = "";
//
//	public Clothes(String name, String description)
//	{
//		this.name = name;
//		this.description = description;
//	}
//
//	public Clothes(String name)
//	{
//		this.name = name;
//	}

//	public Clothes(String name, String description, String clothesPic)
//	{
//		this.name = name;
//		this.description = description;
//		this.clothesPic = clothesPic;
//	}
//
//	public void setName(String name)
//	{
//		this.name = name;
//	}
//
//	public void setDescription(String description)
//	{
//		this.description = description;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public String getClothesPic() {
//		return clothesPic;
//	}
//
//	public void setClothesPic(String clothesPic)
//	{
//		this.clothesPic = clothesPic;
//	}
//


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