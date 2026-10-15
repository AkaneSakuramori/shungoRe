package i0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.shungo.app.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f2894c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f2895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2896b;

    public c() {
        this(f2894c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2895a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public c.a b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.f2895a, view);
        if (accessibilityNodeProviderA != null) {
            return new c.a(accessibilityNodeProviderA);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2895a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, j0.o oVar) {
        this.f2895a.onInitializeAccessibilityNodeInfo(view, oVar.f3144a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2895a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2895a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i4, Bundle bundle) {
        boolean zB;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 < listEmptyList.size()) {
                j0.i iVar = (j0.i) listEmptyList.get(i5);
                if (iVar.a() == i4) {
                    j0.b0 b0Var = iVar.f3142d;
                    if (b0Var != null) {
                        Class cls = iVar.f3141c;
                        if (cls != null) {
                            try {
                                defpackage.a.n(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                                throw null;
                            } catch (Exception e5) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e5);
                            }
                        }
                        zB = b0Var.j(view);
                        break;
                    }
                } else {
                    i5++;
                }
            }
            zB = false;
            break;
        }
        if (!zB) {
            zB = b.b(this.f2895a, view, i4, bundle);
        }
        if (zB || i4 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zB;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i7 = 0; clickableSpanArr != null && i7 < clickableSpanArr.length; i7++) {
                if (clickableSpan.equals(clickableSpanArr[i7])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
            }
        }
        return z4;
    }

    public void h(View view, int i4) {
        this.f2895a.sendAccessibilityEvent(view, i4);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2895a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public c(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2895a = accessibilityDelegate;
        this.f2896b = new a(this);
    }
}
