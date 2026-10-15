package r;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import r3.q;
import s.o;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f3932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f3934f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p.i f3937i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f3929a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3935g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3936h = Integer.MIN_VALUE;

    public c(d dVar, int i4) {
        this.f3932d = dVar;
        this.f3933e = i4;
    }

    public final void a(c cVar, int i4) {
        b(cVar, i4, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i4, int i5, boolean z4) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z4 && !i(cVar)) {
            return false;
        }
        this.f3934f = cVar;
        if (cVar.f3929a == null) {
            cVar.f3929a = new HashSet();
        }
        HashSet hashSet = this.f3934f.f3929a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3935g = i4;
        this.f3936h = i5;
        return true;
    }

    public final void c(int i4, o oVar, ArrayList arrayList) {
        HashSet hashSet = this.f3929a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                q.d(((c) it.next()).f3932d, i4, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (this.f3931c) {
            return this.f3930b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f3932d.f3951g0 == 8) {
            return 0;
        }
        int i4 = this.f3936h;
        return (i4 == Integer.MIN_VALUE || (cVar = this.f3934f) == null || cVar.f3932d.f3951g0 != 8) ? this.f3935g : i4;
    }

    public final c f() {
        int i4 = this.f3933e;
        int iA = p.h.a(i4);
        d dVar = this.f3932d;
        switch (iA) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(defpackage.a.o(i4));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3929a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3934f != null;
    }

    public final boolean i(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i4 = this.f3933e;
        d dVar = cVar.f3932d;
        int i5 = cVar.f3933e;
        if (i5 == i4) {
            return i4 != 6 || (dVar.E && this.f3932d.E);
        }
        switch (p.h.a(i4)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z4 = i5 == 2 || i5 == 4;
                if (dVar instanceof h) {
                    return z4 || i5 == 8;
                }
                return z4;
            case 2:
            case 4:
                boolean z5 = i5 == 3 || i5 == 5;
                if (dVar instanceof h) {
                    return z5 || i5 == 9;
                }
                return z5;
            case 5:
                return (i5 == 2 || i5 == 4) ? false : true;
            case 6:
                return (i5 == 6 || i5 == 8 || i5 == 9) ? false : true;
            default:
                throw new AssertionError(defpackage.a.o(i4));
        }
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f3934f;
        if (cVar != null && (hashSet = cVar.f3929a) != null) {
            hashSet.remove(this);
            if (this.f3934f.f3929a.size() == 0) {
                this.f3934f.f3929a = null;
            }
        }
        this.f3929a = null;
        this.f3934f = null;
        this.f3935g = 0;
        this.f3936h = Integer.MIN_VALUE;
        this.f3931c = false;
        this.f3930b = 0;
    }

    public final void k() {
        p.i iVar = this.f3937i;
        if (iVar == null) {
            this.f3937i = new p.i(1);
        } else {
            iVar.c();
        }
    }

    public final void l(int i4) {
        this.f3930b = i4;
        this.f3931c = true;
    }

    public final String toString() {
        return this.f3932d.f3953h0 + ":" + defpackage.a.o(this.f3933e);
    }
}
