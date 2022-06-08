// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static String confirm(int month, int date) {
        if(date <= 0){
            return "BAD!";
        }
        switch (month) {
            case 1:
                if(date>31){
                    return "BAD!";
                } else {
                    return "OK!";
                }
            case 2:
                if(date>29){
                    return "BAD!";
                } else {
                    return "OK!";
                }
            case 3:
                if(date>31){
                    return "BAD!";
                } else {
                    return "OK!";
                }
            case 4:
                if(date>30){
                    return "BAD!";
                } else {
                    return "OK!";
                }
            case 5:
                if(date>31){
                    return "BAD!";
                } else {
                    return "OK!";
                }
            case 6:
                if(date>30){
                    return "BAD!";
                } else {
                    return "OK!";
                }
            case 7:
                if(date>31){
                    return "BAD!";
                } else {
                    return "OK!";
                }
            case 8:
                if(date>31){
                    return "BAD!";
                } else {
                    return "OK!";
                }
            case 9:
                if(date>30){
                    return "BAD!";
                } else {
                    return "OK!";
                }
            case 10:
                if(date>31){
                    return "BAD!";
                } else {
                    return "OK!";
                }
            case 11:
                if(date>30){
                    return "BAD!";
                } else {
                    return "OK!";
                }
            case 12:
                if(date>31){
                    return "BAD!";
                } else {
                    return "OK!";
                }
        
            default:
            return "BAD!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int date = scanner.nextInt();

        System.out.println(confirm(month, date));


        scanner.close();
    }
}