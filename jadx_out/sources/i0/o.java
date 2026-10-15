package i0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f2944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f2945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f2946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f2948e;

    public o(View view) {
        this.f2946c = view;
    }

    public final boolean a(float f5, float f6, boolean z4) {
        ViewParent viewParentF;
        if (!this.f2947d || (viewParentF = f(0)) == null) {
            return false;
        }
        try {
            return z0.a(viewParentF, this.f2946c, f5, f6, z4);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedFling", e5);
            return false;
        }
    }

    public final boolean b(float f5, float f6) {
        ViewParent viewParentF;
        if (!this.f2947d || (viewParentF = f(0)) == null) {
            return false;
        }
        try {
            return z0.b(viewParentF, this.f2946c, f5, f6);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedPreFling", e5);
            return false;
        }
    }

    public final boolean c(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        ViewParent viewParentF;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f2947d || (viewParentF = f(i6)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f2946c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            if (this.f2948e == null) {
                this.f2948e = new int[2];
            }
            iArr3 = this.f2948e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f2946c;
        if (viewParentF instanceof p) {
            ((p) viewParentF).e(view2, i4, i5, iArr3, i6);
        } else if (i6 == 0) {
            try {
                z0.c(viewParentF, view2, i4, i5, iArr3);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedPreScroll", e5);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i4, int i5, int i6, int[] iArr) {
        e(0, i4, 0, i5, null, i6, iArr);
    }

    public final boolean e(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent viewParentF;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.f2947d || (viewParentF = f(i8)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f2946c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            if (this.f2948e == null) {
                this.f2948e = new int[2];
            }
            int[] iArr4 = this.f2948e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f2946c;
        if (viewParentF instanceof q) {
            ((q) viewParentF).b(view2, i4, i5, i6, i7, i8, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i6;
            iArr3[1] = iArr3[1] + i7;
            if (viewParentF instanceof p) {
                ((p) viewParentF).c(view2, i4, i5, i6, i7, i8);
            } else if (i8 == 0) {
                try {
                    z0.d(viewParentF, view2, i4, i5, i6, i7);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedScroll", e5);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i9;
            iArr[1] = iArr[1] - i10;
        }
        return true;
    }

    public final ViewParent f(int i4) {
        if (i4 == 0) {
            return this.f2944a;
        }
        if (i4 != 1) {
            return null;
        }
        return this.f2945b;
    }

    public final boolean g(int i4) {
        return f(i4) != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077 A[SYNTHETIC] */
    public final boolean h(int i4, int i5) {
        boolean zF;
        if (g(i5)) {
            return true;
        }
        if (!this.f2947d) {
            return false;
        }
        View view = this.f2946c;
        View view2 = view;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            boolean z4 = parent instanceof p;
            if (z4) {
                zF = ((p) parent).f(view2, view, i4, i5);
            } else {
                if (i5 == 0) {
                    try {
                        zF = z0.f(parent, view2, view, i4);
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e5);
                    }
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            if (zF) {
                if (i5 == 0) {
                    this.f2944a = parent;
                } else if (i5 == 1) {
                    this.f2945b = parent;
                }
                if (z4) {
                    ((p) parent).a(view2, view, i4, i5);
                } else if (i5 == 0) {
                    try {
                        z0.e(parent, view2, view, i4);
                    } catch (AbstractMethodError e6) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e6);
                    }
                }
                return true;
            }
            if (parent instanceof View) {
                view2 = parent;
            }
        }
        return false;
    }

    public final void i(int i4) {
        ViewParent viewParentF = f(i4);
        if (viewParentF != null) {
            boolean z4 = viewParentF instanceof p;
            View view = this.f2946c;
            if (z4) {
                ((p) viewParentF).d(view, i4);
            } else if (i4 == 0) {
                try {
                    z0.g(viewParentF, view);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i4 == 0) {
                this.f2944a = null;
            } else {
                if (i4 != 1) {
                    return;
                }
                this.f2945b = null;
            }
        }
    }
}
