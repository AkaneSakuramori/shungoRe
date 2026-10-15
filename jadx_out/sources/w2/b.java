package w2;

import android.content.Context;
import android.util.Log;
import c3.e;
import c3.h;
import f4.i;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import t3.b0;
import t3.c0;
import t3.d0;
import t3.u;
import x3.j;
import z2.f;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f4889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f4891c;

    public b(Boolean bool, e eVar, Context context) {
        this.f4889a = bool;
        this.f4890b = eVar;
        this.f4891c = context;
    }

    public final void a(j jVar, IOException iOException) {
        h.b0(jVar, "call");
        Log.e("Shungo", "HTTP request error !");
        String message = iOException.getMessage();
        if (message != null) {
            Log.e("Shungo", message);
        }
        this.f4890b.b(null);
    }

    public final void b(j jVar, b0 b0Var) throws IllegalAccessException, IOException, InvocationTargetException {
        u uVarR;
        Charset charsetA;
        f fVar;
        boolean zI = h.I(this.f4889a, Boolean.FALSE);
        d0 d0Var = b0Var.f4313h;
        String str = null;
        if (!zI && b0Var.f4310e == 200) {
            if (d0Var != null) {
                h.p2(this.f4891c, d0Var, "data.json");
                fVar = f.f5511a;
            } else {
                fVar = null;
            }
            if (fVar == null) {
                throw new IOException("Failed to download file: response body is null");
            }
        } else if (d0Var != null) {
            i iVar = ((c0) d0Var).f4336d;
            try {
                c0 c0Var = (c0) d0Var;
                int i4 = c0Var.f4334b;
                Object obj = c0Var.f4337e;
                switch (i4) {
                    case 0:
                        uVarR = (u) obj;
                        break;
                    default:
                        String str2 = (String) obj;
                        if (str2 == null) {
                            uVarR = null;
                        } else {
                            Pattern pattern = u.f4429c;
                            try {
                                uVarR = f2.e.r(str2);
                            } catch (IllegalArgumentException unused) {
                                uVarR = null;
                            }
                        }
                        break;
                }
                if (uVarR == null || (charsetA = uVarR.a(q3.a.f3886a)) == null) {
                    charsetA = q3.a.f3886a;
                }
                String strY = iVar.y(u3.b.r(iVar, charsetA));
                h.k0(iVar, null);
                str = strY;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    h.k0(iVar, th);
                    throw th2;
                }
            }
        }
        this.f4890b.b(new a(str, b0Var));
    }
}
