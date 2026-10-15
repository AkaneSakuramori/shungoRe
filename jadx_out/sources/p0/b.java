package p0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import c3.h;
import com.google.android.material.chip.Chip;
import i0.e0;
import i0.f0;
import i0.v0;
import j0.o;
import j0.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import n.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends i0.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rect f3713n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f2.e f3714o = new f2.e(10);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f2.e f3715p = new f2.e(11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f3720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f3721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f3722j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f3716d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f3717e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f3718f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f3719g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3723k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3724l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3725m = Integer.MIN_VALUE;

    public b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f3721i = view;
        this.f3720h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = v0.f2983a;
        if (e0.c(view) == 0) {
            e0.s(view, 1);
        }
    }

    @Override // i0.c
    public final c.a b(View view) {
        if (this.f3722j == null) {
            this.f3722j = new a(this);
        }
        return this.f3722j;
    }

    @Override // i0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // i0.c
    public final void d(View view, o oVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2895a;
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f3144a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((v1.d) this).f4778q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i4) {
        if (this.f3724l != i4) {
            return false;
        }
        this.f3724l = Integer.MIN_VALUE;
        v1.d dVar = (v1.d) this;
        if (i4 == 1) {
            Chip chip = dVar.f4778q;
            chip.f1425n = false;
            chip.refreshDrawableState();
        }
        q(i4, 8);
        return true;
    }

    public final o k(int i4) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        o oVar = new o(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoObtain.setClassName("android.view.View");
        Rect rect = f3713n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        oVar.f3145b = -1;
        View view = this.f3721i;
        accessibilityNodeInfoObtain.setParent(view);
        o(i4, oVar);
        if (oVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3717e;
        oVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        oVar.f3146c = i4;
        accessibilityNodeInfoObtain.setSource(view, i4);
        if (this.f3723k == i4) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            oVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            oVar.a(64);
        }
        boolean z4 = this.f3724l == i4;
        if (z4) {
            oVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            oVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z4);
        int[] iArr = this.f3719g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f3716d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            oVar.f(rect3);
            if (oVar.f3145b != -1) {
                o oVar2 = new o(AccessibilityNodeInfo.obtain());
                for (int i5 = oVar.f3145b; i5 != -1; i5 = oVar2.f3145b) {
                    oVar2.f3145b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = oVar2.f3144a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i5, oVar2);
                    oVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f3718f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                oVar.f3144a.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfoObtain.setVisibleToUser(true);
                    }
                }
            }
        }
        return oVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:115:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x0152  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a8  */
    public final boolean m(int i4, Rect rect) {
        int i5;
        int i6;
        Object obj;
        o oVar;
        int i7;
        Rect rect2;
        int i8;
        Rect rect3;
        int i9;
        o oVar2;
        int i10;
        int iW1;
        int iZ1;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        l lVar = new l();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            lVar.d(((Integer) arrayList.get(i11)).intValue(), k(((Integer) arrayList.get(i11)).intValue()));
        }
        int i12 = this.f3724l;
        int i13 = Integer.MIN_VALUE;
        o oVar3 = i12 == Integer.MIN_VALUE ? null : (o) lVar.c(i12, null);
        f2.e eVar = f3714o;
        f2.e eVar2 = f3715p;
        View view = this.f3721i;
        if (i4 == 1 || i4 == 2) {
            i5 = 0;
            i6 = -1;
            WeakHashMap weakHashMap = v0.f2983a;
            boolean z4 = f0.d(view) == 1;
            eVar2.getClass();
            int i14 = lVar.f3528d;
            ArrayList arrayList2 = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList2.add((o) lVar.f3527c[i15]);
            }
            Collections.sort(arrayList2, new c(z4, eVar));
            if (i4 == 1) {
                int size = arrayList2.size();
                if (oVar3 != null) {
                    size = arrayList2.indexOf(oVar3);
                }
                int i16 = size - 1;
                if (i16 >= 0) {
                    obj = arrayList2.get(i16);
                } else {
                    obj = null;
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (oVar3 == null ? -1 : arrayList2.lastIndexOf(oVar3)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            oVar = (o) obj;
        } else {
            if (i4 != 17 && i4 != 33 && i4 != 66 && i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i17 = this.f3724l;
            if (i17 != Integer.MIN_VALUE) {
                n(i17).f(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (i4 == 17) {
                        i6 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i4 == 33) {
                        i6 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i4 == 66) {
                        rect4.set(-1, 0, -1, height);
                        i6 = -1;
                    } else {
                        if (i4 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        rect4.set(0, -1, width, -1);
                        i6 = -1;
                    }
                }
                rect2 = new Rect(rect4);
                if (i4 != 17) {
                    i5 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i4 != 33) {
                    i5 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i4 != 66) {
                    i5 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i4 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i5 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                eVar2.getClass();
                i8 = lVar.f3528d;
                rect3 = new Rect();
                oVar = null;
                for (i9 = i5; i9 < i8; i9++) {
                    oVar2 = (o) lVar.f3527c[i9];
                    if (oVar2 == oVar3) {
                        eVar.getClass();
                        oVar2.f(rect3);
                        if (h.m1(i4, rect4, rect3)) {
                            if (h.m1(i4, rect4, rect2) || h.L(i4, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                oVar = oVar2;
                            } else if (h.L(i4, rect4, rect2, rect3)) {
                                int iW2 = h.w1(i4, rect4, rect3);
                                int iZ2 = h.z1(i4, rect4, rect3);
                                i10 = (iZ2 * iZ2) + (iW2 * 13 * iW2);
                                iW1 = h.w1(i4, rect4, rect2);
                                iZ1 = h.z1(i4, rect4, rect2);
                                if (i10 < (iZ1 * iZ1) + (iW1 * 13 * iW1)) {
                                    rect2.set(rect3);
                                    oVar = oVar2;
                                }
                            }
                        }
                    }
                }
            }
            i6 = -1;
            rect2 = new Rect(rect4);
            if (i4 != 17) {
                i5 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i4 != 33) {
                i5 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i4 != 66) {
                i5 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i4 == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i5 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            eVar2.getClass();
            i8 = lVar.f3528d;
            rect3 = new Rect();
            oVar = null;
            while (i9 < i8) {
                oVar2 = (o) lVar.f3527c[i9];
                if (oVar2 == oVar3) {
                    eVar.getClass();
                    oVar2.f(rect3);
                    if (h.m1(i4, rect4, rect3)) {
                        if (h.m1(i4, rect4, rect2)) {
                            rect2.set(rect3);
                            oVar = oVar2;
                        } else if (h.L(i4, rect4, rect2, rect3)) {
                            int iW3 = h.w1(i4, rect4, rect3);
                            int iZ3 = h.z1(i4, rect4, rect3);
                            i10 = (iZ3 * iZ3) + (iW3 * 13 * iW3);
                            iW1 = h.w1(i4, rect4, rect2);
                            iZ1 = h.z1(i4, rect4, rect2);
                            if (i10 < (iZ1 * iZ1) + (iW1 * 13 * iW1)) {
                                rect2.set(rect3);
                                oVar = oVar2;
                            }
                        }
                    }
                }
            }
        }
        o oVar4 = oVar;
        if (oVar4 != null) {
            int i18 = i5;
            while (true) {
                if (i18 >= lVar.f3528d) {
                    i7 = i6;
                    break;
                }
                if (lVar.f3527c[i18] == oVar4) {
                    i7 = i18;
                    break;
                }
                i18++;
            }
            i13 = lVar.f3526b[i7];
        }
        return p(i13);
    }

    public final o n(int i4) {
        if (i4 != -1) {
            return k(i4);
        }
        View view = this.f3721i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        o oVar = new o(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = v0.f2983a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            oVar.f3144a.addChild(view, ((Integer) arrayList.get(i5)).intValue());
        }
        return oVar;
    }

    public abstract void o(int i4, o oVar);

    public final boolean p(int i4) {
        int i5;
        View view = this.f3721i;
        if ((!view.isFocused() && !view.requestFocus()) || (i5 = this.f3724l) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            j(i5);
        }
        if (i4 == Integer.MIN_VALUE) {
            return false;
        }
        this.f3724l = i4;
        v1.d dVar = (v1.d) this;
        if (i4 == 1) {
            Chip chip = dVar.f4778q;
            chip.f1425n = true;
            chip.refreshDrawableState();
        }
        q(i4, 8);
        return true;
    }

    public final void q(int i4, int i5) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i4 == Integer.MIN_VALUE || !this.f3720h.isEnabled() || (parent = (view = this.f3721i).getParent()) == null) {
            return;
        }
        if (i4 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i5);
            o oVarN = n(i4);
            accessibilityEventObtain.getText().add(oVarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = oVarN.f3144a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            t.a(accessibilityEventObtain, view, i4);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i5);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
