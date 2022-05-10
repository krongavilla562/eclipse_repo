package org.ssglobal.training.codes.modifiers;

public class TestClassMembers {

	public static void main(String[] args) {
		
		ClassMembers cm = new ClassMembers();
		cm.id = 3L;
		cm.showData();
		
		
		cm.salary = 6000;
		cm.printData();

		cm.key = 87276;
		cm.authenticate();
		
	}

}
