/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gjk.platno;

import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author belohradsky
 */
public class SetFontCommand extends GraphicsCommand {

    Font font;
    
    public SetFontCommand(Font f)
    {
        font =f;
    }
    
    @Override
    public void Execute(Graphics c) {
        c.setFont(font);
    }
    
}
