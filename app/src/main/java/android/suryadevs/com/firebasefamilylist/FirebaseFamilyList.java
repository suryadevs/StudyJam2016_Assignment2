package android.suryadevs.com.firebasefamilylist;

import com.firebase.client.Firebase;

/**
 * Created by Harshal Suryawanshi on 26-02-2016.
 */

/*The Firebase library must be initialized once with an Android Context.
        This must happen before any Firebase reference is created or used.*/
public class FirebaseFamilyList extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(getApplicationContext());
        //following line caches the datasnapshot from firebase on ur app so everytime u reopen the app there is no delay in loading
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
    }
}

