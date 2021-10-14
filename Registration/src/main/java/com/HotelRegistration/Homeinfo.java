package com.HotelRegistration;

public class Homeinfo {
private String sno,Room_Number,Room_Name;


public Homeinfo() {
	super();
}


public Homeinfo(String sno, String room_Number, String room_Name) {
	super();
	this.sno = sno;
	Room_Number = room_Number;
	Room_Name = room_Name;
}


public String getSno() {
	return sno;
}


public void setSno(String sno) {
	this.sno = sno;
}


public String getRoom_Number() {
	return Room_Number;
}


public void setRoom_Number(String room_Number) {
	Room_Number = room_Number;
}


public String getRoom_Name() {
	return Room_Name;
}


public void setRoom_Name(String room_Name) {
	Room_Name = room_Name;
}




}
