package a0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.shungo.app.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f12a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int[] iArr;
        boolean z4;
        int iA;
        float f5;
        float f6;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = x.a.f4923a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i4, i4);
                int resourceId = ObtainAttributes.getResourceId(i4, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f12a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r4);
                    int i6 = typedValue.type;
                    if (i6 < 28 || i6 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i4, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i4, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i4, -65281);
                }
                float f7 = ObtainAttributes.hasValue(r4) ? ObtainAttributes.getFloat(r4, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f8 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i7 = i4;
                for (int i8 = i7; i8 < attributeCount; i8++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i9 = i7 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i7] = attributeNameResource;
                        i7 = i9;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i7);
                float f9 = 0.0f;
                float f10 = 100.0f;
                boolean z5 = f8 >= 0.0f && f8 <= 100.0f;
                if (f7 != 1.0f || z5) {
                    int iF0 = c3.h.f0((int) ((Color.alpha(color) * f7) + 0.5f), 0, 255);
                    if (z5) {
                        a aVarA = a.a(color);
                        r rVar = r.f41k;
                        float f11 = aVarA.f3b;
                        if (f11 >= 1.0d && Math.round(f8) > 0.0d && Math.round(f8) < 100.0d) {
                            float f12 = aVarA.f2a;
                            float fMin = f12 < 0.0f ? 0.0f : Math.min(360.0f, f12);
                            float f13 = 0.0f;
                            float f14 = f11;
                            a aVar = null;
                            boolean z6 = true;
                            while (true) {
                                if (Math.abs(f13 - f11) < 0.4f) {
                                    iArr = iArrTrimStateSet;
                                    depth2 = depth2;
                                    z4 = true;
                                    if (aVar != null) {
                                        iA = aVar.c(rVar);
                                        break;
                                    }
                                    iA = b.a(f8);
                                    break;
                                }
                                float f15 = 1000.0f;
                                float f16 = f9;
                                float f17 = f10;
                                float f18 = 1000.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f16 - f17) <= 0.01f) {
                                        depth2 = depth2;
                                        fMin = fMin;
                                        f10 = f10;
                                        z4 = true;
                                        float f19 = f9;
                                        iArr = iArrTrimStateSet;
                                        f5 = f19;
                                        break;
                                    }
                                    float f20 = ((f17 - f16) / 2.0f) + f16;
                                    int iC = a.b(f20, f14, fMin).c(r.f41k);
                                    float fB = b.b(Color.red(iC));
                                    float fB2 = b.b(Color.green(iC));
                                    float fB3 = b.b(Color.blue(iC));
                                    z4 = true;
                                    float[] fArr = b.f11d[1];
                                    f10 = 100.0f;
                                    float f21 = ((fB3 * fArr[2]) + ((fB2 * fArr[1]) + (fB * fArr[0]))) / 100.0f;
                                    float fCbrt = f21 <= 0.008856452f ? f21 * 903.2963f : (((float) Math.cbrt(f21)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f8 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC);
                                        a aVarB = a.b(aVarA2.f4c, aVarA2.f3b, fMin);
                                        f6 = f20;
                                        float f22 = aVarA2.f5d - aVarB.f5d;
                                        fMin = fMin;
                                        float f23 = aVarA2.f6e - aVarB.f6e;
                                        float f24 = aVarA2.f7f - aVarB.f7f;
                                        double dSqrt = Math.sqrt((f24 * f24) + (f23 * f23) + (f22 * f22));
                                        iArr = iArrTrimStateSet;
                                        float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f18 = fPow;
                                            aVar2 = aVarA2;
                                            f15 = fAbs;
                                        }
                                    } else {
                                        f6 = f20;
                                        fMin = fMin;
                                        iArr = iArrTrimStateSet;
                                    }
                                    f5 = 0.0f;
                                    if (f15 == 0.0f && f18 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f8) {
                                        f16 = f6;
                                    } else {
                                        f17 = f6;
                                    }
                                    f10 = 100.0f;
                                    depth2 = depth2;
                                    fMin = fMin;
                                    int[] iArr5 = iArr;
                                    f9 = 0.0f;
                                    iArrTrimStateSet = iArr5;
                                }
                                a aVar3 = aVar2;
                                if (!z6) {
                                    if (aVar3 == null) {
                                        f11 = f14;
                                    } else {
                                        aVar = aVar3;
                                        f13 = f14;
                                    }
                                    f14 = ((f11 - f13) / 2.0f) + f13;
                                } else {
                                    if (aVar3 != null) {
                                        iA = aVar3.c(rVar);
                                        break;
                                    }
                                    f14 = ((f11 - f13) / 2.0f) + f13;
                                    z6 = false;
                                }
                                int[] iArr6 = iArr;
                                f9 = f5;
                                iArrTrimStateSet = iArr6;
                            }
                        } else {
                            iArr = iArrTrimStateSet;
                            depth2 = depth2;
                            z4 = true;
                            iA = b.a(f8);
                        }
                        color = iA;
                    } else {
                        iArr = iArrTrimStateSet;
                        depth2 = depth2;
                        z4 = true;
                    }
                    color = (16777215 & color) | (iF0 << 24);
                } else {
                    iArr = iArrTrimStateSet;
                    depth2 = depth2;
                    z4 = true;
                }
                int i10 = i5 + 1;
                if (i10 > iArr2.length) {
                    int[] iArr7 = new int[i5 <= 4 ? 8 : i5 * 2];
                    System.arraycopy(iArr2, 0, iArr7, 0, i5);
                    iArr2 = iArr7;
                }
                iArr2[i5] = color;
                if (i10 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5 > 4 ? i5 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i5);
                    objArr = objArr2;
                }
                objArr[i5] = iArr;
                objArr = (int[][]) objArr;
                i5 = i10;
                r4 = z4;
                depth2 = depth2;
                i4 = 0;
            } else {
                int i11 = depth2;
                r4 = r4 == true ? 1 : 0;
                depth2 = i11;
                i4 = 0;
            }
        }
        int[] iArr8 = new int[i5];
        int[][] iArr9 = new int[i5][];
        System.arraycopy(iArr2, 0, iArr8, 0, i5);
        System.arraycopy(objArr, 0, iArr9, 0, i5);
        return new ColorStateList(iArr9, iArr8);
    }
}
