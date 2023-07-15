package utils;

public class Constants {
    public static final String CONFIGURATION_FILEPATH=
            System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
    //CAPITAL NAME AS ALLL CONSTATMT CONFIGURATION_FILEPATH
    //we change path that can be acess to all
    //public ..so can be seen in project,static
    //static beacuse without object, final because final
  // String path= System.getProperty("user.dir"); get the directory from root
        public static final int EXPLICIT_WAIT=20;
        public static final int IMPLICIT_WAIT=10;
        public static final String TESTDATA_FILEPATH = System.getProperty("user.dir")+"/src/test/resources/testdata/EmployeeData.xlsx";

}

