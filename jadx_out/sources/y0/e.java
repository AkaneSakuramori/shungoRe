package y0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f5123d;

    public /* synthetic */ e(k kVar, ArrayList arrayList, int i4) {
        this.f5121b = i4;
        this.f5123d = kVar;
        this.f5122c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c5;
        int i4 = this.f5121b;
        k kVar = this.f5123d;
        ArrayList<j> arrayList = this.f5122c;
        switch (i4) {
            case 0:
                for (j jVar : arrayList) {
                    d1 d1Var = jVar.f5164a;
                    kVar.getClass();
                    View view = d1Var.f5103a;
                    int i5 = jVar.f5167d - jVar.f5165b;
                    int i6 = jVar.f5168e - jVar.f5166c;
                    if (i5 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i6 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    kVar.f5183p.add(d1Var);
                    viewPropertyAnimatorAnimate.setDuration(kVar.f5206e).setListener(new g(kVar, d1Var, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                }
                arrayList.clear();
                kVar.f5180m.remove(arrayList);
                break;
            case 1:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    kVar.getClass();
                    d1 d1Var2 = iVar.f5157a;
                    View view2 = d1Var2 == null ? null : d1Var2.f5103a;
                    d1 d1Var3 = iVar.f5158b;
                    View view3 = d1Var3 != null ? d1Var3.f5103a : null;
                    ArrayList arrayList2 = kVar.f5185r;
                    long j4 = kVar.f5207f;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j4);
                        arrayList2.add(iVar.f5157a);
                        duration.translationX(iVar.f5161e - iVar.f5159c);
                        duration.translationY(iVar.f5162f - iVar.f5160d);
                        duration.alpha(0.0f).setListener(new h(kVar, iVar, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                        arrayList2.add(iVar.f5158b);
                        c5 = 0;
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j4).alpha(1.0f).setListener(new h(kVar, iVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                    } else {
                        c5 = 0;
                    }
                }
                arrayList.clear();
                kVar.f5181n.remove(arrayList);
                break;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    d1 d1Var4 = (d1) it2.next();
                    kVar.getClass();
                    View view4 = d1Var4.f5103a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                    kVar.f5182o.add(d1Var4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(kVar.f5204c).setListener(new f(kVar, d1Var4, view4, viewPropertyAnimatorAnimate3, 1)).start();
                }
                arrayList.clear();
                kVar.f5179l.remove(arrayList);
                break;
        }
    }
}
