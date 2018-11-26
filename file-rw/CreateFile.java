import java.io.*;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("hello.txt");
        fw.write("Hello World - 2");
        fw.close();
    }
}