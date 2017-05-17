/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gjk.platno;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author belohradsky
 */
public class SetColorCommand extends GraphicsCommand{

    Color color;
    public SetColorCommand(Color c)
    {
        color=c;
    }
    
    @Override
    public void Execute(Graphics c) {
        c.setColor(color);
    }
    
}
