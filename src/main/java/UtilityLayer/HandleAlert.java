package UtilityLayer;

import BaseLayer.BaseClass;

public class HandleAlert extends BaseClass {

	public static void accept() {
		Wait.alertisPresent().accept();
	}

	public static void dismiss() {
		Wait.alertisPresent().dismiss();
	}

	public static void sendKeys(String value) {
		Wait.alertisPresent().sendKeys(value);
	}

	public static String getText() {

		return Wait.alertisPresent().getText();
	}

}
