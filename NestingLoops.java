/*Look at the first set of nested loops ("CN"). Which variable changes faster? Is it the variable controlled by the outer loop (c) or the variable controlled by the inner loop (n)? Answer in a comment.
Change the order of the loops so that the "c" loop is on the inside and the "n" loop is on the outside. How does the output change?
//The Order of the letters change in the rows.
Look at the second set of nested loops ("AB"). Change the print() statement to println(). How does the output change? (Then change it back to print().)
//The numbers print in line and align with the first loop.
Add a System.out.println() statement after the close brace of the inner loop (the "b" loop), but still inside the outer loop. How does the output change?*/
//it prints an empty line.

public class NestingLoops {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        // the outer loop 'c' controls the variable
        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c + " " + n);
            }
        }
        System.out.println();

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
            }
            // * You will add a line of code here.
        }

        System.out.println("\n");

    }
}