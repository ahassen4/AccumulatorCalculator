import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        getInput(scanner);
    }
    /**
     // This function reads in a double from the user that is followed by a newline.
     //It then returns this double.
     // @param scanner Scanner to read from
     // @return The double read in from the user
     */
    public static double getDouble(Scanner scanner) {
        System.out.print("Please enter a value: ");
        double output = scanner.nextDouble();
        scanner.nextLine();
        return output;
    }
    /**
     * This function first reads in a double from the user. This double becomes the running total or accumulator.
     * It then asks the user to enter a command. This command is then handled by handleCommmand.
     * The result of the command then becomes the new accumulator value. This new value is printed out.
     * This process is repeated until the user enters the "QUIT" command.
     // @param scanner Scanner to read from
     // @return
     */
    public static double getInput(Scanner scanner) {
        double accumulator = getDouble(scanner);
        //TODO: Fill this function out with the logic given above
        System.out.print("Please enter a command: ");
        String command = scanner.next();
        double handle = handleCommand(scanner, command,accumulator);
        while (true) {
            System.out.println("The result is: "+handle);
            accumulator = handle;
            System.out.print("Please enter a command: ");
            command = scanner.next();
            handle = handleCommand(scanner, command, accumulator);
        }

    }
    /**
     * This function determines what operations to carry out based on the command given to it.
     * The result of the operations are then returned from this function
     // @param scanner Scanner to read from
     // @param command Command string entered by the user
     // @param accumulator Current accumulator value
     // @return The result of the operations performed based on the given command
     */
    public static double handleCommand(Scanner scanner,
                                       String command,
                                       double accumulator) {
        // TODO: Fill this function out with the logic given above

        if (command.equals("ADD")) {
            double add = getDouble(scanner);
            double sum = accumulator + add;
            return sum;
        }
        if (command.equals("MUL")) {
            double multi = getDouble(scanner);
            double product = accumulator * multi;
            return product;
        }
        if (command.equals("FACT")) {
            double factco = factorial(accumulator);
            return  factco;
        }
        if (command.equals("FIB")) {
            double fiboco = fibonacci(accumulator);
            return  fiboco;
        }
        if (command.equals("SEQ1")) {
            double seq1co = sequence1(accumulator);
            return seq1co;
        }
        if (command.equals("SEQ2")) {
            double seq2co = sequence2(accumulator);
            return seq2co;
        }
        if (command.equals("HOFQ")) {
            double hofq = hofsQ(accumulator);
            return hofq;
        }
        if (command.equals("TET")) {
            double teta = getDouble(scanner);
            double tetco = tetration(accumulator,teta);
            return  tetco;
        }
        if (command.equals("RAND")) {
            double randco = Math.random() * accumulator;
            return randco;
        }
        if (command.equals("CEIL")) {
            double ceilco = Math.ceil(accumulator);
            return  ceilco;
        }
        if (command.equals("ROUND")) {
            double randco = Math.round(accumulator);
            return randco;
        }
        if (command.equals("FLOOR")) {
            double floorco = Math.floor(accumulator);
            return floorco;
        }
        if (command.equals("QUIT")) {
            System.out.println("The result is: "+accumulator);
            System.exit(0);

        }
        if (command.equals("RESET")) {
            accumulator = 0;
        }
            return accumulator;


    }

    // TODO: Put your function definitions here

    public static double factorial(double n) {

        if (n < 1) return 1;
        else return n * factorial(n - 1);
    }

    public static double fibonacci(double n) {
        if (n == 1){
            return 1;
        }
        else if (n < 1) {
            return 0;
        }
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static double sequence1(double n) {
        if (n < 2) return 2;
        else return 2 * sequence1(n - 1) - 1;
    }

    public static double sequence2(double n) {
        if (n < 2) return 5;
        else return 3 * sequence2(n - 1);


    }

    public static double hofsQ(double n) {
        if (n < 3) return 1;
        else return hofsQ(n - hofsQ(n - 1)) + hofsQ(n - hofsQ(n - 2));


    }

    public static double tetration(double a, double n) {
        if (n == 0) return 1;
        else {
            return Math.pow(a, tetration(a, n - 1));

        }

    }

}

