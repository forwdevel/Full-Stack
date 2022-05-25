import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] num = new int[n];
        String[] oristr = new String[n];
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
            oristr[i] = scanner.next();
            result[i] = "";
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < oristr[i].length(); k++) {
                for (int j = 0; j < num[i]; j++) {
                    result[i] = result[i] + oristr[i].charAt(k);
                }
            }
            System.out.println(result[i]);
        }
        scanner.close();
    }
}
