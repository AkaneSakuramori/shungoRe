package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d extends f2.e {
    public d() {
        super(12);
    }

    @Override // f2.e
    public final List K(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentContentProviders(intent, 0);
    }

    @Override // f2.e
    public final ProviderInfo x(ResolveInfo resolveInfo) {
        return resolveInfo.providerInfo;
    }
}
