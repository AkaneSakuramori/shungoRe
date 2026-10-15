package b0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import e.n0;
import i.a0;
import i.r;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f1088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n.f f1089b;

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f1088a = new k(10);
        } else if (i4 >= 28) {
            f1088a = new j();
        } else {
            f1088a = new i();
        }
        f1089b = new n.f(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    public static Typeface a(Context context, a0.f fVar, Resources resources, int i4, String str, int i5, int i6, c3.h hVar, boolean z4) {
        Typeface typefaceW;
        Typeface typefaceCreate;
        Typeface typeface;
        if (fVar instanceof a0.i) {
            a0.i iVar = (a0.i) fVar;
            String str2 = iVar.f26d;
            typefaceW = null;
            int i7 = 0;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (hVar != null) {
                    hVar.P(typefaceCreate);
                }
                return typefaceCreate;
            }
            int i8 = 1;
            boolean z5 = !z4 ? hVar != null : iVar.f25c != 0;
            int i9 = z4 ? iVar.f24b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            n0 n0Var = new n0(hVar);
            r rVar = iVar.f23a;
            a0 a0Var = new a0(n0Var, 5, handler);
            if (z5) {
                n.f fVar2 = f0.g.f2013a;
                String str3 = ((String) rVar.f2760g) + "-" + i6;
                typeface = (Typeface) f0.g.f2013a.a(str3);
                if (typeface != null) {
                    a0Var.v(new f0.f(typeface));
                    typefaceW = typeface;
                } else if (i9 == -1) {
                    f0.f fVarA = f0.g.a(str3, context, rVar, i6);
                    a0Var.v(fVarA);
                    typefaceW = fVarA.f2011a;
                } else {
                    try {
                        try {
                            try {
                                f0.f fVar3 = (f0.f) f0.g.f2014b.submit(new f0.d(str3, context, rVar, i6, 0)).get(i9, TimeUnit.MILLISECONDS);
                                a0Var.v(fVar3);
                                typefaceW = fVar3.f2011a;
                            } catch (InterruptedException e5) {
                                throw e5;
                            }
                        } catch (ExecutionException e6) {
                            throw new RuntimeException(e6);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        a0Var.v(new f0.f(-3));
                    }
                }
            } else {
                n.f fVar4 = f0.g.f2013a;
                String str4 = ((String) rVar.f2760g) + "-" + i6;
                typeface = (Typeface) f0.g.f2013a.a(str4);
                if (typeface != null) {
                    a0Var.v(new f0.f(typeface));
                    typefaceW = typeface;
                } else {
                    f0.e eVar = new f0.e(i7, a0Var);
                    synchronized (f0.g.f2015c) {
                        try {
                            n.k kVar = f0.g.f2016d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(eVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(eVar);
                                kVar.put(str4, arrayList2);
                                f0.g.f2014b.execute(new f0.a(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new f0.d(str4, context, rVar, i6, 1), new f0.e(i8, str4), 2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            typefaceW = f1088a.w(context, (a0.g) fVar, resources, i6);
            if (hVar != null) {
                if (typefaceW != null) {
                    hVar.P(typefaceW);
                } else {
                    hVar.O(-3);
                }
            }
        }
        if (typefaceW != null) {
            f1089b.b(b(resources, i4, str, i5, i6), typefaceW);
        }
        return typefaceW;
    }

    public static String b(Resources resources, int i4, String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
    }
}
