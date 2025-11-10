import java.io.FileWriter;
import java.io.IOException;
public class WriteFile
{
    public static void main(String[] args)
    {
        // Writing Text File
        try {
            FileWriter Writer = new FileWriter("sample3.txt");
            // Writing File
            Writer.write("Files in Java are seriously good!!!");
            Writer.write("Hello This is File Handling session");
            Writer.close();

            System.out.println("Successfully written.");
        }

        // Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
        }
    }
}
