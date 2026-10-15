package f0;

import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import e.n0;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2002e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i4) {
        this.f1999b = i4;
        this.f2002e = obj;
        this.f2000c = obj2;
        this.f2001d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        Object obj = this.f2002e;
        Object obj2 = this.f2000c;
        Object obj3 = this.f2001d;
        switch (this.f1999b) {
            case 0:
                Typeface typeface = (Typeface) obj3;
                c3.h hVar = (c3.h) ((n0) obj2).f1896c;
                if (hVar != null) {
                    hVar.H1(typeface);
                }
                break;
            case 1:
                ((e) ((h0.a) obj2)).b(obj3);
                break;
            case 2:
                try {
                    objCall = ((Callable) obj2).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) obj).post(new a(this, (h0.a) obj3, objCall, 1));
                break;
            default:
                if (((View) obj3) != null) {
                    ((p1.c) obj).getClass();
                }
                break;
        }
    }
}
