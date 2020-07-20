/**
 * 
 */
package hackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author DELL
 *
 */
public class AnagramDIfference {

	/**
	 * @param args
	 */

	static int areAnagram(char[] str1, char[] str2) {

		int n1 = str1.length;
		int n2 = str2.length;

		if (n1 != n2)
			return -1;

		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return 1;

		return 0;
	}

	static List<Integer> getMinimumDifference(String[] arr1, String[] arr2) {

		List<String> list1 = Arrays.asList(arr1);
		List<String> list2 = Arrays.asList(arr2);

		Integer count = 0;

		List<Integer> addChoice = new ArrayList<Integer>();

		for (int i = 0; i < list1.size(); i++) {

			count = areAnagram(list1.get(i).toCharArray(), list2.get(i).toCharArray());
			addChoice.add(count);
		}

		return addChoice;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr1 = { "tea", "tea", "act"};
		String[] arr2 = { "ate", "toe", "acts" };

		List<Integer> elements = getMinimumDifference(arr1, arr2);

		System.out.println(elements);

	}

}
