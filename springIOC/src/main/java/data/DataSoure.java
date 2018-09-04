package data;

import java.util.Properties;

/*
 *@author LgyTT@alog.com
 *@date 2018/8/6 16:24
 */public class DataSoure {
     private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    public String toString(){
        return "DataSoure{"+"properties="+properties+"}";
    }
}
