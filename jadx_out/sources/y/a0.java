package y;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5020b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5021c;

    public a0(Context context) {
        this.f5021c = context;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f5020b.iterator();
    }
}
