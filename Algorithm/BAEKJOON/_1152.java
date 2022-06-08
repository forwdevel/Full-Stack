import java.util.Scanner;

public class _1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        str = str.trim();

        int cnt =0;

        if(str.length()>0){
            cnt++;
        }
        for (int i = 0; i<str.length();i++){
            if(str.charAt(i)==' '){
                cnt++;
            }
        }

        System.out.println(cnt);

        scanner.close();
    }
}