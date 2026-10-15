package i0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c2 f2927a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f2929c;

    public j0(View view, s sVar) {
        this.f2928b = view;
        this.f2929c = sVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        c2 c2VarG = c2.g(view, windowInsets);
        int i4 = Build.VERSION.SDK_INT;
        s sVar = this.f2929c;
        if (i4 < 30) {
            k0.a(windowInsets, this.f2928b);
            if (c2VarG.equals(this.f2927a)) {
                return sVar.q(view, c2VarG).f();
            }
        }
        this.f2927a = c2VarG;
        c2 c2VarQ = sVar.q(view, c2VarG);
        if (i4 >= 30) {
            return c2VarQ.f();
        }
        WeakHashMap weakHashMap = v0.f2983a;
        i0.c(view);
        return c2VarQ.f();
    }
}
