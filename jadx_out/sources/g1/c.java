package g1;

import android.text.TextUtils;
import c3.h;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f1.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2307c;

    public c() {
        super("An error occurred when trying to authenticate with the server.", null);
    }

    public final String a() {
        String str = this.f2307c;
        if (!TextUtils.isEmpty(str)) {
            h.X(str);
            return str;
        }
        String str2 = this.f2306b;
        if (str2 == null) {
            str2 = "a0.sdk.internal_error.unknown";
        }
        if (!h.I("a0.sdk.internal_error.unknown", str2)) {
            return "Failed with unknown error";
        }
        String str3 = this.f2306b;
        String str4 = String.format("Received error with code %s", Arrays.copyOf(new Object[]{str3 != null ? str3 : "a0.sdk.internal_error.unknown"}, 1));
        h.a0(str4, "format(format, *args)");
        return str4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this();
        h.b0(str, "code");
        this.f2306b = str;
        this.f2307c = str2;
    }
}
