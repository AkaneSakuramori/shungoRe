package s;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p {
    @Override // s.d
    public final void a(d dVar) {
        f fVar = this.f4194h;
        if (fVar.f4156c && !fVar.f4163j) {
            fVar.d((int) ((((f) fVar.f4165l.get(0)).f4160g * ((r.h) this.f4188b).f4016q0) + 0.5f));
        }
    }

    @Override // s.p
    public final void d() {
        r.d dVar = this.f4188b;
        r.h hVar = (r.h) dVar;
        int i4 = hVar.f4017r0;
        int i5 = hVar.f4018s0;
        int i6 = hVar.f4020u0;
        f fVar = this.f4194h;
        if (i6 == 1) {
            if (i4 != -1) {
                fVar.f4165l.add(dVar.T.f3944d.f4194h);
                this.f4188b.T.f3944d.f4194h.f4164k.add(fVar);
                fVar.f4159f = i4;
            } else if (i5 != -1) {
                fVar.f4165l.add(dVar.T.f3944d.f4195i);
                this.f4188b.T.f3944d.f4195i.f4164k.add(fVar);
                fVar.f4159f = -i5;
            } else {
                fVar.f4155b = true;
                fVar.f4165l.add(dVar.T.f3944d.f4195i);
                this.f4188b.T.f3944d.f4195i.f4164k.add(fVar);
            }
            m(this.f4188b.f3944d.f4194h);
            m(this.f4188b.f3944d.f4195i);
            return;
        }
        if (i4 != -1) {
            fVar.f4165l.add(dVar.T.f3946e.f4194h);
            this.f4188b.T.f3946e.f4194h.f4164k.add(fVar);
            fVar.f4159f = i4;
        } else if (i5 != -1) {
            fVar.f4165l.add(dVar.T.f3946e.f4195i);
            this.f4188b.T.f3946e.f4195i.f4164k.add(fVar);
            fVar.f4159f = -i5;
        } else {
            fVar.f4155b = true;
            fVar.f4165l.add(dVar.T.f3946e.f4195i);
            this.f4188b.T.f3946e.f4195i.f4164k.add(fVar);
        }
        m(this.f4188b.f3946e.f4194h);
        m(this.f4188b.f3946e.f4195i);
    }

    @Override // s.p
    public final void e() {
        r.d dVar = this.f4188b;
        int i4 = ((r.h) dVar).f4020u0;
        f fVar = this.f4194h;
        if (i4 == 1) {
            dVar.Y = fVar.f4160g;
        } else {
            dVar.Z = fVar.f4160g;
        }
    }

    @Override // s.p
    public final void f() {
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
