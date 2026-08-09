package com.kodewala;

import java.util .*;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<SBIUser> defaultList = new ArrayList<>();
		
		SBIUser u1 = new SBIUser("sreenu", "BTM blr", "SBIN001", 12242);
		SBIUser u2 = new SBIUser("ravi", "BTM blr", "SBIN001", 535);
		SBIUser u3 = new SBIUser("mahi", "BTM blr", "SBIN001", 23);
		SBIUser u4 = new SBIUser("siva", "BTM blr", "SBIN001", 2423);
		SBIUser u5 = new SBIUser("swamy", "BTM blr", "SBIN001", 455);
		SBIUser u6 = new SBIUser("kiran", "BTM blr", "SBIN001", 2323);
		SBIUser u7 = new SBIUser("lakki", "BTM blr", "SBIN001", 1);
		
		defaultList.add(u1);
		defaultList.add(u2);
		defaultList.add(u3);
		defaultList.add(u4);
		defaultList.add(u5);
		defaultList.add(u6);
		defaultList.add(u7);
	
		for(int i=0;i<defaultList.size();i++)
		{
			SBIUser user = defaultList.get(i);
			if(user.getBalance() < 1000)
			{
				System.out.println("need to send the mail to : " + user.getName());
			}
		}
	}

}
