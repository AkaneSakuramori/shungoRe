package n3;

import c3.h;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3567d;

    public a(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f3565b = i4;
        this.f3566c = h.Z0(i4, i5, i6);
        this.f3567d = i6;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f3565b != aVar.f3565b || this.f3566c != aVar.f3566c || this.f3567d != aVar.f3567d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f3565b * 31) + this.f3566c) * 31) + this.f3567d;
    }

    public boolean isEmpty() {
        int i4 = this.f3567d;
        int i5 = this.f3566c;
        int i6 = this.f3565b;
        if (i4 > 0) {
            if (i6 <= i5) {
                return false;
            }
        } else if (i6 >= i5) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f3565b, this.f3566c, this.f3567d);
    }

    public String toString() {
        StringBuilder sb;
        int i4 = this.f3566c;
        int i5 = this.f3565b;
        int i6 = this.f3567d;
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append("..");
            sb.append(i4);
            sb.append(" step ");
            sb.append(i6);
        } else {
            sb = new StringBuilder();
            sb.append(i5);
            sb.append(" downTo ");
            sb.append(i4);
            sb.append(" step ");
            sb.append(-i6);
        }
        return sb.toString();
    }
}
