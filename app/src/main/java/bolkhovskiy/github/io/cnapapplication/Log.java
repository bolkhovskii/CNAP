package bolkhovskiy.github.io.cnapapplication;

/**
 * Created by COMFY on 16.11.2016.
 */

public class Log {
    private final static String LOG_CODE ="hh42";

    public static void debug(String s){
        android.util.Log.d(LOG_CODE,s);
    }
}