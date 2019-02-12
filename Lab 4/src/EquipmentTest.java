
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
	 * Teseting Equipment class equals method
	 * method will return true if all five fields being compared all equal each other
	 * if not all five fields equal each other than method return fasle
	 */
	public void equalsEquipmentTest() throws AssertException
	{
		
		
		String strg = "Belt/2,5.97,889.00,Bat belt that holds equipment";
		
		String strg1 = "Belt/2,5.97,889.00,Bat belt that holds equipment";
		
		String strg2 = "Rope/1,2.43,145.44,Rope that is super strong and won't break no matter what";
		
		Equipment test = new Equipment(strg);
		Equipment test1 = new Equipment(strg1);
		Equipment test2 = new Equipment(strg2);
		
		boolean expected = true;
		boolean actual = test.equals(test1);
		
		boolean expectedCase2 = false;
		boolean actualCase2 = test2.equals(test);
		
		

		Assert.assertEquals(expected, actual);
		Assert.assertEquals(expectedCase2, actualCase2);
		
		
	}


















}