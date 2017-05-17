/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gjk.platno;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author belohradsky
 */
public class LineCommand extends GraphicsCommand  {
    private Rectangle r;
    
    public LineCommand(int x1, int y1, int x2, int y2)
    {
        this.r = new Rectangle(x1, y1, x2-x1, y2-y1);
    }

    @Override
    public void Execute(Graphics c) {
        c.drawLine(r.x, r.y, r.x+r.width, r.y+r.height);
    }
    
    
}
