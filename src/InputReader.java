import java.util.Scanner;

public class InputReader {
    public String readInput() {
        System.out.println("Input text that has to be converted into morse");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }
}
