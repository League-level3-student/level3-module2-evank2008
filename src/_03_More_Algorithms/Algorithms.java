package _03_More_Algorithms;

import java.util.Collections;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1+" x "+num2+" = "+num1*num2;
    }
    public static boolean isPrime(int num) {
    	for(int i = 2;i<num;i++) {
    		if(num%i==0) {
    			return false;
    		}
    	}
    	return true;
    }
    public static boolean isSquare(int num) {
    	if(Math.sqrt(num)%1==0) {
    		return true;
    	}
    	return false;
    }
    public static boolean isCube(int num) {
    	if(Math.cbrt(num)%1==0) {
    		return true;
    	}
    	return false;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	for(int i = 0;i<eggs.size();i++) {
    		if(eggs.get(i)=="cracked") {
    			return i;
    		}
    	}
        return 0;
    }

    public static int countPearls(List<Boolean> eggs) {
    	int pearls=0;
    	for(int i = 0; i<eggs.size();i++) {
    		if(eggs.get(i)) {
    			pearls++;
    		}
    	}
    	return pearls;
    }
	public static double findTallest(List<Double> eggs) {
		double tallest = 0;
		for(int i = 0; i<eggs.size();i++) {
			if(eggs.get(i)>tallest) {
				tallest=eggs.get(i);
			}
		}
		return tallest;
	}
	public static Object findLongestWord(List<String> eggs) {
		// TODO Auto-generated method stub
		String longest = "";
		for(int i = 0; i<eggs.size();i++) {
			if(eggs.get(i).length()>longest.length()) {
				longest=eggs.get(i);
			}
		}
		return longest;
	}
	public static boolean containsSOS(List<String> eggs) {
		// TODO Auto-generated method stub
		for(int i = 0; i<eggs.size();i++) {
			if(eggs.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	public static List<Double> sortScores(List<Double> eggs) {
		// TODO Auto-generated method stub
		eggs.sort(null);
		return eggs;
	}
	public static Object sortDNA(List<String> eggs) {
		// TODO Auto-generated method stub
		eggs.sort((x,y)->x.length()>y.length() ? 1:-1);
		return eggs;
	}
	public static List<String> sortWords(List<String> eggs) {
		Collections.sort(eggs);
		return eggs;
	}
}
