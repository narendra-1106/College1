import java.io.FileReader;
import java.lang.Exception;

class FileRead{
    public static void main(String args[])
    {
        try{
            FileReader r = new FileReader("sample3.txt");
            int ch;
            int c = 65;
            System.out.println("value in c=" + (char)c);

            while((ch = r.read()) != -1)
            {
                System.out.println((char)ch);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}
