/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaktivniplatno;

import java.awt.Graphics;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import gjk.platno.GraphicsCommand;

/**
 *
 * @author belohradsky
 */
public class ServerTask implements Runnable {

    private Socket socket;
    private Graphics graphics;

    public ServerTask(Socket s, Graphics g) {
        socket = s;
        graphics = g;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
                        
            Object o= is.readObject();
            while(o!=null)
            {                      
                ((GraphicsCommand)o).Execute(graphics);
                o= is.readObject();
            } 
            
        } catch (Exception ex) {            
            System.err.println(ex.toString());
            
        } finally
        {
            try
            {
                socket.close();
            } catch(Exception e)
            {
                System.err.println(e.toString());
            }
        }
       
            
    }

}
