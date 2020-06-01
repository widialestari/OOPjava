import java.io.FileInputStream;

public class FinalizeExample {
    FileInputStream aFile = null;
    FinalizeExample(String file) {
        try {
            aFile = new FileInputStream(file);
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Could not open file " + file);
        }
    }
    protected void finalize () throws Throwable {
        if (aFile != null) {
          aFile.close();
          aFile = null;
        }
    }
}
