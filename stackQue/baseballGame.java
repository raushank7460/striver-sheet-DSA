package stackQue;

import java.util.Scanner;
import java.util.Stack;

public class baseballGame {

    public static int basegame(String[] opStrings) {

        Stack<Integer> st = new Stack<>();

        for (String op : opStrings) {

            if (op.equals("+")) {

                int a = st.pop();
                int b = st.peek();

                st.push(a);
                st.push(a + b);

            }
            else if (op.equals("D")) {

                st.push(2 * st.peek());

            }
            else if (op.equals("C")) {

                st.pop();

            }
            else {

                st.push(Integer.parseInt(op));
            }
        }

        int total = 0;

        for (int x : st) {
            total += x;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();

        String[] operations = new String[n];

        System.out.println("Enter operations:");

        for (int i = 0; i < n; i++) {
            operations[i] = sc.next();
        }

        System.out.println("Total Score = " + basegame(operations));
    }
}