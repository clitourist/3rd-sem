import java.io.*;

public class IOExample {
    public static void main(String[] args) throws IOException {
        System.out.println("Name : Vedansh\n" +
                "USN : 1DS19CS186");
        char c;
        int i;
        FileInputStream fin = new FileInputStream("D:/Test.txt"); //Set path of Test.txt
        FileOutputStream fout = new FileOutputStream("D:/Test.txt"); //Set path of Test.txt
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the characters: q to quit");
        do {
            c = (char) br.read();
            if (c != 'q') fout.write(c);
        } while (c != 'q');
        do {
            i = fin.read();
            if (i != -1)
                System.out.print((char) i);
        } while (i != -1);
        fin.close();
        fout.close();
    }
}