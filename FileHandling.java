import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        //File Create
//        File file = new File("shafee.txt");
        /*try {
            file.createNewFile();
            System.out.println("file created");
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }*/

        //Code Write to a File
        /*try {
            FileWriter fileWriter = new FileWriter("shafee.txt");
            fileWriter.write("Hi Shafee How R u I am Missing You\nok Bye");
            fileWriter.write("\nNext line is for the java");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //Reading a File
        File file = new File("shafee.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Deleting a File
//        File file = new File("shafee.txt");
//        if(file.delete()){
//            System.out.println("File Deleted" + file.getName() );
//        }
//        else {
//            System.out.println("Error Occured");
//        }

    }
}
