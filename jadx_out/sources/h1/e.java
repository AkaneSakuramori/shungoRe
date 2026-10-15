package h1;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import c3.h;

/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f2502a;

    public e(Context context) {
        h.b0(context, "context");
        if (!(!TextUtils.isEmpty("com.auth0.authentication.storage"))) {
            throw new IllegalArgumentException("The SharedPreferences name is invalid.".toString());
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.auth0.authentication.storage", 0);
        h.a0(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.f2502a = sharedPreferences;
    }

    public final void a(String str) {
        this.f2502a.edit().remove(str).apply();
    }

    public final String b(String str) {
        SharedPreferences sharedPreferences = this.f2502a;
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getString(str, null);
        }
        return null;
    }

    public final void c(String str, Long l4) {
        SharedPreferences sharedPreferences = this.f2502a;
        if (l4 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            sharedPreferences.edit().putLong(str, l4.longValue()).apply();
        }
    }

    public final void d(String str, String str2) {
        SharedPreferences sharedPreferences = this.f2502a;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }
}
