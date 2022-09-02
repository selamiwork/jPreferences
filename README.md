# jPreferences

jPreferences is JAVA console application using Preferences.

This application allows applications to store and retrieve user and system preference and configuration data. This data is stored persistently in an implementation-dependent backing store. 

# Supported Data Types
    string,
    boolean,
    int,
    long,
    float,
    double
        
# Usage

java -jar "jPreferences-1.0-shaded.jar" string app.description  "any description"

java -jar "jPreferences-1.0-shaded.jar" int app.type 1

java -jar "jPreferences-1.0-shaded.jar" boolean app.installed true
