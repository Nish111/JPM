package section9.part125;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
    /*List write();
    void read(List savedValues)*/;
}
