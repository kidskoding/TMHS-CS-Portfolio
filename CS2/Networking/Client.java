 
import java.net.*;
import java.io.*;
import java.util.*;
public class Client {
    public static void main(String[] args) throws Exception{
        String IP = "10.185.72.105";
        int port = 50000;
        Socket socket = new Socket(IP, port);
        Scanner in = new Scanner(System.in);
        System.out.println("CONNECTED TO SERVER");
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        while(!socket.isClosed()) {
            System.out.println("Type your message here: ");
            String message = in.nextLine();
            if(message.equalsIgnoreCase("QUIT")) {
                socket.close();
            }
            pw.println(message);
        }
        in.close();
    }
}
