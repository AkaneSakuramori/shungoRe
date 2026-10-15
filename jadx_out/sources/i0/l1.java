package i0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.e f2935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f2937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2938d;

    public l1(r1.e eVar) {
        super(0);
        this.f2938d = new HashMap();
        this.f2935a = eVar;
    }

    public final o1 a(WindowInsetsAnimation windowInsetsAnimation) {
        o1 o1Var = (o1) this.f2938d.get(windowInsetsAnimation);
        if (o1Var == null) {
            o1Var = new o1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                o1Var.f2949a = new m1(windowInsetsAnimation);
            }
            this.f2938d.put(windowInsetsAnimation, o1Var);
        }
        return o1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        r1.e eVar = this.f2935a;
        a(windowInsetsAnimation);
        eVar.f4066b.setTranslationY(0.0f);
        this.f2938d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        r1.e eVar = this.f2935a;
        a(windowInsetsAnimation);
        View view = eVar.f4066b;
        int[] iArr = eVar.f4069e;
        view.getLocationOnScreen(iArr);
        eVar.f4067c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f2937c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2937c = arrayList2;
            this.f2936b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = x.j(list.get(size));
            o1 o1VarA = a(windowInsetsAnimationJ);
            o1VarA.f2949a.d(windowInsetsAnimationJ.getFraction());
            this.f2937c.add(o1VarA);
        }
        r1.e eVar = this.f2935a;
        c2 c2VarG = c2.g(null, windowInsets);
        eVar.a(c2VarG, this.f2936b);
        return c2VarG.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        r1.e eVar = this.f2935a;
        a(windowInsetsAnimation);
        i.a0 a0Var = new i.a0(bounds);
        View view = eVar.f4066b;
        int[] iArr = eVar.f4069e;
        view.getLocationOnScreen(iArr);
        int i4 = eVar.f4067c - iArr[1];
        eVar.f4068d = i4;
        view.setTranslationY(i4);
        x.m();
        return x.h(((b0.c) a0Var.f2519c).d(), ((b0.c) a0Var.f2520d).d());
    }
}
