import java.io.*;
import java.lang.String;

public class FileReader {
    public String readFile() throws IOException {
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

    public String readFile(File file) throws IOException {
        String fileContent;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        StringBuilder stringBuilder = new StringBuilder();
        fileInputStream = new FileInputStream(file);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        while ((fileContent = bufferedReader.readLine()) != null) {
            stringBuilder.append(fileContent).append("\n");
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }
}
