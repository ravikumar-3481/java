import java.util.*;
import java.util.regex.*;

public class NameAgeParser {
    /**
     * Parse a sentence and add a single name+age pair to the provided lists.
     * Returns true if a pair was found and added, false otherwise.
     */
    public static boolean addFromSentence(String sentence, ArrayList<String> names, ArrayList<Integer> ages) {
        if (sentence == null) return false;

        // Find the first integer age in the sentence
        Pattern pNum = Pattern.compile("\\b(\\d{1,3})\\b");
        Matcher mNum = pNum.matcher(sentence);
        if (!mNum.find()) return false;
        int age;
        try {
            age = Integer.parseInt(mNum.group(1));
        } catch (NumberFormatException e) {
            return false;
        }

        // Search for a capitalized word before the number (likely a name)
        String before = sentence.substring(0, mNum.start());
        Pattern pName = Pattern.compile("\\b([A-Z][a-zA-Z]+)\\b");
        Matcher mName = pName.matcher(before);
        String name = null;
        while (mName.find()) {
            name = mName.group(1); // take the last capitalized word before the number
        }

        // If not found before, try after the number
        if (name == null) {
            String after = sentence.substring(mNum.end());
            Matcher mNameAfter = pName.matcher(after);
            if (mNameAfter.find()) {
                name = mNameAfter.group(1);
            }
        }

        if (name == null) return false;

        names.add(name);
        ages.add(age);
        return true;
    }

    // Small demo to show usage
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String[] samples = new String[] {
            "John 25",
            "Anna is 30 years old",
            "Please add Mark age 40",
            "No data here",
            "Grace, 29",
            "exit"
        };

        for (String s : samples) {
            boolean added = addFromSentence(s, names, ages);
            System.out.println(s + " -> " + (added ? "Added: " + names.get(names.size()-1) + ", " + ages.get(ages.size()-1) : "No match"));
        }

        System.out.println("Final Names: " + names);
        System.out.println("Final Ages: " + ages);
    }
}
