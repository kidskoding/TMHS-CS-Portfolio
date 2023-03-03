package Networking;
import java.io.*;
import java.net.*;
public class Server implements Runnable {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(50000);
        System.out.println("Server started!");
        while(true) {
            Socket socket = server.accept(); //blocks code execution - waiting for someone to construct a socket
            System.out.println("Someone connected!"); 
            Thread t = new Thread(new ListenThread(socket));
            t.start();   
        }
    }
    public void run() {

    }
    public static class ListenThread implements Runnable {
        private Socket socket;
        public ListenThread(Socket socket) {
            this.socket = socket; 
        }

        @Override
        public void run() {
            try {
                InputStreamReader isr = new InputStreamReader(socket.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                while(!socket.isClosed()) {
                    String message = br.readLine(); //blocks code execution
                    if(message == null) {
                        System.out.println(socket.getInetAddress().getHostAddress() + " disconnected!");
                        socket.close();
                    }
                    else {
                        System.out.println(socket.getInetAddress().getHostAddress() + ": " + message);
                    }
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}