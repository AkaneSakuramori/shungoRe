package f2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f2122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f2123d;

    public p(ArrayList arrayList, Matrix matrix) {
        this.f2122c = arrayList;
        this.f2123d = matrix;
    }

    @Override // f2.v
    public final void a(Matrix matrix, e2.a aVar, int i4, Canvas canvas) {
        Iterator it = this.f2122c.iterator();
        while (it.hasNext()) {
            ((v) it.next()).a(this.f2123d, aVar, i4, canvas);
        }
    }
}
