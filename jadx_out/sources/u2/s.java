package u2;

import com.shungo.app.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class s extends e3.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(MainActivity mainActivity, c3.e eVar) {
        super(eVar);
        this.f4753f = mainActivity;
    }

    @Override // e3.a
    public final Object h(Object obj) {
        this.f4752e = obj;
        this.f4754g |= Integer.MIN_VALUE;
        return this.f4753f.n(this);
    }
}
