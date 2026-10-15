package f0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import i.r;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n.f f2013a = new n.f(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f2014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f2016d;

    static {
        j jVar = new j();
        jVar.f2023a = "fonts-androidx";
        jVar.f2024b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), jVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2014b = threadPoolExecutor;
        f2015c = new Object();
        f2016d = new k();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e A[EDGE_INSN: B:10:0x001e->B:26:0x003f BREAK  A[LOOP:0: B:18:0x002e->B:24:0x003b]] */
    public static f a(String str, Context context, r rVar, int i4) throws Throwable {
        n.f fVar = f2013a;
        Typeface typeface = (Typeface) fVar.a(str);
        if (typeface != null) {
            return new f(typeface);
        }
        try {
            e.i iVarA = c.a(context, rVar);
            int i5 = iVarA.f1878b;
            int i6 = 1;
            Object obj = iVarA.f1879c;
            if (i5 == 0) {
                h[] hVarArr = (h[]) obj;
                if (hVarArr != null && hVarArr.length != 0) {
                    int length = hVarArr.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            i6 = 0;
                            break;
                        }
                        int i8 = hVarArr[i7].f2021e;
                        if (i8 != 0) {
                            if (i8 >= 0) {
                                i6 = i8;
                                break;
                            }
                            i6 = -3;
                            break;
                        }
                        i7++;
                    }
                }
            } else {
                if (i5 != 1) {
                    i6 = -3;
                    break;
                }
                i6 = -2;
            }
            if (i6 != 0) {
                return new f(i6);
            }
            Typeface typefaceX = b0.g.f1088a.x(context, (h[]) obj, i4);
            if (typefaceX == null) {
                return new f(-3);
            }
            fVar.b(str, typefaceX);
            return new f(typefaceX);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        }
    }
}
