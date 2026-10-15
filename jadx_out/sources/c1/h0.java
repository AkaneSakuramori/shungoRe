package c1;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f1175a;

    public h0(View view) {
        this.f1175a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h0) && ((h0) obj).f1175a.equals(this.f1175a);
    }

    public final int hashCode() {
        return this.f1175a.hashCode();
    }
}
