package a;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class Day1P2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();
		
		try {
			Scanner scan = new Scanner(new File("input.txt"));
			
			while(scan.hasNext()) {
				leftList.add(scan.nextInt());
				rightList.add(scan.nextInt());
				
			}
			int sum = 0;
			int count = 0;
			for(int i = 0; i<leftList.size();i++) {
				count=0;
				for(int j = 0; j<rightList.size();j++) {
					if(rightList.get(j).equals(leftList.get(i))) {
						count++;
					}
				}
				sum+=count*leftList.get(i);
				
			}
			System.out.println("Sum is "+sum);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
