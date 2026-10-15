package t2;

import java.util.Iterator;
import java.util.Map;
import m2.u;
import p2.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f4255a;

    public static void a(b bVar) {
        if (bVar instanceof g) {
            g gVar = (g) bVar;
            gVar.a0(5);
            Map.Entry entry = (Map.Entry) ((Iterator) gVar.c0()).next();
            gVar.e0(entry.getValue());
            gVar.e0(new u((String) entry.getKey()));
            return;
        }
        int iT = bVar.f4263i;
        if (iT == 0) {
            iT = bVar.t();
        }
        if (iT == 13) {
            bVar.f4263i = 9;
            return;
        }
        if (iT == 12) {
            bVar.f4263i = 8;
        } else {
            if (iT == 14) {
                bVar.f4263i = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + defpackage.a.s(bVar.T()) + bVar.I());
        }
    }
}
