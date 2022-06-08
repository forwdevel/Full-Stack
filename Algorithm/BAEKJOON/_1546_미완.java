import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double[] scores = new double[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        double maxScore = 0;

        double result = 0;

        double sum = 0;

        for(int i = 0; i < n; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (scores[i] != maxScore) {
                scores[i] = ((int) ((scores[i] / maxScore) * (double) 10000) / (double) 100);
                System.out.println(scores[i]);
            }
        }
        
        for (int i = 0; i < n; i++) {
            sum += scores[i];
            System.out.println("sum: "+sum);
        }
        
        result = sum / (double)n;

        System.out.println(result);

        scanner.close();
    }
}