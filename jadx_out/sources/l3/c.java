package l3;

import c3.h;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f3400d = new b(0);

    @Override // l3.a
    public final Random a() {
        Object obj = this.f3400d.get();
        h.a0(obj, "implStorage.get()");
        return (Random) obj;
    }
}
