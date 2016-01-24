package uofthacks.myapplication.clothing;
public class LowerClothes extends Clothes {
	private String type;

	public LowerClothes(String brand, String colour, String size, String type) {
		super(brand, colour, size);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String newType) {
		this.type = newType;
	}
}
