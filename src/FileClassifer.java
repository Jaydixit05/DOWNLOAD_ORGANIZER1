import java.nio.file.Path;

public class FileClassifer {
    public static String getFileExtension(Path file){
        String fileName = file.getFileName().toString();
        int dotIndex = fileName.lastIndexOf(".");
        if(dotIndex > 0){
            return fileName.substring(dotIndex + 1).toUpperCase();
        }
        return "";
    }
}
