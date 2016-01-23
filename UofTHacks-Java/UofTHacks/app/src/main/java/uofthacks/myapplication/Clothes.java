package uofthacks.myapplication; /**
 * 
 */

/**
 * @author Harshil
 *
 */
public abstract class Clothes {

	String name = "";
	String description = "";
	String clothesPic = "";
	
	
	public Clothes(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
	
	public Clothes(String name)
	{
		this.name = name;
	}
	
	public Clothes(String name, String description, String clothesPic)
	{
		this.name = name;
		this.description = description;
		this.clothesPic = clothesPic;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getClothesPic() {
		return clothesPic;
	}

	public void setClothesPic(String clothesPic)
	{
		this.clothesPic = clothesPic;
	}
	

}
