package com.est.pref;

import java.util.Arrays;
import java.util.prefs.Preferences;

/**
 * @author selami
 */
public class App {
    private static Preferences preferences = Preferences.userRoot();
    public static Preferences getPreferences() { try { preferences.sync(); } catch (Exception e) { } return preferences; }

    enum DataType{
        DataType_string,
        DataType_boolean,
        DataType_int,
        DataType_long,
        DataType_float,
        DataType_double
        ;

        public static DataType parse(String text){
            for(DataType dataType : DataType.values()){
                if(dataType.toString().equals(text.toLowerCase())){
                    return dataType;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return super.toString().replace("DataType_", "").toLowerCase();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {

        try {
            DataType dataType = DataType.parse(args[0]);
            switch (dataType){
                case DataType_string:
                    getPreferences().put(args[1], args[2]);
                    break;
                case DataType_boolean:
                    getPreferences().putBoolean(args[1], Boolean.parseBoolean(args[2]));
                    break;
                case DataType_int:
                    getPreferences().putInt(args[1], Integer.parseInt(args[2]));
                    break;
                case DataType_long:
                    getPreferences().putLong(args[1], Long.parseLong(args[2]));
                    break;
                case DataType_float:
                    getPreferences().putFloat(args[1], Float.parseFloat(args[2]));
                    break;
                case DataType_double:
                    getPreferences().putDouble(args[1], Double.parseDouble(args[2]));
                    break;
            }
        } catch (Exception e) {}
    }
}
