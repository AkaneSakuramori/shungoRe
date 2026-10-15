package i0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.shungo.app.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f2983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f2984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f2985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f2986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f2987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f2988f;

    static {
        new AtomicInteger(1);
        f2983a = null;
        f2985c = false;
        f2986d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f2987e = new z();
        f2988f = new b0();
    }

    public static d1 a(View view) {
        if (f2983a == null) {
            f2983a = new WeakHashMap();
        }
        d1 d1Var = (d1) f2983a.get(view);
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1Var2 = new d1(view);
        f2983a.put(view, d1Var2);
        return d1Var2;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = u0.f2966d;
        u0 u0Var = (u0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (u0Var == null) {
            u0Var = new u0();
            u0Var.f2967a = null;
            u0Var.f2968b = null;
            u0Var.f2969c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, u0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = u0Var.f2967a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = u0.f2966d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (u0Var.f2967a == null) {
                            u0Var.f2967a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = u0.f2966d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                u0Var.f2967a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    u0Var.f2967a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = u0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (u0Var.f2968b == null) {
                    u0Var.f2968b = new SparseArray();
                }
                u0Var.f2968b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return p0.a(view);
        }
        if (f2985c) {
            return null;
        }
        if (f2984b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2984b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2985c = true;
                return null;
            }
        }
        try {
            Object obj = f2984b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2985c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        return (CharSequence) new a0(R.id.tag_accessibility_pane_title, 8, 28, 1).a(view);
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(View view) {
        return Build.VERSION.SDK_INT >= 31 ? r0.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i4) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z4 = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (h0.a(view) != 0 || z4) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z4 ? 32 : 2048);
                h0.g(accessibilityEventObtain, i4);
                if (z4) {
                    accessibilityEventObtain.getText().add(d(view));
                    if (e0.c(view) == 0) {
                        e0.s(view, 1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i4 != 32) {
                if (view.getParent() != null) {
                    try {
                        h0.e(view.getParent(), view, view, i4);
                        return;
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e5);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            h0.g(accessibilityEventObtain2, i4);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h h(View view, h hVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + hVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return r0.b(view, hVar);
        }
        t tVar = (t) view.getTag(R.id.tag_on_receive_content_listener);
        u uVar = f2987e;
        if (tVar == null) {
            if (view instanceof u) {
                uVar = (u) view;
            }
            return uVar.a(hVar);
        }
        h hVarA = ((m0.u) tVar).a(view, hVar);
        if (hVarA == null) {
            return null;
        }
        if (view instanceof u) {
            uVar = (u) view;
        }
        return uVar.a(hVarA);
    }

    public static void i(View view, int i4) {
        ArrayList arrayListE = e(view);
        for (int i5 = 0; i5 < arrayListE.size(); i5++) {
            if (((j0.i) arrayListE.get(i5)).a() == i4) {
                arrayListE.remove(i5);
                return;
            }
        }
    }

    public static void j(View view, j0.i iVar, j0.b0 b0Var) {
        c cVar;
        j0.i iVar2 = new j0.i(null, iVar.f3140b, null, b0Var, iVar.f3141c);
        View.AccessibilityDelegate accessibilityDelegateC = c(view);
        if (accessibilityDelegateC == null) {
            cVar = null;
        } else {
            cVar = accessibilityDelegateC instanceof a ? ((a) accessibilityDelegateC).f2884a : new c(accessibilityDelegateC);
        }
        if (cVar == null) {
            cVar = new c();
        }
        l(view, cVar);
        i(view, iVar2.a());
        e(view).add(iVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            p0.d(view, context, iArr, attributeSet, typedArray, i4, 0);
        }
    }

    public static void l(View view, c cVar) {
        if (cVar == null && (c(view) instanceof a)) {
            cVar = new c();
        }
        if (e0.c(view) == 0) {
            e0.s(view, 1);
        }
        view.setAccessibilityDelegate(cVar == null ? null : cVar.f2896b);
    }

    public static void m(View view, CharSequence charSequence) {
        new a0(R.id.tag_accessibility_pane_title, 8, 28, 1 == true ? 1 : 0).b(view, charSequence);
        b0 b0Var = f2988f;
        if (charSequence == null) {
            b0Var.f2889b.remove(view);
            view.removeOnAttachStateChangeListener(b0Var);
            e0.o(view.getViewTreeObserver(), b0Var);
        } else {
            b0Var.f2889b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(b0Var);
            if (h0.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(b0Var);
            }
        }
    }
}
