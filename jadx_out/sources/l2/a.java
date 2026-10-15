package l2;

import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f3375a = Arrays.asList("com.google.android.apps.chrome", "org.chromium.chrome", "com.chrome.canary", "com.chrome.dev", "com.chrome.beta", "com.android.chrome");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f3376b;

    static {
        Arrays.asList("com.chrome.beta", "com.android.chrome");
        f3376b = Arrays.asList("com.google.android.apps.chrome", "org.chromium.chrome");
    }

    public static boolean a(PackageManager packageManager, String str, int i4) {
        int longVersionCode;
        if (f3376b.contains(str)) {
            return true;
        }
        try {
            longVersionCode = Build.VERSION.SDK_INT >= 28 ? (int) packageManager.getPackageInfo(str, 0).getLongVersionCode() : packageManager.getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            longVersionCode = 0;
        }
        return longVersionCode >= i4;
    }
}
