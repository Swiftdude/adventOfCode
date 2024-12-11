package a;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;


public class Day2P2 {

	public static boolean decreasing(String[] list) {
		
		for(int i =1; i<list.length;i++) {
			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]);
			
			if(el1>=el0) {
				return false;
			}else if(el0-el1>3) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean increasing(String[] list) {
		
		for(int i =1; i<list.length;i++) {
			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]);
			
			if(el1<=el0) {
				return false;
			}else if(el1-el0>3) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		
		
		try {
			Scanner scan = new Scanner(new File("input2.txt"));
			int count=0;
			while(scan.hasNext()) {
				String line = scan.nextLine();
				String[] elements = line.split(" ");
				
				if(increasing(elements)||decreasing(elements)) {
					count++;
				}else {
					System.out.println(Arrays.toString(elements));
				}
			}
			System.out.println(count);
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
