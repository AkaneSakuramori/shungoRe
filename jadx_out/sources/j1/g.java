package j1;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f3173b;

    public g(Intent intent) {
        this.f3173b = intent;
        this.f3172a = (intent == null ? null : intent.getData()) != null ? -1 : 0;
    }

    public final boolean a() {
        Intent intent;
        if (this.f3172a == 0 && (intent = this.f3173b) != null) {
            if ((intent == null ? null : intent.getData()) == null) {
                return true;
            }
        }
        return false;
    }
}
