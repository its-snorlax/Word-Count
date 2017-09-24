public class StringManager {
    private String content;

    StringManager(String content) {
        this.content = content;
    }

    int getNumberOfCharacters() {
        return content.length();
    }

    int getNumberOfWord() {
        return content.split("\\s").length;
    }

    int getNumberOfLines() {
        return content.split("\n").length;
    }
}
