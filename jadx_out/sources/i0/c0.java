package i0;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f2898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2900d;

    public c0(int i4, Class cls, int i5, int i6) {
        this.f2897a = i4;
        this.f2898b = cls;
        this.f2900d = i5;
        this.f2899c = i6;
    }

    public final Object a(View view) {
        if (Build.VERSION.SDK_INT < this.f2899c) {
            Object tag = view.getTag(this.f2897a);
            if (this.f2898b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        int i4 = ((a0) this).f2885e;
        switch (i4) {
            case 0:
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(o0.d(view));
                    default:
                        return Boolean.valueOf(o0.c(view));
                }
            case 1:
                switch (i4) {
                    case 1:
                        return o0.b(view);
                    default:
                        return q0.b(view);
                }
            case 2:
                switch (i4) {
                    case 1:
                        return o0.b(view);
                    default:
                        return q0.b(view);
                }
            default:
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(o0.d(view));
                    default:
                        return Boolean.valueOf(o0.c(view));
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0065. Please report as an issue. */
    public final void b(View view, Object obj) {
        boolean zEquals;
        boolean z4;
        if (Build.VERSION.SDK_INT >= this.f2899c) {
            int i4 = ((a0) this).f2885e;
            switch (i4) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    switch (i4) {
                        case 0:
                            o0.j(view, bool.booleanValue());
                            break;
                        default:
                            o0.g(view, bool.booleanValue());
                            break;
                    }
                    break;
                case 1:
                    CharSequence charSequence = (CharSequence) obj;
                    switch (i4) {
                        case 1:
                            o0.h(view, charSequence);
                            break;
                        default:
                            q0.f(view, charSequence);
                            break;
                    }
                    break;
                case 2:
                    CharSequence charSequence2 = (CharSequence) obj;
                    switch (i4) {
                        case 1:
                            o0.h(view, charSequence2);
                            break;
                        default:
                            q0.f(view, charSequence2);
                            break;
                    }
                    break;
                default:
                    Boolean bool2 = (Boolean) obj;
                    switch (i4) {
                        case 0:
                            o0.j(view, bool2.booleanValue());
                            break;
                        default:
                            o0.g(view, bool2.booleanValue());
                            break;
                    }
                    break;
            }
        }
        Object objA = a(view);
        boolean z5 = false;
        int i5 = ((a0) this).f2885e;
        switch (i5) {
            case 0:
                Boolean bool3 = (Boolean) objA;
                Boolean bool4 = (Boolean) obj;
                switch (i5) {
                    case 0:
                        if ((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue())) {
                            z5 = true;
                        }
                        break;
                    default:
                        if ((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue())) {
                            z5 = true;
                        }
                        break;
                }
                z4 = !z5;
                break;
            case 1:
                CharSequence charSequence3 = (CharSequence) objA;
                CharSequence charSequence4 = (CharSequence) obj;
                switch (i5) {
                    case 1:
                        zEquals = TextUtils.equals(charSequence3, charSequence4);
                        break;
                    default:
                        zEquals = TextUtils.equals(charSequence3, charSequence4);
                        break;
                }
                z4 = !zEquals;
                break;
            case 2:
                CharSequence charSequence5 = (CharSequence) objA;
                CharSequence charSequence6 = (CharSequence) obj;
                switch (i5) {
                    case 1:
                        zEquals = TextUtils.equals(charSequence5, charSequence6);
                        break;
                    default:
                        zEquals = TextUtils.equals(charSequence5, charSequence6);
                        break;
                }
                z4 = !zEquals;
                break;
            default:
                Boolean bool5 = (Boolean) objA;
                Boolean bool6 = (Boolean) obj;
                switch (i5) {
                    case 0:
                        if ((bool5 != null && bool5.booleanValue()) == (bool6 != null && bool6.booleanValue())) {
                            z5 = true;
                        }
                        break;
                    default:
                        if ((bool5 != null && bool5.booleanValue()) == (bool6 != null && bool6.booleanValue())) {
                            z5 = true;
                        }
                        break;
                }
                z4 = !z5;
                break;
        }
        if (z4) {
            View.AccessibilityDelegate accessibilityDelegateC = v0.c(view);
            c cVar = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof a ? ((a) accessibilityDelegateC).f2884a : new c(accessibilityDelegateC);
            if (cVar == null) {
                cVar = new c();
            }
            v0.l(view, cVar);
            view.setTag(this.f2897a, obj);
            v0.g(view, this.f2900d);
        }
    }
}
