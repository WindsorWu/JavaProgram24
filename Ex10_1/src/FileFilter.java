import java.io.File;
import java.io.FilenameFilter;

public class FileFilter implements FilenameFilter {
    public String ext;
    public FileFilter(String ext){
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(ext);
    }
}
