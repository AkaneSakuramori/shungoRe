package i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends SeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f2637b;

    public l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        m3.a(this, getContext());
        m0 m0Var = new m0(this);
        this.f2637b = m0Var;
        m0Var.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m0 m0Var = this.f2637b;
        Drawable drawable = m0Var.f2680e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = m0Var.f2679d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2637b.f2680e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2637b.d(canvas);
    }
}
