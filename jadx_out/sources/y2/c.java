package y2;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends c3.h implements x2.c, Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ArrayList f5374o = new ArrayList(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f5375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f5376q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f5379l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f5381n;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f5377j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f5378k = new h();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f5380m = f5374o;

    static {
        String string = UUID.randomUUID().toString();
        f5375p = string;
        f5376q = String.format("__RET=$?;echo %1$s;echo %1$s >&2;echo $__RET;unset __RET\n", string).getBytes(StandardCharsets.UTF_8);
    }

    public final h Q2() {
        ArrayList arrayList = this.f5380m;
        boolean z4 = arrayList == f5374o;
        List list = this.f5379l;
        h hVar = this.f5378k;
        hVar.f5393j = list;
        hVar.f5394k = z4 ? null : arrayList;
        if (z4 && this.f5381n.f5401e) {
            hVar.f5394k = list;
        }
        if (list != null && list == hVar.f5394k) {
            if (r.f5411a == null) {
                r.f5411a = Collections.synchronizedCollection(e.a()).getClass();
            }
            if (!r.f5411a.isInstance(list)) {
                List listSynchronizedList = Collections.synchronizedList(hVar.f5393j);
                hVar.f5393j = listSynchronizedList;
                hVar.f5394k = listSynchronizedList;
            }
        }
        try {
            try {
                this.f5381n.h(this);
                close();
                hVar.f5393j = this.f5379l;
                if (z4) {
                    arrayList = null;
                }
                hVar.f5394k = arrayList;
                return hVar;
            } catch (IOException e5) {
                if (e5 instanceof n) {
                    h hVar2 = h.f5392m;
                    close();
                    hVar.f5393j = this.f5379l;
                    if (z4) {
                        arrayList = null;
                    }
                    hVar.f5394k = arrayList;
                    return hVar2;
                }
                Log.d("LIBSU", "", e5);
                h hVar3 = h.f5391l;
                close();
                hVar.f5393j = this.f5379l;
                if (z4) {
                    arrayList = null;
                }
                hVar.f5394k = arrayList;
                return hVar3;
            }
        } catch (Throwable th) {
            close();
            hVar.f5393j = this.f5379l;
            if (z4) {
                arrayList = null;
            }
            hVar.f5394k = arrayList;
            throw th;
        }
    }

    public final void R2(l lVar, k kVar, k kVar2) throws IOException {
        ExecutorService executorService = x2.d.f4929b;
        h hVar = this.f5378k;
        Future futureSubmit = executorService.submit(new o(kVar, hVar.f5393j, 1));
        Future futureSubmit2 = executorService.submit(new o(kVar2, hVar.f5394k, 0));
        Iterator it = this.f5377j.iterator();
        while (it.hasNext()) {
            for (String str : ((b) it.next()).f5373b) {
                lVar.write(str.getBytes(StandardCharsets.UTF_8));
                lVar.write(10);
            }
        }
        lVar.write(f5376q);
        lVar.flush();
        try {
            ((Integer) futureSubmit.get()).intValue();
            futureSubmit2.get();
        } catch (InterruptedException | ExecutionException e5) {
            throw ((InterruptedIOException) new InterruptedIOException().initCause(e5));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f5377j.iterator();
        while (it.hasNext()) {
            ((b) it.next()).getClass();
        }
    }
}
