
public class Pants extends LowerClothes
{

	/**
	 * Makes new pants given the name.
	 * @param name represents the name of the pants
	 */
	public Pants(String name)
	{
		super(name);
	}
	
	/**
	 * Makes the new pants with the name and the description.
	 * @param name represents the name of the pants
	 * @param description represents the description of the pants
	 */
	public Pants(String name, String description)
	{
		super(name, description);
	}
	
	/**
	 * Makes a new pants given the name,description and the picture of the clothes
	 * @param name represents the name of the pants
	 * @param description represents the description of the pants
	 * @param clothesPic represents the location to the picture of the clothes
	 */
	public Pants(String name, String description, String clothesPic)
	{
		super(name, description, clothesPic);
	}

}
