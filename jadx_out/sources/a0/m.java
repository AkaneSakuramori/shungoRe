package a0;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f30a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f31b;

    public m(Resources resources, Resources.Theme theme) {
        this.f30a = resources;
        this.f31b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f30a.equals(mVar.f30a) && h0.b.a(this.f31b, mVar.f31b);
    }

    public final int hashCode() {
        return h0.b.b(this.f30a, this.f31b);
    }
}
