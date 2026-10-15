package androidx.activity;

import androidx.fragment.app.c0;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class r extends k3.g implements j3.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(z zVar, int i4) {
        super(1);
        this.f292c = i4;
        this.f293d = zVar;
    }

    public final void b(b bVar) {
        int i4 = this.f292c;
        Object obj = null;
        z zVar = this.f293d;
        switch (i4) {
            case 0:
                c3.h.b0(bVar, "backEvent");
                a3.i iVar = zVar.f338b;
                iVar.getClass();
                ListIterator listIterator = iVar.listIterator(iVar.f71d);
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((c0) objPrevious).f709a) {
                        obj = objPrevious;
                        zVar.f339c = (c0) obj;
                        break;
                    }
                }
                zVar.f339c = (c0) obj;
                break;
            default:
                c3.h.b0(bVar, "backEvent");
                a3.i iVar2 = zVar.f338b;
                iVar2.getClass();
                ListIterator listIterator2 = iVar2.listIterator(iVar2.f71d);
                while (listIterator2.hasPrevious()) {
                    Object objPrevious2 = listIterator2.previous();
                    if (((c0) objPrevious2).f709a) {
                        obj = objPrevious2;
                        break;
                    }
                }
                break;
        }
    }

    @Override // j3.l
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        z2.f fVar = z2.f.f5511a;
        switch (this.f292c) {
            case 0:
                b((b) obj);
                break;
            default:
                b((b) obj);
                break;
        }
        return fVar;
    }
}
