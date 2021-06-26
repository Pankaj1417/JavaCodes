package oops.singelton;

public class appConfig {
    private appConfig(){

    }
    private static appConfig obj = null;
    public static appConfig getInstance() {
        if(obj==null){
            obj = new appConfig();
        }
        return obj;
    }
}
