

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DeDup {

	private int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
			18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
			19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	// We can use HashSet but it will not maintain the order
	public void removeDuplicates() {
		System.out.println("Array without removing duplicates");
		for (int i = 0; i < randomIntegers.length; i++) {
			System.out.print(randomIntegers[i] + "\t");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < randomIntegers.length; i++) {
			set.add(randomIntegers[i]);
		}
		Object[] randomIntegersWithoutDuplicates = set.toArray();
		System.out.println("Array after removing duplicates using Hashset order will not maintained");
		for (int i = 0; i < randomIntegersWithoutDuplicates.length; i++) {
			System.out.print(randomIntegersWithoutDuplicates[i] + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
	}

	// We can use LinkedHashSet to maintain order
	public void removeDuplicatesMaintainOrder() {
		System.out.println("Array without removing duplicates");
		for (int i = 0; i < randomIntegers.length; i++) {
			System.out.print(randomIntegers[i] + "\t");
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < randomIntegers.length; i++) {
			set.add(randomIntegers[i]);
		}
		Object[] randomIntegersWithoutDuplicates = set.toArray();
		System.out.println("Array after removing duplicates using LinkedHashSet to maintain order");
		for (int i = 0; i < randomIntegersWithoutDuplicates.length; i++) {
			System.out.print(randomIntegersWithoutDuplicates[i] + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
	}

	public void removeDuplicatesWithoutCollection() {
		System.out.println("Array without removing duplicates");
		for (int i = 0; i < randomIntegers.length; i++) {
			System.out.print(randomIntegers[i] + "\t");
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		int len = randomIntegers.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (randomIntegers[i] == randomIntegers[j]) {
					int shiftLeft = j;
					for (int k = j + 1; k < len; k++, shiftLeft++) {
						randomIntegers[shiftLeft] = randomIntegers[k];
					}
					len--;
					j--;
				}
			}
		}

		int[] arrayWithoutDup = new int[len];
		for (int i = 0; i < len; i++) {
			arrayWithoutDup[i] = randomIntegers[i];
		}
		System.out.println("Array after removing duplicates without using collectionr");
		for (int i = 0; i < arrayWithoutDup.length; i++) {
			System.out.print(arrayWithoutDup[i] + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------------");

	}
	
	public void removeDuplicatesUsingJava8() {
		
		System.out.println("Array without removing duplicates");
		for (int i = 0; i < randomIntegers.length; i++) {
			System.out.print(randomIntegers[i] + "\t");
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		int[] arrayWithoutDup = Arrays.stream(randomIntegers).distinct().toArray();
		System.out.println("Array after removing duplicates using Java8");
		for (int i = 0; i < arrayWithoutDup.length; i++) {
			System.out.print(arrayWithoutDup[i] + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeDup deDup = new DeDup();
		deDup.removeDuplicates();
		deDup.removeDuplicatesMaintainOrder();
		deDup.removeDuplicatesWithoutCollection();
		deDup.removeDuplicatesUsingJava8();

	}

}
