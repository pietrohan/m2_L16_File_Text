import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        // variable declaration
    int ch;

        FileReader fr = null;
        try {
            fr = new FileReader("D:\\modul 2\\m2_L16_TextFile\\src\\File");
        }
        catch (FileNotFoundException fe){
            System.out.println("file not found ");

        }
        // read from FileReader till the end of file
//
        while ((ch=fr.read())!=-1)

            System.out.print((char)ch);

        // close the file

        fr.close();
    }
}
