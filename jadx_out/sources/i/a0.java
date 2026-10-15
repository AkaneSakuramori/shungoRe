package i;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.gson.reflect.TypeToken;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements e0.d, i0.s, o2.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2520d;

    public /* synthetic */ a0(Object obj, int i4, Object obj2) {
        this.f2518b = i4;
        this.f2519c = obj;
        this.f2520d = obj2;
    }

    public final void a(boolean z4) {
        androidx.fragment.app.q qVar = ((androidx.fragment.app.i0) this.f2520d).f766r;
        if (qVar != null) {
            qVar.j().f761m.a(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void b(boolean z4) {
        androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f2520d;
        Context context = i0Var.f764p.f884k;
        androidx.fragment.app.q qVar = i0Var.f766r;
        if (qVar != null) {
            qVar.j().f761m.b(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void c(boolean z4) {
        androidx.fragment.app.q qVar = ((androidx.fragment.app.i0) this.f2520d).f766r;
        if (qVar != null) {
            qVar.j().f761m.c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    @Override // o2.n
    public final Object d() {
        switch (this.f2518b) {
            case 12:
                try {
                    return ((Constructor) this.f2519c).newInstance(null);
                } catch (IllegalAccessException e5) {
                    throw new AssertionError(e5);
                } catch (InstantiationException e6) {
                    throw new RuntimeException("Failed to invoke " + ((Constructor) this.f2519c) + " with no args", e6);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException("Failed to invoke " + ((Constructor) this.f2519c) + " with no args", e7.getTargetException());
                }
            default:
                Type type = (Type) this.f2519c;
                if (!(type instanceof ParameterizedType)) {
                    throw new m2.r("Invalid EnumSet type: " + ((Type) this.f2519c).toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new m2.r("Invalid EnumSet type: " + ((Type) this.f2519c).toString());
        }
    }

    @Override // e0.d
    public final void e() {
        ((Animator) this.f2519c).end();
    }

    public final void f(boolean z4) {
        androidx.fragment.app.q qVar = ((androidx.fragment.app.i0) this.f2520d).f766r;
        if (qVar != null) {
            qVar.j().f761m.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void g(boolean z4) {
        androidx.fragment.app.q qVar = ((androidx.fragment.app.i0) this.f2520d).f766r;
        if (qVar != null) {
            qVar.j().f761m.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void h(boolean z4) {
        androidx.fragment.app.q qVar = ((androidx.fragment.app.i0) this.f2520d).f766r;
        if (qVar != null) {
            qVar.j().f761m.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void i(boolean z4) {
        androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f2520d;
        Context context = i0Var.f764p.f884k;
        androidx.fragment.app.q qVar = i0Var.f766r;
        if (qVar != null) {
            qVar.j().f761m.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void j(boolean z4) {
        androidx.fragment.app.q qVar = ((androidx.fragment.app.i0) this.f2520d).f766r;
        if (qVar != null) {
            qVar.j().f761m.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void k(boolean z4) {
        androidx.fragment.app.q qVar = ((androidx.fragment.app.i0) this.f2520d).f766r;
        if (qVar != null) {
            qVar.j().f761m.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void l(boolean z4) {
        androidx.fragment.app.q qVar = ((androidx.fragment.app.i0) this.f2520d).f766r;
        if (qVar != null) {
            qVar.j().f761m.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void m(boolean z4) {
        androidx.fragment.app.q qVar = ((androidx.fragment.app.i0) this.f2520d).f766r;
        if (qVar != null) {
            qVar.j().f761m.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void n(boolean z4) {
        androidx.fragment.app.q qVar = ((androidx.fragment.app.i0) this.f2520d).f766r;
        if (qVar != null) {
            qVar.j().f761m.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void o(boolean z4) {
        androidx.fragment.app.q qVar = ((androidx.fragment.app.i0) this.f2520d).f766r;
        if (qVar != null) {
            qVar.j().f761m.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void p(boolean z4) {
        androidx.fragment.app.q qVar = ((androidx.fragment.app.i0) this.f2520d).f766r;
        if (qVar != null) {
            qVar.j().f761m.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2519c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c A[DONT_INVERT] */
    @Override // i0.s
    public final i0.c2 q(View view, i0.c2 c2Var) {
        boolean z4;
        y.k kVar = (y.k) this.f2519c;
        y0.k0 k0Var = (y0.k0) this.f2520d;
        y0.k0 k0Var2 = new y0.k0();
        k0Var2.f5186a = k0Var.f5186a;
        k0Var2.f5187b = k0Var.f5187b;
        k0Var2.f5188c = k0Var.f5188c;
        k0Var2.f5189d = k0Var.f5189d;
        kVar.getClass();
        i0.a2 a2Var = c2Var.f2902a;
        b0.c cVarF = a2Var.f(7);
        b0.c cVarF2 = a2Var.f(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) kVar.f5038b;
        bottomSheetBehavior.f1381w = cVarF.f1082b;
        boolean zQ1 = c3.h.q1(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (bottomSheetBehavior.f1373o) {
            int iA = c2Var.a();
            bottomSheetBehavior.f1380v = iA;
            paddingBottom = iA + k0Var2.f5189d;
        }
        boolean z5 = bottomSheetBehavior.f1374p;
        int i4 = cVarF.f1081a;
        if (z5) {
            paddingLeft = (zQ1 ? k0Var2.f5188c : k0Var2.f5186a) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1375q;
        int i5 = cVarF.f1083c;
        if (z6) {
            paddingRight = (zQ1 ? k0Var2.f5186a : k0Var2.f5188c) + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1377s || marginLayoutParams.leftMargin == i4) {
            z4 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z4 = true;
        }
        if (!bottomSheetBehavior.f1378t || marginLayoutParams.rightMargin == i5) {
            z7 = z4;
        } else {
            marginLayoutParams.rightMargin = i5;
        }
        if (bottomSheetBehavior.f1379u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = cVarF.f1082b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
            } else if (z7) {
            }
            view.setLayoutParams(marginLayoutParams);
        } else if (z7) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z8 = kVar.f5037a;
        if (z8) {
            bottomSheetBehavior.f1371m = cVarF2.f1084d;
        }
        if (bottomSheetBehavior.f1373o || z8) {
            bottomSheetBehavior.I();
        }
        return c2Var;
    }

    public final o2.n r(TypeToken typeToken) {
        a0 a0Var;
        o2.n xVar;
        Object jVar;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        defpackage.a.n(((Map) this.f2519c).get(type));
        defpackage.a.n(((Map) this.f2519c).get(rawType));
        int i4 = 0;
        try {
            Constructor declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                ((r2.b) this.f2520d).a(declaredConstructor);
            }
            a0Var = new a0(this, declaredConstructor, 12);
        } catch (NoSuchMethodException unused) {
            a0Var = null;
        }
        if (a0Var != null) {
            return a0Var;
        }
        int i5 = 2;
        int i6 = 1;
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                xVar = new a4.x(4);
            } else if (EnumSet.class.isAssignableFrom(rawType)) {
                xVar = new a0(this, type, 13);
            } else if (Set.class.isAssignableFrom(rawType)) {
                xVar = new a4.x(5);
            } else {
                xVar = Queue.class.isAssignableFrom(rawType) ? new a4.x(6) : new a4.x(7);
            }
        } else if (!Map.class.isAssignableFrom(rawType)) {
            xVar = null;
        } else if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
            xVar = new a4.x(8);
        } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
            xVar = new a4.x(i4);
        } else if (SortedMap.class.isAssignableFrom(rawType)) {
            xVar = new a4.x(i6);
        } else {
            xVar = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new a4.x(3) : new a4.x(i5);
        }
        if (xVar != null) {
            return xVar;
        }
        g.h hVar = new g.h();
        hVar.f2226e = this;
        hVar.f2223b = rawType;
        hVar.f2225d = type;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    jVar = new o2.p(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused2) {
                    jVar = new c1.j();
                }
            } catch (Exception unused3) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                jVar = new o2.r(declaredMethod);
            }
        } catch (Exception unused4) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            jVar = new o2.q(iIntValue, declaredMethod3);
        }
        hVar.f2224c = jVar;
        return hVar;
    }

    public final KeyListener s(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? ((f2.e) ((r0.b) this.f2520d).f4030c).v(keyListener) : keyListener;
    }

    public final void t(AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f2519c).getContext().obtainStyledAttributes(attributeSet, d.a.f1662i, i4, 0);
        try {
            boolean z4 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((f2.e) ((r0.b) this.f2520d).f4030c).O(z4);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final String toString() {
        switch (this.f2518b) {
            case 6:
                return "Bounds{lower=" + ((b0.c) this.f2519c) + " upper=" + ((b0.c) this.f2520d) + "}";
            case 14:
                return ((Map) this.f2519c).toString();
            default:
                return super.toString();
        }
    }

    public final InputConnection u(InputConnection inputConnection, EditorInfo editorInfo) {
        r0.b bVar = (r0.b) this.f2520d;
        if (inputConnection != null) {
            return ((f2.e) bVar.f4030c).G(inputConnection, editorInfo);
        }
        bVar.getClass();
        return null;
    }

    public final void v(f0.f fVar) {
        int i4 = fVar.f2012b;
        if (i4 != 0) {
            ((Handler) this.f2520d).post(new androidx.activity.h(this, (e.n0) this.f2519c, i4, 4));
        } else {
            e.n0 n0Var = (e.n0) this.f2519c;
            ((Handler) this.f2520d).post(new f0.a(this, n0Var, fVar.f2011a, 0));
        }
    }

    public /* synthetic */ a0(Object obj, Object obj2, int i4) {
        this.f2518b = i4;
        this.f2520d = obj;
        this.f2519c = obj2;
    }

    public a0(TextView textView) {
        this.f2518b = 1;
        textView.getClass();
        this.f2519c = textView;
    }

    public a0(EditText editText) {
        this.f2518b = 0;
        this.f2519c = editText;
        r0.b bVar = new r0.b();
        bVar.f4028a = Integer.MAX_VALUE;
        bVar.f4029b = 0;
        if (editText != null) {
            bVar.f4030c = new r0.a(editText);
            this.f2520d = bVar;
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }

    public a0(androidx.fragment.app.i0 i0Var) {
        this.f2518b = 8;
        this.f2519c = new CopyOnWriteArrayList();
        this.f2520d = i0Var;
    }

    public a0(Map map) {
        this.f2518b = 14;
        this.f2520d = r2.b.f4070a;
        this.f2519c = map;
    }

    public a0(ArrayList arrayList, ArrayList arrayList2) {
        this.f2518b = 4;
        int size = arrayList.size();
        this.f2519c = new int[size];
        this.f2520d = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            ((int[]) this.f2519c)[i4] = ((Integer) arrayList.get(i4)).intValue();
            ((float[]) this.f2520d)[i4] = ((Float) arrayList2.get(i4)).floatValue();
        }
    }

    public a0(int i4, int i5) {
        this.f2518b = 4;
        this.f2519c = new int[]{i4, i5};
        this.f2520d = new float[]{0.0f, 1.0f};
    }

    public a0(WindowInsetsAnimation.Bounds bounds) {
        this.f2518b = 6;
        this.f2519c = b0.c.c(bounds.getLowerBound());
        this.f2520d = b0.c.c(bounds.getUpperBound());
    }

    public a0(int i4, int i5, int i6) {
        this.f2518b = 4;
        this.f2519c = new int[]{i4, i5, i6};
        this.f2520d = new float[]{0.0f, 0.5f, 1.0f};
    }

    public a0(t1.e eVar, t1.e eVar2) {
        this.f2518b = 9;
        eVar.getClass();
        eVar2.getClass();
        if (0.0f > 0.0f) {
            throw new IllegalArgumentException();
        }
        this.f2519c = eVar;
        this.f2520d = eVar2;
    }
}
