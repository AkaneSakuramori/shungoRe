package e0;

import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f1961a;

    public j(Object obj) {
        this.f1961a = (LocaleList) obj;
    }

    @Override // e0.i
    public final Object a() {
        return this.f1961a;
    }

    public final boolean equals(Object obj) {
        return this.f1961a.equals(((i) obj).a());
    }

    public final int hashCode() {
        return this.f1961a.hashCode();
    }

    public final String toString() {
        return this.f1961a.toString();
    }
}
