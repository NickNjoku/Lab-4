/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    
    /**
     *  Test the full constructor and the getters
     * @throws AssertException
     */
    
    public void fullConstructorTest() throws AssertException
    {
    	String color = "red";
    	String name = "Monkey";
    	double weight = 25.0;
    	double height = 3.4;
    	Animal animal = new Animal(color, name, weight, height);
    	
    	// Assertions to verify functionality of the constructor and getters
    	// Assert.assertEquals(Message_to_display_if_test_fails, expectedValue, actualResultFromCode)
    	Assert.assertEquals("red", animal.getColor());
    	Assert.assertEquals("Monkey", animal.getName());
    	Assert.assertEquals(25.0, animal.getWeight());
    	Assert.assertEquals(3.4, animal.getHeight());
    }
    /**
     * Test the toString method
     * @throws AssertException
     */
    
    public void toStringTest() throws AssertException
    {
    	String expected = "Monkey, a red-colored animal. 25.0 pounds, 3.4 inches" + "\n";
    	String color = "red";
    	String name = "Monkey";
    	double weight = 25.0;
    	double height = 3.4;
    	Animal animal = new Animal(color, name, weight, height);
    	String actual = animal.toString();
    	
    	Assert.assertEquals(expected, actual);
    }
    
    /**
     * Test the equals method
     * All fields must match in order for .equals to return true
     * @throws AssertException
     */
    
    public void equalsTest() throws AssertException
    {
    	Animal test = new Animal("red", "Monkey", 25.0, 5.5);
    	Animal test1 = new Animal("Green", "Monkey", 25.0, 5.5);
    	
    	boolean expected = false;
    	boolean actual = test.equals(test1);
    	
    	Assert.assertEquals(expected, actual);
    }
}

