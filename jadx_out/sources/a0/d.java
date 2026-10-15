package a0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import i.a0;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Shader f13a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f14b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15c;

    public d(Shader shader, ColorStateList colorStateList, int i4) {
        this.f13a = shader;
        this.f14b = colorStateList;
        this.f15c = i4;
    }

    public static d a(Resources resources, int i4, Resources.Theme theme) {
        int next;
        float f5;
        float f6;
        float f7;
        int i5;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i4);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new d(null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayD1 = c3.h.D1(resources, theme, attributeSetAsAttributeSet, x.a.f4926d);
        float f8 = !c3.h.h1(xml, "startX") ? 0.0f : typedArrayD1.getFloat(8, 0.0f);
        float f9 = !c3.h.h1(xml, "startY") ? 0.0f : typedArrayD1.getFloat(9, 0.0f);
        float f10 = !c3.h.h1(xml, "endX") ? 0.0f : typedArrayD1.getFloat(10, 0.0f);
        float f11 = !c3.h.h1(xml, "endY") ? 0.0f : typedArrayD1.getFloat(11, 0.0f);
        float f12 = !c3.h.h1(xml, "centerX") ? 0.0f : typedArrayD1.getFloat(3, 0.0f);
        float f13 = !c3.h.h1(xml, "centerY") ? 0.0f : typedArrayD1.getFloat(4, 0.0f);
        int i6 = !c3.h.h1(xml, "type") ? 0 : typedArrayD1.getInt(2, 0);
        int color = !c3.h.h1(xml, "startColor") ? 0 : typedArrayD1.getColor(0, 0);
        boolean zH1 = c3.h.h1(xml, "centerColor");
        int color2 = !c3.h.h1(xml, "centerColor") ? 0 : typedArrayD1.getColor(7, 0);
        int color3 = !c3.h.h1(xml, "endColor") ? 0 : typedArrayD1.getColor(1, 0);
        int i7 = !c3.h.h1(xml, "tileMode") ? 0 : typedArrayD1.getInt(6, 0);
        float f14 = !c3.h.h1(xml, "gradientRadius") ? 0.0f : typedArrayD1.getFloat(5, 0.0f);
        typedArrayD1.recycle();
        int depth = xml.getDepth() + 1;
        float f15 = f14;
        ArrayList arrayList = new ArrayList(20);
        float f16 = f11;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f5 = f10;
            if (next2 == 1) {
                f6 = f9;
                break;
            }
            int depth2 = xml.getDepth();
            f6 = f9;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayD2 = c3.h.D1(resources, theme, attributeSetAsAttributeSet, x.a.f4927e);
                boolean zHasValue = typedArrayD2.hasValue(0);
                boolean zHasValue2 = typedArrayD2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayD2.getColor(0, 0);
                float f17 = typedArrayD2.getFloat(1, 0.0f);
                typedArrayD2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f17));
            }
            f10 = f5;
            f9 = f6;
        }
        a0 a0Var = arrayList2.size() > 0 ? new a0(arrayList2, arrayList) : null;
        if (a0Var == null) {
            a0Var = zH1 ? new a0(color, color2, color3) : new a0(color, color3);
        }
        if (i6 == 1) {
            float f18 = f12;
            i5 = 0;
            if (f15 <= 0.0f) {
                f7 = f13;
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr = (int[]) a0Var.f2519c;
            float[] fArr = (float[]) a0Var.f2520d;
            if (i7 == 1) {
                f7 = f13;
                tileMode = Shader.TileMode.REPEAT;
            } else if (i7 != 2) {
                f7 = f13;
                tileMode = Shader.TileMode.CLAMP;
            } else {
                f7 = f13;
                tileMode = Shader.TileMode.MIRROR;
            }
            radialGradient = new RadialGradient(f18, f7, f15, iArr, fArr, tileMode);
        } else if (i6 != 2) {
            int[] iArr2 = (int[]) a0Var.f2519c;
            float[] fArr2 = (float[]) a0Var.f2520d;
            if (i7 != 1) {
                tileMode2 = i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            i5 = 0;
            radialGradient = new LinearGradient(f8, f6, f5, f16, iArr2, fArr2, tileMode2);
        } else {
            i5 = 0;
            radialGradient = new SweepGradient(f12, f13, (int[]) a0Var.f2519c, (float[]) a0Var.f2520d);
        }
        return new d(radialGradient, null, i5);
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.f13a == null && (colorStateList = this.f14b) != null && colorStateList.isStateful();
    }
}
