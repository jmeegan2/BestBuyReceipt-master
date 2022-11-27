package BestBuyReceiptDesign;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Wei on 11/10/18.
 */
public class readConfigFile {
    private Properties configFile;

    public readConfigFile(){
        try {
            configFile = new java.util.Properties();
            configFile.load(new FileInputStream("config.properties"));
        }catch(Exception eta){
            eta.printStackTrace();
        }
    }
    public String getProperty(String key) {
        String value = this.configFile.getProperty(key);
        return value;
    }

}

