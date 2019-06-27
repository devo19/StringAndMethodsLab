

public class StringLab {
	
	public static void main(String[] args) {
		
		capitalize("summer!");
		wheresWaldo("Location");
		String myString = "Ok my friend Waldo, I'm Waldo too";
		wheresWaldo(myString);
		wheresWaldo("Striped Waldo");
		wheresWaldo("Is Waldo here?");
		firstThingsFirst("shehzad", "binish");
		reverse("hello");
		soLong("grand","circus");
		afterMath("hello i'm math also what about you are you math also or what");
		letterSize("Java");
		
		
	}
	
		
	public static void capitalize(String word){	
		
		word = word.toLowerCase();
		word = word.substring(0, 1).toUpperCase()+ word.substring(1).toLowerCase();
		
		System.out.println(word);
		
	}	
	
	
	public static void wheresWaldo(String phrase){
		int locateLocation;
		locateLocation = phrase.indexOf("Waldo");
		System.out.println(locateLocation);
	}
	
	
	public static void firstThingsFirst( String a, String b){
		
		
		if( !(a.charAt(0) > b.charAt(0))){
			System.out.println( a + " " + b);
		}else{
			System.out.println( b + " " + a);
		}
	}
	
	
	public static void reverse(String s){
		
		System.out.println(new StringBuilder(s).reverse().toString());
	
	}
		
	
	public static void soLong(String a , String b){
		
		if( a.length()> b.length()){
			System.out.println(a);
		}else if(b.length()> a.length()){
			System.out.println(b);
		}else if (a.length() == b.length()){
			System.out.println(a + " " + b);
		}
		
		
	}
		
	public static void afterMath(String phrase){
		
		if(phrase.contains("math")){
			int newIndex = phrase.indexOf("math");
			System.out.println(phrase.substring(newIndex));
		}else{
			System.out.println("dud");
		}
		
	}
		
	public static void letterSize(String word){
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	
	}
	
}
		
	
		


		
		
		
		

