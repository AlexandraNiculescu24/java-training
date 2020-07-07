package code._3_in_class;

import javax.xml.crypto.Data;
import java.util.Date;

public class LazyInit {
    private static LazyInit instance;
    private String name;
    private LazyInit(){
        name="instance" + new Date() ;
    };
    public String getName() {
        return name;

    };


    public static LazyInit getInstance(){
        if(instance==null){
            instance=new LazyInit();
        }
        return instance;
    }
}


