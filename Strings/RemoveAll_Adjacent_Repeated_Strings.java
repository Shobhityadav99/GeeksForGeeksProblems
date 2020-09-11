package GFG;

import java.util.*;
import java.lang.*;
import java.io.*;
public class RemoveAll_Adjacent_Repeated_Strings {

		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int testCase = scanner.nextInt();
	        scanner.nextLine();

	        for (int t = 0; t < testCase; t++) {
	            String str = scanner.nextLine();
	            String result = remove(str);
	            System.out.println(result);

	        }
	    }

	    private static String remove(String str) {
	        int origLen;
	        do {
	            origLen = str.length();
	            str = removeUsingRecursion(str, origLen);
	        } while (origLen != str.length());
	        return str;
	    }

	    private static String removeUsingRecursion(String str, int originalLen) {
	        if (originalLen == 0 || originalLen == 1) {
	            return str;
	        }

	        if (str.charAt(0) == str.charAt(1)) {
	            int end = 2;
	            while (end < originalLen && str.charAt(end) == str.charAt(0)) {
	                end++;
	            }
	            str = str.substring(end);
	            return removeUsingRecursion(str, str.length());
	        } else {
	            str = str.charAt(0) + removeUsingRecursion(str.substring(1), originalLen - 1);
	        }

	        return str;
	    }
	}
