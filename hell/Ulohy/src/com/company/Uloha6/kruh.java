package com.company.Uloha6;

/**
 * Created by Ladislav Louka on 12.01.2017.
 */

import java.lang.Math;

class kruh implements Tvar{
    double obsah = 0;
    public String getName(){
        return "kruh    ";
    }
    public double getObsah(){
        return obsah;
    }
    public void setObsah(double a, double b, double c){
        obsah = a*a*Math.PI;
    }
}
