package i2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends f2.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f3013v;

    public f(f2.l lVar, RectF rectF) {
        super(lVar);
        this.f3013v = rectF;
    }

    @Override // f2.g, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f3013v = fVar.f3013v;
    }
}
