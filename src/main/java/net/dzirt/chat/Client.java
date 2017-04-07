package net.dzirt.chat;

/*
 * Класс-клиент для чата через сокеты
 *
 */
import java.net.*;
import java.io.*;
public class Client implements Runnable{

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private InetAddress address;
    private int port = 8080;

    public Client(String addr, int port) throws IOException {
        address = InetAddress.getByName(addr);
        this.port = port;
        System.out.println("Making client on " + addr);
    }

    public void startClient() throws IOException {
        socket = new Socket(address, port);

        System.out.println("socket = " + socket);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
        Thread thisThread = new Thread(this);
        thisThread.start();
    }
    private void sendMessage(String message) throws IOException {
        out.println(message);
    }

    private void closeClient() throws IOException {
        System.out.println(" - closing...");
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        Client c = new Client("localhost", 8080);
        try {
            c.startClient();
            String message;
            do {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                message = reader.readLine();

                c.sendMessage(message);
            } while (!message.equals("END"));
        } finally {
            c.closeClient();
            System.out.println("Client closed");
        }
    }

    @Override
    public void run() {
        try {
            while (!socket.isClosed()) {
                String inputMessage = in.readLine();
                System.out.println("->" + inputMessage );
            }
        } catch (IOException e) {

            System.out.println(e);
        }
    }
}
