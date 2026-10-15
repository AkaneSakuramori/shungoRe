package androidx.emoji2.text;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f628a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f633f;

    public r(w wVar) {
        this.f629b = wVar;
        this.f630c = wVar;
    }

    public final int a(int i4) {
        SparseArray sparseArray = this.f630c.f649a;
        w wVar = sparseArray == null ? null : (w) sparseArray.get(i4);
        int i5 = 1;
        int i6 = 2;
        if (this.f628a == 2) {
            if (wVar != null) {
                this.f630c = wVar;
                this.f633f++;
            } else if (i4 == 65038) {
                b();
            } else if (i4 != 65039) {
                w wVar2 = this.f630c;
                if (wVar2.f650b != null) {
                    i6 = 3;
                    if (this.f633f != 1) {
                        this.f631d = wVar2;
                        b();
                    } else if (c()) {
                        this.f631d = this.f630c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i5 = i6;
        } else if (wVar == null) {
            b();
        } else {
            this.f628a = 2;
            this.f630c = wVar;
            this.f633f = 1;
            i5 = i6;
        }
        this.f632e = i4;
        return i5;
    }

    public final void b() {
        this.f628a = 1;
        this.f630c = this.f629b;
        this.f633f = 0;
    }

    public final boolean c() {
        q0.a aVarC = this.f630c.f650b.c();
        int iA = aVarC.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarC.f3879d).get(iA + aVarC.f3876a) == 0) || this.f632e == 65039;
    }
}
