package net.src_dev.srclibrary.functions;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class FileFunctions {

    private FileFunctions() {}

    public static List<File> getYmlFiles(File folder) {
        List<File> files = new ArrayList<>();
        if (!folder.isDirectory()) {
            return files;
        }
        for (File file : folder.listFiles()) {
            String extension = FilenameUtils.getExtension(file.getName());
            if (extension.equalsIgnoreCase("yml") || extension.equalsIgnoreCase("yaml")) {
                files.add(file);
            }
        }
        return files;
    }

}
