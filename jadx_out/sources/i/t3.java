package i;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t3 implements h.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h.o f2779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h.q f2780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2781d;

    public t3(Toolbar toolbar) {
        this.f2781d = toolbar;
    }

    @Override // h.c0
    public final void b(h.o oVar, boolean z4) {
    }

    @Override // h.c0
    public final void c() {
        if (this.f2780c != null) {
            h.o oVar = this.f2779b;
            if (oVar != null) {
                int size = oVar.f2431f.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (this.f2779b.getItem(i4) == this.f2780c) {
                        return;
                    }
                }
            }
            d(this.f2780c);
        }
    }

    @Override // h.c0
    public final boolean d(h.q qVar) {
        Toolbar toolbar = this.f2781d;
        KeyEvent.Callback callback = toolbar.f484j;
        if (callback instanceof g.d) {
            ((g.d) callback).d();
        }
        toolbar.removeView(toolbar.f484j);
        toolbar.removeView(toolbar.f483i);
        toolbar.f484j = null;
        ArrayList arrayList = toolbar.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2780c = null;
        toolbar.requestLayout();
        qVar.C = false;
        qVar.f2466n.p(false);
        toolbar.v();
        return true;
    }

    @Override // h.c0
    public final void g(Context context, h.o oVar) {
        h.q qVar;
        h.o oVar2 = this.f2779b;
        if (oVar2 != null && (qVar = this.f2780c) != null) {
            oVar2.d(qVar);
        }
        this.f2779b = oVar;
    }

    @Override // h.c0
    public final boolean i() {
        return false;
    }

    @Override // h.c0
    public final boolean j(h.i0 i0Var) {
        return false;
    }

    @Override // h.c0
    public final boolean k(h.q qVar) {
        Toolbar toolbar = this.f2781d;
        toolbar.c();
        ViewParent parent = toolbar.f483i.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f483i);
            }
            toolbar.addView(toolbar.f483i);
        }
        View actionView = qVar.getActionView();
        toolbar.f484j = actionView;
        this.f2780c = qVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f484j);
            }
            u3 u3VarH = Toolbar.h();
            u3VarH.f1771a = (toolbar.f489o & 112) | 8388611;
            u3VarH.f2795b = 2;
            toolbar.f484j.setLayoutParams(u3VarH);
            toolbar.addView(toolbar.f484j);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((u3) childAt.getLayoutParams()).f2795b != 2 && childAt != toolbar.f476b) {
                toolbar.removeViewAt(childCount);
                toolbar.F.add(childAt);
            }
        }
        toolbar.requestLayout();
        qVar.C = true;
        qVar.f2466n.p(false);
        KeyEvent.Callback callback = toolbar.f484j;
        if (callback instanceof g.d) {
            ((g.d) callback).a();
        }
        toolbar.v();
        return true;
    }
}
