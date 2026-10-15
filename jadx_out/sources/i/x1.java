package i;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends f.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2836c;

    @Override // f.c, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f2836c) {
            super.draw(canvas);
        }
    }

    @Override // f.c, android.graphics.drawable.Drawable
    public final void setHotspot(float f5, float f6) {
        if (this.f2836c) {
            super.setHotspot(f5, f6);
        }
    }

    @Override // f.c, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i4, int i5, int i6, int i7) {
        if (this.f2836c) {
            super.setHotspotBounds(i4, i5, i6, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f2836c) {
            return this.f1998b.setState(iArr);
        }
        return false;
    }

    @Override // f.c, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        if (this.f2836c) {
            return super.setVisible(z4, z5);
        }
        return false;
    }
}
