package d1;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f1709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f1717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f1718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f1720l;

    public i() {
        this.f1709a = new Matrix();
        this.f1710b = new ArrayList();
        this.f1711c = 0.0f;
        this.f1712d = 0.0f;
        this.f1713e = 0.0f;
        this.f1714f = 1.0f;
        this.f1715g = 1.0f;
        this.f1716h = 0.0f;
        this.f1717i = 0.0f;
        this.f1718j = new Matrix();
        this.f1720l = null;
    }

    @Override // d1.j
    public final boolean a() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f1710b;
            if (i4 >= arrayList.size()) {
                return false;
            }
            if (((j) arrayList.get(i4)).a()) {
                return true;
            }
            i4++;
        }
    }

    @Override // d1.j
    public final boolean b(int[] iArr) {
        int i4 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f1710b;
            if (i4 >= arrayList.size()) {
                return zB;
            }
            zB |= ((j) arrayList.get(i4)).b(iArr);
            i4++;
        }
    }

    public final void c() {
        Matrix matrix = this.f1718j;
        matrix.reset();
        matrix.postTranslate(-this.f1712d, -this.f1713e);
        matrix.postScale(this.f1714f, this.f1715g);
        matrix.postRotate(this.f1711c, 0.0f, 0.0f);
        matrix.postTranslate(this.f1716h + this.f1712d, this.f1717i + this.f1713e);
    }

    public String getGroupName() {
        return this.f1720l;
    }

    public Matrix getLocalMatrix() {
        return this.f1718j;
    }

    public float getPivotX() {
        return this.f1712d;
    }

    public float getPivotY() {
        return this.f1713e;
    }

    public float getRotation() {
        return this.f1711c;
    }

    public float getScaleX() {
        return this.f1714f;
    }

    public float getScaleY() {
        return this.f1715g;
    }

    public float getTranslateX() {
        return this.f1716h;
    }

    public float getTranslateY() {
        return this.f1717i;
    }

    public void setPivotX(float f5) {
        if (f5 != this.f1712d) {
            this.f1712d = f5;
            c();
        }
    }

    public void setPivotY(float f5) {
        if (f5 != this.f1713e) {
            this.f1713e = f5;
            c();
        }
    }

    public void setRotation(float f5) {
        if (f5 != this.f1711c) {
            this.f1711c = f5;
            c();
        }
    }

    public void setScaleX(float f5) {
        if (f5 != this.f1714f) {
            this.f1714f = f5;
            c();
        }
    }

    public void setScaleY(float f5) {
        if (f5 != this.f1715g) {
            this.f1715g = f5;
            c();
        }
    }

    public void setTranslateX(float f5) {
        if (f5 != this.f1716h) {
            this.f1716h = f5;
            c();
        }
    }

    public void setTranslateY(float f5) {
        if (f5 != this.f1717i) {
            this.f1717i = f5;
            c();
        }
    }

    public i(i iVar, n.b bVar) {
        k gVar;
        this.f1709a = new Matrix();
        this.f1710b = new ArrayList();
        this.f1711c = 0.0f;
        this.f1712d = 0.0f;
        this.f1713e = 0.0f;
        this.f1714f = 1.0f;
        this.f1715g = 1.0f;
        this.f1716h = 0.0f;
        this.f1717i = 0.0f;
        Matrix matrix = new Matrix();
        this.f1718j = matrix;
        this.f1720l = null;
        this.f1711c = iVar.f1711c;
        this.f1712d = iVar.f1712d;
        this.f1713e = iVar.f1713e;
        this.f1714f = iVar.f1714f;
        this.f1715g = iVar.f1715g;
        this.f1716h = iVar.f1716h;
        this.f1717i = iVar.f1717i;
        String str = iVar.f1720l;
        this.f1720l = str;
        this.f1719k = iVar.f1719k;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(iVar.f1718j);
        ArrayList arrayList = iVar.f1710b;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Object obj = arrayList.get(i4);
            if (obj instanceof i) {
                this.f1710b.add(new i((i) obj, bVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    h hVar2 = new h(hVar);
                    hVar2.f1699f = 0.0f;
                    hVar2.f1701h = 1.0f;
                    hVar2.f1702i = 1.0f;
                    hVar2.f1703j = 0.0f;
                    hVar2.f1704k = 1.0f;
                    hVar2.f1705l = 0.0f;
                    hVar2.f1706m = Paint.Cap.BUTT;
                    hVar2.f1707n = Paint.Join.MITER;
                    hVar2.f1708o = 4.0f;
                    hVar2.f1698e = hVar.f1698e;
                    hVar2.f1699f = hVar.f1699f;
                    hVar2.f1701h = hVar.f1701h;
                    hVar2.f1700g = hVar.f1700g;
                    hVar2.f1723c = hVar.f1723c;
                    hVar2.f1702i = hVar.f1702i;
                    hVar2.f1703j = hVar.f1703j;
                    hVar2.f1704k = hVar.f1704k;
                    hVar2.f1705l = hVar.f1705l;
                    hVar2.f1706m = hVar.f1706m;
                    hVar2.f1707n = hVar.f1707n;
                    hVar2.f1708o = hVar.f1708o;
                    gVar = hVar2;
                } else if (obj instanceof g) {
                    gVar = new g((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f1710b.add(gVar);
                Object obj2 = gVar.f1722b;
                if (obj2 != null) {
                    bVar.put(obj2, gVar);
                }
            }
        }
    }
}
