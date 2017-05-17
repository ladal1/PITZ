/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaktivniplatno;

/**
 *
 * @author belohradsky
 */
import java.awt.Graphics;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    public static final int port = 4445;
    private ServerSocket ss = null;
    private Graphics graphics;
    
    public Server(Graphics g)
    {
        this.graphics = g;
    }

    public void  runServer() throws IOException, ClassNotFoundException{
        
    }

    @Override
    public void run() {
        try
        {
            ss = new ServerSocket(port);
            while(!this.interrupted())
            {
                
                
                Socket socket = ss.accept();
                Thread t = new Thread(new ServerTask(socket,graphics));                                                
                t.start();
                //t.join();
                
                
            }
            ss.close();
        } catch(Exception ex)
        {
            System.err.println(ex.toString());
        }
        
    }

    
}
