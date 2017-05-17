/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gjk.platno;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author belohradsky
 */
public class TextCommand extends GraphicsCommand{

    Point p;
    String text;
    
    public TextCommand(int x, int y, String t)
    {
        p = new Point(x,y);
        text=t;
    }
    
    @Override
    public void Execute(Graphics c) {        
        c.drawString(text, p.x, p.y);
    }
    
}
