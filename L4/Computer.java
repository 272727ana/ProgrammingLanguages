
public class Computer {



	public static void main(String[] args) {

		

	   

	        String word = "Computer";

	        

	        System.out.println("Original: " + word);

	        System.out.println("Length: " + word.length());

	        System.out.println("In small letters: " + word.toLowerCase());

	        System.out.println("In capital letters: " + word.toUpperCase());

	        System.out.println("First letter: " + word.charAt(0));

	        System.out.println("Last letter: " + word.charAt(word.length() - 1));

	        System.out.println("The word starts with \"Com\": " + word.startsWith("Com"));

	        System.out.println("The word ends with \"ion\": " + word.endsWith("ion"));

	        

	        String firstTwoLetters = word.substring(0, 2);

	        System.out.println("First two letters: " + firstTwoLetters);

	        

	        String swappedLetters = word.replace('e', 'o');

	        System.out.println("Swapped 'e' with 'o': " + swappedLetters);

	        

	        String swappedSegment = word.replace("Compu", "Calcula");

	        System.out.println("Swapped segment: " + swappedSegment);

	    }



		// TODO Auto-generated method stub



	}
