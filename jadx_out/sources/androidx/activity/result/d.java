package androidx.activity.result;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c3.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c3.h f303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f304m;

    public /* synthetic */ d(g gVar, String str, c3.h hVar, int i4) {
        this.f301j = i4;
        this.f304m = gVar;
        this.f302k = str;
        this.f303l = hVar;
    }

    public final void Q2(Object obj) {
        int i4 = this.f301j;
        c3.h hVar = this.f303l;
        String str = this.f302k;
        g gVar = this.f304m;
        switch (i4) {
            case 0:
                Integer num = (Integer) gVar.f310b.get(str);
                if (num != null) {
                    gVar.f312d.add(str);
                    try {
                        gVar.b(num.intValue(), hVar, obj);
                        return;
                    } catch (Exception e5) {
                        gVar.f312d.remove(str);
                        throw e5;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + hVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                Integer num2 = (Integer) gVar.f310b.get(str);
                if (num2 != null) {
                    gVar.f312d.add(str);
                    try {
                        gVar.b(num2.intValue(), hVar, obj);
                        return;
                    } catch (Exception e6) {
                        gVar.f312d.remove(str);
                        throw e6;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + hVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }
}
