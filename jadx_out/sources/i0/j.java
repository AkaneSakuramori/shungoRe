package i0;

import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2926a;

    public j(DisplayCutout displayCutout) {
        this.f2926a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return h0.b.a(this.f2926a, ((j) obj).f2926a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f2926a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2926a + "}";
    }
}
