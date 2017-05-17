/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaktivniplatnoclient;

import gjk.platno.*;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author belohradsky
 */
public class InteraktivniPlatnoClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException,
            IOException, ClassNotFoundException 
    {
        Socket socket = new Socket("localhost", 4445);
        ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
        os.writeObject(new SetColorCommand(Color.MAGENTA));
        os.writeObject(new LineCommand(3,3,3,600));
        os.writeObject(new LineCommand(3,3,200, 3));
        os.writeObject(new LineCommand(3, 250, 200, 250));
        os.writeObject(new LineCommand(250, 600, 350, 3));
        os.writeObject(new LineCommand(350, 3, 450, 600));
        os.writeObject(new LineCommand(300, 300, 400, 300));
        os.writeObject(new LineCommand(500, 600, 500, 3));
        os.writeObject(new LineCommand(500, 300, 600, 3));
        os.writeObject(new LineCommand(500, 300, 600, 600));
        os.writeObject(new LineCommand(650, 3, 650, 600));
        os.writeObject(new LineCommand(650, 3, 750, 3));
        os.writeObject(new LineCommand(650, 300, 725, 300));
        os.writeObject(new LineCommand(650, 600, 725, 600));

        Font f = new Font("ComicSans", Font.BOLD, 40);
        os.writeObject(new SetColorCommand(Color.pink));
        os.writeObject(new SetFontCommand(f));
        os.writeObject(new TextCommand(775, 333, "NEWS!!!"));



        socket.close();
    }

}
