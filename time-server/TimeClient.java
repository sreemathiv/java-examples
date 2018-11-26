import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TimeClient {
    public static void main(String args[]) throws Exception{
        String host = args[0];
        int port = Integer.parseInt(args[1]);

        Socket socket = new Socket(host, port);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        while(line !=null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        socket.close();
    }
}