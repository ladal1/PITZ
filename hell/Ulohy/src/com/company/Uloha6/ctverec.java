package com.company.Uloha6;

/**
 * Created by Ladislav Louka on 14.12.2016.
 */

class ctverec implements Tvar{
    private double obsah = 0;
    public void setObsah(double a, double b, double c){
        obsah = a*a;
    }
    public double getObsah(){
        return obsah;
    }
    public String getName(){return "Ctverec    ";}
    String name = "Ctverec";
}
