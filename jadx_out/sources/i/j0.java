package i;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends RatingBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f2618b;

    public j0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        m3.a(this, getContext());
        h0 h0Var = new h0(this);
        this.f2618b = h0Var;
        h0Var.a(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        Bitmap bitmap = this.f2618b.f2600b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i4, 0), getMeasuredHeight());
        }
    }
}
