import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ThreadedTimeServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(2000);
        System.out.println("Server is listening on port 2000");
        do {
            Socket socket = server.accept();
            System.out.println("Someone connected");

            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.write("Thiru Laptop Time: "+new Date().toString());
            
            pw.close();
            socket.close();
            
        } while (true);
        

    }
}