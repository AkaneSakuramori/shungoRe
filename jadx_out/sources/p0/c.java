package p0;

import android.graphics.Rect;
import j0.o;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f3726a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f3727b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f2.e f3729d;

    public c(boolean z4, f2.e eVar) {
        this.f3728c = z4;
        this.f3729d = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f3729d.getClass();
        Rect rect = this.f3726a;
        ((o) obj).f(rect);
        Rect rect2 = this.f3727b;
        ((o) obj2).f(rect2);
        int i4 = rect.top;
        int i5 = rect2.top;
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        int i6 = rect.left;
        int i7 = rect2.left;
        boolean z4 = this.f3728c;
        if (i6 < i7) {
            return z4 ? 1 : -1;
        }
        if (i6 > i7) {
            return z4 ? -1 : 1;
        }
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        if (i8 < i9) {
            return -1;
        }
        if (i8 > i9) {
            return 1;
        }
        int i10 = rect.right;
        int i11 = rect2.right;
        if (i10 < i11) {
            return z4 ? 1 : -1;
        }
        if (i10 > i11) {
            return z4 ? -1 : 1;
        }
        return 0;
    }
}
