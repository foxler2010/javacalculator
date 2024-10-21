
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[2]);

        Operation operation;

        if (args[1].equals("+")) {

            operation = Operation.ADD;

        } else if (args[1].equals("-")) {

            operation = Operation.SUBTRACT;

        } else if (args[1].equals("x")) {

            operation = Operation.MULTIPLY;

        } else if (args[1].equals("/")) {

            operation = Operation.DIVIDE;

        } else {

            operation = Operation.ADD;

        }

        double result;

        if (operation == Operation.ADD) {

            result = number1 + number2;

        } else if (operation == Operation.SUBTRACT) {

            result = number1 - number2;

        } else if (operation == Operation.MULTIPLY) {

            result = number1 * number2;

        } else if (operation == Operation.DIVIDE) {

            result = number1 / number2;

        } else {

            result = number1 + number2;

        }

        System.out.println(result);

    }
}