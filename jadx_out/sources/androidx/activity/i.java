package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class i extends androidx.activity.result.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f263h;

    public i(androidx.fragment.app.u uVar) {
        this.f263h = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.result.g
    public final void b(int i4, c3.h hVar, Object obj) {
        Bundle bundle;
        n nVar = this.f263h;
        c.a aVarA1 = hVar.a1(nVar, obj);
        int i5 = 0;
        if (aVarA1 != null) {
            new Handler(Looper.getMainLooper()).post(new h(this, i4, aVarA1, i5));
            return;
        }
        Intent intentB0 = hVar.B0(nVar, obj);
        if (intentB0.getExtras() != null && intentB0.getExtras().getClassLoader() == null) {
            intentB0.setExtrasClassLoader(nVar.getClassLoader());
        }
        if (intentB0.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentB0.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentB0.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentB0.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentB0.getAction())) {
                int i6 = y.e.f5022b;
                y.a.b(nVar, intentB0, i4, bundle);
                return;
            }
            androidx.activity.result.j jVar = (androidx.activity.result.j) intentB0.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = jVar.f320b;
                Intent intent = jVar.f321c;
                int i7 = jVar.f322d;
                int i8 = jVar.f323e;
                int i9 = y.e.f5022b;
                y.a.c(nVar, intentSender, i4, intent, i7, i8, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e5) {
                new Handler(Looper.getMainLooper()).post(new h(this, i4, e5, 1));
                return;
            }
        }
        String[] stringArrayExtra = intentB0.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        int i10 = y.e.f5022b;
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
            if (TextUtils.isEmpty(stringArrayExtra[i11])) {
                throw new IllegalArgumentException(defpackage.a.h(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i11], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i12 = 0;
            while (i5 < stringArrayExtra.length) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr[i12] = stringArrayExtra[i5];
                    i12++;
                }
                i5++;
            }
        }
        if (nVar instanceof y.d) {
            ((y.d) nVar).getClass();
        }
        y.b.b(nVar, stringArrayExtra, i4);
    }
}
