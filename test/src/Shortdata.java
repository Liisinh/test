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
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month";
        }
    }
}

