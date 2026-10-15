package o2;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f3613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m2.m f3616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TypeToken f3617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3618f;

    public e(f fVar, boolean z4, boolean z5, m2.m mVar, TypeToken typeToken) {
        this.f3618f = fVar;
        this.f3614b = z4;
        this.f3615c = z5;
        this.f3616d = mVar;
        this.f3617e = typeToken;
    }

    @Override // m2.b0
    public final Object b(t2.b bVar) throws t2.d {
        if (this.f3614b) {
            bVar.Y();
            return null;
        }
        b0 b0VarD = this.f3613a;
        if (b0VarD == null) {
            b0VarD = this.f3616d.d(this.f3618f, this.f3617e);
            this.f3613a = b0VarD;
        }
        return b0VarD.b(bVar);
    }

    @Override // m2.b0
    public final void c(t2.c cVar, Object obj) throws IOException {
        if (this.f3615c) {
            cVar.G();
            return;
        }
        b0 b0VarD = this.f3613a;
        if (b0VarD == null) {
            b0VarD = this.f3616d.d(this.f3618f, this.f3617e);
            this.f3613a = b0VarD;
        }
        b0VarD.c(cVar, obj);
    }
}
