package com.cc.java;

public class App {

	public static void main(String[] args) {
	//     Erstellen Miarbeiter Objekte

		Mitarbeiter mitarbeiter1 = new Mitarbeiter("Marius", "Simen ", "CEO", 2012);
		Mitarbeiter mitarbeiter2 = new Mitarbeiter(null, null, null, 0);
		Mitarbeiter mitarbeiter3 = new Mitarbeiter(null, null, null, 0);

    //  Ausgabe der Informationen der Mitarbeiter

	System.out.println("Mitarbeiter 1: ");
		output("Name:  " + mitarbeiter1.getInfo("#Name"));
		output("Function: "+ mitarbeiter1.getInfo("Function"));
		output("EintrittsJahr: " + mitarbeiter1.getInfo("EintrittsJahr"));
		output("--------------");

	System.out.println("Mitarbeiter 2");
	 output("Name:" + mitarbeiter2.getInfo("#Name"));
	 output("Function: " + mitarbeiter2.getInfo("Function"));
	 output("----------------");

	 System.out.println("Mitarbeiter 3:");
	 output(mitarbeiter3.getInfo());
	

	}

	

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
