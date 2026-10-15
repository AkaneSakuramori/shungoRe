package o2;

import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m2.b0;
import m2.c0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements c0, Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f3619d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f3620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f3621c;

    static {
        f fVar = new f();
        fVar.f3620b = Collections.emptyList();
        fVar.f3621c = Collections.emptyList();
        f3619d = fVar;
    }

    public static boolean c(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // m2.c0
    public final b0 a(m2.m mVar, TypeToken typeToken) {
        boolean z4;
        boolean z5;
        boolean zC = c(typeToken.getRawType());
        if (zC) {
            z4 = true;
        } else {
            b(true);
            z4 = false;
        }
        if (zC) {
            z5 = true;
        } else {
            b(false);
            z5 = false;
        }
        if (z4 || z5) {
            return new e(this, z5, z4, mVar, typeToken);
        }
        return null;
    }

    public final void b(boolean z4) {
        Iterator it = (z4 ? this.f3620b : this.f3621c).iterator();
        if (it.hasNext()) {
            defpackage.a.n(it.next());
            throw null;
        }
    }

    public final Object clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }
}
