import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String userHome = System.getProperty("user.home");
        Path downloadpath = Paths.get(userHome, "Downloads");

        FileScanner scanner = new FileScanner();
        scanner.scanAndOrganize(downloadpath);
    }
//    public static void organizedownloads(Path downloadpath){
//
//        try (DirectoryStream<Path> stream = Files.newDirectoryStream(downloadpath)) {
//            for (Path file : stream) {
//                if (Files.isRegularFile(file)) {
//                    //processss
//                    String FileName = file.getFileName().toString();
//                    String extension = getFileExtension()(FileName);
//
//                    if (!extension.isEmpty()) {
//                        Path newFolderPath = downloadpath.resolve(extension);
//
//                        if (!Files.exists(newFolderPath)) {
//                            Files.createDirectory(newFolderPath);
//                        }
//                        Path targetpath = newFolderPath.resolve(file.getFileName());
//                        Files.move(file, targetpath, StandardCopyOption.REPLACE_EXISTING);
//
//                        System.out.println("Moved: " + FileName + " ->" + extension);
//
//
//                    }
//                }
//
//            }
//        }
//            catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public static String getFileExtension(String fileName){
//        int dotIndex = fileName.lastIndexOf(".");
//        if(dotIndex > 0){
//            return fileName.substring(dotIndex + 1).toUpperCase();
//        }
//
//        return "";
//    }
}