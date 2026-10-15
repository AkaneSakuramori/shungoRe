package i2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends f2.h {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f3014z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f3015y;

    public h(f fVar) {
        super(fVar);
        this.f3015y = fVar;
    }

    @Override // f2.h, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f3015y = new f(this.f3015y);
        return this;
    }

    public final void o(float f5, float f6, float f7, float f8) {
        RectF rectF = this.f3015y.f3013v;
        if (f5 == rectF.left && f6 == rectF.top && f7 == rectF.right && f8 == rectF.bottom) {
            return;
        }
        rectF.set(f5, f6, f7, f8);
        invalidateSelf();
    }
}
