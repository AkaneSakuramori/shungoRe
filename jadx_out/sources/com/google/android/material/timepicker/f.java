package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.shungo.app.R;
import i0.e0;
import i0.f0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends ConstraintLayout {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f1622t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1623u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f2.h f1624v;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.e] */
    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        f2.h hVar = new f2.h();
        this.f1624v = hVar;
        f2.i iVar = new f2.i(0.5f);
        f2.k kVarE = hVar.f2057b.f2035a.e();
        kVarE.f2084e = iVar;
        kVarE.f2085f = iVar;
        kVarE.f2086g = iVar;
        kVarE.f2087h = iVar;
        hVar.setShapeAppearanceModel(kVarE.a());
        this.f1624v.k(ColorStateList.valueOf(-1));
        f2.h hVar2 = this.f1624v;
        WeakHashMap weakHashMap = v0.f2983a;
        e0.q(this, hVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1.a.f3558t, R.attr.materialClockStyle, 0);
        this.f1623u = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1622t = new Runnable() { // from class: com.google.android.material.timepicker.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f1621b.n();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = v0.f2983a;
            view.setId(f0.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f1622t;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    public abstract void n();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f1622t;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i4) {
        this.f1624v.k(ColorStateList.valueOf(i4));
    }
}
