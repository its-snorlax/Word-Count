public class StringManager {
    private String fileContent;

    StringManager(String fileContent) {
        this.fileContent = fileContent;
    }

    int getNumberOfCharacters() {
        return fileContent.length();
    }

    int getNumberOfWord() {
        return fileContent.split("\\s").length;
    }

    int getNumberOfLines() {
        return fileContent.split("\n").length;
    }
}
