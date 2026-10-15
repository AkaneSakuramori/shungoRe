package i2;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {
    @Override // f2.h
    public final void f(Canvas canvas) {
        if (this.f3015y.f3013v.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f3015y.f3013v);
        super.f(canvas);
        canvas.restore();
    }
}
