import java.io.*;
import java.lang.String;

public class FileReader {
    public String fileRead() throws IOException {
        String fileContent;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        StringBuilder stringBuilder = new StringBuilder();
        fileInputStream = new FileInputStream("test.txt");
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        while ((fileContent = bufferedReader.readLine()) != null) {
            stringBuilder.append(fileContent).append("\n");
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }
}
