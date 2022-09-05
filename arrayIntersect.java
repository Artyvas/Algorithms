package arrayIntersect;

import java.util.ArrayList;
import java.util.HashMap;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray1 = { 4, 9, 5 };
		int[] intArray2 = { 9, 4, 9, 8, 4 };
		intersection(intArray1, intArray2);
	}

	public static int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
		int[] output = new int[set1.size];
		int i = 0;
		for (Integer s : set1)
			if (set2.contains(s))
				output[i++] = s;

		return Arrays.copyOf(output, idx);
	}

	public int[] intersections(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();

		for (Integer s : nums1)
			set1.add(s);
		for (Integer s : nums2)
			set2.add(s);

		if (set1.size < set2.size)
			return set_intersection(set1, set2);
		else
			return set_intersection(set2, set1);
	}

}
