import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class FileScanner {
    public void scanAndOrganize(Path downloadPath) {

        boolean fileFound = false;

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(downloadPath)) {

            for (Path file : stream) {

                if (Files.isRegularFile(file)) {
                    fileFound = true;

                    FileClassifer classifier = new FileClassifer();
                    String category = classifier.getFileExtension(file);

                    if (!category.isEmpty()) {

                        FileMover mover = new FileMover();
                        mover.moveFile(file, downloadPath, category);
                    }
                }
            }

            if (!fileFound) {
                System.out.println("No Files Found to Organize in: " + downloadPath);
                return;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}