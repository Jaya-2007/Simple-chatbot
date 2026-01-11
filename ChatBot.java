import java.util.Scanner;

public class ChatBot {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("ChatBot: Hello! I am here to help you 😊");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("ChatBot: Thank you for chatting. Have a nice day! 👋");
                break;
            }

            respond(input);
        }

        scanner.close();
    }

    public static void respond(String input) {

        if (input.contains("hi") || input.contains("hello")) {
            System.out.println("ChatBot: Hello! Hope you are doing well 😊");
        }
        else if (input.contains("how are you")) {
            System.out.println("ChatBot: I am doing great! Thanks for asking 😊");
        }
        else if (input.contains("name")) {
            System.out.println("ChatBot: I am a simple Java ChatBot.");
        }
        else if (input.contains("help")) {
            System.out.println("ChatBot: Sure! Please ask your question.");
        }
        else if (input.contains("add")) {
            System.out.print("ChatBot: Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("ChatBot: Enter second number: ");
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.println("ChatBot: Result = " + (a + b));
        }
        else if (input.contains("sub")) {
            System.out.print("ChatBot: Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("ChatBot: Enter second number: ");
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.println("ChatBot: Result = " + (a - b));
        }
        else if (input.contains("mul")) {
            System.out.print("ChatBot: Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("ChatBot: Enter second number: ");
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.println("ChatBot: Result = " + (a * b));
        }
        else if (input.contains("div")) {
            System.out.print("ChatBot: Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("ChatBot: Enter second number: ");
            int b = scanner.nextInt();
            scanner.nextLine();

            if (b != 0) {
                System.out.println("ChatBot: Result = " + (a / b));
            } else {
                System.out.println("ChatBot: Division by zero is not allowed.");
            }
        }
        else {
            System.out.println("ChatBot: I understand. Please tell me more.");
        }
    }
}
