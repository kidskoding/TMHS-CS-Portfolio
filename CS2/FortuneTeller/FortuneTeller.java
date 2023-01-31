package FortuneTeller;
import java.io.*;
import java.util.*;
public class FortuneTeller {
    static BufferedReader in;
    static BufferedReader fileReader;
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you want to have your fortune?");
        String s = in.readLine();
        if(!s.equalsIgnoreCase("yes")) {
            System.out.println("See you next time!");
            return;
        }
        else
            System.out.println(compute());
    }
    public static java.lang.String compute() throws IOException {
        fileReader = new BufferedReader(new FileReader("H:/TMHS-CS-Portfolio/CS2/FortuneTeller/fortuneteller.txt"));
        int x = 0;
        while(fileReader.ready()) {
            x++;
            fileReader.readLine();
        }
        Random rand = new Random();
        int randNum = rand.nextInt(x);
        for(int m = 0; m <= x; m++) {
            String st = fileReader.readLine();
            if(randNum == m) {
                return st;
            }
        }
        return null;
    }
}