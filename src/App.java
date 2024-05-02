import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            FileReader reader = new FileReader("README.MD");
            StringBuilder text = new StringBuilder();
            int character;

            while ((character = reader.read()) != -1) {
                text.append((char) character);
            }

            System.out.println(text.toString());

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
