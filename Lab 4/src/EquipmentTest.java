
/**
 * Testing the Equipment class methods
 * @author nicholasnjoku
 *
 */

public class EquipmentTest
{
	
	/**
	 * Testing Equipment default constructor and getters
     *
     * e.g. format for String parameter 
     * 	"name/count,totalWeight,totalPrice,description"
     * 
	 */
	
	public void equipmentConstructorTest() throws AssertException 
	{
		String strg = "Belt/2,5.97,889.99,Bat belt that holds equipment";
		
		Equipment test = new Equipment(strg);
		
		Assert.assertEquals("Belt",test.getName());
		Assert.assertEquals(2, test.getCount());
		Assert.assertEquals(5.97, test.getTotalWeight());
		Assert.assertEquals(889.99, test.getTotalPrice());
		Assert.assertEquals("Bat belt that holds equipment", test.getDescription());
	}
	/**
	 * Testing Equipment class toString method
	 * 
	 * e.g. toString format
	 * "Name: Batarang, Number: 5, Weight: 3.22 lbs, Price: $700.75 - bat-shaped boomerangs"
	 */
	
	public void toStringEquipmentTest() throws AssertException
	{
		String strg = "Belt/2,5.97,889.99,Bat belt that holds equipment";
		
		Equipment test = new Equipment(strg);
		
		String expected = ("Name: Belt, Number: 2, Weight: 5.97 lbs, Price: $889.99 - Bat belt that holds equipment");
		String actual = test.toString();
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * 
	 */
	public void equalsEquipmentTest() throws AssertException
	{
		String strg = "Belt/2,5.97,889.99,Bat belt that holds equipment";
		
		String strg1 = "Belt/2,5.97,889.99,Bat belt that holds equipment";
		
		Equipment test = new Equipment(strg);
		Equipment test1 = new Equipment(strg1);
		
		boolean expected = true;
		boolean actual = test1.equals(test);
		
		Assert.assertEquals(expected, actual);
		
		
	}


















}