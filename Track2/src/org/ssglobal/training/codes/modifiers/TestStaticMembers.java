package org.ssglobal.training.codes.modifiers;

public class TestStaticMembers {

	public static void main(String[] args) {
		
		StaticMembers sm1 = new StaticMembers();
		StaticMembers sm2 = new StaticMembers();
		StaticMembers sm3 = new StaticMembers();
		
		// Instance variables
		sm1.e = 3.17;
		System.out.println(sm1.e);
		sm2.e = 4.17;
		System.out.println(sm2.e);
		sm3.e = 5.17;
		System.out.println(sm3.e);

		StaticMembers.pie = 4.14;
		System.out.println(StaticMembers.pie);
		System.out.println(StaticMembers.pie);
		System.out.println(StaticMembers.pie);
	}

}
