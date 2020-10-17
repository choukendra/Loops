import java.util.Scanner;

class Triangle {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        String ch = "";
        int n = 0;

        System.out.println("What character do you want your trinagle made of? ");
        ch = sc.next();
        System.out.println("How tall do you want it? ");
        n = sc.nextInt();
        System.out.println("Here's your triangle ");

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(ch);   
            }
            System.out.println(" ");
        }

       

    }
}
