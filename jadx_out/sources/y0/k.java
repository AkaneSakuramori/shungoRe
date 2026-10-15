package y0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f5173s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f5175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f5176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f5177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f5178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f5179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f5180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f5181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f5182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f5183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f5184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f5185r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((d1) arrayList.get(size)).f5103a.animate().cancel();
        }
    }

    @Override // y0.l0
    public final boolean a(d1 d1Var, d1 d1Var2, k0 k0Var, k0 k0Var2) {
        int i4;
        int i5;
        int i6 = k0Var.f5186a;
        int i7 = k0Var.f5187b;
        if (d1Var2.q()) {
            int i8 = k0Var.f5186a;
            i5 = k0Var.f5187b;
            i4 = i8;
        } else {
            i4 = k0Var2.f5186a;
            i5 = k0Var2.f5187b;
        }
        if (d1Var == d1Var2) {
            return g(d1Var, i6, i7, i4, i5);
        }
        View view = d1Var.f5103a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(d1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(d1Var2);
        float f5 = -((int) ((i4 - i6) - translationX));
        View view2 = d1Var2.f5103a;
        view2.setTranslationX(f5);
        view2.setTranslationY(-((int) ((i5 - i7) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f5178k;
        i iVar = new i();
        iVar.f5157a = d1Var;
        iVar.f5158b = d1Var2;
        iVar.f5159c = i6;
        iVar.f5160d = i7;
        iVar.f5161e = i4;
        iVar.f5162f = i5;
        arrayList.add(iVar);
        return true;
    }

    @Override // y0.l0
    public final void d(d1 d1Var) {
        View view = d1Var.f5103a;
        view.animate().cancel();
        ArrayList arrayList = this.f5177j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) arrayList.get(size)).f5164a == d1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(d1Var);
                arrayList.remove(size);
            }
        }
        j(d1Var, this.f5178k);
        if (this.f5175h.remove(d1Var)) {
            view.setAlpha(1.0f);
            c(d1Var);
        }
        if (this.f5176i.remove(d1Var)) {
            view.setAlpha(1.0f);
            c(d1Var);
        }
        ArrayList arrayList2 = this.f5181n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(d1Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f5180m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((j) arrayList5.get(size4)).f5164a == d1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(d1Var);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f5179l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(d1Var)) {
                view.setAlpha(1.0f);
                c(d1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f5184q.remove(d1Var);
        this.f5182o.remove(d1Var);
        this.f5185r.remove(d1Var);
        this.f5183p.remove(d1Var);
        i();
    }

    @Override // y0.l0
    public final void e() {
        ArrayList arrayList = this.f5177j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) arrayList.get(size);
            View view = jVar.f5164a.f5103a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(jVar.f5164a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f5175h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((d1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f5176i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            d1 d1Var = (d1) arrayList3.get(size3);
            d1Var.f5103a.setAlpha(1.0f);
            c(d1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f5178k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            i iVar = (i) arrayList4.get(size4);
            d1 d1Var2 = iVar.f5157a;
            if (d1Var2 != null) {
                k(iVar, d1Var2);
            }
            d1 d1Var3 = iVar.f5158b;
            if (d1Var3 != null) {
                k(iVar, d1Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f5180m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList6.get(size6);
                    View view2 = jVar2.f5164a.f5103a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(jVar2.f5164a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f5179l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    d1 d1Var4 = (d1) arrayList8.get(size8);
                    d1Var4.f5103a.setAlpha(1.0f);
                    c(d1Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f5181n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    i iVar2 = (i) arrayList10.get(size10);
                    d1 d1Var5 = iVar2.f5157a;
                    if (d1Var5 != null) {
                        k(iVar2, d1Var5);
                    }
                    d1 d1Var6 = iVar2.f5158b;
                    if (d1Var6 != null) {
                        k(iVar2, d1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f5184q);
            h(this.f5183p);
            h(this.f5182o);
            h(this.f5185r);
            ArrayList arrayList11 = this.f5203b;
            if (arrayList11.size() > 0) {
                defpackage.a.n(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // y0.l0
    public final boolean f() {
        return (this.f5176i.isEmpty() && this.f5178k.isEmpty() && this.f5177j.isEmpty() && this.f5175h.isEmpty() && this.f5183p.isEmpty() && this.f5184q.isEmpty() && this.f5182o.isEmpty() && this.f5185r.isEmpty() && this.f5180m.isEmpty() && this.f5179l.isEmpty() && this.f5181n.isEmpty()) ? false : true;
    }

    public final boolean g(d1 d1Var, int i4, int i5, int i6, int i7) {
        View view = d1Var.f5103a;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i5 + ((int) d1Var.f5103a.getTranslationY());
        l(d1Var);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            c(d1Var);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX(-i8);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        ArrayList arrayList = this.f5177j;
        j jVar = new j();
        jVar.f5164a = d1Var;
        jVar.f5165b = translationX;
        jVar.f5166c = translationY;
        jVar.f5167d = i6;
        jVar.f5168e = i7;
        arrayList.add(jVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f5203b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            defpackage.a.n(arrayList.get(0));
            throw null;
        }
    }

    public final void j(d1 d1Var, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i iVar = (i) arrayList.get(size);
            if (k(iVar, d1Var) && iVar.f5157a == null && iVar.f5158b == null) {
                arrayList.remove(iVar);
            }
        }
    }

    public final boolean k(i iVar, d1 d1Var) {
        if (iVar.f5158b == d1Var) {
            iVar.f5158b = null;
        } else {
            if (iVar.f5157a != d1Var) {
                return false;
            }
            iVar.f5157a = null;
        }
        d1Var.f5103a.setAlpha(1.0f);
        View view = d1Var.f5103a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(d1Var);
        return true;
    }

    public final void l(d1 d1Var) {
        if (f5173s == null) {
            f5173s = new ValueAnimator().getInterpolator();
        }
        d1Var.f5103a.animate().setInterpolator(f5173s);
        d(d1Var);
    }
}
