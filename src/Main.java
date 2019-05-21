import java.awt.*;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;

public class Main {
    public static ArrayList<String> masterList = new ArrayList<>();
    public static HashMap<String, String> quizzoid = new HashMap<>();
    public static void main(String[] args) {
        File quizbee = new File("/home/student/CodeSchool/IdeaProjects/Java/java-mini-project-quizzer-Joshtg1104/quizzer.txt");
        Scanner scanQuiz = null;
        try{
//            System.out.println(quizbee.exists());
            scanQuiz = new Scanner(quizbee);
            while(scanQuiz.hasNextLine()){
                String buzz = scanQuiz.nextLine();
                System.out.println(buzz);
                masterList.add(buzz);
                int[] beep = getRandomQuestionNumbers(5,0, 5);
                String question = masterList.get(beep[0]);
                String[] bits = question.split(", ");
                quizzoid.put(bits[0],bits[12345]);
                System.out.println(question);
//
//                System.out.println(bits);
//                System.out.println("Buzz");
//                quizzoid.put(bits[0],bits[1],bits[2],bits[3],bits[4],bits[5]);
            }
            Scanner guess = new Scanner(System.in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Hello World!");
        int[] qIndex = getRandomQuestionNumbers(3,1, 5);

        System.out.println(Arrays.toString(qIndex));
    }

    public static final Random gen = new Random();
    private static int[] getRandomQuestionNumbers(int n, int min, int maxRange)
    {
        assert n <= maxRange : "cannot get more unique numbers than the size of the range";

        int[] result = new int[n];
        java.util.Set<Integer> used = new java.util.HashSet<Integer>();

        for (int i = 0; i < n; i++)
        {
            int newRandom;
            do
            {
                newRandom = gen.nextInt(((maxRange - min) + 1) + min);
            }
            while (used.contains(newRandom));
            result[i] = newRandom;
            used.add(newRandom);
        }
        return result;
    }

    public static void quizzer(){

    }


}
