package a;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class Day1P1 {

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
			while(leftList.size()>0) {
				int smallestLeft = leftList.get(0);
				int smallestLIndex = 0;
				for(int i = 0; i<leftList.size();i++) {
					if(leftList.get(i)<smallestLeft) {
						smallestLeft = leftList.get(i);
						smallestLIndex = i;
					}
				}
				leftList.remove(smallestLIndex);
				
				int smallestRight = rightList.get(0);
				int smallestRIndex = 0;
				for(int i = 0; i<rightList.size();i++) {
					if(rightList.get(i)<smallestRight) {
						smallestRight = rightList.get(i);
						smallestRIndex = i;
					}
				}
				rightList.remove(smallestRIndex);
				
				System.out.println(smallestLeft+":"+smallestRight+"="+Math.abs(smallestRight-smallestLeft));
				sum+=Math.abs(smallestLeft-smallestRight);
			}
			System.out.println("Sum is "+sum);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
