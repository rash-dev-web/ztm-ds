package section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayTest {

	@Test
	public void insertElementInMid() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		System.out.println(list);
		list.add(3, 4);
		System.out.println(list);

	}

}
