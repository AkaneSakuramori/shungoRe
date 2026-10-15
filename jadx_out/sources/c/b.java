package c;

import a3.j;
import a3.q;
import android.content.Intent;
import androidx.activity.n;
import c3.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {
    @Override // c3.h
    public final Intent B0(n nVar, Object obj) {
        h.b0(nVar, "context");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
        h.a0(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // c3.h
    public final Object R1(Intent intent, int i4) {
        q qVar = q.f76b;
        if (i4 != -1 || intent == null) {
            return qVar;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return qVar;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i5 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i5 == 0));
        }
        ArrayList arrayListW2 = j.W2(stringArrayExtra);
        Iterator it = arrayListW2.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(j.R2(arrayListW2), j.R2(arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new z2.a(it.next(), it2.next()));
        }
        return j.a3(arrayList2);
    }

    @Override // c3.h
    public final a a1(n nVar, Object obj) {
        String[] strArr = (String[]) obj;
        h.b0(nVar, "context");
        if (strArr.length == 0) {
            return new a(q.f76b);
        }
        for (String str : strArr) {
            if (z.d.a(nVar, str) != 0) {
                return null;
            }
        }
        int iX1 = h.x1(strArr.length);
        if (iX1 < 16) {
            iX1 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iX1);
        for (String str2 : strArr) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new a(linkedHashMap);
    }
}
