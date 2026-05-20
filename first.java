import java.util.*;

public class first {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter sentences containing name and age (or 'exit' to finish).");
            while (true) {
                System.out.print("> ");
                String line = sc.nextLine().trim();
                if (line.equalsIgnoreCase("exit")) break;

                // Try to parse a name+age pair from the sentence
                boolean added = NameAgeParser.addFromSentence(line, names, ages);
                if (added) {
                    System.out.println("Parsed and added.");
                    continue;
                }

                // Fallback: ask for name and age separately
                System.out.println("Couldn't parse name+age from the sentence.");
                System.out.print("Enter name (or 'skip' to ignore): ");
                String name = sc.next().trim();
                if (name.equalsIgnoreCase("skip")) {
                    sc.nextLine(); // consume rest of line
                    continue;
                }
                System.out.print("Enter age: ");
                int age = -1;
                try {
                    age = sc.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println("Invalid age input, skipping.");
                    sc.nextLine();
                    continue;
                }
                sc.nextLine(); // consume newline
                names.add(name);
                ages.add(age);
                System.out.println("Added manually: " + name + ", " + age);
            }
        }

        System.out.println("Names: " + names);
        System.out.println("Ages: " + ages);
    }
}
