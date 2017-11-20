package com.example.larsonsadienov12.csm117_finalproj;

import android.content.Context;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;
import java.util.List;

/**
 * Created by larsonsadie on 11/20/17.
 */

class CastOptionsProvider implements OptionsProvider {

    public static final String CUSTOM_NAMESPACE = "urn:x-cast:custom_namespace";

    @Override
    public CastOptions getCastOptions(Context appContext) {
//        NotificationOptions notificationOptions = new NotificationOptions.Builder()
//                .setTargetActivityClassName(ExpandedControlsActivity.class.getName())
//                .build();
//
//        CastMediaOptions mediaOptions = new CastMediaOptions.Builder()
//                .setNotificationOptions(notificationOptions)
//                .setExpandedControllerActivityClassName(ExpandedControlsActivity.class.getName())
//                .build();

        /*List<String> supportedNamespaces = new ArrayList<>();
        supportedNamespaces.add(CUSTOM_NAMESPACE);
        CastOptions castOptions = new CastOptions.Builder()
                .setReceiverApplicationId(appContext.getString(R.string.app_id))
                .setSupportedNamespaces(supportedNamespaces)
                .build();
        return castOptions;*/

        return new CastOptions.Builder()
                //changed from app_id to app_name
                .setReceiverApplicationId(appContext.getString(R.string.app_id))
                .build();
    }

    @Override
    public List<SessionProvider> getAdditionalSessionProviders(Context context) {
        return null;
    }
}