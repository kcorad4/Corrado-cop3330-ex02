import java.util.Scanner;

public class StringCount {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        //get input
        System.out.println("What is the input string?");
        String input = sc.nextLine();

        //input length count
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != ' ')
                count++;
        }

        System.out.println("\n"+input+" has "+count+" chatacters.");

    }
}
