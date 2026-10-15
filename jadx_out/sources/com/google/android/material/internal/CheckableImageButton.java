package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import i.c0;
import i0.v0;
import p1.a;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends c0 implements Checkable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f1509h = {R.attr.state_checked};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1512g;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.shungo.app.R.attr.imageButtonStyle);
        this.f1511f = true;
        this.f1512g = true;
        v0.l(this, new a(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1510e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        return this.f1510e ? View.mergeDrawableStates(super.onCreateDrawableState(i4 + 1), f1509h) : super.onCreateDrawableState(i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z1.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z1.a aVar = (z1.a) parcelable;
        super.onRestoreInstanceState(aVar.f3594b);
        setChecked(aVar.f5442d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        z1.a aVar = new z1.a(super.onSaveInstanceState());
        aVar.f5442d = this.f1510e;
        return aVar;
    }

    public void setCheckable(boolean z4) {
        if (this.f1511f != z4) {
            this.f1511f = z4;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (!this.f1511f || this.f1510e == z4) {
            return;
        }
        this.f1510e = z4;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z4) {
        this.f1512g = z4;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        if (this.f1512g) {
            super.setPressed(z4);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1510e);
    }
}
