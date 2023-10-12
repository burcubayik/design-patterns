package adapterPattern;
//başkasının yazdığı kodlar değişiklik yapamıyoruz !
public class Log4Net {
    public void logMessage(String message){
        System.out.println(String.format("Logged with log4net %s",message));
    }
}
