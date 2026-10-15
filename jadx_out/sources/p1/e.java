package p1;

import android.view.View;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3770d;

    public e(View view) {
        this.f3767a = view;
    }

    public final void a() {
        int i4 = this.f3770d;
        View view = this.f3767a;
        int top = i4 - (view.getTop() - this.f3768b);
        WeakHashMap weakHashMap = v0.f2983a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f3769c));
    }
}
