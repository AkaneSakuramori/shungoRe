package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.h;
import com.shungo.app.R;
import e.n0;
import f2.l;
import i0.e0;
import i0.f0;
import i0.m;
import i0.v0;
import j0.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k2.a;
import p.f;
import s1.d;
import z1.k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f1401l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f1403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f1405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer[] f1406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashSet f1411k;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f1402b = new ArrayList();
        this.f1403c = new n0(this);
        this.f1404d = new LinkedHashSet();
        this.f1405e = new f(1, this);
        this.f1407g = false;
        this.f1411k = new HashSet();
        TypedArray typedArrayE = k.e(getContext(), attributeSet, n1.a.f3549k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayE.getBoolean(3, false));
        this.f1410j = typedArrayE.getResourceId(1, -1);
        this.f1409i = typedArrayE.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
        WeakHashMap weakHashMap = v0.f2983a;
        e0.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (c(i4)) {
                return i4;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if ((getChildAt(i5) instanceof MaterialButton) && c(i5)) {
                i4++;
            }
        }
        return i4;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = v0.f2983a;
            materialButton.setId(f0.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f1403c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i4 = firstVisibleChildIndex + 1; i4 < getChildCount(); i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i4 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                m.g(layoutParams2, 0);
                m.h(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                m.h(layoutParams2, 0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            m.g(layoutParams3, 0);
            m.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i4, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        l shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f1402b.add(new d(shapeAppearanceModel.f2096e, shapeAppearanceModel.f2099h, shapeAppearanceModel.f2097f, shapeAppearanceModel.f2098g));
        materialButton.setEnabled(isEnabled());
        v0.l(materialButton, new p1.a(1, this));
    }

    public final void b(int i4, boolean z4) {
        if (i4 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i4);
            return;
        }
        HashSet hashSet = new HashSet(this.f1411k);
        if (z4 && !hashSet.contains(Integer.valueOf(i4))) {
            if (this.f1408h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i4));
        } else {
            if (z4 || !hashSet.contains(Integer.valueOf(i4))) {
                return;
            }
            if (!this.f1409i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i4));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i4) {
        return getChildAt(i4).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f1411k;
        this.f1411k = new HashSet(set);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id = ((MaterialButton) getChildAt(i4)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f1407g = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f1407g = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f1404d.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f1405e);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            treeMap.put((MaterialButton) getChildAt(i4), Integer.valueOf(i4));
        }
        this.f1406f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i4 = 0; i4 < childCount; i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            if (materialButton.getVisibility() != 8) {
                f2.k kVarE = materialButton.getShapeAppearanceModel().e();
                d dVar2 = (d) this.f1402b.get(i4);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z4 = getOrientation() == 0;
                    f2.a aVar = d.f4220e;
                    if (i4 == firstVisibleChildIndex) {
                        dVar = z4 ? c3.h.q1(this) ? new d(aVar, aVar, dVar2.f4222b, dVar2.f4223c) : new d(dVar2.f4221a, dVar2.f4224d, aVar, aVar) : new d(dVar2.f4221a, aVar, dVar2.f4222b, aVar);
                    } else if (i4 != lastVisibleChildIndex) {
                        dVar2 = null;
                    } else if (z4) {
                        dVar = c3.h.q1(this) ? new d(dVar2.f4221a, dVar2.f4224d, aVar, aVar) : new d(aVar, aVar, dVar2.f4222b, dVar2.f4223c);
                    } else {
                        dVar = new d(aVar, dVar2.f4224d, aVar, dVar2.f4223c);
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    kVarE.f2084e = new f2.a(0.0f);
                    kVarE.f2085f = new f2.a(0.0f);
                    kVarE.f2086g = new f2.a(0.0f);
                    kVarE.f2087h = new f2.a(0.0f);
                } else {
                    kVarE.f2084e = dVar2.f4221a;
                    kVarE.f2087h = dVar2.f4224d;
                    kVarE.f2085f = dVar2.f4222b;
                    kVarE.f2086g = dVar2.f4223c;
                }
                materialButton.setShapeAppearanceModel(kVarE.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f1408h || this.f1411k.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f1411k.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id = ((MaterialButton) getChildAt(i4)).getId();
            if (this.f1411k.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        Integer[] numArr = this.f1406f;
        if (numArr != null && i5 < numArr.length) {
            return numArr[i5].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i5;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f1410j;
        if (i4 != -1) {
            d(Collections.singleton(Integer.valueOf(i4)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new o(accessibilityNodeInfo).h(new c.a(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f1408h ? 1 : 2)));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        e();
        a();
        super.onMeasure(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f1402b.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            ((MaterialButton) getChildAt(i4)).setEnabled(z4);
        }
    }

    public void setSelectionRequired(boolean z4) {
        this.f1409i = z4;
    }

    public void setSingleSelection(boolean z4) {
        if (this.f1408h != z4) {
            this.f1408h = z4;
            d(new HashSet());
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            ((MaterialButton) getChildAt(i4)).setA11yClassName((this.f1408h ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }
}
