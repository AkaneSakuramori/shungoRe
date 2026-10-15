package androidx.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f262e;

    public /* synthetic */ h(Object obj, int i4, Object obj2, int i5) {
        this.f259b = i5;
        this.f261d = obj;
        this.f260c = i4;
        this.f262e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.c cVar;
        int i4 = this.f259b;
        int i5 = 0;
        Object obj = this.f261d;
        int i6 = this.f260c;
        Object obj2 = this.f262e;
        switch (i4) {
            case 0:
                i iVar = (i) obj;
                Object obj3 = ((c.a) obj2).f1137a;
                String str = (String) iVar.f309a.get(Integer.valueOf(i6));
                if (str == null) {
                    return;
                }
                androidx.activity.result.e eVar = (androidx.activity.result.e) iVar.f313e.get(str);
                if (eVar == null || (cVar = eVar.f305a) == null) {
                    iVar.f315g.remove(str);
                    iVar.f314f.put(str, obj3);
                    return;
                } else {
                    if (iVar.f312d.remove(str)) {
                        cVar.b(obj3);
                        return;
                    }
                    return;
                }
            case 1:
                ((i) obj).a(i6, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj2));
                return;
            case 2:
                ((l.b) obj).getClass();
                throw null;
            case 3:
                String[] strArr = (String[]) obj2;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) obj;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i5 < length) {
                    iArr[i5] = packageManager.checkPermission(strArr[i5], packageName);
                    i5++;
                }
                ((y.c) activity).onRequestPermissionsResult(i6, strArr, iArr);
                return;
            case 4:
                c3.h hVar = (c3.h) ((n0) obj2).f1896c;
                if (hVar != null) {
                    hVar.G1(i6);
                    return;
                }
                return;
            case 5:
                List list = (List) obj2;
                int size = list.size();
                if (i6 != 1) {
                    while (i5 < size) {
                        ((androidx.emoji2.text.k) list.get(i5)).getClass();
                        i5++;
                    }
                    return;
                } else {
                    while (i5 < size) {
                        ((androidx.emoji2.text.k) list.get(i5)).a();
                        i5++;
                    }
                    return;
                }
            default:
                ((BottomSheetBehavior) obj).E((View) obj2, i6, false);
                return;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, int i4, int i5) {
        this.f259b = i5;
        this.f261d = obj;
        this.f262e = obj2;
        this.f260c = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(androidx.emoji2.text.k kVar, int i4) {
        this.f259b = 5;
        androidx.emoji2.text.k[] kVarArr = new androidx.emoji2.text.k[1];
        if (kVar != null) {
            kVarArr[0] = kVar;
            this(Arrays.asList(kVarArr), i4, null);
            return;
        }
        throw new NullPointerException("initCallback cannot be null");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i4, ArrayList arrayList) {
        this(arrayList, i4, null);
        this.f259b = 5;
    }

    public h(List list, int i4, Throwable th) {
        this.f259b = 5;
        if (list != null) {
            this.f262e = new ArrayList(list);
            this.f260c = i4;
            this.f261d = th;
            return;
        }
        throw new NullPointerException("initCallbacks cannot be null");
    }
}
