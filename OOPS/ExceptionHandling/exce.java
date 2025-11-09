import java.io.*;

class FileHandler {
    FileHandler(String file) throws IOException {
        File f = new File(file);
        if (!f.exists()) throw new IOException("File not found!");
    }
}

class FileConstructorTest {
    public static void main(String[] args) {
        try {
            new FileHandler("abc.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
