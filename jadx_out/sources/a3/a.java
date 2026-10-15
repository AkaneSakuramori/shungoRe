package a3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k3.g implements j3.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f57c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f58d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4, Object obj) {
        super(1);
        this.f57c = i4;
        this.f58d = obj;
    }

    @Override // j3.l
    public final Object e(Object obj) {
        int i4 = this.f57c;
        Object obj2 = this.f58d;
        switch (i4) {
            case 0:
                return obj == ((b) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
            default:
                n3.c cVar = (n3.c) obj;
                c3.h.b0(cVar, "it");
                return q3.l.p3((CharSequence) obj2, cVar);
            case 2:
                String str = (String) obj;
                c3.h.b0(str, "line");
                return defpackage.a.h(new StringBuilder(), (String) obj2, str);
        }
    }
}
