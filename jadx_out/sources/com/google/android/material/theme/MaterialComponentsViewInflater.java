package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b2.a;
import c3.h;
import com.google.android.material.button.MaterialButton;
import com.shungo.app.R;
import e.h0;
import i.h1;
import i.i0;
import i.q;
import i.s;
import i2.t;
import m0.b;
import u1.c;
import z1.k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends h0 {
    @Override // e.h0
    public final q a(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    @Override // e.h0
    public final s b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // e.h0
    public final i.t c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // e.h0
    public final i0 d(Context context, AttributeSet attributeSet) {
        a aVar = new a(k2.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray typedArrayE = k.e(context2, attributeSet, n1.a.f3553o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayE.hasValue(0)) {
            b.c(aVar, h.P0(context2, typedArrayE, 0));
        }
        aVar.f1104g = typedArrayE.getBoolean(1, false);
        typedArrayE.recycle();
        return aVar;
    }

    @Override // e.h0
    public final h1 e(Context context, AttributeSet attributeSet) {
        j2.a aVar = new j2.a(k2.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (h.j2(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = n1.a.f3556r;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iM = j2.a.m(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, n1.a.f3555q);
                    int iM2 = j2.a.m(aVar.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM2 >= 0) {
                        aVar.setLineHeight(iM2);
                    }
                }
            }
        }
        return aVar;
    }
}
