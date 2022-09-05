package arrayIntersect;
import java.util.ArrayList;
import java.util.HashMap;

public class solution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray1 = {4,9,5};
		int[] intArray2 = {9,4,9,8,4};
		intersection(intArray1, intArray2);
	}
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> solutionArr = new ArrayList<Integer>();
        HashMap<Integer, Integer> hashIndex = new HashMap<Integer, Integer>();
        HashMap<Integer,Integer> dupCheck = new HashMap<Integer, Integer>();
//        Builds the HashMap
        for(int i = 0; i < Math.max(nums1.length, nums2.length); i++) {
        	if (nums1.length > nums2.length) {
        		if (!hashIndex.containsKey(nums1[i])) {
        			hashIndex.put(nums1[i], nums1[i]);
        		}
        	} else if (nums1.length < nums2.length) {
        		if (!hashIndex.containsKey(nums2[i])) {
        			hashIndex.put(nums2[i], nums2[i]);
        		}
        	} else {
        		if (!hashIndex.containsKey(nums1[i])) {
        			hashIndex.put(nums1[i], nums1[i]);
        		}
        	}
        }
        
        for (int i = 0; i < Math.min(nums1.length, nums2.length); i++) {
        	if (nums1.length < nums2.length) {
        		if(hashIndex.containsKey(nums1[i])) {
        			if(!dupCheck.containsKey(nums1[i])) {
        				solutionArr.add(nums1[i]);
        				dupCheck.put(nums1[i], nums1[i]);
        			}
        		}
        	} else if (nums1.length > nums2.length) {
        		if(hashIndex.containsKey(nums2[i])) {
        			if(!dupCheck.containsKey(nums2[i])) {
        				solutionArr.add(nums2[i]);
        				dupCheck.put(nums2[i], nums2[i]);
        			}
        		}
        	} else {
        		if(hashIndex.containsKey(nums2[i])) {
        			if(!dupCheck.containsKey(nums2[i])) {
        				solutionArr.add(nums2[i]);
        				dupCheck.put(nums2[i], nums2[i]);
        			}
        		}
        	}
        }
        int[] array = solutionArr.stream().mapToInt(i -> i).toArray();
//        System.out.println(array);
        return array;
    }
}
