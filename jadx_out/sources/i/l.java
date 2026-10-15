package i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class l extends e0 implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f2636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f2636e = mVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        y3.a(this, getContentDescription());
        setOnTouchListener(new k(this, this, mVar, 0));
    }

    @Override // i.n
    public final boolean a() {
        return false;
    }

    @Override // i.n
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2636e.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i4, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i4, i5, i6, i7);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            c0.b.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
