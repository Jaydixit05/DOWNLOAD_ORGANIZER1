import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileMover {
    public static void moveFile(Path file,Path downloadpath,String category) {
            try {

                Path newFolderPath = downloadpath.resolve(category);// create kela newfolderpath navacha var

                if (!Files.exists(newFolderPath)) {
                    Files.createDirectory(newFolderPath);
                }
                Path targetPath = newFolderPath.resolve(file.getFileName());

                Files.move(file, targetPath, StandardCopyOption.REPLACE_EXISTING);

                System.out.println("Successfully Moved: " + file.getFileName() + " ->" + category);
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
