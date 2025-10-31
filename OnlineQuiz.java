import java.util.*;

public class OnlineQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        List<String> questions = new ArrayList<>();
        List<String[]> options = new ArrayList<>();
        List<Character> answers = new ArrayList<>();

     
        questions.add("1. What are Java loops?");
        options.add(new String[]{"A. Repeating statements", "B. Decision making", "C. File handling", "D. None"});
        answers.add('A');

        questions.add("2. What is an enhanced for-loop?");
        options.add(new String[]{"A. Simple for loop", "B. For each loop", "C. Infinite loop", "D. None"});
        answers.add('B');

        questions.add("3. What is ArrayList?");
        options.add(new String[]{"A. Fixed array", "B. Dynamic list", "C. Linked list", "D. None"});
        answers.add('B');

        questions.add("4. What is a Map in Java?");
        options.add(new String[]{"A. Stores key-value pairs", "B. Stores only values", "C. Used for sorting", "D. None"});
        answers.add('A');

        questions.add("5. How to shuffle elements in a list?");
        options.add(new String[]{"A. Collections.shuffle()", "B. Random.sort()", "C. Math.random()", "D. None"});
        answers.add('A');


        for (int i = 0; i < questions.size(); i++) {
            System.out.println("\n" + questions.get(i));
            for (String opt : options.get(i)) {
                System.out.println(opt);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers.get(i)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + answers.get(i));
            }
        }

        System.out.println("\n🎯 Quiz Completed!");
        System.out.println("Your Score: " + score + "/" + questions.size());
        sc.close();
    }
}
