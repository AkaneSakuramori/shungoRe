package c1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1229b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1228a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1230c = new ArrayList();

    public x(View view) {
        this.f1229b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f1229b == xVar.f1229b && this.f1228a.equals(xVar.f1228a);
    }

    public final int hashCode() {
        return this.f1228a.hashCode() + (this.f1229b.hashCode() * 31);
    }

    public final String toString() {
        String strF = defpackage.a.f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1229b + "\n", "    values:");
        HashMap map = this.f1228a;
        for (String str : map.keySet()) {
            strF = strF + "    " + str + ": " + map.get(str) + "\n";
        }
        return strF;
    }
}
