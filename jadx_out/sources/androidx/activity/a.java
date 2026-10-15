package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f249a = new a();

    public final BackEvent a(float f5, float f6, float f7, int i4) {
        return new BackEvent(f5, f6, f7, i4);
    }

    public final float b(BackEvent backEvent) {
        c3.h.b0(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        c3.h.b0(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        c3.h.b0(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        c3.h.b0(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
