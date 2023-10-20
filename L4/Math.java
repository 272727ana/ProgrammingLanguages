package exercise11;

public class math {
	
	    public static void main(String[] args) {
	        double variable = 13;

	        double sine = Math.sin(variable);
	        double cosine = Math.cos(variable);
	        double tangent = Math.tan(variable);
	        double cotangent = 1 / tangent;

	        double squareRoot = Math.sqrt(variable);
	        double square = Math.pow(variable, 2);
	        double cube = Math.pow(variable, 3);

	        double smallestLargerInteger = Math.ceil(variable);
	        double largestSmallerInteger = Math.floor(variable);

	        double radius = variable;
	        double area = Math.PI * Math.pow(radius, 2);

	      
	        double pi = Math.PI;
	        double e = Math.E;
	        
	        System.out.println("Sine: " + sine);
	        System.out.println("Cosine: " + cosine);
	        System.out.println("Tangent: " + tangent);
	        System.out.println("Cotangent: " + cotangent);
	        System.out.println("Square root: " + squareRoot);
	        System.out.println("Square: " + square);
	        System.out.println("Cube: " + cube);
	        System.out.println("Smallest integer larger than or equal to the variable: " + smallestLargerInteger);
	        System.out.println("Largest integer smaller than or equal to the variable: " + largestSmallerInteger);
	        


}
} 
