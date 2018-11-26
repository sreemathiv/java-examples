import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String ... args) throws IOException{
        FileReader fr = new FileReader(args[0]);
        int ch = fr.read();
        while(ch != -1){
            System.out.print((char)ch);
            ch =  fr.read();    
        }
        fr.close();
    }
}