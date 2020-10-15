import java.util.Scanner;

class Bar {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        String ch = "";
        int n = 0;
        System.out.println("What character do you want your bar made of? ");        
        ch = sc.next();
        System.out.print("How long do you want the bar? ");
        n = sc.nextInt();
        System.out.println(" ");
        System.out.println("Here's your bar! ");
        System.out.println(" ");

        for(int i = 0; i < n; i++){
            System.out.print(ch);
        }

    }
}