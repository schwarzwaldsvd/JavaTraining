package oca.chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter3Examples {

    private static enum Directions {

        NORTH, SOUTH, EAST, WEST
    };
    private static int state;

    public static void main(String[] args) {
        //comparisonExamples();
        //floatingPointExamples();
        //calculate();
    	//calcSomeArrays();
//    	compareArrays();
//        enumerationExample();
//        shortCircuitExamples();
    	//copyArrays();
    	testArrayList();
    }

    private static boolean evaluateThis() {
        System.out.println("evaluateThis executed");
        return true;
    }

    private static boolean evaluateThat() {
        System.out.println("evaluateThat executed");
        state = 10;
        return false;
    }

    private static void shortCircuitExamples() {
        int sum = 1100;
        int amount = 300;
        if (sum > 1200 && amount < 500) {
            //
        }

        if (evaluateThis() || evaluateThat()) {
            System.out.println("The result is true");
        } else {
            System.out.println("The result is false");
        }
    }

    private static void floatingPointExamples() {
        float num1 = 0.0f;

        System.out.println(num1 / 0.0f);
        System.out.println(Math.sqrt(-4));
        System.out.println(Double.NaN + Double.NaN);
        System.out.println(Float.NaN + 2);
        System.out.println((int) Double.NaN);

        System.out.println();
        System.out.println("1. " + Float.NEGATIVE_INFINITY);
        System.out.println("2. "+ Double.NEGATIVE_INFINITY);
        System.out.println("3. "+ Float.POSITIVE_INFINITY);
        System.out.println("4. "+ Double.POSITIVE_INFINITY);
        System.out.println("5. "+ Float.POSITIVE_INFINITY + 2);
        System.out.println("6. "+ (1.0 / 0.0));
        System.out.println("7. "+ ((1.0 / 0.0) - (1.0 / 0.0)));
        System.out.println("8. "+ (23.0f / 0.0f));
        System.out.println("9. "+ (int) (1.0 / 0.0));
        System.out.println("10. "+ (Float.NEGATIVE_INFINITY == Double.NEGATIVE_INFINITY));

        System.out.println();
        System.out.println("11. "+ (0 == -0));

        System.out.println("12. "+ (-1.0f / Float.POSITIVE_INFINITY));
        System.out.println("13. "+ (1.0f / Float.NEGATIVE_INFINITY));

        num1 = -0.0f;
        if (num1 >= 0.0f) {
            System.out.println(num1 + " is greater than or equal to zero");
        } else {
            System.out.println(-num1 + " is now greater than or equal to zero");
        }
        System.out.println(0.0f - num1);
        System.out.println(Math.abs(num1));
        System.out.println((new Float(-2.0)).compareTo(-0.0f));


        System.out.println();
        double num2 = 1.2f;
        double num3 = 0.2f;
        System.out.println("14. "+((num2 / num3) == 6));
        float e = 0.000001f; // the maximum difference that is acceptable:
        if (Math.abs((num2 / num3) - 6) < e) {
            System.out.println("They are effectively equal");
        } else {
            System.out.println("They are not equal");
        }


    }

    private static void comparisonExamples() {
        int rate;
        rate = 100;
        boolean errorPresent = rate == 100;
        System.out.println(errorPresent);

        if (rate == 100) {
            System.out.println("rate is equal to 100");
        } else {
            System.out.println("rate is not equal to 100");
        }
//        if(rate = 100) {
//            
//        }   
        final int LEGAL_AGE = 21;
        int age = 12;

        if (age > LEGAL_AGE) {
            // Process
        } else {
            // Do not process
        }

        if (age <= LEGAL_AGE) {
            // Do not process
        } else {
            // Process
        }

        boolean isLegalAge = age >= LEGAL_AGE;
        boolean isNotLegalAge = age < LEGAL_AGE;
        if (isLegalAge) {
            System.out.println("Of legal age");
            System.out.println("Also of legal age");
        } else {
            System.out.println("Not of legal age");
        }

        if (!isLegalAge) {
            // Do not process
        } else {
            // Process
        }

        if (!isNotLegalAge) {
            // Process
        } else {
            // Do not process
        }

        float result = computeShippingCost(6,20);
        System.out.println(result);
    }

    private static float computeShippingCost(int zone, float weight) {
        float shippingCost;

        if (zone == 5) {
            shippingCost = weight * 0.23f;
        } else if (zone == 6) {
            shippingCost = weight * 0.23f;
        } else if (zone == 15) {
            shippingCost = weight * 0.35f;
        } else if (zone == 18) {
            shippingCost = weight * 0.17f;
        } else {
            shippingCost = weight * 0.25f;
        }

        switch (zone) {
            case 5:
                shippingCost = weight * 0.23f;
                break;
            case 6:
                shippingCost = weight * 0.23f;
                break;
            case 15:
                shippingCost = weight * 0.35f;
                break;
            case 18:
                shippingCost = weight * 0.17f;
                break;
            default:
                shippingCost = weight * 0.25f;
        }
        return shippingCost;
    }
    
    private static void enumerationExample() {
        Directions direction = Directions.NORTH;

        switch (direction) {
            case NORTH:
                System.out.println("Going North");
                break;
            case SOUTH:
                System.out.println("Going South");
                break;
            case EAST:
                System.out.println("Going East");
                break;
            case WEST:
                System.out.println("Going West");
                break;
        }

    }

    private static void calculate() {

        String zone = "East";
        float weight = 0;
        float shippingCost;


        if (zone.equals("East")) {
            shippingCost = weight * 0.23f;
        } else if (zone.equals("NorthCentral")) {
            shippingCost = weight * 0.35f;
        } else if (zone.equals("SouthCentral")) {
            shippingCost = weight * 0.17f;
        } else {
            shippingCost = weight * 0.25f;
        }
        System.out.println(shippingCost);

        switch (zone) {
            case "East":
                shippingCost = weight * 0.23f;
                break;
            case "NorthCentral":
                shippingCost = weight * 0.35f;
                break;
            case "SouthCentral":
                shippingCost = weight * 0.17f;
                break;
            default:
                shippingCost = weight * 0.25f;
        }
        System.out.println(shippingCost);
    }
    
    private static void calcSomeArrays(){
        System.out.println(16 >>> 3);
        int i = 3;
        int j = 3;
        int k = 3;
        if(i > j) {}
        if(i > j && i > k) {}
        int ages[] = {35, 10, 43, -5, 12};
        System.out.println(ages.toString());
        // for each loop
        for(int f: ages){
        	System.out.println(f);
        }
        // simple for loop
    	System.out.println("----------------------------------------");
        for(int f=0; f<ages.length; f++){
        	System.out.println(ages[f]);
        }
        System.out.println("----------------------------------------");
        
        final int ROWS = 2;
        final int COLS = 3;
        int grades[][] = new int[ROWS][COLS];
        grades[0][0] = 0;
        grades[0][1] = 1;
		grades[0][2] = 2;
		grades[1][0] = 3;
		grades[1][1] = 4;
		grades[1][2] = 5;
		for (int rows = 0; rows < ROWS; rows++) {
			for (int cols = 0; cols < COLS; cols++) {
				System.out.printf("%d | ", grades[rows][cols]);
			}
			System.out.println();
		}
        
    }
    
    private static void compareArrays(){
	    int arr1[];
	    int arr2[];
	    final int ROWS = 2;
        final int COLS = 3;
	    arr1 = new int[5];
	    arr2 = new int[5];
	    for(int i = 0; i < 5; i++) {
		    arr1[i] = 0;
		    arr2[i] = 0;
	    }
	    //arr1[2] = 3;

	    // Element-by-element comparison
	    boolean areEqual = true;
	    for (int i = 0; i < 5; i++) {
		    if(arr1[i] != arr2[i]) {
		    	areEqual = false;
		    }
	    }
	    System.out.println("Element-by-element comparison: " + areEqual);
	    
	    // Using the equality operator
	    System.out.println("Using the equality operator: " + (arr1 == arr2));  //Displays false
	    
	    // Using the equals method
	    System.out.println("Using the equals method: " + (arr1.equals(arr2)));	// Displays false
	    
	    // Using the deepEquals method
	    System.out.println("Using the equals method: " + (Arrays.equals(arr1,arr2)));

	    // 
	    int grades[][];
	    grades = new int[ROWS][];
	    grades[0] = new int[COLS];
	    grades[1] = new int[COLS];
	    grades[0][0] = 0;
	    grades[0][1] = 1;
	    grades[0][2] = 2;
	    grades[1][0] = 3;
	    grades[1][1] = 4;
	    grades[1][2] = 5;
	    
	    int grades2[][];
	    grades2 = new int[ROWS][];
	    grades2[0] = new int[COLS];
	    grades2[1] = new int[COLS];
	    grades2[0][0] = 0;
	    grades2[0][1] = 1;
	    grades2[0][2] = 2;
	    grades2[1][0] = 3;
	    grades2[1][1] = 4;
	    grades2[1][2] = 5;
	    System.out.println("----------------------------------------");
	    System.out.println(grades == grades2); 					// false
	    System.out.println(grades.equals(grades2)); 			// false
	    System.out.println(Arrays.equals(grades, grades2));		// false
	    System.out.println(Arrays.deepEquals(grades, grades2));	// true
     }
    
    private static void printArrayEmelens(int[] arr){
    	// Print elements of second array on the screen
    	for(int i : arr){
    		System.out.print(i+", ");
    	}
    }
    
    private static void copyArrays(){
    	int arr1[] = new int[5];
    	int arr2[] = new int[5];
    	
    	for(int i = 0; i < arr1.length; i++) {
    		arr1[i] = i;
    	}

    	// Simple element-by-element copy
    	/*
    	 * for(int i = 0; i < arr1.length; i++) {
    		arr2[i] = arr1[i];
    	}
    	printArrayEmelens(arr2);
    	*/
    	
    	// Using the System.arraycopy method
    	System.arraycopy(arr1, 0, arr2, 0, 5);    	// 0, 1, 2, 3, 4
    	printArrayEmelens(arr2);
    }
    
    private static void copyIdenticalArray(){
    	StringBuilder arr3[] = new StringBuilder[4];
    	arr3[0] = new StringBuilder("Pine");
    	arr3[1] = new StringBuilder("Oak");
    	arr3[2] = new StringBuilder("Maple");
    	arr3[3] = new StringBuilder("Walnut");
    	
    	StringBuilder arr4[] = new StringBuilder[4];
    	// However, arr4 contains the same object reference variables used by arr3. 
    	// The corresponding element of both arrays reference the same object.
    	System.arraycopy(arr3, 0, arr4, 0, 4);
    	
    	// This approach is necessary if a deep copy is needed.
    	for (int i = 0; i < arr3.length; i++) {
    		arr4[i] = new StringBuilder(arr3[i]);
    	}
    }
    
    private static void testArrayList(){
    	
    	int arr1[] = new int[5];
    	ArrayList list = new ArrayList();
    	list.add("item 1");
    	list.add("item 2");
    	Object arr2[] = {"item 3", new Integer(5), list};
    	String arr3[] = {"Pine", "Oak", "Maple", "Walnut"};
    	Arrays.fill(arr1,5);
    	System.out.println("----------------------------------------");
    	System.out.println(Arrays.asList(arr3));
    	System.out.println(Arrays.toString(arr1));
    	System.out.println(Arrays.deepToString(arr2));
    	
    	List list2 = Arrays.asList(arr3);
    	list2.set(0, "Birch");
    	System.out.println(Arrays.toString(arr3));
    }
}
