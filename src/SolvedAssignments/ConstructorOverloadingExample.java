package SolvedAssignments;


public class ConstructorOverloadingExample {
	
	    private int value;

	    
	    public ConstructorOverloadingExample()
	    {
	        value = 0;
	    }

	    
	    public ConstructorOverloadingExample(int val)
	    {
	        value = val;
	    }

	    
	    public ConstructorOverloadingExample(int val1, int val2)
	    {
	        value = val1 + val2;
	    }

	    
	    public int getValue() 
	    {
	        return value;
	    }

	    public static void main(String[] args) {
	        // Creating objects using different constructors
	        ConstructorOverloadingExample obj1 = new ConstructorOverloadingExample(); // Invokes the constructor with no parameters
	        ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample(80); // Invokes the constructor with one parameter
	        ConstructorOverloadingExample obj3 = new ConstructorOverloadingExample(30, 90); // Invokes the constructor with two parameters

	        // Printing the values
	        System.out.println("Value of object 1: " + obj1.getValue()); 
	        System.out.println("Value of object 2: " + obj2.getValue()); 
	        System.out.println("Value of object 3: " + obj3.getValue()); 
	    }
	}
