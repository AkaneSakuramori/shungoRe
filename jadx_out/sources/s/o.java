package s;

import java.util.ArrayList;
import java.util.Iterator;
import r3.q;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f4181f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f4185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4186e;

    public final void a(ArrayList arrayList) {
        int size = this.f4182a.size();
        if (this.f4186e != -1 && size > 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                o oVar = (o) arrayList.get(i4);
                if (this.f4186e == oVar.f4183b) {
                    c(this.f4184c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(p.d dVar, int i4) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f4182a;
        if (arrayList.size() == 0) {
            return 0;
        }
        r.e eVar = (r.e) ((r.d) arrayList.get(0)).T;
        dVar.t();
        eVar.c(dVar, false);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ((r.d) arrayList.get(i5)).c(dVar, false);
        }
        if (i4 == 0 && eVar.f3988z0 > 0) {
            q.b(eVar, dVar, arrayList, 0);
        }
        if (i4 == 1 && eVar.A0 > 0) {
            q.b(eVar, dVar, arrayList, 1);
        }
        try {
            dVar.p();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f4185d = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            this.f4185d.add(new n(this, (r.d) arrayList.get(i6), dVar, i4));
        }
        if (i4 == 0) {
            iN = p.d.n(eVar.I);
            iN2 = p.d.n(eVar.K);
            dVar.t();
        } else {
            iN = p.d.n(eVar.J);
            iN2 = p.d.n(eVar.L);
            dVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i4, o oVar) {
        for (r.d dVar : this.f4182a) {
            ArrayList arrayList = oVar.f4182a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i5 = oVar.f4183b;
            if (i4 == 0) {
                dVar.f3965n0 = i5;
            } else {
                dVar.f3967o0 = i5;
            }
        }
        this.f4186e = oVar.f4183b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i4 = this.f4184c;
        if (i4 == 0) {
            str = "Horizontal";
        } else if (i4 == 1) {
            str = "Vertical";
        } else {
            str = i4 == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.f4183b);
        sb.append("] <");
        String string = sb.toString();
        Iterator it = this.f4182a.iterator();
        while (it.hasNext()) {
            string = string + " " + ((r.d) it.next()).f3953h0;
        }
        return defpackage.a.f(string, " >");
    }
}
