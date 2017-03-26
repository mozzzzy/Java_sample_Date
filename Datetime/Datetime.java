package Datetime;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Datetime{

	//日時をStringで返す
	public static String returnDatetime(){
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		return sdf1.format(date);
	}



}
