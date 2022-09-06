package section7;

import java.util.Hashtable;
import java.util.Map;

import org.testng.annotations.Test;

public class FirstRecurringNumTest {

	@Test
	 public void findFirstRecNum() {
		int[] arr = { 2, 1, 3, 1, 5, 2 };
		System.out.println(findfirstRecNumber(arr));

	}

	private int findfirstRecNumber(int[] arr) {
		int num = 0;
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (ht.contains(arr[i])) {
				num=  arr[i];
				break;
			}
			ht.put(i, arr[i]);
		}
		
		return num;
	}

	@Test
	public void hashTable() {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Java");
		ht.put(2, "Python");
		ht.put(3, "JS");

		for (Map.Entry<Integer, String> ent : ht.entrySet()) {
			System.out.println(ent.getKey() + " " + ent.getValue());
		}
	}
}
