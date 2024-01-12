import java.util.Scanner;

public class Shortdata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Date (YYYY-MM-DD): ");
        String shortdata= scanner.nextLine();

        int year = Integer.parseInt(shortdata.substring(0, 4));
        int month = Integer.parseInt(shortdata.substring(5, 7));
        int day = Integer.parseInt(shortdata.substring(8, 10));

        String monthname = getMonth(month);

        System.out.println(monthname + " " + day + ", " + year);

        scanner.close();
    }

    private static String getMonth(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month";
        };
    }
}

