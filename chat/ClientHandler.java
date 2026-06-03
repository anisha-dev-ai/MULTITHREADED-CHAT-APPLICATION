import java.io.*;
import java.net.*;

public class ClientHandler implements Runnable {

    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;

    public ClientHandler(Socket socket) {
        this.socket = socket;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            writer = new PrintWriter(
                    socket.getOutputStream(), true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        String message;

        try {
            while ((message = reader.readLine()) != null) {
                System.out.println("Received: " + message);

                ChatServer.broadcastMessage(message, this);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            ChatServer.removeClient(this);

            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(String message) {
        writer.println(message);
    }
}