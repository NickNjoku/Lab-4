/**
 * Test for Zoo class methods
 * @author nicholasnjoku
 *
 */
public class ZooTest
{
	
	/**
	 * @param color The animal color.
     * @param name The animal's name.
     * @param weight The animal's weight in pounds.
     * @param height The animal's height in inches.
     * String color, String name, double weight, double height
	 */
	
	public void getTotalHeightTest() throws AssertException
	{
		int initialCapacity = 10;
		Zoo test = new Zoo(initialCapacity);
		Animal monkey = new Animal("Blue","Monkey", 50.0, 60.0);
		Animal tiger = new Animal("Orange", "Tiger", 350.0, 50.0);
		Animal elephant = new Animal("Grey", "Elephant", 1000.0, 108.5);
		
		test.addAnimal(monkey);
		test.addAnimal(tiger);
		test.addAnimal(elephant);
		
		double expected = 218.5;
		double actual = test.getTotalHeight();
		
		Assert.assertEquals(expected, actual);
	}
	
	
	public void getCapcityTest() throws AssertException
	{
		int initialCapacity = 2;
		Zoo test = new Zoo(initialCapacity);
		
		Animal monkey = new Animal("Blue","Monkey", 50.0, 60.0);
		Animal tiger = new Animal("Orange", "Tiger", 350.0, 50.0);
		Animal elephant = new Animal("Grey", "Elephant", 1000.0, 108.5);
		
		test.addAnimal(monkey);
		test.addAnimal(tiger);
		test.addAnimal(elephant);
		
		int expected = 4;
		int actual = test.getCapacity();
		
		Assert.assertEquals(expected, actual);
	}
	
	
	
	public void toStringTest() throws AssertException
	{
		int initialCapacity = 2;
		Zoo test = new Zoo(initialCapacity);
		
		Animal monkey = new Animal("Blue","Monkey", 50.0, 60.0);
		Animal tiger = new Animal("Orange", "Tiger", 350.0, 50.0);
		
		test.addAnimal(monkey);
		test.addAnimal(tiger);
		
		String expected = ("These animals live in the zoo: " + "\n" + "Monkey, a Blue-colored animal. 50.0 pounds, 60.0 inches" + "\n" + "Tiger, a Orange-colored animal. 350.0 pounds, 50.0 inches" + "\n");
		String actual = test.toString();
		
		Assert.assertEquals(expected, actual);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}