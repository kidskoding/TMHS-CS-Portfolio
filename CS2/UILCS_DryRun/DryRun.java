package UILCS_DryRun;
import java.io.*;
public class DryRun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("H:/TMHS-CS-Portfolio/CS2/UILCS_DryRun/dryrun.dat"));
        int numCases = Integer.parseInt(br.readLine());
        for(int k = 1; k <= numCases; k++) {
            String s = br.readLine();
            System.out.println("I like " + s + ".");
        }
        br.close();
    }
}