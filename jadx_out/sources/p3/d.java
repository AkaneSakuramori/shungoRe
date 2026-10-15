package p3;

import a3.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends e {
    public static List Q2(c cVar) {
        Iterator it = cVar.iterator();
        if (!it.hasNext()) {
            return p.f75b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return c3.h.u1(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
