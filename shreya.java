import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.lang.Object;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your move: ");
        int human = sc.nextInt();
        Random var=new Random();
        int CI= var.nextInt(1,3);
        switch (human){
            case 1:
                System.out.println("Its rock");
                break;
            case 2:
                System.out.println("Its paper");
                break;
            case 3:
                System.out.println("Its scissor");
                break;
        }
        if (human<=3){
            switch (CI){
                case 1:
                    System.out.println("Its rock");
                    break;
                case 2:
                    System.out.println("Its paper");
                    break;
                case 3:
                    System.out.println("Its scissor");
                    break;
        }

if (human == 1 && CI == 2) {
System.out.println("Computer won!");
            } else if (human == 2 && CI == 3) {
                System.out.println("Computer won!");
            } else if (human == 3 && CI == 1) {
                System.out.println("Computer won!");
            } else if (human>3) {
                System.out.println("It is an invalid input game cant be proceed further5");

} else {
System.out.println("Congrats! you won the match");

 }
        }

}
    }
