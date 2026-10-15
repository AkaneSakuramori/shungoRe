package p2;

import com.google.gson.reflect.TypeToken;
import java.io.EOFException;
import java.io.IOException;
import m2.b0;
import m2.c0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2.p f3824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2.m f3825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypeToken f3826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f3827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.a f3828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f3829f;

    public s(m2.p pVar, m2.m mVar, TypeToken typeToken, c0 c0Var) {
        c.a aVar = new c.a();
        aVar.f1137a = this;
        this.f3828e = aVar;
        this.f3824a = pVar;
        this.f3825b = mVar;
        this.f3826c = typeToken;
        this.f3827d = c0Var;
    }

    @Override // m2.b0
    public final Object b(t2.b bVar) {
        boolean z4;
        m2.q qVar;
        TypeToken typeToken = this.f3826c;
        m2.p pVar = this.f3824a;
        if (pVar == null) {
            b0 b0VarD = this.f3829f;
            if (b0VarD == null) {
                b0VarD = this.f3825b.d(this.f3827d, typeToken);
                this.f3829f = b0VarD;
            }
            return b0VarD.b(bVar);
        }
        try {
            try {
                bVar.T();
                z4 = false;
                try {
                    qVar = (m2.q) x.f3865y.b(bVar);
                } catch (EOFException e5) {
                    e = e5;
                    if (!z4) {
                        throw new m2.r(e);
                    }
                    qVar = m2.s.f3475b;
                }
            } catch (EOFException e6) {
                e = e6;
                z4 = true;
            }
            qVar.getClass();
            if (qVar instanceof m2.s) {
                return null;
            }
            return pVar.a(qVar, typeToken.getType(), this.f3828e);
        } catch (t2.d e7) {
            throw new m2.r(e7);
        } catch (IOException e8) {
            throw new m2.r(e8);
        } catch (NumberFormatException e9) {
            throw new m2.r(e9);
        }
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) {
        b0 b0VarD = this.f3829f;
        if (b0VarD == null) {
            b0VarD = this.f3825b.d(this.f3827d, this.f3826c);
            this.f3829f = b0VarD;
        }
        b0VarD.c(cVar, obj);
    }
}
