package c1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f1231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f1232b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1231a = new d0(3);
        } else {
            f1231a = new c0(3);
        }
        f1232b = new c(Float.class, "translationAlpha", 5);
        new c(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i4, int i5, int i6, int i7) {
        f1231a.l(view, i4, i5, i6, i7);
    }
}
