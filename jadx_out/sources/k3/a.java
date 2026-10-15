package k3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements o3.a, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient o3.a f3258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f3260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3263g;

    public a(Object obj, Class cls, String str, String str2, boolean z4) {
        this.f3259c = obj;
        this.f3260d = cls;
        this.f3261e = str;
        this.f3262f = str2;
        this.f3263g = z4;
    }

    public final b b() {
        b cVar;
        Class cls = this.f3260d;
        if (cls == null) {
            return null;
        }
        if (this.f3263g) {
            n.f3277a.getClass();
            cVar = new h(cls);
        } else {
            n.f3277a.getClass();
            cVar = new c(cls);
        }
        return cVar;
    }
}
