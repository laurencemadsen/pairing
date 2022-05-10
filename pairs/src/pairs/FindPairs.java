package pairs;
import java.io.*;
import java.lang.*;
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
 
    public static void getAllPairs(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                if ((arr[i] + arr[j]) == 10 && i != j)
                	System.out.printf("[" + arr[i] + "," + arr[j] + "]" + " ");
 
    }

    public static void getUniquePairs(int[] arr, String pair) {
    	ArrayList<String> uniquePairs = new ArrayList<String>();
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                if ((arr[i] + arr[j]) == 10 && i != j)
                	pair = "[" + arr[i] + "," + arr[j] + "]" + " ";
                	if (!uniquePairs.contains(pair))
                		uniquePairs.add(pair);
                	}
        for (int i = 0; i < uniquePairs.size(); i++)
            System.out.printf(uniquePairs.get(i));
    }

    public static void getDistinctPairs(int[] arr, String pair)
    {
    	Arrays.sort(arr);
    	ArrayList<String> uniquePairs = new ArrayList<String>();
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