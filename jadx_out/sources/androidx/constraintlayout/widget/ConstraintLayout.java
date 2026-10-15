package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import r.a;
import r.d;
import r.e;
import r.h;
import r.j;
import r.l;
import s.k;
import s.m;
import s.p;
import u.c;
import u.f;
import u.g;
import u.n;
import u.o;
import u.r;
import u.s;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static s f511s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n f521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap f524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s.n f526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f528r;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f512b = new SparseArray();
        this.f513c = new ArrayList(4);
        this.f514d = new e();
        this.f515e = 0;
        this.f516f = 0;
        this.f517g = Integer.MAX_VALUE;
        this.f518h = Integer.MAX_VALUE;
        this.f519i = true;
        this.f520j = 257;
        this.f521k = null;
        this.f522l = null;
        this.f523m = -1;
        this.f524n = new HashMap();
        this.f525o = new SparseArray();
        this.f526p = new s.n(this, this);
        this.f527q = 0;
        this.f528r = 0;
        i(attributeSet, 0);
    }

    public static u.e g() {
        u.e eVar = new u.e(-2, -2);
        eVar.f4513a = -1;
        eVar.f4515b = -1;
        eVar.f4517c = -1.0f;
        eVar.f4519d = true;
        eVar.f4521e = -1;
        eVar.f4523f = -1;
        eVar.f4525g = -1;
        eVar.f4527h = -1;
        eVar.f4529i = -1;
        eVar.f4531j = -1;
        eVar.f4533k = -1;
        eVar.f4535l = -1;
        eVar.f4537m = -1;
        eVar.f4539n = -1;
        eVar.f4541o = -1;
        eVar.f4543p = -1;
        eVar.f4545q = 0;
        eVar.f4546r = 0.0f;
        eVar.f4547s = -1;
        eVar.f4548t = -1;
        eVar.f4549u = -1;
        eVar.f4550v = -1;
        eVar.f4551w = Integer.MIN_VALUE;
        eVar.f4552x = Integer.MIN_VALUE;
        eVar.f4553y = Integer.MIN_VALUE;
        eVar.f4554z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = Integer.MIN_VALUE;
        eVar.D = 0;
        eVar.E = 0.5f;
        eVar.F = 0.5f;
        eVar.G = null;
        eVar.H = -1.0f;
        eVar.I = -1.0f;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 0;
        eVar.R = 1.0f;
        eVar.S = 1.0f;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = -1;
        eVar.W = false;
        eVar.X = false;
        eVar.Y = null;
        eVar.Z = 0;
        eVar.f4514a0 = true;
        eVar.f4516b0 = true;
        eVar.f4518c0 = false;
        eVar.f4520d0 = false;
        eVar.f4522e0 = false;
        eVar.f4524f0 = -1;
        eVar.f4526g0 = -1;
        eVar.f4528h0 = -1;
        eVar.f4530i0 = -1;
        eVar.f4532j0 = Integer.MIN_VALUE;
        eVar.f4534k0 = Integer.MIN_VALUE;
        eVar.f4536l0 = 0.5f;
        eVar.f4544p0 = new d();
        return eVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static s getSharedValues() {
        if (f511s == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f511s = sVar;
        }
        return f511s;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof u.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f513c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((c) arrayList.get(i4)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i6 = Integer.parseInt(strArrSplit[0]);
                        int i7 = Integer.parseInt(strArrSplit[1]);
                        int i8 = Integer.parseInt(strArrSplit[2]);
                        int i9 = (int) ((i6 / 1080.0f) * width);
                        int i10 = (int) ((i7 / 1920.0f) * height);
                        int i11 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f5 = i9;
                        float f6 = i10;
                        float f7 = i9 + ((int) ((i8 / 1080.0f) * width));
                        canvas.drawLine(f5, f6, f7, f6, paint);
                        float f8 = i10 + i11;
                        canvas.drawLine(f7, f6, f7, f8, paint);
                        canvas.drawLine(f7, f8, f5, f8, paint);
                        canvas.drawLine(f5, f8, f5, f6, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f5, f6, f7, f8, paint);
                        canvas.drawLine(f5, f8, f7, f6, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f519i = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        u.e eVar = new u.e(context, attributeSet);
        eVar.f4513a = -1;
        eVar.f4515b = -1;
        eVar.f4517c = -1.0f;
        eVar.f4519d = true;
        eVar.f4521e = -1;
        eVar.f4523f = -1;
        eVar.f4525g = -1;
        eVar.f4527h = -1;
        eVar.f4529i = -1;
        eVar.f4531j = -1;
        eVar.f4533k = -1;
        eVar.f4535l = -1;
        eVar.f4537m = -1;
        eVar.f4539n = -1;
        eVar.f4541o = -1;
        eVar.f4543p = -1;
        eVar.f4545q = 0;
        eVar.f4546r = 0.0f;
        eVar.f4547s = -1;
        eVar.f4548t = -1;
        eVar.f4549u = -1;
        eVar.f4550v = -1;
        eVar.f4551w = Integer.MIN_VALUE;
        eVar.f4552x = Integer.MIN_VALUE;
        eVar.f4553y = Integer.MIN_VALUE;
        eVar.f4554z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = Integer.MIN_VALUE;
        eVar.D = 0;
        eVar.E = 0.5f;
        eVar.F = 0.5f;
        eVar.G = null;
        eVar.H = -1.0f;
        eVar.I = -1.0f;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 0;
        eVar.R = 1.0f;
        eVar.S = 1.0f;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = -1;
        eVar.W = false;
        eVar.X = false;
        eVar.Y = null;
        eVar.Z = 0;
        eVar.f4514a0 = true;
        eVar.f4516b0 = true;
        eVar.f4518c0 = false;
        eVar.f4520d0 = false;
        eVar.f4522e0 = false;
        eVar.f4524f0 = -1;
        eVar.f4526g0 = -1;
        eVar.f4528h0 = -1;
        eVar.f4530i0 = -1;
        eVar.f4532j0 = Integer.MIN_VALUE;
        eVar.f4534k0 = Integer.MIN_VALUE;
        eVar.f4536l0 = 0.5f;
        eVar.f4544p0 = new d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4658b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            int i5 = u.d.f4512a.get(index);
            switch (i5) {
                case 1:
                    eVar.V = typedArrayObtainStyledAttributes.getInt(index, eVar.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4543p);
                    eVar.f4543p = resourceId;
                    if (resourceId == -1) {
                        eVar.f4543p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    eVar.f4545q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4545q);
                    break;
                case 4:
                    float f5 = typedArrayObtainStyledAttributes.getFloat(index, eVar.f4546r) % 360.0f;
                    eVar.f4546r = f5;
                    if (f5 < 0.0f) {
                        eVar.f4546r = (360.0f - f5) % 360.0f;
                    }
                    break;
                case 5:
                    eVar.f4513a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f4513a);
                    break;
                case 6:
                    eVar.f4515b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f4515b);
                    break;
                case 7:
                    eVar.f4517c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f4517c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4521e);
                    eVar.f4521e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f4521e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4523f);
                    eVar.f4523f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f4523f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4525g);
                    eVar.f4525g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f4525g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4527h);
                    eVar.f4527h = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f4527h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4529i);
                    eVar.f4529i = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.f4529i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4531j);
                    eVar.f4531j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f4531j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4533k);
                    eVar.f4533k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f4533k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4535l);
                    eVar.f4535l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f4535l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4537m);
                    eVar.f4537m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f4537m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4547s);
                    eVar.f4547s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f4547s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4548t);
                    eVar.f4548t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f4548t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4549u);
                    eVar.f4549u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f4549u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4550v);
                    eVar.f4550v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f4550v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    eVar.f4551w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4551w);
                    break;
                case 22:
                    eVar.f4552x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4552x);
                    break;
                case 23:
                    eVar.f4553y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4553y);
                    break;
                case 24:
                    eVar.f4554z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4554z);
                    break;
                case 25:
                    eVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.A);
                    break;
                case 26:
                    eVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.B);
                    break;
                case 27:
                    eVar.W = typedArrayObtainStyledAttributes.getBoolean(index, eVar.W);
                    break;
                case 28:
                    eVar.X = typedArrayObtainStyledAttributes.getBoolean(index, eVar.X);
                    break;
                case 29:
                    eVar.E = typedArrayObtainStyledAttributes.getFloat(index, eVar.E);
                    break;
                case 30:
                    eVar.F = typedArrayObtainStyledAttributes.getFloat(index, eVar.F);
                    break;
                case 31:
                    int i6 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.L = i6;
                    if (i6 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i7 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.M = i7;
                    if (i7 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        eVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.N) == -2) {
                            eVar.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        eVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.P) == -2) {
                            eVar.P = -2;
                        }
                    }
                    break;
                case 35:
                    eVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.R));
                    eVar.L = 2;
                    break;
                case 36:
                    try {
                        eVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.O) == -2) {
                            eVar.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        eVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.Q) == -2) {
                            eVar.Q = -2;
                        }
                    }
                    break;
                case 38:
                    eVar.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.S));
                    eVar.M = 2;
                    break;
                default:
                    switch (i5) {
                        case 44:
                            n.h(eVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            eVar.H = typedArrayObtainStyledAttributes.getFloat(index, eVar.H);
                            break;
                        case 46:
                            eVar.I = typedArrayObtainStyledAttributes.getFloat(index, eVar.I);
                            break;
                        case 47:
                            eVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            eVar.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            eVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.T);
                            break;
                        case 50:
                            eVar.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.U);
                            break;
                        case 51:
                            eVar.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4539n);
                            eVar.f4539n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f4539n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4541o);
                            eVar.f4541o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f4541o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            eVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.D);
                            break;
                        case 55:
                            eVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.C);
                            break;
                        default:
                            switch (i5) {
                                case 64:
                                    n.g(eVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(eVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.Z = typedArrayObtainStyledAttributes.getInt(index, eVar.Z);
                                    break;
                                case 67:
                                    eVar.f4519d = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f4519d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getMaxHeight() {
        return this.f518h;
    }

    public int getMaxWidth() {
        return this.f517g;
    }

    public int getMinHeight() {
        return this.f516f;
    }

    public int getMinWidth() {
        return this.f515e;
    }

    public int getOptimizationLevel() {
        return this.f514d.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f514d;
        if (eVar.f3956j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f3956j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f3956j = "parent";
            }
        }
        if (eVar.f3953h0 == null) {
            eVar.f3953h0 = eVar.f3956j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f3953h0);
        }
        for (d dVar : eVar.f4025q0) {
            View view = (View) dVar.f3949f0;
            if (view != null) {
                if (dVar.f3956j == null && (id = view.getId()) != -1) {
                    dVar.f3956j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f3953h0 == null) {
                    dVar.f3953h0 = dVar.f3956j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f3953h0);
                }
            }
        }
        eVar.o(sb);
        return sb.toString();
    }

    public final d h(View view) {
        if (view == this) {
            return this.f514d;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof u.e) {
            return ((u.e) view.getLayoutParams()).f4544p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof u.e) {
            return ((u.e) view.getLayoutParams()).f4544p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i4) {
        e eVar = this.f514d;
        eVar.f3949f0 = this;
        s.n nVar = this.f526p;
        eVar.f3983u0 = nVar;
        eVar.f3981s0.f4151f = nVar;
        this.f512b.put(getId(), this);
        this.f521k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4658b, i4, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == 16) {
                    this.f515e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f515e);
                } else if (index == 17) {
                    this.f516f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f516f);
                } else if (index == 14) {
                    this.f517g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f517g);
                } else if (index == 15) {
                    this.f518h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f518h);
                } else if (index == 113) {
                    this.f520j = typedArrayObtainStyledAttributes.getInt(index, this.f520j);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f522l = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar2 = new n();
                        this.f521k = nVar2;
                        nVar2.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f521k = null;
                    }
                    this.f523m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.D0 = this.f520j;
        p.d.f3674p = eVar.X(512);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void j(int i4) {
        Context context = getContext();
        g gVar = new g();
        gVar.f4560a = new SparseArray();
        gVar.f4561b = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            int eventType = xml.getEventType();
            i iVar = null;
            while (true) {
                byte b5 = 1;
                if (eventType != 1) {
                    if (eventType == 0) {
                        xml.getName();
                    } else if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (!name.equals("ConstraintSet")) {
                                    b5 = -1;
                                } else {
                                    b5 = 4;
                                }
                                break;
                            case 80204913:
                                if (!name.equals("State")) {
                                    b5 = -1;
                                } else {
                                    b5 = 2;
                                }
                                break;
                            case 1382829617:
                                if (!name.equals("StateSet")) {
                                    b5 = -1;
                                }
                                break;
                            case 1657696882:
                                if (!name.equals("layoutDescription")) {
                                    b5 = -1;
                                } else {
                                    b5 = 0;
                                }
                                break;
                            case 1901439077:
                                if (!name.equals("Variant")) {
                                    b5 = -1;
                                } else {
                                    b5 = 3;
                                }
                                break;
                            default:
                                b5 = -1;
                                break;
                        }
                        if (b5 == 2) {
                            iVar = new i(context, xml);
                            gVar.f4560a.put(iVar.f316b, iVar);
                        } else if (b5 == 3) {
                            f fVar = new f(context, xml);
                            if (iVar != null) {
                                ((ArrayList) iVar.f318d).add(fVar);
                            }
                        } else if (b5 == 4) {
                            gVar.a(context, xml);
                        }
                    }
                    eventType = xml.next();
                }
                this.f522l = gVar;
                return;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        } catch (XmlPullParserException e6) {
            e6.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:161:0x0308  */
    /* JADX WARN: Code duplicated, block: B:163:0x030b  */
    /* JADX WARN: Code duplicated, block: B:168:0x032d  */
    /* JADX WARN: Code duplicated, block: B:177:0x034a  */
    /* JADX WARN: Code duplicated, block: B:288:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:408:0x0379 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x04db A[SYNTHETIC] */
    public final void k(e eVar, int i4, int i5, int i6) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i7;
        int i8;
        boolean z4;
        s.n nVar;
        int i9;
        int i10;
        boolean zV;
        int i11;
        e eVar2;
        int i12;
        s.n nVar2;
        s.n nVar3;
        boolean z5;
        k kVar;
        m mVar;
        int i13;
        int i14;
        int i15;
        boolean zV2;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        boolean z6;
        Iterator it;
        boolean z7;
        p pVar;
        e eVar3 = eVar;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i20 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        s.n nVar4 = this.f526p;
        nVar4.f4173a = iMax3;
        nVar4.f4174b = iMax4;
        nVar4.f4175c = paddingWidth;
        nVar4.f4176d = i20;
        nVar4.f4177e = i5;
        nVar4.f4178f = i6;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i21 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i22 = size - paddingWidth;
        int i23 = size2 - i20;
        int i24 = nVar4.f4176d;
        int i25 = nVar4.f4175c;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f515e);
                iMin = iMax;
            } else {
                iMin = i22;
            }
            i21 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f515e);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i21 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.f517g - i25, i22);
            i21 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f516f);
                iMin2 = iMax2;
            } else {
                iMin2 = i23;
            }
            i7 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f518h - i24, i23);
            i7 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f516f);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i7 = 2;
        }
        int iR = eVar.r();
        s.e eVar4 = eVar3.f3981s0;
        int i26 = iMin;
        if (i26 != iR || iMin2 != eVar.l()) {
            eVar4.f4148c = true;
        }
        eVar3.Y = 0;
        eVar3.Z = 0;
        int i27 = this.f517g - i25;
        int[] iArr2 = eVar3.C;
        iArr2[0] = i27;
        iArr2[1] = this.f518h - i24;
        eVar3.f3941b0 = 0;
        eVar3.f3943c0 = 0;
        eVar3.N(i21);
        eVar3.P(i26);
        eVar3.O(i7);
        eVar3.M(iMin2);
        int i28 = this.f515e - i25;
        if (i28 < 0) {
            eVar3.f3941b0 = 0;
        } else {
            eVar3.f3941b0 = i28;
        }
        int i29 = this.f516f - i24;
        if (i29 < 0) {
            eVar3.f3943c0 = 0;
        } else {
            eVar3.f3943c0 = i29;
        }
        eVar3.f3986x0 = iMax5;
        eVar3.f3987y0 = iMax3;
        e.c cVar = eVar3.f3980r0;
        cVar.getClass();
        s.n nVar5 = eVar3.f3983u0;
        int size3 = eVar3.f4025q0.size();
        int iR2 = eVar.r();
        int iL = eVar.l();
        boolean zB = r.k.b(i4, 128);
        boolean z8 = zB || r.k.b(i4, 64);
        if (z8) {
            int i30 = 0;
            while (true) {
                if (i30 < size3) {
                    d dVar = (d) eVar3.f4025q0.get(i30);
                    int[] iArr3 = dVar.f3969p0;
                    boolean z9 = (iArr3[0] == 3) && (iArr3[1] == 3) && dVar.W > 0.0f;
                    if ((dVar.y() && z9) || ((dVar.z() && z9) || (dVar instanceof r.g) || dVar.y() || dVar.z())) {
                        i8 = 1073741824;
                        z8 = false;
                    } else {
                        i30++;
                    }
                } else {
                    i8 = 1073741824;
                }
            }
        } else {
            i8 = 1073741824;
        }
        boolean z10 = ((mode == i8 && mode2 == i8) || zB) & z8;
        if (z10) {
            int iMin3 = Math.min(iArr2[0], i22);
            int iMin4 = Math.min(iArr2[1], i23);
            if (mode == 1073741824 && eVar.r() != iMin3) {
                eVar3.P(iMin3);
                eVar3.f3981s0.f4147b = true;
            }
            if (mode2 == 1073741824 && eVar.l() != iMin4) {
                eVar3.M(iMin4);
                eVar3.f3981s0.f4147b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z11 = zB & true;
                boolean z12 = eVar4.f4147b;
                e eVar5 = eVar4.f4146a;
                if (z12 || eVar4.f4148c) {
                    for (d dVar2 : eVar5.f4025q0) {
                        dVar2.i();
                        dVar2.f3938a = false;
                        dVar2.f3944d.n();
                        dVar2.f3946e.m();
                    }
                    i16 = 0;
                    eVar5.i();
                    eVar5.f3938a = false;
                    eVar5.f3944d.n();
                    eVar5.f3946e.m();
                    eVar4.f4148c = false;
                } else {
                    i16 = 0;
                }
                eVar4.b(eVar4.f4149d);
                eVar5.Y = i16;
                eVar5.Z = i16;
                int iK = eVar5.k(i16);
                int iK2 = eVar5.k(1);
                if (eVar4.f4147b) {
                    eVar4.c();
                }
                int iS = eVar5.s();
                int iT = eVar5.t();
                z4 = z10;
                eVar5.f3944d.f4194h.d(iS);
                eVar5.f3946e.f4194h.d(iT);
                eVar4.g();
                ArrayList<p> arrayList = eVar4.f4150e;
                nVar = nVar5;
                if (iK == 2 || iK2 == 2) {
                    if (z11) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (!((p) it2.next()).k()) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    if (z11 && iK == 2) {
                        eVar5.N(1);
                        eVar5.P(eVar4.d(eVar5, 0));
                        eVar5.f3944d.f4191e.d(eVar5.r());
                    }
                    if (z11 && iK2 == 2) {
                        i17 = 1;
                        eVar5.O(1);
                        eVar5.M(eVar4.d(eVar5, 1));
                        eVar5.f3946e.f4191e.d(eVar5.l());
                    }
                    iArr = eVar5.f3969p0;
                    i9 = iL;
                    i18 = iArr[0];
                    if (i18 != i17 || i18 == 4) {
                        int iR3 = eVar5.r() + iS;
                        eVar5.f3944d.f4195i.d(iR3);
                        eVar5.f3944d.f4191e.d(iR3 - iS);
                        eVar4.g();
                        i19 = iArr[1];
                        if (i19 != 1 || i19 == 4) {
                            int iL2 = eVar5.l() + iT;
                            eVar5.f3946e.f4195i.d(iL2);
                            eVar5.f3946e.f4191e.d(iL2 - iT);
                        }
                        eVar4.g();
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    for (p pVar2 : arrayList) {
                        if (pVar2.f4188b == eVar5 || pVar2.f4193g) {
                            pVar2.e();
                        }
                    }
                    it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z7 = true;
                            break;
                        }
                        pVar = (p) it.next();
                        if (!z6 || pVar.f4188b != eVar5) {
                            if (pVar.f4194h.f4163j || ((!pVar.f4195i.f4163j && !(pVar instanceof s.i)) || (!pVar.f4191e.f4163j && !(pVar instanceof s.c) && !(pVar instanceof s.i)))) {
                                z7 = false;
                                break;
                            }
                        }
                    }
                    eVar5.N(iK);
                    eVar5.O(iK2);
                    zV = z7;
                    i14 = 1073741824;
                    i10 = 2;
                } else {
                    iR2 = iR2;
                }
                i17 = 1;
                iArr = eVar5.f3969p0;
                i9 = iL;
                i18 = iArr[0];
                if (i18 != i17) {
                    int iR4 = eVar5.r() + iS;
                    eVar5.f3944d.f4195i.d(iR4);
                    eVar5.f3944d.f4191e.d(iR4 - iS);
                    eVar4.g();
                    i19 = iArr[1];
                    if (i19 != 1) {
                        int iL3 = eVar5.l() + iT;
                        eVar5.f3946e.f4195i.d(iL3);
                        eVar5.f3946e.f4191e.d(iL3 - iT);
                    } else {
                        int iL4 = eVar5.l() + iT;
                        eVar5.f3946e.f4195i.d(iL4);
                        eVar5.f3946e.f4191e.d(iL4 - iT);
                    }
                    eVar4.g();
                    z6 = true;
                } else {
                    int iR5 = eVar5.r() + iS;
                    eVar5.f3944d.f4195i.d(iR5);
                    eVar5.f3944d.f4191e.d(iR5 - iS);
                    eVar4.g();
                    i19 = iArr[1];
                    if (i19 != 1) {
                        int iL5 = eVar5.l() + iT;
                        eVar5.f3946e.f4195i.d(iL5);
                        eVar5.f3946e.f4191e.d(iL5 - iT);
                    } else {
                        int iL6 = eVar5.l() + iT;
                        eVar5.f3946e.f4195i.d(iL6);
                        eVar5.f3946e.f4191e.d(iL6 - iT);
                    }
                    eVar4.g();
                    z6 = true;
                }
                while (r8.hasNext()) {
                    if (pVar2.f4188b == eVar5) {
                    }
                    pVar2.e();
                }
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z7 = true;
                        break;
                    }
                    pVar = (p) it.next();
                    if (!z6) {
                    }
                    if (pVar.f4194h.f4163j) {
                    }
                    z7 = false;
                    break;
                }
                eVar5.N(iK);
                eVar5.O(iK2);
                zV = z7;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z4 = z10;
                nVar = nVar5;
                iR2 = iR2;
                i9 = iL;
                boolean z13 = eVar4.f4147b;
                e eVar6 = eVar4.f4146a;
                if (z13) {
                    for (d dVar3 : eVar6.f4025q0) {
                        dVar3.i();
                        dVar3.f3938a = false;
                        k kVar2 = dVar3.f3944d;
                        kVar2.f4191e.f4163j = false;
                        kVar2.f4193g = false;
                        kVar2.n();
                        m mVar2 = dVar3.f3946e;
                        mVar2.f4191e.f4163j = false;
                        mVar2.f4193g = false;
                        mVar2.m();
                    }
                    i13 = 0;
                    eVar6.i();
                    eVar6.f3938a = false;
                    k kVar3 = eVar6.f3944d;
                    kVar3.f4191e.f4163j = false;
                    kVar3.f4193g = false;
                    kVar3.n();
                    m mVar3 = eVar6.f3946e;
                    mVar3.f4191e.f4163j = false;
                    mVar3.f4193g = false;
                    mVar3.m();
                    eVar4.c();
                } else {
                    i13 = 0;
                }
                eVar4.b(eVar4.f4149d);
                eVar6.Y = i13;
                eVar6.Z = i13;
                eVar6.f3944d.f4194h.d(i13);
                eVar6.f3946e.f4194h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    i15 = 1;
                    zV2 = eVar3.V(i13, zB) & true;
                    i10 = 1;
                } else {
                    i15 = 1;
                    zV2 = true;
                    i10 = 0;
                }
                if (mode2 == 1073741824) {
                    zV = zV2 & eVar3.V(i15, zB);
                    i10++;
                } else {
                    zV = zV2;
                }
            }
            if (zV) {
                eVar3.Q(mode == i14, mode2 == i14);
            }
        } else {
            z4 = z10;
            nVar = nVar5;
            iR2 = iR2;
            i9 = iL;
            i10 = 0;
            zV = false;
        }
        if (zV && i10 == 2) {
            return;
        }
        int i31 = eVar3.D0;
        if (size3 > 0) {
            int size4 = eVar3.f4025q0.size();
            boolean zX = eVar3.X(64);
            s.n nVar6 = eVar3.f3983u0;
            for (int i32 = 0; i32 < size4; i32++) {
                d dVar4 = (d) eVar3.f4025q0.get(i32);
                if (!(dVar4 instanceof h) && !(dVar4 instanceof a) && !dVar4.F && (!zX || (kVar = dVar4.f3944d) == null || (mVar = dVar4.f3946e) == null || !kVar.f4191e.f4163j || !mVar.f4191e.f4163j)) {
                    int iK3 = dVar4.k(0);
                    int iK4 = dVar4.k(1);
                    boolean z14 = iK3 == 3 && dVar4.f3971r != 1 && iK4 == 3 && dVar4.f3972s != 1;
                    if (!z14 && eVar3.X(1) && !(dVar4 instanceof r.g)) {
                        if (iK3 == 3 && dVar4.f3971r == 0 && iK4 != 3 && !dVar4.y()) {
                            z14 = true;
                        }
                        if (iK4 == 3 && dVar4.f3972s == 0 && iK3 != 3 && !dVar4.y()) {
                            z14 = true;
                        }
                        if (iK3 == 3 || iK4 == 3) {
                            if (dVar4.W > 0.0f) {
                            }
                        }
                        if (z14) {
                            cVar.t(0, dVar4, nVar6);
                        }
                    }
                    if (z14) {
                        cVar.t(0, dVar4, nVar6);
                    }
                }
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) nVar6.f4179g;
            int childCount2 = constraintLayout.getChildCount();
            for (int i33 = 0; i33 < childCount2; i33++) {
                constraintLayout.getChildAt(i33);
            }
            ArrayList arrayList2 = constraintLayout.f513c;
            int size5 = arrayList2.size();
            if (size5 > 0) {
                for (int i34 = 0; i34 < size5; i34++) {
                    ((c) arrayList2.get(i34)).getClass();
                }
            }
        }
        cVar.x(eVar3);
        int size6 = ((ArrayList) cVar.f1779c).size();
        int i35 = iR2;
        int i36 = i9;
        if (size3 > 0) {
            cVar.w(eVar3, 0, i35, i36);
        }
        if (size6 > 0) {
            int[] iArr4 = eVar3.f3969p0;
            boolean z15 = iArr4[0] == 2;
            boolean z16 = iArr4[1] == 2;
            int iMax7 = Math.max(eVar.r(), ((e) cVar.f1781e).f3941b0);
            int iMax8 = Math.max(eVar.l(), ((e) cVar.f1781e).f3943c0);
            int i37 = 0;
            boolean z17 = false;
            while (i37 < size6) {
                d dVar5 = (d) ((ArrayList) cVar.f1779c).get(i37);
                if (dVar5 instanceof r.g) {
                    int iR6 = dVar5.r();
                    int iL7 = dVar5.l();
                    nVar3 = nVar;
                    boolean zT = z17 | cVar.t(1, dVar5, nVar3);
                    int iR7 = dVar5.r();
                    boolean z18 = zT;
                    int iL8 = dVar5.l();
                    if (iR7 != iR6) {
                        dVar5.P(iR7);
                        if (z15 && dVar5.s() + dVar5.U > iMax7) {
                            iMax7 = Math.max(iMax7, dVar5.j(4).e() + dVar5.s() + dVar5.U);
                        }
                        z18 = true;
                    }
                    if (iL8 != iL7) {
                        dVar5.M(iL8);
                        if (z16 && dVar5.t() + dVar5.V > iMax8) {
                            iMax8 = Math.max(iMax8, dVar5.j(5).e() + dVar5.t() + dVar5.V);
                        }
                        z5 = true;
                    } else {
                        z5 = z18;
                    }
                    z17 = ((r.g) dVar5).f4014y0 | z5;
                } else {
                    nVar3 = nVar;
                }
                i37++;
                nVar = nVar3;
                i31 = i31;
            }
            i11 = i31;
            s.n nVar7 = nVar;
            int i38 = 0;
            while (true) {
                if (i38 < 2) {
                    boolean z19 = z17;
                    int i39 = 0;
                    while (i39 < size6) {
                        d dVar6 = (d) ((ArrayList) cVar.f1779c).get(i39);
                        if (((dVar6 instanceof r.i) && !(dVar6 instanceof r.g)) || (dVar6 instanceof h) || dVar6.f3951g0 == 8 || ((z4 && dVar6.f3944d.f4191e.f4163j && dVar6.f3946e.f4191e.f4163j) || (dVar6 instanceof r.g))) {
                            nVar2 = nVar7;
                            i12 = size6;
                        } else {
                            int iR8 = dVar6.r();
                            int iL9 = dVar6.l();
                            i12 = size6;
                            int i40 = dVar6.f3939a0;
                            boolean zT2 = cVar.t(i38 == 1 ? 2 : 1, dVar6, nVar7) | z19;
                            int iR9 = dVar6.r();
                            nVar2 = nVar7;
                            int iL10 = dVar6.l();
                            if (iR9 != iR8) {
                                dVar6.P(iR9);
                                if (z15 && dVar6.s() + dVar6.U > iMax7) {
                                    iMax7 = Math.max(iMax7, dVar6.j(4).e() + dVar6.s() + dVar6.U);
                                }
                                zT2 = true;
                            }
                            if (iL10 != iL9) {
                                dVar6.M(iL10);
                                if (z16 && dVar6.t() + dVar6.V > iMax8) {
                                    iMax8 = Math.max(iMax8, dVar6.j(5).e() + dVar6.t() + dVar6.V);
                                }
                                zT2 = true;
                            }
                            z19 = (!dVar6.E || i40 == dVar6.f3939a0) ? zT2 : true;
                        }
                        i39++;
                        size6 = i12;
                        nVar7 = nVar2;
                    }
                    s.n nVar8 = nVar7;
                    int i41 = size6;
                    if (!z19) {
                        eVar2 = eVar;
                        break;
                    }
                    i38++;
                    cVar.w(eVar, i38, i35, i36);
                    eVar3 = eVar;
                    size6 = i41;
                    nVar7 = nVar8;
                    z17 = false;
                }
            }
            eVar2.D0 = i11;
            p.d.f3674p = eVar2.X(512);
        }
        i11 = i31;
        eVar2 = eVar3;
        eVar2.D0 = i11;
        p.d.f3674p = eVar2.X(512);
    }

    public final void l(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f524n == null) {
                this.f524n = new HashMap();
            }
            int iIndexOf = str.indexOf("/");
            if (iIndexOf != -1) {
                str = str.substring(iIndexOf + 1);
            }
            this.f524n.put(str, Integer.valueOf(num.intValue()));
        }
    }

    public final void m(d dVar, u.e eVar, SparseArray sparseArray, int i4, int i5) {
        View view = (View) this.f512b.get(i4);
        d dVar2 = (d) sparseArray.get(i4);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof u.e)) {
            return;
        }
        eVar.f4518c0 = true;
        if (i5 == 6) {
            u.e eVar2 = (u.e) view.getLayoutParams();
            eVar2.f4518c0 = true;
            eVar2.f4544p0.E = true;
        }
        dVar.j(6).b(dVar2.j(i5), eVar.D, eVar.C, true);
        dVar.E = true;
        dVar.j(3).j();
        dVar.j(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            u.e eVar = (u.e) childAt.getLayoutParams();
            d dVar = eVar.f4544p0;
            if (childAt.getVisibility() != 8 || eVar.f4520d0 || eVar.f4522e0 || zIsInEditMode) {
                int iS = dVar.s();
                int iT = dVar.t();
                childAt.layout(iS, iT, dVar.r() + iS, dVar.l() + iT);
            }
        }
        ArrayList arrayList = this.f513c;
        int size = arrayList.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((c) arrayList.get(i9)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:159:0x0319  */
    /* JADX WARN: Code duplicated, block: B:161:0x0323  */
    /* JADX WARN: Code duplicated, block: B:162:0x0336  */
    /* JADX WARN: Code duplicated, block: B:169:0x035d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0367  */
    /* JADX WARN: Code duplicated, block: B:172:0x037b  */
    /* JADX WARN: Code duplicated, block: B:179:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:181:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:189:0x03da  */
    /* JADX WARN: Code duplicated, block: B:190:0x03df  */
    /* JADX WARN: Code duplicated, block: B:193:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:267:0x050c  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a0  */
    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        boolean z4;
        int i6;
        int i7;
        d dVar;
        int i8;
        int i9;
        d dVar2;
        int i10;
        int i11;
        d dVar3;
        int i12;
        u.e eVar;
        d dVar4;
        int i13;
        int i14;
        int i15;
        d dVar5;
        float f5;
        d dVar6;
        d dVar7;
        d dVar8;
        int i16;
        int i17;
        int i18;
        float fAbs;
        int i19;
        ArrayList arrayList;
        d dVar9;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f527q == i4) {
            int i20 = constraintLayout.f528r;
        }
        int i21 = 0;
        if (!constraintLayout.f519i) {
            int childCount = getChildCount();
            for (int i22 = 0; i22 < childCount; i22++) {
                if (constraintLayout.getChildAt(i22).isLayoutRequested()) {
                    constraintLayout.f519i = true;
                    break;
                }
            }
        }
        constraintLayout.f527q = i4;
        constraintLayout.f528r = i5;
        boolean z5 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        e eVar2 = constraintLayout.f514d;
        eVar2.f3984v0 = z5;
        if (constraintLayout.f519i) {
            constraintLayout.f519i = false;
            int childCount2 = getChildCount();
            int i23 = 0;
            while (true) {
                if (i23 >= childCount2) {
                    z4 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i23).isLayoutRequested()) {
                        z4 = true;
                        break;
                    }
                    i23++;
                }
            }
            if (z4) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i24 = 0; i24 < childCount3; i24++) {
                    d dVarH = constraintLayout.h(constraintLayout.getChildAt(i24));
                    if (dVarH != null) {
                        dVarH.D();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i25 = 0; i25 < childCount3; i25++) {
                        View childAt = constraintLayout.getChildAt(i25);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            constraintLayout.l(resourceName, Integer.valueOf(childAt.getId()));
                            int iIndexOf = resourceName.indexOf(47);
                            if (iIndexOf != -1) {
                                resourceName = resourceName.substring(iIndexOf + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) constraintLayout.f512b.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                dVar9 = viewFindViewById == constraintLayout ? eVar2 : viewFindViewById == null ? null : ((u.e) viewFindViewById.getLayoutParams()).f4544p0;
                            }
                            dVar9.f3953h0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (constraintLayout.f523m != -1) {
                    for (int i26 = 0; i26 < childCount3; i26++) {
                        constraintLayout.getChildAt(i26).getId();
                    }
                }
                n nVar = constraintLayout.f521k;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                eVar2.f4025q0.clear();
                ArrayList arrayList2 = constraintLayout.f513c;
                int size = arrayList2.size();
                if (size > 0) {
                    int i27 = 0;
                    while (i27 < size) {
                        c cVar = (c) arrayList2.get(i27);
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f4509f);
                        }
                        j jVar = cVar.f4508e;
                        if (jVar == null) {
                            arrayList = arrayList2;
                        } else {
                            jVar.f4023r0 = i21;
                            Arrays.fill(jVar.f4022q0, obj);
                            int i28 = i21;
                            while (i28 < cVar.f4506c) {
                                int i29 = cVar.f4505b[i28];
                                View view = (View) constraintLayout.f512b.get(i29);
                                if (view == null) {
                                    Integer numValueOf = Integer.valueOf(i29);
                                    HashMap map = cVar.f4511h;
                                    String str = (String) map.get(numValueOf);
                                    int iF = cVar.f(constraintLayout, str);
                                    if (iF != 0) {
                                        cVar.f4505b[i28] = iF;
                                        map.put(Integer.valueOf(iF), str);
                                        view = (View) constraintLayout.f512b.get(iF);
                                    }
                                }
                                if (view != null) {
                                    j jVar2 = cVar.f4508e;
                                    d dVarH2 = constraintLayout.h(view);
                                    jVar2.getClass();
                                    if (dVarH2 != jVar2 && dVarH2 != null) {
                                        int i30 = jVar2.f4023r0 + 1;
                                        d[] dVarArr = jVar2.f4022q0;
                                        if (i30 > dVarArr.length) {
                                            jVar2.f4022q0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = jVar2.f4022q0;
                                        int i31 = jVar2.f4023r0;
                                        dVarArr2[i31] = dVarH2;
                                        jVar2.f4023r0 = i31 + 1;
                                    }
                                }
                                i28++;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            cVar.f4508e.a();
                        }
                        i27++;
                        arrayList2 = arrayList;
                        obj = null;
                        i21 = 0;
                    }
                }
                int i32 = 2;
                for (int i33 = 0; i33 < childCount3; i33++) {
                    constraintLayout.getChildAt(i33);
                }
                SparseArray sparseArray = constraintLayout.f525o;
                sparseArray.clear();
                sparseArray.put(0, eVar2);
                sparseArray.put(getId(), eVar2);
                for (int i34 = 0; i34 < childCount3; i34++) {
                    View childAt2 = constraintLayout.getChildAt(i34);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i35 = 0;
                while (i35 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i35);
                    d dVarH3 = constraintLayout.h(childAt3);
                    if (dVarH3 == null) {
                        i13 = i32;
                        i6 = childCount3;
                    } else {
                        u.e eVar3 = (u.e) childAt3.getLayoutParams();
                        eVar2.f4025q0.add(dVarH3);
                        d dVar10 = dVarH3.T;
                        if (dVar10 != null) {
                            ((l) dVar10).f4025q0.remove(dVarH3);
                            dVarH3.D();
                        }
                        dVarH3.T = eVar2;
                        eVar3.a();
                        dVarH3.f3951g0 = childAt3.getVisibility();
                        dVarH3.f3949f0 = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).h(dVarH3, eVar2.f3984v0);
                        }
                        if (eVar3.f4520d0) {
                            h hVar = (h) dVarH3;
                            int i36 = eVar3.f4538m0;
                            int i37 = eVar3.f4540n0;
                            float f6 = eVar3.f4542o0;
                            if (f6 != -1.0f) {
                                if (f6 > -1.0f) {
                                    hVar.f4016q0 = f6;
                                    hVar.f4017r0 = -1;
                                    hVar.f4018s0 = -1;
                                }
                            } else if (i36 != -1) {
                                if (i36 > -1) {
                                    hVar.f4016q0 = -1.0f;
                                    hVar.f4017r0 = i36;
                                    hVar.f4018s0 = -1;
                                }
                            } else if (i37 != -1 && i37 > -1) {
                                hVar.f4016q0 = -1.0f;
                                hVar.f4017r0 = -1;
                                hVar.f4018s0 = i37;
                            }
                            i13 = i32;
                            i6 = childCount3;
                        } else {
                            int i38 = eVar3.f4524f0;
                            int i39 = eVar3.f4526g0;
                            int i40 = eVar3.f4528h0;
                            int i41 = eVar3.f4530i0;
                            int i42 = eVar3.f4532j0;
                            i6 = childCount3;
                            int i43 = eVar3.f4534k0;
                            float f7 = eVar3.f4536l0;
                            int i44 = eVar3.f4543p;
                            if (i44 != -1) {
                                d dVar11 = (d) sparseArray.get(i44);
                                if (dVar11 != null) {
                                    float f8 = eVar3.f4546r;
                                    dVarH3.w(7, dVar11, 7, eVar3.f4545q, 0);
                                    dVarH3.D = f8;
                                }
                                eVar = eVar3;
                                dVar5 = dVarH3;
                                i13 = 2;
                            } else {
                                if (i38 != -1) {
                                    d dVar12 = (d) sparseArray.get(i38);
                                    if (dVar12 != null) {
                                        dVarH3.w(2, dVar12, 2, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i42);
                                    }
                                } else {
                                    i7 = -1;
                                    if (i39 == -1) {
                                        if (i40 != i7) {
                                            dVar8 = (d) sparseArray.get(i40);
                                            if (dVar8 != null) {
                                                dVarH3.w(4, dVar8, 2, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i43);
                                            }
                                        } else if (i41 != i7 && (dVar = (d) sparseArray.get(i41)) != null) {
                                            dVarH3.w(4, dVar, 4, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i43);
                                        }
                                        i8 = eVar3.f4529i;
                                        if (i8 != -1) {
                                            dVar7 = (d) sparseArray.get(i8);
                                            if (dVar7 != null) {
                                                dVarH3.w(3, dVar7, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f4552x);
                                            }
                                        } else {
                                            i9 = eVar3.f4531j;
                                            if (i9 != -1 && (dVar2 = (d) sparseArray.get(i9)) != null) {
                                                dVarH3.w(3, dVar2, 5, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f4552x);
                                            }
                                        }
                                        i10 = eVar3.f4533k;
                                        if (i10 != -1) {
                                            dVar6 = (d) sparseArray.get(i10);
                                            if (dVar6 != null) {
                                                dVarH3.w(5, dVar6, 3, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f4554z);
                                            }
                                        } else {
                                            i11 = eVar3.f4535l;
                                            if (i11 != -1 && (dVar3 = (d) sparseArray.get(i11)) != null) {
                                                dVarH3.w(5, dVar3, 5, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f4554z);
                                            }
                                        }
                                        i12 = eVar3.f4537m;
                                        if (i12 != -1) {
                                            eVar = eVar3;
                                            dVar4 = dVarH3;
                                            i13 = 2;
                                            m(dVarH3, eVar3, sparseArray, i12, 6);
                                        } else {
                                            eVar = eVar3;
                                            dVar4 = dVarH3;
                                            i13 = 2;
                                            i14 = eVar.f4539n;
                                            if (i14 != -1) {
                                                m(dVar4, eVar, sparseArray, i14, 3);
                                            } else {
                                                i15 = eVar.f4541o;
                                                if (i15 != -1) {
                                                    m(dVar4, eVar, sparseArray, i15, 5);
                                                }
                                            }
                                        }
                                        if (f7 >= 0.0f) {
                                            dVar5 = dVar4;
                                            dVar5.f3945d0 = f7;
                                        } else {
                                            dVar5 = dVar4;
                                        }
                                        f5 = eVar.F;
                                        if (f5 >= 0.0f) {
                                            dVar5.f3947e0 = f5;
                                        }
                                    } else {
                                        d dVar13 = (d) sparseArray.get(i39);
                                        if (dVar13 != null) {
                                            dVarH3.w(2, dVar13, 4, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i42);
                                        }
                                    }
                                }
                                i7 = -1;
                                if (i40 != i7) {
                                    dVar8 = (d) sparseArray.get(i40);
                                    if (dVar8 != null) {
                                        dVarH3.w(4, dVar8, 2, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i43);
                                    }
                                } else if (i41 != i7) {
                                    dVarH3.w(4, dVar, 4, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i43);
                                }
                                i8 = eVar3.f4529i;
                                if (i8 != -1) {
                                    dVar7 = (d) sparseArray.get(i8);
                                    if (dVar7 != null) {
                                        dVarH3.w(3, dVar7, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f4552x);
                                    }
                                } else {
                                    i9 = eVar3.f4531j;
                                    if (i9 != -1) {
                                        dVarH3.w(3, dVar2, 5, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f4552x);
                                    }
                                }
                                i10 = eVar3.f4533k;
                                if (i10 != -1) {
                                    dVar6 = (d) sparseArray.get(i10);
                                    if (dVar6 != null) {
                                        dVarH3.w(5, dVar6, 3, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f4554z);
                                    }
                                } else {
                                    i11 = eVar3.f4535l;
                                    if (i11 != -1) {
                                        dVarH3.w(5, dVar3, 5, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f4554z);
                                    }
                                }
                                i12 = eVar3.f4537m;
                                if (i12 != -1) {
                                    eVar = eVar3;
                                    dVar4 = dVarH3;
                                    i13 = 2;
                                    m(dVarH3, eVar3, sparseArray, i12, 6);
                                } else {
                                    eVar = eVar3;
                                    dVar4 = dVarH3;
                                    i13 = 2;
                                    i14 = eVar.f4539n;
                                    if (i14 != -1) {
                                        m(dVar4, eVar, sparseArray, i14, 3);
                                    } else {
                                        i15 = eVar.f4541o;
                                        if (i15 != -1) {
                                            m(dVar4, eVar, sparseArray, i15, 5);
                                        }
                                    }
                                }
                                if (f7 >= 0.0f) {
                                    dVar5 = dVar4;
                                    dVar5.f3945d0 = f7;
                                } else {
                                    dVar5 = dVar4;
                                }
                                f5 = eVar.F;
                                if (f5 >= 0.0f) {
                                    dVar5.f3947e0 = f5;
                                }
                            }
                            if (zIsInEditMode && ((i19 = eVar.T) != -1 || eVar.U != -1)) {
                                int i45 = eVar.U;
                                dVar5.Y = i19;
                                dVar5.Z = i45;
                            }
                            if (eVar.f4514a0) {
                                dVar5.N(1);
                                dVar5.P(((ViewGroup.MarginLayoutParams) eVar).width);
                                if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                                    dVar5.N(i13);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
                                if (eVar.W) {
                                    dVar5.N(3);
                                } else {
                                    dVar5.N(4);
                                }
                                dVar5.j(2).f3935g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                dVar5.j(4).f3935g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                dVar5.N(3);
                                dVar5.P(0);
                            }
                            if (eVar.f4516b0) {
                                i16 = -1;
                                dVar5.O(1);
                                dVar5.M(((ViewGroup.MarginLayoutParams) eVar).height);
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                                    dVar5.O(i13);
                                }
                            } else {
                                i16 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
                                    if (eVar.X) {
                                        dVar5.O(3);
                                    } else {
                                        dVar5.O(4);
                                    }
                                    dVar5.j(3).f3935g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    dVar5.j(5).f3935g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                                } else {
                                    dVar5.O(3);
                                    dVar5.M(0);
                                }
                            }
                            String str2 = eVar.G;
                            if (str2 == null || str2.length() == 0) {
                                dVar5.W = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf2 = str2.indexOf(44);
                                if (iIndexOf2 <= 0 || iIndexOf2 >= length - 1) {
                                    i17 = i16;
                                    i18 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf2);
                                    i17 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i16;
                                    i18 = iIndexOf2 + 1;
                                }
                                int iIndexOf3 = str2.indexOf(58);
                                if (iIndexOf3 < 0 || iIndexOf3 >= length - 1) {
                                    String strSubstring2 = str2.substring(i18);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i18, iIndexOf3);
                                    String strSubstring4 = str2.substring(iIndexOf3 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f9 = Float.parseFloat(strSubstring3);
                                            float f10 = Float.parseFloat(strSubstring4);
                                            if (f9 <= 0.0f || f10 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i17 == 1 ? Math.abs(f10 / f9) : Math.abs(f9 / f10);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    dVar5.W = fAbs;
                                    dVar5.X = i17;
                                }
                            }
                            float f11 = eVar.H;
                            float[] fArr = dVar5.f3959k0;
                            fArr[0] = f11;
                            fArr[1] = eVar.I;
                            dVar5.f3955i0 = eVar.J;
                            dVar5.f3957j0 = eVar.K;
                            int i46 = eVar.Z;
                            if (i46 >= 0 && i46 <= 3) {
                                dVar5.f3970q = i46;
                            }
                            int i47 = eVar.L;
                            int i48 = eVar.N;
                            int i49 = eVar.P;
                            float f12 = eVar.R;
                            dVar5.f3971r = i47;
                            dVar5.f3974u = i48;
                            if (i49 == Integer.MAX_VALUE) {
                                i49 = 0;
                            }
                            dVar5.f3975v = i49;
                            dVar5.f3976w = f12;
                            if (f12 > 0.0f && f12 < 1.0f && i47 == 0) {
                                dVar5.f3971r = i13;
                            }
                            int i50 = eVar.M;
                            int i51 = eVar.O;
                            int i52 = eVar.Q;
                            float f13 = eVar.S;
                            dVar5.f3972s = i50;
                            dVar5.f3977x = i51;
                            if (i52 == Integer.MAX_VALUE) {
                                i52 = 0;
                            }
                            dVar5.f3978y = i52;
                            dVar5.f3979z = f13;
                            if (f13 > 0.0f && f13 < 1.0f && i50 == 0) {
                                dVar5.f3972s = i13;
                            }
                        }
                    }
                    i35++;
                    i32 = i13;
                    childCount3 = i6;
                    constraintLayout = this;
                }
            }
            if (z4) {
                eVar2.f3980r0.x(eVar2);
            }
        }
        k(eVar2, this.f520j, i4, i5);
        int iR = eVar2.r();
        int iL = eVar2.l();
        boolean z6 = eVar2.E0;
        boolean z7 = eVar2.F0;
        s.n nVar2 = this.f526p;
        int i53 = nVar2.f4176d;
        int iResolveSizeAndState = View.resolveSizeAndState(iR + nVar2.f4175c, i4, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iL + i53, i5, 0) & 16777215;
        int iMin = Math.min(this.f517g, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f518h, iResolveSizeAndState2);
        if (z6) {
            iMin |= 16777216;
        }
        if (z7) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d dVarH = h(view);
        if ((view instanceof u.p) && !(dVarH instanceof h)) {
            u.e eVar = (u.e) view.getLayoutParams();
            h hVar = new h();
            eVar.f4544p0 = hVar;
            eVar.f4520d0 = true;
            hVar.T(eVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((u.e) view.getLayoutParams()).f4522e0 = true;
            ArrayList arrayList = this.f513c;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f512b.put(view.getId(), view);
        this.f519i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f512b.remove(view.getId());
        d dVarH = h(view);
        this.f514d.f4025q0.remove(dVarH);
        dVarH.D();
        this.f513c.remove(view);
        this.f519i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f519i = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f521k = nVar;
    }

    @Override // android.view.View
    public void setId(int i4) {
        int id = getId();
        SparseArray sparseArray = this.f512b;
        sparseArray.remove(id);
        super.setId(i4);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i4) {
        if (i4 == this.f518h) {
            return;
        }
        this.f518h = i4;
        requestLayout();
    }

    public void setMaxWidth(int i4) {
        if (i4 == this.f517g) {
            return;
        }
        this.f517g = i4;
        requestLayout();
    }

    public void setMinHeight(int i4) {
        if (i4 == this.f516f) {
            return;
        }
        this.f516f = i4;
        requestLayout();
    }

    public void setMinWidth(int i4) {
        if (i4 == this.f515e) {
            return;
        }
        this.f515e = i4;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        g gVar = this.f522l;
        if (gVar != null) {
            gVar.getClass();
        }
    }

    public void setOptimizationLevel(int i4) {
        this.f520j = i4;
        e eVar = this.f514d;
        eVar.D0 = i4;
        p.d.f3674p = eVar.X(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f512b = new SparseArray();
        this.f513c = new ArrayList(4);
        this.f514d = new e();
        this.f515e = 0;
        this.f516f = 0;
        this.f517g = Integer.MAX_VALUE;
        this.f518h = Integer.MAX_VALUE;
        this.f519i = true;
        this.f520j = 257;
        this.f521k = null;
        this.f522l = null;
        this.f523m = -1;
        this.f524n = new HashMap();
        this.f525o = new SparseArray();
        this.f526p = new s.n(this, this);
        this.f527q = 0;
        this.f528r = 0;
        i(attributeSet, i4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        u.e eVar = new u.e(layoutParams);
        eVar.f4513a = -1;
        eVar.f4515b = -1;
        eVar.f4517c = -1.0f;
        eVar.f4519d = true;
        eVar.f4521e = -1;
        eVar.f4523f = -1;
        eVar.f4525g = -1;
        eVar.f4527h = -1;
        eVar.f4529i = -1;
        eVar.f4531j = -1;
        eVar.f4533k = -1;
        eVar.f4535l = -1;
        eVar.f4537m = -1;
        eVar.f4539n = -1;
        eVar.f4541o = -1;
        eVar.f4543p = -1;
        eVar.f4545q = 0;
        eVar.f4546r = 0.0f;
        eVar.f4547s = -1;
        eVar.f4548t = -1;
        eVar.f4549u = -1;
        eVar.f4550v = -1;
        eVar.f4551w = Integer.MIN_VALUE;
        eVar.f4552x = Integer.MIN_VALUE;
        eVar.f4553y = Integer.MIN_VALUE;
        eVar.f4554z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = Integer.MIN_VALUE;
        eVar.D = 0;
        eVar.E = 0.5f;
        eVar.F = 0.5f;
        eVar.G = null;
        eVar.H = -1.0f;
        eVar.I = -1.0f;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 0;
        eVar.R = 1.0f;
        eVar.S = 1.0f;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = -1;
        eVar.W = false;
        eVar.X = false;
        eVar.Y = null;
        eVar.Z = 0;
        eVar.f4514a0 = true;
        eVar.f4516b0 = true;
        eVar.f4518c0 = false;
        eVar.f4520d0 = false;
        eVar.f4522e0 = false;
        eVar.f4524f0 = -1;
        eVar.f4526g0 = -1;
        eVar.f4528h0 = -1;
        eVar.f4530i0 = -1;
        eVar.f4532j0 = Integer.MIN_VALUE;
        eVar.f4534k0 = Integer.MIN_VALUE;
        eVar.f4536l0 = 0.5f;
        eVar.f4544p0 = new d();
        return eVar;
    }
}
