package UtilityLayer;

import java.util.ArrayList;
import java.util.Iterator;

import BaseLayer.BaseClass;

public class HandleWindow extends BaseClass {

	private static ArrayList<String> arr;

	public static void getWindowHandles(int windowIndexPosition) {

		Iterator<String> it = driver.getWindowHandles().iterator();

		arr = new ArrayList<String>();

		while (it.hasNext()) {

			arr.add(it.next());
		}

		driver.switchTo().window(arr.get(windowIndexPosition));

	}

}
