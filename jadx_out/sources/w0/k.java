package w0;

import a4.e0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o.g f4877a = new o.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f4878b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e0 f4879c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static e0 b() {
        e0 e0Var = new e0();
        f4879c = e0Var;
        o.g gVar = f4877a;
        gVar.getClass();
        if (o.f.f3588f.S(gVar, null, e0Var)) {
            o.f.b(gVar);
        }
        return f4879c;
    }

    public static void c(Context context, boolean z4) {
        j jVarA;
        int i4;
        if (z4 || f4879c == null) {
            synchronized (f4878b) {
                if (!z4) {
                    try {
                        if (f4879c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 28 && i5 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i6 = 0;
                    boolean z5 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z6 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                jVarA = j.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            jVarA = null;
                        }
                        if (jVarA != null && jVarA.f4875c == jA && (i4 = jVarA.f4874b) != 2) {
                            i6 = i4;
                        } else if (z5) {
                            i6 = 1;
                        } else if (z6) {
                            i6 = 2;
                        }
                        if (z4 && z6 && i6 != 1) {
                            i6 = 2;
                        }
                        j jVar = new j(1, (jVarA == null || jVarA.f4874b != 2 || i6 != 1 || length >= jVarA.f4876d) ? i6 : 3, jA, length2);
                        if (jVarA == null || !jVarA.equals(jVar)) {
                            try {
                                jVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
