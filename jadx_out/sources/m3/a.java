package m3;

import c3.h;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l3.a {
    @Override // l3.a
    public final Random a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        h.a0(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
