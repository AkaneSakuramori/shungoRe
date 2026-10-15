package c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.n;
import androidx.activity.result.i;
import androidx.activity.result.j;
import c3.h;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1138j;

    public /* synthetic */ c(int i4) {
        this.f1138j = i4;
    }

    @Override // c3.h
    public final Intent B0(n nVar, Object obj) {
        Bundle bundleExtra;
        switch (this.f1138j) {
            case 0:
                h.b0(nVar, "context");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
                h.a0(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            default:
                j jVar = (j) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = jVar.f321c;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = jVar.f320b;
                        h.b0(intentSender, "intentSender");
                        i iVar = new i();
                        iVar.f318d = intentSender;
                        iVar.f319e = null;
                        int i4 = jVar.f323e;
                        iVar.f317c = i4;
                        int i5 = jVar.f322d;
                        iVar.f316b = i5;
                        jVar = new j(intentSender, null, i5, i4);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
        }
    }

    @Override // c3.h
    public final Object R1(Intent intent, int i4) {
        switch (this.f1138j) {
            case 0:
                if (intent == null || i4 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z4 = false;
                if (intArrayExtra != null) {
                    for (int i5 : intArrayExtra) {
                        if (i5 == 0) {
                            z4 = true;
                        }
                    }
                }
                return Boolean.valueOf(z4);
            default:
                return new androidx.activity.result.b(intent, i4);
        }
    }

    @Override // c3.h
    public final a a1(n nVar, Object obj) {
        switch (this.f1138j) {
            case 0:
                h.b0(nVar, "context");
                if (z.d.a(nVar, (String) obj) == 0) {
                    return new a(Boolean.TRUE);
                }
                return null;
            default:
                h.b0(nVar, "context");
                return null;
        }
    }
}
