package pairs;
import java.util.ArrayList;
import java.util.Arrays;

public class FindPairs {
	public static void main(String args[])
    {
        int[] arr = {1, 1, 2, 4, 4, 5, 5, 5, 6, 7, 9};
        String pair = "";
        getAllPairs(arr);
        System.out.println(" ");
        getUniquePairs(arr, pair);
        System.out.println(" ");
        getDistinctPairs(arr, pair);
    }
 
	// Prints all pairs that add up to 10
    public static void getAllPairs(int[] arr)
    {
    	// iterate over the array checking if each element added to the current index (i) is equal to 10 then print if true
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                if ((arr[i] + arr[j]) == 10 && i != j)
                	System.out.printf("[" + arr[i] + "," + arr[j] + "]" + " ");
 
    }
    // Prints all unique pairs
    public static void getUniquePairs(int[] arr, String pair) {
    	// Create an ArrayList to store pairs and be able to check if a particular pair has already been found
    	ArrayList<String> uniquePairs = new ArrayList<String>();
    	// iterate over the array checking if each element added to the current index (i) is equal to 10 
    	//then check if it has already been found if it hasn't it is added to the Arraylist
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                if ((arr[i] + arr[j]) == 10 && i != j)
                	pair = "[" + arr[i] + "," + arr[j] + "]" + " ";
                	if (!uniquePairs.contains(pair))
                		uniquePairs.add(pair);
    	}
         // print the contents of the arryalist      	
        for (int i = 0; i < uniquePairs.size(); i++)
            System.out.printf(uniquePairs.get(i));
    }

    public static void getDistinctPairs(int[] arr, String pair)
    {
    	//Sort the array in ascending order
    	Arrays.sort(arr);
    	// Create an ArrayList to store pairs and be able to check if a particular pair has already been found
    	ArrayList<String> uniquePairs = new ArrayList<String>();
    	// iterate over the array checking if each element added to the current index (i) is equal to 10 
    	//then check if it has already been found if it hasn't it is added to the Arraylist
    	// avoid checking indexes against itself and check only indexes after the current to avoid (9,1) (1,9) sets of pairs
    	for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == 10 && i != j)
                	pair = "[" + arr[i] + "," + arr[j] + "]" + " ";
                	if (!uniquePairs.contains(pair))
                		uniquePairs.add(pair);
                	}
        for (int i = 0; i < uniquePairs.size(); i++)
            System.out.printf(uniquePairs.get(i));
 
    }
   
}