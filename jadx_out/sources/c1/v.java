package c1;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class v extends q {
    public int A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f1223y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1224z = true;
    public boolean B = false;
    public int C = 0;

    @Override // c1.q
    public final void A(c3.h hVar) {
        this.f1215t = hVar;
        this.C |= 8;
        int size = this.f1223y.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.f1223y.get(i4)).A(hVar);
        }
    }

    @Override // c1.q
    public final void B(TimeInterpolator timeInterpolator) {
        this.C |= 1;
        ArrayList arrayList = this.f1223y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((q) this.f1223y.get(i4)).B(timeInterpolator);
            }
        }
        this.f1200e = timeInterpolator;
    }

    @Override // c1.q
    public final void C(z0.c cVar) {
        super.C(cVar);
        this.C |= 4;
        if (this.f1223y != null) {
            for (int i4 = 0; i4 < this.f1223y.size(); i4++) {
                ((q) this.f1223y.get(i4)).C(cVar);
            }
        }
    }

    @Override // c1.q
    public final void D() {
        this.C |= 2;
        int size = this.f1223y.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.f1223y.get(i4)).D();
        }
    }

    @Override // c1.q
    public final void E(long j4) {
        this.f1198c = j4;
    }

    @Override // c1.q
    public final String G(String str) {
        String strG = super.G(str);
        for (int i4 = 0; i4 < this.f1223y.size(); i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strG);
            sb.append("\n");
            sb.append(((q) this.f1223y.get(i4)).G(str + "  "));
            strG = sb.toString();
        }
        return strG;
    }

    public final void H(q qVar) {
        this.f1223y.add(qVar);
        qVar.f1205j = this;
        long j4 = this.f1199d;
        if (j4 >= 0) {
            qVar.z(j4);
        }
        if ((this.C & 1) != 0) {
            qVar.B(this.f1200e);
        }
        if ((this.C & 2) != 0) {
            qVar.D();
        }
        if ((this.C & 4) != 0) {
            qVar.C(this.f1216u);
        }
        if ((this.C & 8) != 0) {
            qVar.A(this.f1215t);
        }
    }

    @Override // c1.q
    public final void a(p pVar) {
        super.a(pVar);
    }

    @Override // c1.q
    public final void b(View view) {
        for (int i4 = 0; i4 < this.f1223y.size(); i4++) {
            ((q) this.f1223y.get(i4)).b(view);
        }
        this.f1202g.add(view);
    }

    @Override // c1.q
    public final void d(x xVar) {
        if (s(xVar.f1229b)) {
            for (q qVar : this.f1223y) {
                if (qVar.s(xVar.f1229b)) {
                    qVar.d(xVar);
                    xVar.f1230c.add(qVar);
                }
            }
        }
    }

    @Override // c1.q
    public final void f(x xVar) {
        int size = this.f1223y.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.f1223y.get(i4)).f(xVar);
        }
    }

    @Override // c1.q
    public final void g(x xVar) {
        if (s(xVar.f1229b)) {
            for (q qVar : this.f1223y) {
                if (qVar.s(xVar.f1229b)) {
                    qVar.g(xVar);
                    xVar.f1230c.add(qVar);
                }
            }
        }
    }

    @Override // c1.q
    /* JADX INFO: renamed from: j */
    public final q clone() {
        v vVar = (v) super.clone();
        vVar.f1223y = new ArrayList();
        int size = this.f1223y.size();
        for (int i4 = 0; i4 < size; i4++) {
            q qVarClone = ((q) this.f1223y.get(i4)).clone();
            vVar.f1223y.add(qVarClone);
            qVarClone.f1205j = vVar;
        }
        return vVar;
    }

    @Override // c1.q
    public final void l(ViewGroup viewGroup, g.h hVar, g.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j4 = this.f1198c;
        int size = this.f1223y.size();
        for (int i4 = 0; i4 < size; i4++) {
            q qVar = (q) this.f1223y.get(i4);
            if (j4 > 0 && (this.f1224z || i4 == 0)) {
                long j5 = qVar.f1198c;
                if (j5 > 0) {
                    qVar.E(j5 + j4);
                } else {
                    qVar.E(j4);
                }
            }
            qVar.l(viewGroup, hVar, hVar2, arrayList, arrayList2);
        }
    }

    @Override // c1.q
    public final void u(View view) {
        super.u(view);
        int size = this.f1223y.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.f1223y.get(i4)).u(view);
        }
    }

    @Override // c1.q
    public final void v(p pVar) {
        super.v(pVar);
    }

    @Override // c1.q
    public final void w(View view) {
        for (int i4 = 0; i4 < this.f1223y.size(); i4++) {
            ((q) this.f1223y.get(i4)).w(view);
        }
        this.f1202g.remove(view);
    }

    @Override // c1.q
    public final void x(ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.f1223y.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.f1223y.get(i4)).x(viewGroup);
        }
    }

    @Override // c1.q
    public final void y() {
        if (this.f1223y.isEmpty()) {
            F();
            m();
            return;
        }
        u uVar = new u();
        uVar.f1222a = this;
        Iterator it = this.f1223y.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(uVar);
        }
        this.A = this.f1223y.size();
        if (this.f1224z) {
            Iterator it2 = this.f1223y.iterator();
            while (it2.hasNext()) {
                ((q) it2.next()).y();
            }
            return;
        }
        for (int i4 = 1; i4 < this.f1223y.size(); i4++) {
            ((q) this.f1223y.get(i4 - 1)).a(new h(this, 2, (q) this.f1223y.get(i4)));
        }
        q qVar = (q) this.f1223y.get(0);
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override // c1.q
    public final void z(long j4) {
        ArrayList arrayList;
        this.f1199d = j4;
        if (j4 < 0 || (arrayList = this.f1223y) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.f1223y.get(i4)).z(j4);
        }
    }
}
