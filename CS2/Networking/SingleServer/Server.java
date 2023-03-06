import java.net.*;
import java.io.*;
import java.util.*;
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("SERVER MAIN METHOD");
        String myIP = InetAddress.getLocalHost().getHostAddress();
        int myPort = 50000;
        ServerSocket serverSocket = new ServerSocket(myPort);
        System.out.println("HOSTING SERVER ON " + myIP + ":" + myPort);
        System.out.println("WAITING FOR SOMEONE TO CONNECT");
        Socket socket = serverSocket.accept();
        System.out.println("....SOMEONE CONNECTED TO THE SERVER");
        String userIP = socket.getInetAddress().getHostAddress();
        int userPort = socket.getPort();
        System.out.println("CONNECTED USER INFO IS " + userIP + ":" + userPort);
        
        Thread talkThread = new Thread(new TalkThread(socket));
        Thread listenThread = new Thread(new ListenThread(socket));
        talkThread.start();
        listenThread.start();
        while(true) {
            
        }
    }
    private static class TalkThread implements Runnable {
        private Socket socket;
        public TalkThread(Socket socket) {
            this.socket = socket;
        }
        public void run() {
            try {
                System.out.println("TALK THREAD STARTED!");
                OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
                PrintWriter pw = new PrintWriter(osw, true);
                Scanner in = new Scanner(System.in);
                while(!socket.isClosed()) {
                    String message = in.nextLine(); //BLOCK CODE EXECUTION
                    pw.println(message);
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    private static class ListenThread implements Runnable {
        private Socket socket;
        public ListenThread(Socket socket) {
            this.socket = socket;
        }
        public void run() {
            try {
                System.out.println("LISTEN THREAD STARTED!");
                InputStreamReader isr = new InputStreamReader(socket.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                while(!socket.isClosed()) {
                    String message = br.readLine();
                    System.out.println(message);
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}