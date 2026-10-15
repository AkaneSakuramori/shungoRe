package s;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f4169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f4170b;

    public static long a(f fVar, long j4) {
        p pVar = fVar.f4157d;
        if (pVar instanceof j) {
            return j4;
        }
        ArrayList arrayList = fVar.f4164k;
        int size = arrayList.size();
        long jMin = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) arrayList.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4157d != pVar) {
                    jMin = Math.min(jMin, a(fVar2, ((long) fVar2.f4159f) + j4));
                }
            }
        }
        if (fVar != pVar.f4195i) {
            return jMin;
        }
        long j5 = pVar.j();
        f fVar3 = pVar.f4194h;
        long j6 = j4 - j5;
        return Math.min(Math.min(jMin, a(fVar3, j6)), j6 - ((long) fVar3.f4159f));
    }

    public static long b(f fVar, long j4) {
        p pVar = fVar.f4157d;
        if (pVar instanceof j) {
            return j4;
        }
        ArrayList arrayList = fVar.f4164k;
        int size = arrayList.size();
        long jMax = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) arrayList.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f4157d != pVar) {
                    jMax = Math.max(jMax, b(fVar2, ((long) fVar2.f4159f) + j4));
                }
            }
        }
        if (fVar != pVar.f4194h) {
            return jMax;
        }
        long j5 = pVar.j();
        f fVar3 = pVar.f4195i;
        long j6 = j4 + j5;
        return Math.max(Math.max(jMax, b(fVar3, j6)), j6 - ((long) fVar3.f4159f));
    }
}
