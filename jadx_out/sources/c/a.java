package c;

import android.os.Bundle;
import c3.h;
import j0.o;
import j0.r;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import m2.q;
import p2.s;
import w3.f;
import x3.m;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1137a;

    public /* synthetic */ a(Object obj) {
        this.f1137a = obj;
    }

    public o a(int i4) {
        return null;
    }

    public Object b(q qVar, Type type) {
        return ((s) this.f1137a).f3825b.b(qVar, type);
    }

    public o c(int i4) {
        return null;
    }

    public boolean d(int i4, int i5, Bundle bundle) {
        return false;
    }

    public /* synthetic */ a(int i4) {
        if (i4 == 4) {
            this.f1137a = new LinkedHashSet();
            return;
        }
        TimeUnit timeUnit = TimeUnit.MINUTES;
        h.b0(timeUnit, "timeUnit");
        this.f1137a = new m(f.f4914i, timeUnit);
    }

    public a() {
        this.f1137a = new r(this);
    }
}
