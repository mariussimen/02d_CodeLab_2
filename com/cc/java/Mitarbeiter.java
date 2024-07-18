package com.cc.java;

public class Mitarbeiter {
    private String Name;
    private String Vorname;
    private String Function;
    private int EintrittsJahr;



    public Mitarbeiter(String Name, String Vorname, String Function, int EintrittsJahr) {
        this.Name = Name;
        this.Vorname = Vorname;
        this.Function = Function;
        this.EintrittsJahr = EintrittsJahr;
    }

public String  getInfo( String parameter){
switch (parameter) {
    case "#Name":
     return getName() + getVorname();
    case "Function":
    return getFunction();
    case "EintrittsJahr":
    return String.valueOf(getEintrittsJahr());
    default:
        return "Paramter";
}

}

    public String getName() {
        return Name;
    }


    public String getVorname() {
        return Vorname;
    }


    public String getFunction() {
        return Function;
    }



    public int getEintrittsJahr() {
        return EintrittsJahr;
    }

 
}
