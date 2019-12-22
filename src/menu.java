import java.util.Scanner;

public class menu {
private static final Scanner options = new Scanner(System.in);

    public int menuList (){
        int count = 21;
        int  numOfStars = 0;


        while (numOfStars <= count){
            System.out.print("*");
            numOfStars++;
        }

        System.out.println();

        System.out.println("1. Add Notes");
        System.out.println("2. View Notes");
        System.out.println("3. Delete Notes");

        return options.nextInt();
    }
}
