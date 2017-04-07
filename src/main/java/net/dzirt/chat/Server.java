package net.dzirt.chat;
import java.io.*;
import java.net.*;
class Server extends Thread {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    public Server(Socket s) throws IOException {
        socket = s;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // Включение автосброса буферов:
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
        // Если какой либо, указанный выше класс выбросит исключение
        // вызывающая процедура ответственна за закрытие сокета
        // В противном случае нить(поток) закроет его.

        start(); // Вызывает run()
    }

    public void run() {
        try {
            while (true) {
                String str = in.readLine();
                if (str.equals("END")) break;
                System.out.println("Echoing: " + str);
                out.println(str);
            }
            System.out.println("closing...");
        } catch(IOException e) {
            System.err.println("IO Exception");
        } finally {
            try {
                socket.close();
            } catch(IOException e) {
                System.err.println("Socket not closed");
            }
        }
    }
}
