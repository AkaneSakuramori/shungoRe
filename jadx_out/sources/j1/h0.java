package j1;

import android.util.Base64;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f3175f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1.b f3176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f3180e;

    public h0(g1.b bVar, String str, HashMap map) {
        this.f3176a = bVar;
        this.f3178c = str;
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        this.f3177b = strEncodeToString;
        byte[] bytes = strEncodeToString.getBytes(StandardCharsets.US_ASCII);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            this.f3179d = Base64.encodeToString(messageDigest.digest(), 11);
            this.f3180e = map;
        } catch (NoSuchAlgorithmException e5) {
            Log.e("e0", "Failed to get SHA-256 signature", e5);
            throw new IllegalStateException("Failed to get SHA-256 signature", e5);
        }
    }
}
