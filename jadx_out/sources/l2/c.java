package l2;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3380c;

    public c(Bundle bundle, Resources resources) {
        bundle.getString("android.support.customtabs.trusted.DEFAULT_URL");
        int i4 = bundle.getInt("android.support.customtabs.trusted.STATUS_BAR_COLOR", R.color.white);
        this.f3378a = i4;
        bundle.getInt("android.support.customtabs.trusted.STATUS_BAR_COLOR_DARK", i4);
        int i5 = bundle.getInt("android.support.customtabs.trusted.NAVIGATION_BAR_COLOR", R.color.white);
        this.f3379b = i5;
        bundle.getInt("android.support.customtabs.trusted.NAVIGATION_BAR_COLOR_DARK", i5);
        bundle.getInt("androix.browser.trusted.NAVIGATION_BAR_DIVIDER_COLOR", R.color.transparent);
        bundle.getInt("androix.browser.trusted.NAVIGATION_BAR_DIVIDER_COLOR_DARK", i5);
        bundle.getInt("android.support.customtabs.trusted.SPLASH_IMAGE_DRAWABLE", 0);
        bundle.getInt("android.support.customtabs.trusted.SPLASH_SCREEN_BACKGROUND_COLOR", R.color.white);
        bundle.getString("android.support.customtabs.trusted.FILE_PROVIDER_AUTHORITY");
        bundle.getInt("android.support.customtabs.trusted.SPLASH_SCREEN_FADE_OUT_DURATION", 0);
        if (bundle.containsKey("android.support.customtabs.trusted.ADDITIONAL_TRUSTED_ORIGINS")) {
            this.f3380c = Arrays.asList(resources.getStringArray(bundle.getInt("android.support.customtabs.trusted.ADDITIONAL_TRUSTED_ORIGINS")));
        } else {
            this.f3380c = null;
        }
        bundle.getString("android.support.customtabs.trusted.FALLBACK_STRATEGY");
        String string = bundle.getString("android.support.customtabs.trusted.DISPLAY_MODE");
        if (!"immersive".equals(string)) {
            "sticky-immersive".equals(string);
        }
        bundle.getString("android.support.customtabs.trusted.SCREEN_ORIENTATION");
        int i6 = bundle.getInt("android.support.customtabs.trusted.METADATA_SHARE_TARGET", 0);
        if (i6 == 0) {
            return;
        }
        resources.getString(i6);
    }
}
