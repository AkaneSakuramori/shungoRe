package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f2797b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f2798c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2799d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2800e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f2802g;

    public /* synthetic */ v(TextView textView, int i4) {
        this.f2796a = i4;
        this.f2802g = textView;
    }

    public final void a() {
        TextView textView = this.f2802g;
        Drawable drawableA = m0.c.a((CompoundButton) textView);
        if (drawableA != null) {
            if (this.f2799d || this.f2800e) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.f2799d) {
                    c0.b.h(drawableMutate, this.f2797b);
                }
                if (this.f2800e) {
                    c0.b.i(drawableMutate, this.f2798c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(((CompoundButton) textView).getDrawableState());
                }
                ((CompoundButton) textView).setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b() {
        TextView textView = this.f2802g;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2799d || this.f2800e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f2799d) {
                    c0.b.h(drawableMutate, this.f2797b);
                }
                if (this.f2800e) {
                    c0.b.i(drawableMutate, this.f2798c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(((CheckedTextView) textView).getDrawableState());
                }
                ((CheckedTextView) textView).setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public final void c(AttributeSet attributeSet, int i4) {
        int iN;
        int iN2;
        int iN3;
        int iN4;
        int i5 = this.f2796a;
        TextView textView = this.f2802g;
        switch (i5) {
            case 0:
                CheckedTextView checkedTextView = (CheckedTextView) textView;
                Context context = checkedTextView.getContext();
                int[] iArr = d.a.f1665l;
                e.c cVarU = e.c.u(context, attributeSet, iArr, i4);
                i0.v0.k(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, (TypedArray) cVarU.f1780d, i4);
                try {
                    if (cVarU.r(1) && (iN2 = cVarU.n(1, 0)) != 0) {
                        try {
                            ((CheckedTextView) textView).setCheckMarkDrawable(r3.q.g(((CheckedTextView) textView).getContext(), iN2));
                        } catch (Resources.NotFoundException unused) {
                            if (cVarU.r(0)) {
                                ((CheckedTextView) textView).setCheckMarkDrawable(r3.q.g(((CheckedTextView) textView).getContext(), iN));
                            }
                        }
                        break;
                    } else if (cVarU.r(0) && (iN = cVarU.n(0, 0)) != 0) {
                        ((CheckedTextView) textView).setCheckMarkDrawable(r3.q.g(((CheckedTextView) textView).getContext(), iN));
                    }
                    if (cVarU.r(2)) {
                        ((CheckedTextView) textView).setCheckMarkTintList(cVarU.c(2));
                    }
                    if (cVarU.r(3)) {
                        ((CheckedTextView) textView).setCheckMarkTintMode(t1.b(cVarU.k(3, -1), null));
                        break;
                    }
                    return;
                } finally {
                    cVarU.v();
                }
            default:
                CompoundButton compoundButton = (CompoundButton) textView;
                Context context2 = compoundButton.getContext();
                int[] iArr2 = d.a.f1666m;
                e.c cVarU2 = e.c.u(context2, attributeSet, iArr2, i4);
                i0.v0.k(compoundButton, compoundButton.getContext(), iArr2, attributeSet, (TypedArray) cVarU2.f1780d, i4);
                try {
                    if (cVarU2.r(1) && (iN4 = cVarU2.n(1, 0)) != 0) {
                        try {
                            ((CompoundButton) textView).setButtonDrawable(r3.q.g(((CompoundButton) textView).getContext(), iN4));
                        } catch (Resources.NotFoundException unused2) {
                            if (cVarU2.r(0)) {
                                ((CompoundButton) textView).setButtonDrawable(r3.q.g(((CompoundButton) textView).getContext(), iN3));
                            }
                        }
                        break;
                    } else if (cVarU2.r(0) && (iN3 = cVarU2.n(0, 0)) != 0) {
                        ((CompoundButton) textView).setButtonDrawable(r3.q.g(((CompoundButton) textView).getContext(), iN3));
                    }
                    if (cVarU2.r(2)) {
                        m0.b.c((CompoundButton) textView, cVarU2.c(2));
                    }
                    if (cVarU2.r(3)) {
                        m0.b.d((CompoundButton) textView, t1.b(cVarU2.k(3, -1), null));
                        break;
                    }
                    return;
                } finally {
                    cVarU2.v();
                }
        }
    }
}
