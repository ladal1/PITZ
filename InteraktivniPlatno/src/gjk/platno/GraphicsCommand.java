/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gjk.platno;

import java.awt.Graphics;
import java.io.Serializable;

/**
 *
 * @author belohradsky
 */
public abstract class GraphicsCommand implements Serializable {
    public abstract void Execute(Graphics c);
}

