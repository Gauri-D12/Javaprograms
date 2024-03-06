package basicprograms;
	public class ReverseArray
	{  
	 public static String reverseString(String str)
	 
	 {  
	       StringBuilder sb = new StringBuilder(str);  
	        return sb.reverse().toString();  
	 }  
	     
	 public static void main(String[] args)
	 {  
	        String str = "Hello Gauri !";  
	        
	        System.out.println("name " + str);  
	        System.out.println(" reserved name : ");  
	  
	        String reversed = reverseString(str);  
	        System.out.println(reversed);  
	    }  
	}  