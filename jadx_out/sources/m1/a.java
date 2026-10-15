package m1;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import c3.h;
import com.auth0.android.request.internal.f;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3444a;

    public a() {
        TextUtils.isEmpty("Auth0.Android");
        TextUtils.isEmpty("2.10.2");
        HashMap map = new HashMap();
        map.put("android", String.valueOf(Build.VERSION.SDK_INT));
        if (!TextUtils.isEmpty(null)) {
            map.put("auth0.android", null);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        h.a0(mapUnmodifiableMap, "unmodifiableMap(tmpEnv)");
        HashMap map2 = new HashMap();
        map2.put("name", "Auth0.Android");
        map2.put("version", "2.10.2");
        map2.put("env", mapUnmodifiableMap);
        String strF = f.f1315a.f(map2);
        h.a0(strF, "json");
        Charset charset = StandardCharsets.UTF_8;
        h.a0(charset, "UTF_8");
        byte[] bytes = strF.getBytes(charset);
        h.a0(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 10);
        h.a0(bArrEncode, "encode(bytes, Base64.URL_SAFE or Base64.NO_WRAP)");
        this.f3444a = new String(bArrEncode, charset);
    }
}
