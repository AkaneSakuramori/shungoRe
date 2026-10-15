package s;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f4157d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4160g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f4154a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4155b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4156c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4158e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4161h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f4162i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4163j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f4164k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f4165l = new ArrayList();

    public f(p pVar) {
        this.f4157d = pVar;
    }

    @Override // s.d
    public final void a(d dVar) {
        ArrayList<f> arrayList = this.f4165l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f4163j) {
                return;
            }
        }
        this.f4156c = true;
        p pVar = this.f4154a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f4155b) {
            this.f4157d.a(this);
            return;
        }
        f fVar = null;
        int i4 = 0;
        for (f fVar2 : arrayList) {
            if (!(fVar2 instanceof g)) {
                i4++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i4 == 1 && fVar.f4163j) {
            g gVar = this.f4162i;
            if (gVar != null) {
                if (!gVar.f4163j) {
                    return;
                } else {
                    this.f4159f = this.f4161h * gVar.f4160g;
                }
            }
            d(fVar.f4160g + this.f4159f);
        }
        p pVar2 = this.f4154a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f4164k.add(dVar);
        if (this.f4163j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f4165l.clear();
        this.f4164k.clear();
        this.f4163j = false;
        this.f4160g = 0;
        this.f4156c = false;
        this.f4155b = false;
    }

    public void d(int i4) {
        if (this.f4163j) {
            return;
        }
        this.f4163j = true;
        this.f4160g = i4;
        for (d dVar : this.f4164k) {
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4157d.f4188b.f3953h0);
        sb.append(":");
        sb.append(defpackage.a.r(this.f4158e));
        sb.append("(");
        sb.append(this.f4163j ? Integer.valueOf(this.f4160g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4165l.size());
        sb.append(":d=");
        sb.append(this.f4164k.size());
        sb.append(">");
        return sb.toString();
    }
}
