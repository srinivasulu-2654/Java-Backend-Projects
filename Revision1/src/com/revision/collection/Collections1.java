package com.revision.collection;

import java.util.ArrayList;
import java.util.List;

public class Collections1 {
	
	public static void main(String[] args) {
		
		List<SBIUser> user = new ArrayList<SBIUser>();
		
		SBIUser user1 = new SBIUser("Sreenu", "Gandhi Park", "SBIN0001234", 50000);
		SBIUser user2 = new SBIUser("Ravi", "MG Road", "SBIN0002345", 75000);
		SBIUser user3 = new SBIUser("Kiran", "Kukatpally", "SBIN0003456", 40000);
		SBIUser user4 = new SBIUser("Arun", "Banjara Hills", "SBIN0004567", 90000);
		SBIUser user5 = new SBIUser("Vijay", "Ameerpet", "SBIN0005678", 65000);
		SBIUser user6 = new SBIUser("Prakash", "Madhapur", "SBIN0006789", 35000);
		SBIUser user7 = new SBIUser("Naveen", "Hitech City", "SBIN0007890", 80000);
		SBIUser user8 = new SBIUser("Ramesh", "Secunderabad", "SBIN0008901", 55000);
		SBIUser user9 = new SBIUser("Suresh", "Kondapur", "SBIN0009012", 70000);
		SBIUser user10 = new SBIUser("Mahesh", "Gachibowli", "SBIN0010123", 45000);
		
		user.add(user1);
		user.add(user2);
		user.add(user3);
		user.add(user4);
		user.add(user5);
		user.add(user6);
		user.add(user7);
		user.add(user8);
		user.add(user9);
		user.add(user10);
		
		for(int i=0;i<user.size();i++) {
			SBIUser getUser = user.get(i);
			if(getUser.balance > 50000) {
				System.out.println("need to send mail: " + getUser.getName());
			}
		}
	}
}
