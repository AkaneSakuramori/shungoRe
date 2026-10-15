package c2;

import android.graphics.Typeface;
import c3.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f1237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f1238k;

    public b(d dVar, h hVar) {
        this.f1238k = dVar;
        this.f1237j = hVar;
    }

    @Override // c3.h
    public final void G1(int i4) {
        this.f1238k.f1255m = true;
        this.f1237j.G1(i4);
    }

    @Override // c3.h
    public final void H1(Typeface typeface) {
        d dVar = this.f1238k;
        dVar.f1256n = Typeface.create(typeface, dVar.f1245c);
        dVar.f1255m = true;
        this.f1237j.I1(dVar.f1256n, false);
    }
}
