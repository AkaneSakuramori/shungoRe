package defpackage;

import c3.e;
import c3.h;
import d3.a;
import e3.g;
import j3.p;
import z2.f;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g implements p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f1076f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, e eVar2) {
        super(eVar2);
        this.f1076f = eVar;
    }

    @Override // e3.a
    public final e a(e eVar) {
        return new b(this.f1076f, eVar);
    }

    @Override // j3.p
    public final Object c(Object obj, Object obj2) throws Throwable {
        b bVar = (b) a((e) obj2);
        f fVar = f.f5511a;
        bVar.h(fVar);
        return fVar;
    }

    @Override // e3.a
    public final Object h(Object obj) throws Throwable {
        a aVar = a.f1765b;
        h.D2(obj);
        h.B2(this.f1076f.f1770a);
        return f.f5511a;
    }
}
