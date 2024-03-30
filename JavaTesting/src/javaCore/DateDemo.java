package javaCore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		System.out.println(date.toString());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/M/yyyy");
		System.out.println(simpleDateFormat.format(date));

		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
		System.out.println(simpleDateFormat2.format(date));

	}

}
