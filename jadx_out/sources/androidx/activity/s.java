package androidx.activity;

import androidx.fragment.app.c0;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class s extends k3.g implements j3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(z zVar, int i4) {
        super(0);
        this.f324c = i4;
        this.f325d = zVar;
    }

    @Override // j3.a
    public final /* bridge */ /* synthetic */ Object a() {
        z2.f fVar = z2.f.f5511a;
        switch (this.f324c) {
            case 0:
                b();
                break;
            case 1:
                b();
                break;
            default:
                b();
                break;
        }
        return fVar;
    }

    public final void b() {
        Object objPrevious;
        int i4 = this.f324c;
        z zVar = this.f325d;
        switch (i4) {
            case 0:
                zVar.b();
                break;
            case 1:
                a3.i iVar = zVar.f338b;
                iVar.getClass();
                ListIterator listIterator = iVar.listIterator(iVar.f71d);
                while (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                    if (((c0) objPrevious).f709a) {
                        zVar.f339c = null;
                        break;
                    }
                }
                objPrevious = null;
                zVar.f339c = null;
                break;
            default:
                zVar.b();
                break;
        }
    }
}
