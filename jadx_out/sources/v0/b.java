package v0;

import androidx.lifecycle.q0;
import androidx.lifecycle.r;
import c3.h;
import e.c;
import java.io.PrintWriter;
import n.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f4772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f4773k;

    public b(r rVar, q0 q0Var) {
        this.f4772j = rVar;
        c cVar = new c(q0Var, a.f4770d, 0);
        String canonicalName = a.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f4773k = (a) cVar.a(a.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
    }

    public final void Q2(String str, PrintWriter printWriter) {
        l lVar = this.f4773k.f4771c;
        if (lVar.f3528d > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (lVar.f3528d <= 0) {
                return;
            }
            defpackage.a.n(lVar.f3527c[0]);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(lVar.f3526b[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        r rVar = this.f4772j;
        if (rVar == null) {
            sb.append("null");
        } else {
            String simpleName = rVar.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = rVar.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(rVar)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
