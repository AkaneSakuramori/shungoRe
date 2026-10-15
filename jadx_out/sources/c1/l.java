package c1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f1186g;

    public l(m mVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f1186g = mVar;
        this.f1180a = obj;
        this.f1181b = arrayList;
        this.f1182c = obj2;
        this.f1183d = arrayList2;
        this.f1184e = obj3;
        this.f1185f = arrayList3;
    }

    @Override // c1.r, c1.p
    public final void c() {
        m mVar = this.f1186g;
        Object obj = this.f1180a;
        if (obj != null) {
            mVar.u(obj, this.f1181b, null);
        }
        Object obj2 = this.f1182c;
        if (obj2 != null) {
            mVar.u(obj2, this.f1183d, null);
        }
        Object obj3 = this.f1184e;
        if (obj3 != null) {
            mVar.u(obj3, this.f1185f, null);
        }
    }

    @Override // c1.p
    public final void d(q qVar) {
        qVar.v(this);
    }
}
