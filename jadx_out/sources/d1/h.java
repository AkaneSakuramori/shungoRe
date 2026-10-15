package d1;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0.d f1698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0.d f1700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f1702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Cap f1706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Paint.Join f1707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1708o;

    @Override // d1.j
    public final boolean a() {
        return this.f1700g.b() || this.f1698e.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // d1.j
    public final boolean b(int[] iArr) {
        boolean z4;
        a0.d dVar = this.f1700g;
        boolean z5 = false;
        if (dVar.b()) {
            ColorStateList colorStateList = dVar.f14b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar.f15c) {
                dVar.f15c = colorForState;
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        a0.d dVar2 = this.f1698e;
        if (dVar2.b()) {
            ColorStateList colorStateList2 = dVar2.f14b;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != dVar2.f15c) {
                dVar2.f15c = colorForState2;
                z5 = true;
            }
        }
        return z4 | z5;
    }

    public float getFillAlpha() {
        return this.f1702i;
    }

    public int getFillColor() {
        return this.f1700g.f15c;
    }

    public float getStrokeAlpha() {
        return this.f1701h;
    }

    public int getStrokeColor() {
        return this.f1698e.f15c;
    }

    public float getStrokeWidth() {
        return this.f1699f;
    }

    public float getTrimPathEnd() {
        return this.f1704k;
    }

    public float getTrimPathOffset() {
        return this.f1705l;
    }

    public float getTrimPathStart() {
        return this.f1703j;
    }

    public void setFillAlpha(float f5) {
        this.f1702i = f5;
    }

    public void setFillColor(int i4) {
        this.f1700g.f15c = i4;
    }

    public void setStrokeAlpha(float f5) {
        this.f1701h = f5;
    }

    public void setStrokeColor(int i4) {
        this.f1698e.f15c = i4;
    }

    public void setStrokeWidth(float f5) {
        this.f1699f = f5;
    }

    public void setTrimPathEnd(float f5) {
        this.f1704k = f5;
    }

    public void setTrimPathOffset(float f5) {
        this.f1705l = f5;
    }

    public void setTrimPathStart(float f5) {
        this.f1703j = f5;
    }
}
