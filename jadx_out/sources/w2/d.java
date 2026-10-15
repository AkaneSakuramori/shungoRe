package w2;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import c3.h;
import c3.m;
import com.shungo.app.R;
import f2.e;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import t3.u;
import t3.v;
import t3.w;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f4898a;

    static {
        Pattern pattern = u.f4429c;
        f4898a = e.r("application/json");
    }

    public static Object a(Context context, String str, String str2, String str3, Boolean bool, c3.e eVar) {
        m mVar = new m(h.k1(eVar));
        Log.i("Shungo", "Authenticated request: ".concat(str));
        v vVar = new v();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        h.b0(timeUnit, "unit");
        vVar.f4451s = u3.b.b(60L, timeUnit);
        w wVar = new w(vVar);
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string == null) {
            Toast.makeText(context, "Error no device id", 0).show();
            mVar.b(null);
        }
        Log.i("Shungo", "query: " + str2);
        String str4 = context.getString(R.string.api_url) + str + "?device=" + string + str2;
        Log.i("Shungo", str4);
        String string2 = context.getString(R.string.com_auth0_client_id);
        h.a0(string2, "getString(...)");
        String string3 = context.getString(R.string.com_auth0_domain);
        h.a0(string3, "getString(...)");
        g1.b bVar = new g1.b(new f1.a(string2, string3));
        h1.e eVar2 = new h1.e(context);
        h1.c cVar = new h1.c(bVar, eVar2);
        String strB = eVar2.b("com.auth0.access_token");
        String strB2 = eVar2.b("com.auth0.refresh_token");
        String strB3 = eVar2.b("com.auth0.id_token");
        SharedPreferences sharedPreferences = eVar2.f2502a;
        Long lValueOf = !sharedPreferences.contains("com.auth0.expires_at") ? null : Long.valueOf(sharedPreferences.getLong("com.auth0.expires_at", 0L));
        if ((TextUtils.isEmpty(strB) && TextUtils.isEmpty(strB3)) || lValueOf == null || (cVar.a(lValueOf.longValue(), 0L) && strB2 == null)) {
            mVar.b(null);
        }
        cVar.f2501d.execute(new h1.b(cVar, new c(str4, str3, wVar, bool, mVar, context)));
        Object objA = mVar.a();
        d3.a aVar = d3.a.f1765b;
        return objA;
    }

    public static /* synthetic */ Object b(Context context, String str, String str2, String str3, c3.e eVar, int i4) {
        if ((i4 & 4) != 0) {
            str2 = "";
        }
        return a(context, str, str2, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? Boolean.FALSE : null, eVar);
    }
}
