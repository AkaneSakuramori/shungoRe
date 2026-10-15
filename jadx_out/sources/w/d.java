package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f4819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f4829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f4830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4833o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f4834p;

    public d() {
        super(-2, -2);
        this.f4820b = false;
        this.f4821c = 0;
        this.f4822d = 0;
        this.f4823e = -1;
        this.f4824f = -1;
        this.f4825g = 0;
        this.f4826h = 0;
        this.f4834p = new Rect();
    }

    public final boolean a(int i4) {
        if (i4 == 0) {
            return this.f4832n;
        }
        if (i4 != 1) {
            return false;
        }
        return this.f4833o;
    }

    public d(Context context, AttributeSet attributeSet) {
        a aVar;
        super(context, attributeSet);
        this.f4820b = false;
        this.f4821c = 0;
        this.f4822d = 0;
        this.f4823e = -1;
        this.f4824f = -1;
        this.f4825g = 0;
        this.f4826h = 0;
        this.f4834p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.a.f4769b);
        this.f4821c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f4824f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f4822d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f4823e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f4825g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f4826h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f4820b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f529u;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f529u;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f531w;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f530v);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e5) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e5);
                }
            }
            this.f4819a = aVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        a aVar2 = this.f4819a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f4820b = false;
        this.f4821c = 0;
        this.f4822d = 0;
        this.f4823e = -1;
        this.f4824f = -1;
        this.f4825g = 0;
        this.f4826h = 0;
        this.f4834p = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4820b = false;
        this.f4821c = 0;
        this.f4822d = 0;
        this.f4823e = -1;
        this.f4824f = -1;
        this.f4825g = 0;
        this.f4826h = 0;
        this.f4834p = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4820b = false;
        this.f4821c = 0;
        this.f4822d = 0;
        this.f4823e = -1;
        this.f4824f = -1;
        this.f4825g = 0;
        this.f4826h = 0;
        this.f4834p = new Rect();
    }
}
