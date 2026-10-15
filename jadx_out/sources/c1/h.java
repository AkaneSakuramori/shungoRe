package c1;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1174c;

    public /* synthetic */ h(Object obj, int i4, Object obj2) {
        this.f1172a = i4;
        this.f1174c = obj;
        this.f1173b = obj2;
    }

    @Override // c1.p
    public final void d(q qVar) {
        int i4 = this.f1172a;
        Object obj = this.f1173b;
        switch (i4) {
            case 0:
                c0 c0Var = y.f1231a;
                c0Var.i((View) obj, 1.0f);
                c0Var.getClass();
                qVar.v(this);
                break;
            case 1:
                ((ArrayList) ((n.b) obj).getOrDefault(((s) this.f1174c).f1218c, null)).remove(qVar);
                qVar.v(this);
                break;
            default:
                ((q) obj).y();
                qVar.v(this);
                break;
        }
    }
}
