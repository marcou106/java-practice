package intro.methods;
import java.util.Scanner;

class Program {
    static int sum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }
    static double average(int[] scores) {
        double sum = sum(scores);
        double avg = sum / scores.length;
        return avg;
    }
    static char grade(double avg) {
        if (avg >= 90) {
            return 'A';
        } else if (avg >= 80) {
            return 'B';
        } else if (avg >= 70) {
            return 'C';
        } else if (avg >= 60) {
            return 'D';
        }
        return 'F';
    }
    static boolean passed(char g) {
        if (g != 'F') {
            return true;
        } return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        int sum = sum(scores);
        System.out.println("Sum: " + sum);

        double avg = average(scores);
        System.out.println("Average: " + avg);

        char g = grade(avg);
        System.out.println("Grade: " + g);

        boolean passed = passed(g);
        System.out.println("Passed: " + passed);
    }
}