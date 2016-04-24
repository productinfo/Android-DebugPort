package jwf.debugport.app;

import android.app.Application;
import android.content.Intent;

import jwf.debugport.DebugPortService;

/**
 *
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        DebugPortService.start(this);
    }
}
