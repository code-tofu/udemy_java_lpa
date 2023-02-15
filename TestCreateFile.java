import java.io.File;
import java.io.IOException;

public class TestCreateFile {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        createMyFile("testtextfile.txt");
    }
    public static void createMyFile(String fileName) throws IOException {
        File newFile = new File(fileName);
        if(newFile.createNewFile()){
            System.out.println("New File Created");
        } else {
            System.out.println("Open Existing File");
            File f = new File(fileName);
        }
    }
}
