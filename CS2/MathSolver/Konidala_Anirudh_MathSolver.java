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
            String operator = s.substring(1, 2);
            double operand1 = Double.parseDouble(s.substring(0, 1));
            double operand2 = Double.parseDouble(s.substring(2, 3));
            switch(operator) {
                case "+":
                    pw.write(Integer.toString((int) (operand1 + operand2)));
                    break;
                case "-":
                    pw.write(Integer.toString((int) (operand1 - operand2)));
                    break;
                case "*":
                    pw.write(Integer.toString((int) (operand1 * operand2)));
                    break;
                case "/":
                    if(operand2 % operand1 == 0) {
                        int temp1 = (int) operand1;
                        int temp2 = (int) operand2;
                        pw.write(Integer.toString(temp2 / temp1));
                    }
                    else {
                        pw.write(Double.toString(operand1 / operand2));
                    }
                    break;
            }    
        }
    }
}
