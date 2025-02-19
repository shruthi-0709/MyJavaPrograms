import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int correctPIN = 4567;
        int attempts = 0;

        // 🛡️ Scanner will automatically close after the try block
        try (Scanner scanner = new Scanner(System.in)) {
            while (attempts < 3) {
                System.out.println("Enter your PIN: ");
                int enteredPIN = scanner.nextInt();  // 📥 Read input

                if (enteredPIN == correctPIN) {
                    System.out.println("Access Granted");  // ✅ Correct PIN
                    return;  // 🚪 Exits early, but scanner still closes! 🔥
                } else {
                    System.out.println("Incorrect PIN. Try again");
                }
                attempts++;  // ➕ Increase attempts
            }
            System.out.println("Account Locked! Too many Attempts");  // 🚫 After 3 tries
        }  // 🚀 Scanner closes automatically here!
    }
}
