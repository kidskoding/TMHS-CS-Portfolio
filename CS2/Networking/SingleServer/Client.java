import java.net.*;
import java.io.*;
import java.util.*;
public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("CLIENT MAIN METHOD");
        String myIP = InetAddress.getLocalHost().getHostAddress();
        int myPort = 50000;
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER IP TO CONNECT TO: ");
        String userIP = in.nextLine();
        System.out.print("ENTER PORT TO CONNECT TO: ");
        int userPort = in.nextInt(); in.nextLine();
        System.out.println("CONNECTING TO SERVER...");
        Socket socket = new Socket(userIP, userPort);
        System.out.println("...SUCCESSFULLY JOINED THE SERVER");
        
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