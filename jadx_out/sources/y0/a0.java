package y0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(o0 o0Var, int i4) {
        super(o0Var);
        this.f5061d = i4;
    }

    @Override // y0.b0
    public final int b(View view) {
        int i4 = this.f5061d;
        o0 o0Var = this.f5081a;
        switch (i4) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                o0Var.getClass();
                return view.getRight() + ((p0) view.getLayoutParams()).f5274b.right + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                o0Var.getClass();
                return view.getBottom() + ((p0) view.getLayoutParams()).f5274b.bottom + ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin;
        }
    }

    @Override // y0.b0
    public final int c(View view) {
        int i4 = this.f5061d;
        o0 o0Var = this.f5081a;
        switch (i4) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                o0Var.getClass();
                Rect rect = ((p0) view.getLayoutParams()).f5274b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                o0Var.getClass();
                Rect rect2 = ((p0) view.getLayoutParams()).f5274b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) p0Var2).topMargin + ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin;
        }
    }

    @Override // y0.b0
    public final int d(View view) {
        int i4 = this.f5061d;
        o0 o0Var = this.f5081a;
        switch (i4) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                o0Var.getClass();
                return (view.getLeft() - ((p0) view.getLayoutParams()).f5274b.left) - ((ViewGroup.MarginLayoutParams) p0Var).leftMargin;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                o0Var.getClass();
                return (view.getTop() - ((p0) view.getLayoutParams()).f5274b.top) - ((ViewGroup.MarginLayoutParams) p0Var2).topMargin;
        }
    }

    @Override // y0.b0
    public final int e() {
        int i4 = this.f5061d;
        o0 o0Var = this.f5081a;
        switch (i4) {
            case 0:
                return o0Var.f5241n - o0Var.D();
            default:
                return o0Var.f5242o - o0Var.B();
        }
    }

    @Override // y0.b0
    public final int f() {
        int i4 = this.f5061d;
        o0 o0Var = this.f5081a;
        switch (i4) {
            case 0:
                return o0Var.C();
            default:
                return o0Var.E();
        }
    }

    @Override // y0.b0
    public final int g() {
        int i4 = this.f5061d;
        o0 o0Var = this.f5081a;
        switch (i4) {
            case 0:
                return (o0Var.f5241n - o0Var.C()) - o0Var.D();
            default:
                return (o0Var.f5242o - o0Var.E()) - o0Var.B();
        }
    }

    @Override // y0.b0
    public final int i(View view) {
        int i4 = this.f5061d;
        Rect rect = this.f5083c;
        o0 o0Var = this.f5081a;
        switch (i4) {
            case 0:
                o0Var.I(view, rect);
                return rect.right;
            default:
                o0Var.I(view, rect);
                return rect.bottom;
        }
    }

    @Override // y0.b0
    public final int j(View view) {
        int i4 = this.f5061d;
        Rect rect = this.f5083c;
        o0 o0Var = this.f5081a;
        switch (i4) {
            case 0:
                o0Var.I(view, rect);
                return rect.left;
            default:
                o0Var.I(view, rect);
                return rect.top;
        }
    }

    @Override // y0.b0
    public final void k(int i4) {
        int i5 = this.f5061d;
        o0 o0Var = this.f5081a;
        switch (i5) {
            case 0:
                o0Var.M(i4);
                break;
            default:
                o0Var.N(i4);
                break;
        }
    }

    public final int l(View view) {
        int i4 = this.f5061d;
        o0 o0Var = this.f5081a;
        switch (i4) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                o0Var.getClass();
                Rect rect = ((p0) view.getLayoutParams()).f5274b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) p0Var).topMargin + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                o0Var.getClass();
                Rect rect2 = ((p0) view.getLayoutParams()).f5274b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) p0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) p0Var2).rightMargin;
        }
    }
}
