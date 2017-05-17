/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gjk.zapalky;

import gjk.zapalky.*;

/**
 *
 * @author belohradsky
 */
public class ZapalkyDemo {
    public static void main(String[] args) {
        ZapalkyGameController hra = new ZapalkyGameController(new HloupyHrac(), new xloul(), 5);
        hra.PlayGameVisualized();
    }
    
}