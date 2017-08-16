
import java.util.LinkedHashMap;



public class Dec2Roman {

	public static String conv(int num) {
		return conv2008_2(num);
	}
	
	public static String conv0(int num) {
		return null; 	// version 0: no test passes.
	}
	
	public static String conv1(int num) {
		return "I";
	}
	
	public static String conv2(int num) {
		
		 String res = "I";

	     if (num > 1)
	        {
	            res += "I";
	        }
	     
	     return res;
	}

	public static String conv3(int num) {
		String res = "I";

	    for (; num > 1; num-=1)
	    	{
	            res += "I";
	        }
	    return res;
	}
	
	public static String conv4(int num) {
		String res = "";
		
		if (num >= 4) {
			res += "IV";
			num -= 4;
		}
		
		for (; num>=1 ; num-=1) {
			res += "I";
		}
		return res;
	}
	
	public static String conv5(int num) {
		String res = "";
		
		for (; num>=5; num-=5) {
			res += "V";
		}
		
		for (; num>=4; num-=4) {
			res += "IV";
		}
		
		for (; num>=1 ; num-=1) {
			res += "I";
		}
		return res;
	}

	public static String conv10(int num) {
		String res = "";
		
		for (; num>=10; num-=10) {
			res += "X";
		}
		
		for (; num>=9; num-=9) {
			res += "IX";
		}
		
		for (; num>=5; num-=5) {
			res += "V";
		}
		
		for (; num>=4; num-=4) {
			res += "IV";
		}
		
		for (; num>=1 ; num-=1) {
			res += "I";
		}
		return res;
	}
	
	public static String conv44(int num) {
		String res = "";
		
		for (; num>=50; num-=50) {
			res += "L";
		}
		
		for (; num>=40; num-=40) {
			res += "XL";
		}
		
		for (; num>=10; num-=10) {
			res += "X";
		}
		
		for (; num>=9; num-=9) {
			res += "IX";
		}
		
		for (; num>=5; num-=5) {
			res += "V";
		}
		
		for (; num>=4; num-=4) {
			res += "IV";
		}
		
		for (; num>=1 ; num-=1) {
			res += "I";
		}
		return res;
	}
	
	public static String conv100(int num) {
		String res = "";
		
		for(; num>=100; num-=100) {
			res += "C";
		}
		
		for(; num>=90; num-=90) {
			res += "XC";
		}
		
		for (; num>=50; num-=50) {
			res += "L";
		}
		
		for (; num>=40; num-=40) {
			res += "XL";
		}
		
		for (; num>=10; num-=10) {
			res += "X";
		}
		
		for (; num>=9; num-=9) {
			res += "IX";
		}
		
		for (; num>=5; num-=5) {
			res += "V";
		}
		
		for (; num>=4; num-=4) {
			res += "IV";
		}
		
		for (; num>=1 ; num-=1) {
			res += "I";
		}
		return res;
	}
	
	/******************************************
	 * Using HashMap:
	 */
	
	public static String conv4_2(int number)
    {
    	LinkedHashMap<Integer, String> Results = new LinkedHashMap<Integer, String>();
    	Results.put(1,"I");
    	Results.put(4,"IV");
    	
        if (Results.containsKey(number) )
        {
            return Results.get(number);
        }
        return Results.get(1) + conv4_2(number - 1);
    }
	
	public static String conv5_2(int number)
    {
    	LinkedHashMap<Integer, String> Results = new LinkedHashMap<Integer, String>();
    	Results.put(5,"V");
    	Results.put(4,"IV");
    	Results.put(1, "I");
    	
    	if(number==0) return "";
    	int key;
    	for(key=number; !Results.containsKey(key); key-=1) {
    	}
    	
    	return Results.get(key) + conv5_2(number - key);
    }
	
	public static String conv44_2(int number)
    {
    	LinkedHashMap<Integer, String> Results = new LinkedHashMap<Integer, String>();
    	Results.put(50, "L");
    	Results.put(40, "XL");
    	Results.put(10, "X");
    	Results.put(9, "IX");
    	Results.put(5,"V");
    	Results.put(4,"IV");
    	Results.put(1, "I");
    	
    	if(number==0) return "";
    	int key;
    	for(key=number; !Results.containsKey(key); key-=1) {
    	}
    	
    	return Results.get(key) + conv44_2(number - key);
    }
	
	public static String conv2008_2(int number)
    {
    	LinkedHashMap<Integer, String> Results = new LinkedHashMap<Integer, String>();
    	Results.put(1000, "M");
    	Results.put(900, "CM");
    	Results.put(500, "D");
    	Results.put(400, "CD");
    	Results.put(100, "C");
    	Results.put(90, "XC");
    	Results.put(50, "L");
    	Results.put(40, "XL");
    	Results.put(10, "X");
    	Results.put(9, "IX");
    	Results.put(5,"V");
    	Results.put(4,"IV");
    	Results.put(1, "I");
    	
    	if(number==0) return "";
    	int key;
    	for(key=number; !Results.containsKey(key); key-=1) {
    	}
    	
    	return Results.get(key) + conv2008_2(number - key);
    }
}// class Dec2Roman
	
	/*
	/// EXAMPLE OF HOW TO USE A DICTIONARY!
	// example of how to use a dictionary to avoid repetition
	public static String conv4_2(int number)
	    {
	    	LinkedHashMap<Integer, String> Results = new LinkedHashMap<Integer, String>();
	    	Results.put(1,"I");
	    	Results.put(4,"IV");
	    	
	        if (Results.containsKey(number) )
	        {
	            return Results.get(number);
	        }
	        return Results.get(1) + conv4_2(number - 1);
	    }
	*/


	
		
