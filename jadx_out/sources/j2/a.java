package j2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import c3.h;
import com.shungo.app.R;
import i.h1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h1 {
    public static int m(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i4 = 0; i4 < iArr.length && dimensionPixelSize < 0; i4++) {
            int i5 = iArr[i4];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i5, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i5, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // i.h1, android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        if (h.j2(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i4, n1.a.f3555q);
            int iM = m(getContext(), typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM >= 0) {
                setLineHeight(iM);
            }
        }
    }
}
