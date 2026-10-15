package s;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p {
    @Override // s.d
    public final void a(d dVar) {
        r.a aVar = (r.a) this.f4188b;
        int i4 = aVar.f3908s0;
        f fVar = this.f4194h;
        Iterator it = fVar.f4165l.iterator();
        int i5 = 0;
        int i6 = -1;
        while (it.hasNext()) {
            int i7 = ((f) it.next()).f4160g;
            if (i6 == -1 || i7 < i6) {
                i6 = i7;
            }
            if (i5 < i7) {
                i5 = i7;
            }
        }
        if (i4 == 0 || i4 == 2) {
            fVar.d(i6 + aVar.f3910u0);
        } else {
            fVar.d(i5 + aVar.f3910u0);
        }
    }

    @Override // s.p
    public final void d() {
        r.d dVar = this.f4188b;
        if (dVar instanceof r.a) {
            f fVar = this.f4194h;
            fVar.f4155b = true;
            r.a aVar = (r.a) dVar;
            int i4 = aVar.f3908s0;
            boolean z4 = aVar.f3909t0;
            int i5 = 0;
            if (i4 == 0) {
                fVar.f4158e = 4;
                while (i5 < aVar.f4023r0) {
                    r.d dVar2 = aVar.f4022q0[i5];
                    if (z4 || dVar2.f3951g0 != 8) {
                        f fVar2 = dVar2.f3944d.f4194h;
                        fVar2.f4164k.add(fVar);
                        fVar.f4165l.add(fVar2);
                    }
                    i5++;
                }
                m(this.f4188b.f3944d.f4194h);
                m(this.f4188b.f3944d.f4195i);
                return;
            }
            if (i4 == 1) {
                fVar.f4158e = 5;
                while (i5 < aVar.f4023r0) {
                    r.d dVar3 = aVar.f4022q0[i5];
                    if (z4 || dVar3.f3951g0 != 8) {
                        f fVar3 = dVar3.f3944d.f4195i;
                        fVar3.f4164k.add(fVar);
                        fVar.f4165l.add(fVar3);
                    }
                    i5++;
                }
                m(this.f4188b.f3944d.f4194h);
                m(this.f4188b.f3944d.f4195i);
                return;
            }
            if (i4 == 2) {
                fVar.f4158e = 6;
                while (i5 < aVar.f4023r0) {
                    r.d dVar4 = aVar.f4022q0[i5];
                    if (z4 || dVar4.f3951g0 != 8) {
                        f fVar4 = dVar4.f3946e.f4194h;
                        fVar4.f4164k.add(fVar);
                        fVar.f4165l.add(fVar4);
                    }
                    i5++;
                }
                m(this.f4188b.f3946e.f4194h);
                m(this.f4188b.f3946e.f4195i);
                return;
            }
            if (i4 != 3) {
                return;
            }
            fVar.f4158e = 7;
            while (i5 < aVar.f4023r0) {
                r.d dVar5 = aVar.f4022q0[i5];
                if (z4 || dVar5.f3951g0 != 8) {
                    f fVar5 = dVar5.f3946e.f4195i;
                    fVar5.f4164k.add(fVar);
                    fVar.f4165l.add(fVar5);
                }
                i5++;
            }
            m(this.f4188b.f3946e.f4194h);
            m(this.f4188b.f3946e.f4195i);
        }
    }

    @Override // s.p
    public final void e() {
        r.d dVar = this.f4188b;
        if (dVar instanceof r.a) {
            int i4 = ((r.a) dVar).f3908s0;
            f fVar = this.f4194h;
            if (i4 == 0 || i4 == 1) {
                dVar.Y = fVar.f4160g;
            } else {
                dVar.Z = fVar.f4160g;
            }
        }
    }

    @Override // s.p
    public final void f() {
        this.f4189c = null;
        this.f4194h.c();
    }

    @Override // s.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f4194h;
        fVar2.f4164k.add(fVar);
        fVar.f4165l.add(fVar2);
    }
}
