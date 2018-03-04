/**
 * Programmed by: Noah Daniels
 * February 28, 2014
 * LibraryDriver.java
 *
 * The main driver code for LAB3/CA3.
 * Uses user-defined AVL tree to implement
 * methods insert, find, and remove
 *
 */ 

import java.io.IOException;
import java.util.Scanner;

public class LibraryDriver
{
	// Main method to handle user input and call BST methods
    public static void main(String[] args) throws IOException
    {
        String[] results;
        int m;
        BST myBST = new BST();
        
        Scanner stdin = new Scanner(System.in);
        String operation, book;
        m = Integer.parseInt(stdin.nextLine());
        results = new String[m];
        
        //loop through each of the commands and store the result of each command in
        // array results
        for (int i = 0; i < m; i++)
        {
        	 operation = stdin.nextLine();
        	 book = stdin.nextLine();
        	 if (operation.equals("insert"))
        	 {
        		 if (myBST.insert(book))
        			 results[i] = "Inserted " + book + " into the catalog.";
        		 else
        			 results[i] = "" + book + " has already been inserted.";
        	 }
        	 
        	 else if (operation.equals("find"))
    		 {
    			 if (myBST.find(book))
    				 results[i] = book + " is in the catalog.";
    			 else
    				 results[i] = book + " is not in the catalog";
    		 }
        	
        	 else if (operation.equals("remove"))
        	 {
        		 if (myBST.remove(book))
        			 results[i] = book + " was removed from the catalog.";
        		 else
        			 results[i] = book + " is not in the catalog.";
        	 }
        }
        
        //loop through the results array and print each element
        for (String s : results)
        {
        	System.out.println(s);
        }
    }
}