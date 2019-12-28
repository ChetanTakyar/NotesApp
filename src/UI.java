import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Properties;


public class UI implements optionsInterface {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        UI ui = new UI();
        ui.menuActions();

    }

    public void menuActions(){
        String prompt = "What would you like to do?";
        System.out.println(prompt);
        menu menuObj = new menu();
        int listOfOptions = menuObj.menuList();
        


        switch (listOfOptions) {
            case 1:
                addNotes();
                break;
            case 2:
                System.out.println("Bye");
                break;


        }

    }

    @Override
    public void addNotes() {
        String desktopPath = System.getProperty("user.home") + "/Desktop/";

        System.out.println("What would you like to save your notes as?");
        String fileName = input.nextLine();

        System.out.println("Please enter your notes here:");
        String firstNote = input.nextLine();


        try {
            FileOutputStream writtenNote = new FileOutputStream(String.format("%s%s.txt", desktopPath, fileName));
            writtenNote.write(firstNote.getBytes());
            writtenNote.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void editNotes() {

    }
  
    @Override
    public void deleteNotes() {

    }
}

