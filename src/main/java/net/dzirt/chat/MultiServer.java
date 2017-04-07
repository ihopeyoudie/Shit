package net.dzirt.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
    static final int PORT = 8080;
    public static void main(String[] args) throws IOException {

        ServerUI ui = new ServerUI();
        ui.display();

        ServerSocket s = new ServerSocket(PORT);
        System.out.println("Server Started");
        try {
            while(true) {
                // Останавливает выполнение, до нового соединения:
                Socket socket = s.accept();

                try {
                    new Server(socket);
                    ui.addUser(socket);
                    //System.out.println("New Socket - " + socket );
                } catch(IOException e) {
                    // Если неудача - закрываем сокет, в противном случае нить закроет его:
                    socket.close();

                }
            }
        } finally {
            s.close();
        }
    }
}
