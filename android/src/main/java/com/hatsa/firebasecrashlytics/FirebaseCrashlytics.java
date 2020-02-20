package com.hatsa.firebasecrashlytics;

import com.crashlytics.android.Crashlytics;
import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.google.firebase.FirebaseApp;

@NativePlugin()
public class FirebaseCrashlytics extends Plugin {

    public void load() {
        super.load();

        if(FirebaseApp.getApps(this.getContext()).size() == 0) {
            FirebaseApp.initializeApp(this.getContext());
        }
    }

    @PluginMethod()
    public void crash(PluginCall call) {
        Crashlytics.getInstance().crash();
    }

    @PluginMethod()
    public void logUser(PluginCall call) {
        if (call.getData().has("email") && call.getData().has("id") && call.getData().has("name")) {
            Crashlytics.setUserEmail(call.getString("email"));
            Crashlytics.setUserIdentifier(call.getString("name"));
            Crashlytics.setUserIdentifier(call.getString("id"));
        } else {
            call.error("Required keys: email, id, name");
        }
    }
}
