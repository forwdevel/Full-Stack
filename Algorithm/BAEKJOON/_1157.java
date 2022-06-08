import java.util.Scanner;

public class _1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        str = str.toUpperCase();

        int[] temp = new int[26];
        int maxidx = 0;
        int dup = 0;

        for(int i = 0; i < 26; i++){
            temp[i] = 0;
        }

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                temp[str.charAt(i)-65]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (temp[maxidx] < temp[i]) {
                maxidx = i;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            if (maxidx != i && temp[maxidx] == temp[i] && temp[maxidx] != 0 && temp[i] != 0) {
                dup++;
            }
        }

        if(dup>0){
            System.out.println("?");
        }else{
            System.out.println((char)(maxidx+65)); 
        }

        scanner.close();
    }
}