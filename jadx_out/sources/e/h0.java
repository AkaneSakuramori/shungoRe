package e;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import i.h1;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f1870b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f1871c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1872d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f1873e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f1874f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f1875g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n.k f1876h = new n.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f1877a = new Object[2];

    public i.q a(Context context, AttributeSet attributeSet) {
        return new i.q(context, attributeSet);
    }

    public i.s b(Context context, AttributeSet attributeSet) {
        return new i.s(context, attributeSet, com.shungo.app.R.attr.buttonStyle);
    }

    public i.t c(Context context, AttributeSet attributeSet) {
        return new i.t(context, attributeSet, com.shungo.app.R.attr.checkboxStyle);
    }

    public i.i0 d(Context context, AttributeSet attributeSet) {
        return new i.i0(context, attributeSet);
    }

    public h1 e(Context context, AttributeSet attributeSet) {
        return new h1(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        n.k kVar = f1876h;
        Constructor constructor = (Constructor) kVar.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1870b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1877a);
    }

    public final void g(TextView textView, String str) {
        if (textView != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
