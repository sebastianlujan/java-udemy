package buffers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffers {

    public static void printConsole(Process proc) throws IOException {

        InputStreamReader reader = new InputStreamReader(proc.getInputStream());
        BufferedReader br = new BufferedReader(reader);

        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }


    public static void main(String[] args) throws IOException {

        var command = "ping www.google.com";
        Process proc = Runtime.getRuntime().exec(command);
        printConsole(proc);


    }

}
