package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c0.b;
import c3.h;
import com.shungo.app.R;
import h.o;
import i0.e0;
import i0.k0;
import i0.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import k2.a;
import w.g;
import z1.k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f1338a0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer S;
    public boolean T;
    public boolean U;
    public ImageView.ScaleType V;
    public Boolean W;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayE = k.e(context2, attributeSet, n1.a.f3557s, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayE.hasValue(2)) {
            setNavigationIconTint(typedArrayE.getColor(2, -1));
        }
        this.T = typedArrayE.getBoolean(4, false);
        this.U = typedArrayE.getBoolean(3, false);
        int i4 = typedArrayE.getInt(1, -1);
        if (i4 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f1338a0;
            if (i4 < scaleTypeArr.length) {
                this.V = scaleTypeArr[i4];
            }
        }
        if (typedArrayE.hasValue(0)) {
            this.W = Boolean.valueOf(typedArrayE.getBoolean(0, false));
        }
        typedArrayE.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : h.R0(background);
        if (colorStateListValueOf != null) {
            f2.h hVar = new f2.h();
            hVar.k(colorStateListValueOf);
            hVar.i(context2);
            WeakHashMap weakHashMap = v0.f2983a;
            hVar.j(k0.i(this));
            e0.q(this, hVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.V;
    }

    public Integer getNavigationIconTint() {
        return this.S;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void n(int i4) {
        Menu menu = getMenu();
        boolean z4 = menu instanceof o;
        if (z4) {
            ((o) menu).w();
        }
        super.n(i4);
        if (z4) {
            ((o) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof f2.h) {
            h.t2(this, (f2.h) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z4, i4, i5, i6, i7);
        ImageView imageView2 = null;
        if (this.T || this.U) {
            ArrayList arrayListD = k.d(this, getTitle());
            boolean zIsEmpty = arrayListD.isEmpty();
            g gVar = k.f5503c;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListD, gVar);
            ArrayList arrayListD2 = k.d(this, getSubtitle());
            TextView textView2 = arrayListD2.isEmpty() ? null : (TextView) Collections.max(arrayListD2, gVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i8 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i8 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i8 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.T && textView != null) {
                    w(textView, pair);
                }
                if (this.U && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt2 = getChildAt(i10);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.W;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.V;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        Drawable background = getBackground();
        if (background instanceof f2.h) {
            ((f2.h) background).j(f5);
        }
    }

    public void setLogoAdjustViewBounds(boolean z4) {
        Boolean bool = this.W;
        if (bool == null || bool.booleanValue() != z4) {
            this.W = Boolean.valueOf(z4);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.V != scaleType) {
            this.V = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.S != null) {
            drawable = drawable.mutate();
            b.g(drawable, this.S.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i4) {
        this.S = Integer.valueOf(i4);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z4) {
        if (this.U != z4) {
            this.U = z4;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z4) {
        if (this.T != z4) {
            this.T = z4;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i4 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i5 = measuredWidth2 + i4;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i4, 0), Math.max(i5 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i4 += iMax;
            i5 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i5 - i4, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i4, textView.getTop(), i5, textView.getBottom());
    }
}
