package org.ssglobal.training.codes.answers.ex2;

import org.ssglobal.training.codes.modifiers.ClassMembers;

public class TestClassMembers extends ClassMembers{

	public static void main(String[] args) {
		
		ClassMembers cm = new ClassMembers();
		cm.id = 4L;
		cm.showData();
		
	}
	
	public void accessPoint() {
		key = 8000;
		authenticate();
	}

}
