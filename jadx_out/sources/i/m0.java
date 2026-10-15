package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f2679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f2680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f2681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f2682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2684i;

    public m0(SeekBar seekBar) {
        super(seekBar);
        this.f2681f = null;
        this.f2682g = null;
        this.f2683h = false;
        this.f2684i = false;
        this.f2679d = seekBar;
    }

    @Override // i.h0
    public final void a(AttributeSet attributeSet, int i4) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f2679d;
        Context context = seekBar.getContext();
        int[] iArr = d.a.f1660g;
        e.c cVarU = e.c.u(context, attributeSet, iArr, R.attr.seekBarStyle);
        i0.v0.k(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) cVarU.f1780d, R.attr.seekBarStyle);
        Drawable drawableI = cVarU.i(0);
        if (drawableI != null) {
            seekBar.setThumb(drawableI);
        }
        Drawable drawableH = cVarU.h(1);
        Drawable drawable = this.f2680e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2680e = drawableH;
        if (drawableH != null) {
            drawableH.setCallback(seekBar);
            c0.c.b(drawableH, i0.f0.d(seekBar));
            if (drawableH.isStateful()) {
                drawableH.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (cVarU.r(3)) {
            this.f2682g = t1.b(cVarU.k(3, -1), this.f2682g);
            this.f2684i = true;
        }
        if (cVarU.r(2)) {
            this.f2681f = cVarU.c(2);
            this.f2683h = true;
        }
        cVarU.v();
        c();
    }

    public final void c() {
        Drawable drawable = this.f2680e;
        if (drawable != null) {
            if (this.f2683h || this.f2684i) {
                Drawable drawableMutate = drawable.mutate();
                this.f2680e = drawableMutate;
                if (this.f2683h) {
                    c0.b.h(drawableMutate, this.f2681f);
                }
                if (this.f2684i) {
                    c0.b.i(this.f2680e, this.f2682g);
                }
                if (this.f2680e.isStateful()) {
                    this.f2680e.setState(this.f2679d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f2680e != null) {
            SeekBar seekBar = this.f2679d;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2680e.getIntrinsicWidth();
                int intrinsicHeight = this.f2680e.getIntrinsicHeight();
                int i4 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i5 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2680e.setBounds(-i4, -i5, i4, i5);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f2680e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
