package q3;

import j3.p;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f3895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f3898d;

    public c(CharSequence charSequence, int i4, int i5, k kVar) {
        c3.h.b0(charSequence, "input");
        this.f3895a = charSequence;
        this.f3896b = i4;
        this.f3897c = i5;
        this.f3898d = kVar;
    }

    @Override // p3.c
    public final Iterator iterator() {
        return new b(this);
    }
}
