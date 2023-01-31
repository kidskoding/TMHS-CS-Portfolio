package MathSolver;
import java.io.*;
public class Konidala_Anirudh_MathSolver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("H:/TMHS-CS-Portfolio/CS2/MathSolver/MathProblems.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("H:/TMHS-CS-Portfolio/CS2/MathSolver/MathSolutions.txt"));
        mathSolver(br, pw);
        br.close();
        pw.close();
    }
    public static void mathSolver(BufferedReader br, PrintWriter pw) throws IOException {
        while(br.ready()) {
            String s = br.readLine();
            String[] contents = s.split(" ");
            double operand1 = Double.parseDouble(contents[0]);
            String operator = contents[1];
            double operand2 = Double.parseDouble(contents[2]);
            switch(operator) {
                case "+":
                    pw.write(Integer.toString((int) (operand1 + operand2)) + "\n");
                    break;
                case "-":
                    pw.write(Integer.toString((int) (operand1 - operand2)) + "\n");
                    break;
                case "*":
                    pw.write(Integer.toString((int) (operand1 * operand2)) + "\n");
                    break;
                case "/":
                    if((int) (operand1 % operand2) == 0)
                        pw.write(Integer.toString((int) (operand1 / operand2)) + "\n");
                    else
                        pw.write(Double.toString(operand1 / operand2) + "\n");
                    break;
            }    
        }
    }
}
