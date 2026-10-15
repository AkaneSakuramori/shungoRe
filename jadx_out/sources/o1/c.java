package o1;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3605e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f3603c;
        return timeInterpolator != null ? timeInterpolator : a.f3596b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3601a == cVar.f3601a && this.f3602b == cVar.f3602b && this.f3604d == cVar.f3604d && this.f3605e == cVar.f3605e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f3601a;
        long j5 = this.f3602b;
        return ((((a().getClass().hashCode() + (((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31)) * 31) + this.f3604d) * 31) + this.f3605e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3601a + " duration: " + this.f3602b + " interpolator: " + a().getClass() + " repeatCount: " + this.f3604d + " repeatMode: " + this.f3605e + "}\n";
    }
}
