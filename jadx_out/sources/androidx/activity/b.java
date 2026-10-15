package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f253d;

    public b(BackEvent backEvent) {
        c3.h.b0(backEvent, "backEvent");
        a aVar = a.f249a;
        float fD = aVar.d(backEvent);
        float fE = aVar.e(backEvent);
        float fB = aVar.b(backEvent);
        int iC = aVar.c(backEvent);
        this.f250a = fD;
        this.f251b = fE;
        this.f252c = fB;
        this.f253d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f250a + ", touchY=" + this.f251b + ", progress=" + this.f252c + ", swipeEdge=" + this.f253d + '}';
    }
}
