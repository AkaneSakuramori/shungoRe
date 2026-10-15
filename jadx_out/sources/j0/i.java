package j0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f3131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f3132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f3133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f3134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f3135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i f3136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i f3137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i f3138l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f3141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f3142d;

    static {
        new i(1);
        new i(2);
        new i(4);
        new i(8);
        f3131e = new i(16);
        new i(32);
        new i(64);
        new i(128);
        new i(256, u.class);
        new i(512, u.class);
        new i(1024, v.class);
        new i(2048, v.class);
        f3132f = new i(4096);
        f3133g = new i(8192);
        new i(16384);
        new i(32768);
        new i(65536);
        new i(131072, z.class);
        f3134h = new i(262144);
        f3135i = new i(524288);
        f3136j = new i(1048576);
        new i(2097152, a0.class);
        int i4 = Build.VERSION.SDK_INT;
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, x.class);
        f3137k = new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f3138l = new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new i(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new i(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new i(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new i(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, y.class);
        new i(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, w.class);
        new i(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new i(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new i(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new i(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new i(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new i(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new i(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new i(i4 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new i(i4 >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public i(int i4) {
        this(null, i4, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f3139a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        Object obj2 = ((i) obj).f3139a;
        Object obj3 = this.f3139a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f3139a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = o.d(this.f3140b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f3139a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public i(int i4, Class cls) {
        this(null, i4, null, null, cls);
    }

    public i(Object obj, int i4, String str, b0 b0Var, Class cls) {
        this.f3140b = i4;
        this.f3142d = b0Var;
        if (obj == null) {
            this.f3139a = new AccessibilityNodeInfo.AccessibilityAction(i4, str);
        } else {
            this.f3139a = obj;
        }
        this.f3141c = cls;
    }
}
