import java.util.Scanner;

class RunningTally {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int t = 0;
        int n = 0;
        while(n >= 0){
          System.out.print("Add: ");
          n = sc.nextInt();
          if(n > 0)
          t += n;
        }
        System.out.println(" ");
        System.out.println("Tally: " + t);
        
        

    }
}
