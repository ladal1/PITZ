package com.company.Uloha6;

/**
 * Created by Ladislav Louka on 14.12.2016.
 */

import java.lang.Math;

class trojuhelnik implements Tvar{
    private double obsah = 0;
    public void setObsah(double a, double b, double c){
        double s = (a+b+c)/2;
        obsah = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double getObsah(){
        return obsah;
    }
    public String getName(){
        return "Trujuhelnik    ";
    }
}
