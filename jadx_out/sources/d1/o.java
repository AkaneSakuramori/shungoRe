package d1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class o extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1754k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f1755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuffColorFilter f1756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorFilter f1757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f1760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f1761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f1762j;

    public o() {
        this.f1759g = true;
        this.f1760h = new float[9];
        this.f1761i = new Matrix();
        this.f1762j = new Rect();
        m mVar = new m();
        mVar.f1743c = null;
        mVar.f1744d = f1754k;
        mVar.f1742b = new l();
        this.f1755c = mVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1697b;
        if (drawable == null) {
            return false;
        }
        c0.b.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f1762j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1757e;
        if (colorFilter == null) {
            colorFilter = this.f1756d;
        }
        Matrix matrix = this.f1761i;
        canvas.getMatrix(matrix);
        float[] fArr = this.f1760h;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && c0.c.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        m mVar = this.f1755c;
        Bitmap bitmap = mVar.f1746f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != mVar.f1746f.getHeight()) {
            mVar.f1746f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            mVar.f1751k = true;
        }
        if (this.f1759g) {
            m mVar2 = this.f1755c;
            if (mVar2.f1751k || mVar2.f1747g != mVar2.f1743c || mVar2.f1748h != mVar2.f1744d || mVar2.f1750j != mVar2.f1745e || mVar2.f1749i != mVar2.f1742b.getRootAlpha()) {
                m mVar3 = this.f1755c;
                mVar3.f1746f.eraseColor(0);
                Canvas canvas2 = new Canvas(mVar3.f1746f);
                l lVar = mVar3.f1742b;
                lVar.a(lVar.f1732g, l.f1725p, canvas2, iMin, iMin2);
                m mVar4 = this.f1755c;
                mVar4.f1747g = mVar4.f1743c;
                mVar4.f1748h = mVar4.f1744d;
                mVar4.f1749i = mVar4.f1742b.getRootAlpha();
                mVar4.f1750j = mVar4.f1745e;
                mVar4.f1751k = false;
            }
        } else {
            m mVar5 = this.f1755c;
            mVar5.f1746f.eraseColor(0);
            Canvas canvas3 = new Canvas(mVar5.f1746f);
            l lVar2 = mVar5.f1742b;
            lVar2.a(lVar2.f1732g, l.f1725p, canvas3, iMin, iMin2);
        }
        m mVar6 = this.f1755c;
        if (mVar6.f1742b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (mVar6.f1752l == null) {
                Paint paint2 = new Paint();
                mVar6.f1752l = paint2;
                paint2.setFilterBitmap(true);
            }
            mVar6.f1752l.setAlpha(mVar6.f1742b.getRootAlpha());
            mVar6.f1752l.setColorFilter(colorFilter);
            paint = mVar6.f1752l;
        }
        canvas.drawBitmap(mVar6.f1746f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1697b;
        return drawable != null ? c0.a.a(drawable) : this.f1755c.f1742b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1697b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1755c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1697b;
        return drawable != null ? c0.b.c(drawable) : this.f1757e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1697b != null) {
            return new n(this.f1697b.getConstantState());
        }
        this.f1755c.f1741a = getChangingConfigurations();
        return this.f1755c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1697b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1755c.f1742b.f1734i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1697b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1755c.f1742b.f1733h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        l lVar;
        int i4;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            c0.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.f1755c;
        mVar.f1742b = new l();
        TypedArray typedArrayD1 = c3.h.D1(resources, theme, attributeSet, a.f1680a);
        m mVar2 = this.f1755c;
        l lVar2 = mVar2.f1742b;
        int i7 = !c3.h.h1(xmlPullParser, "tintMode") ? -1 : typedArrayD1.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i8 = 3;
        if (i7 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i7 != 5) {
            if (i7 != 9) {
                switch (i7) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        mVar2.f1744d = mode;
        int i9 = 1;
        ColorStateList colorStateListA = null;
        boolean z6 = false;
        if (c3.h.h1(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayD1.getValue(1, typedValue);
            int i10 = typedValue.type;
            if (i10 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i10 < 28 || i10 > 31) {
                Resources resources2 = typedArrayD1.getResources();
                int resourceId = typedArrayD1.getResourceId(1, 0);
                ThreadLocal threadLocal = a0.c.f12a;
                try {
                    colorStateListA = a0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e5) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e5);
                }
            } else {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            mVar2.f1743c = colorStateList;
        }
        boolean z7 = mVar2.f1745e;
        if (c3.h.h1(xmlPullParser, "autoMirrored")) {
            z7 = typedArrayD1.getBoolean(5, z7);
        }
        mVar2.f1745e = z7;
        float f5 = lVar2.f1735j;
        if (c3.h.h1(xmlPullParser, "viewportWidth")) {
            f5 = typedArrayD1.getFloat(7, f5);
        }
        lVar2.f1735j = f5;
        float f6 = lVar2.f1736k;
        if (c3.h.h1(xmlPullParser, "viewportHeight")) {
            f6 = typedArrayD1.getFloat(8, f6);
        }
        lVar2.f1736k = f6;
        if (lVar2.f1735j <= 0.0f) {
            throw new XmlPullParserException(typedArrayD1.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f6 <= 0.0f) {
            throw new XmlPullParserException(typedArrayD1.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        lVar2.f1733h = typedArrayD1.getDimension(3, lVar2.f1733h);
        float dimension = typedArrayD1.getDimension(2, lVar2.f1734i);
        lVar2.f1734i = dimension;
        if (lVar2.f1733h <= 0.0f) {
            throw new XmlPullParserException(typedArrayD1.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayD1.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = lVar2.getAlpha();
        if (c3.h.h1(xmlPullParser, "alpha")) {
            alpha = typedArrayD1.getFloat(4, alpha);
        }
        lVar2.setAlpha(alpha);
        String string = typedArrayD1.getString(0);
        if (string != null) {
            lVar2.f1738m = string;
            lVar2.f1740o.put(string, lVar2);
        }
        typedArrayD1.recycle();
        mVar.f1741a = getChangingConfigurations();
        mVar.f1751k = true;
        m mVar3 = this.f1755c;
        l lVar3 = mVar3.f1742b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(lVar3.f1732g);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z8 = true;
        while (eventType != i9 && (xmlPullParser.getDepth() >= depth || eventType != i8)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                i iVar = (i) arrayDeque.peek();
                boolean zEquals = "path".equals(name);
                i4 = depth;
                n.b bVar = lVar3.f1740o;
                if (zEquals) {
                    h hVar = new h();
                    hVar.f1699f = 0.0f;
                    hVar.f1701h = 1.0f;
                    hVar.f1702i = 1.0f;
                    hVar.f1703j = 0.0f;
                    hVar.f1704k = 1.0f;
                    hVar.f1705l = 0.0f;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    hVar.f1706m = cap2;
                    Paint.Join join3 = Paint.Join.MITER;
                    hVar.f1707n = join3;
                    lVar = lVar3;
                    hVar.f1708o = 4.0f;
                    TypedArray typedArrayD2 = c3.h.D1(resources, theme, attributeSet, a.f1682c);
                    if (c3.h.h1(xmlPullParser, "pathData")) {
                        String string2 = typedArrayD2.getString(0);
                        if (string2 != null) {
                            hVar.f1722b = string2;
                        }
                        String string3 = typedArrayD2.getString(2);
                        if (string3 != null) {
                            hVar.f1721a = c3.h.C0(string3);
                        }
                        hVar.f1700g = c3.h.Y0(typedArrayD2, xmlPullParser, theme, "fillColor", 1);
                        float f7 = hVar.f1702i;
                        if (c3.h.h1(xmlPullParser, "fillAlpha")) {
                            f7 = typedArrayD2.getFloat(12, f7);
                        }
                        hVar.f1702i = f7;
                        int i11 = !c3.h.h1(xmlPullParser, "strokeLineCap") ? -1 : typedArrayD2.getInt(8, -1);
                        Paint.Cap cap3 = hVar.f1706m;
                        if (i11 != 0) {
                            join = join3;
                            if (i11 != 1) {
                                cap = i11 != 2 ? cap3 : Paint.Cap.SQUARE;
                            } else {
                                cap = Paint.Cap.ROUND;
                            }
                        } else {
                            join = join3;
                            cap = cap2;
                        }
                        hVar.f1706m = cap;
                        int i12 = !c3.h.h1(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayD2.getInt(9, -1);
                        Paint.Join join4 = hVar.f1707n;
                        if (i12 == 0) {
                            join2 = join;
                        } else if (i12 != 1) {
                            join2 = i12 != 2 ? join4 : Paint.Join.BEVEL;
                        } else {
                            join2 = Paint.Join.ROUND;
                        }
                        hVar.f1707n = join2;
                        float f8 = hVar.f1708o;
                        if (c3.h.h1(xmlPullParser, "strokeMiterLimit")) {
                            f8 = typedArrayD2.getFloat(10, f8);
                        }
                        hVar.f1708o = f8;
                        hVar.f1698e = c3.h.Y0(typedArrayD2, xmlPullParser, theme, "strokeColor", 3);
                        float f9 = hVar.f1701h;
                        if (c3.h.h1(xmlPullParser, "strokeAlpha")) {
                            f9 = typedArrayD2.getFloat(11, f9);
                        }
                        hVar.f1701h = f9;
                        float f10 = hVar.f1699f;
                        if (c3.h.h1(xmlPullParser, "strokeWidth")) {
                            f10 = typedArrayD2.getFloat(4, f10);
                        }
                        hVar.f1699f = f10;
                        float f11 = hVar.f1704k;
                        if (c3.h.h1(xmlPullParser, "trimPathEnd")) {
                            f11 = typedArrayD2.getFloat(6, f11);
                        }
                        hVar.f1704k = f11;
                        float f12 = hVar.f1705l;
                        if (c3.h.h1(xmlPullParser, "trimPathOffset")) {
                            f12 = typedArrayD2.getFloat(7, f12);
                        }
                        hVar.f1705l = f12;
                        float f13 = hVar.f1703j;
                        if (c3.h.h1(xmlPullParser, "trimPathStart")) {
                            f13 = typedArrayD2.getFloat(5, f13);
                        }
                        hVar.f1703j = f13;
                        int i13 = hVar.f1723c;
                        if (c3.h.h1(xmlPullParser, "fillType")) {
                            i13 = typedArrayD2.getInt(13, i13);
                        }
                        hVar.f1723c = i13;
                    }
                    typedArrayD2.recycle();
                    iVar.f1710b.add(hVar);
                    if (hVar.getPathName() != null) {
                        bVar.put(hVar.getPathName(), hVar);
                    }
                    mVar3.f1741a |= hVar.f1724d;
                    z5 = false;
                    i5 = 1;
                    z8 = false;
                } else {
                    lVar = lVar3;
                    if ("clip-path".equals(name)) {
                        g gVar = new g();
                        if (c3.h.h1(xmlPullParser, "pathData")) {
                            TypedArray typedArrayD3 = c3.h.D1(resources, theme, attributeSet, a.f1683d);
                            String string4 = typedArrayD3.getString(0);
                            if (string4 != null) {
                                gVar.f1722b = string4;
                            }
                            String string5 = typedArrayD3.getString(1);
                            if (string5 != null) {
                                gVar.f1721a = c3.h.C0(string5);
                            }
                            gVar.f1723c = !c3.h.h1(xmlPullParser, "fillType") ? 0 : typedArrayD3.getInt(2, 0);
                            typedArrayD3.recycle();
                        }
                        iVar.f1710b.add(gVar);
                        if (gVar.getPathName() != null) {
                            bVar.put(gVar.getPathName(), gVar);
                        }
                        mVar3.f1741a = gVar.f1724d | mVar3.f1741a;
                    } else if ("group".equals(name)) {
                        i iVar2 = new i();
                        TypedArray typedArrayD4 = c3.h.D1(resources, theme, attributeSet, a.f1681b);
                        float f14 = iVar2.f1711c;
                        if (c3.h.h1(xmlPullParser, "rotation")) {
                            f14 = typedArrayD4.getFloat(5, f14);
                        }
                        iVar2.f1711c = f14;
                        i5 = 1;
                        iVar2.f1712d = typedArrayD4.getFloat(1, iVar2.f1712d);
                        iVar2.f1713e = typedArrayD4.getFloat(2, iVar2.f1713e);
                        float f15 = iVar2.f1714f;
                        if (c3.h.h1(xmlPullParser, "scaleX")) {
                            f15 = typedArrayD4.getFloat(3, f15);
                        }
                        iVar2.f1714f = f15;
                        float f16 = iVar2.f1715g;
                        if (c3.h.h1(xmlPullParser, "scaleY")) {
                            f16 = typedArrayD4.getFloat(4, f16);
                        }
                        iVar2.f1715g = f16;
                        float f17 = iVar2.f1716h;
                        if (c3.h.h1(xmlPullParser, "translateX")) {
                            f17 = typedArrayD4.getFloat(6, f17);
                        }
                        iVar2.f1716h = f17;
                        float f18 = iVar2.f1717i;
                        if (c3.h.h1(xmlPullParser, "translateY")) {
                            f18 = typedArrayD4.getFloat(7, f18);
                        }
                        iVar2.f1717i = f18;
                        z5 = false;
                        String string6 = typedArrayD4.getString(0);
                        if (string6 != null) {
                            iVar2.f1720l = string6;
                        }
                        iVar2.c();
                        typedArrayD4.recycle();
                        iVar.f1710b.add(iVar2);
                        arrayDeque.push(iVar2);
                        if (iVar2.getGroupName() != null) {
                            bVar.put(iVar2.getGroupName(), iVar2);
                        }
                        mVar3.f1741a = iVar2.f1719k | mVar3.f1741a;
                    }
                    z5 = false;
                    i5 = 1;
                }
                z4 = z5;
                i6 = 3;
            } else {
                lVar = lVar3;
                i4 = depth;
                i5 = i9;
                z4 = z6;
                i6 = 3;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i8 = i6;
            z6 = z4;
            i9 = i5;
            depth = i4;
            lVar3 = lVar;
        }
        if (z8) {
            throw new XmlPullParserException("no path defined");
        }
        this.f1756d = a(mVar.f1743c, mVar.f1744d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1697b;
        return drawable != null ? c0.a.d(drawable) : this.f1755c.f1745e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            m mVar = this.f1755c;
            if (mVar != null) {
                l lVar = mVar.f1742b;
                if (lVar.f1739n == null) {
                    lVar.f1739n = Boolean.valueOf(lVar.f1732g.a());
                }
                if (lVar.f1739n.booleanValue() || ((colorStateList = this.f1755c.f1743c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1758f && super.mutate() == this) {
            m mVar = this.f1755c;
            m mVar2 = new m();
            mVar2.f1743c = null;
            mVar2.f1744d = f1754k;
            if (mVar != null) {
                mVar2.f1741a = mVar.f1741a;
                l lVar = new l(mVar.f1742b);
                mVar2.f1742b = lVar;
                if (mVar.f1742b.f1730e != null) {
                    lVar.f1730e = new Paint(mVar.f1742b.f1730e);
                }
                if (mVar.f1742b.f1729d != null) {
                    mVar2.f1742b.f1729d = new Paint(mVar.f1742b.f1729d);
                }
                mVar2.f1743c = mVar.f1743c;
                mVar2.f1744d = mVar.f1744d;
                mVar2.f1745e = mVar.f1745e;
            }
            this.f1755c = mVar2;
            this.f1758f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z4;
        PorterDuff.Mode mode;
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.f1755c;
        ColorStateList colorStateList = mVar.f1743c;
        if (colorStateList == null || (mode = mVar.f1744d) == null) {
            z4 = false;
        } else {
            this.f1756d = a(colorStateList, mode);
            invalidateSelf();
            z4 = true;
        }
        l lVar = mVar.f1742b;
        if (lVar.f1739n == null) {
            lVar.f1739n = Boolean.valueOf(lVar.f1732g.a());
        }
        if (lVar.f1739n.booleanValue()) {
            boolean zB = mVar.f1742b.f1732g.b(iArr);
            mVar.f1751k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else if (this.f1755c.f1742b.getRootAlpha() != i4) {
            this.f1755c.f1742b.setRootAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            c0.a.e(drawable, z4);
        } else {
            this.f1755c.f1745e = z4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1757e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            c3.h.v2(drawable, i4);
        } else {
            setTintList(ColorStateList.valueOf(i4));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            c0.b.h(drawable, colorStateList);
            return;
        }
        m mVar = this.f1755c;
        if (mVar.f1743c != colorStateList) {
            mVar.f1743c = colorStateList;
            this.f1756d = a(colorStateList, mVar.f1744d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            c0.b.i(drawable, mode);
            return;
        }
        m mVar = this.f1755c;
        if (mVar.f1744d != mode) {
            mVar.f1744d = mode;
            this.f1756d = a(mVar.f1743c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        Drawable drawable = this.f1697b;
        return drawable != null ? drawable.setVisible(z4, z5) : super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public o(m mVar) {
        this.f1759g = true;
        this.f1760h = new float[9];
        this.f1761i = new Matrix();
        this.f1762j = new Rect();
        this.f1755c = mVar;
        this.f1756d = a(mVar.f1743c, mVar.f1744d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
