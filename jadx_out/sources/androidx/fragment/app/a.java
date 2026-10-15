package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0 f678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f680r;

    public a(i0 i0Var) {
        i0Var.B();
        t tVar = i0Var.f764p;
        if (tVar != null) {
            tVar.f884k.getClassLoader();
        }
        this.f663a = new ArrayList();
        this.f677o = false;
        this.f680r = -1;
        this.f678p = i0Var;
    }

    @Override // androidx.fragment.app.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f669g) {
            return true;
        }
        i0 i0Var = this.f678p;
        if (i0Var.f752d == null) {
            i0Var.f752d = new ArrayList();
        }
        i0Var.f752d.add(this);
        return true;
    }

    public final void b(p0 p0Var) {
        this.f663a.add(p0Var);
        p0Var.f842c = this.f664b;
        p0Var.f843d = this.f665c;
        p0Var.f844e = this.f666d;
        p0Var.f845f = this.f667e;
    }

    public final void c(int i4) {
        if (this.f669g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i4);
            }
            int size = this.f663a.size();
            for (int i5 = 0; i5 < size; i5++) {
                p0 p0Var = (p0) this.f663a.get(i5);
                q qVar = p0Var.f841b;
                if (qVar != null) {
                    qVar.f864r += i4;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p0Var.f841b + " to " + p0Var.f841b.f864r);
                    }
                }
            }
        }
    }

    public final int d(boolean z4) {
        if (this.f679q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new a1());
            e("  ", printWriter, true);
            printWriter.close();
        }
        this.f679q = true;
        boolean z5 = this.f669g;
        i0 i0Var = this.f678p;
        if (z5) {
            this.f680r = i0Var.f757i.getAndIncrement();
        } else {
            this.f680r = -1;
        }
        i0Var.v(this, z4);
        return this.f680r;
    }

    public final void e(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f670h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f680r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f679q);
            if (this.f668f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f668f));
            }
            if (this.f664b != 0 || this.f665c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f664b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f665c));
            }
            if (this.f666d != 0 || this.f667e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f666d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f667e));
            }
            if (this.f671i != 0 || this.f672j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f671i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f672j);
            }
            if (this.f673k != 0 || this.f674l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f673k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f674l);
            }
        }
        if (this.f663a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f663a.size();
        for (int i4 = 0; i4 < size; i4++) {
            p0 p0Var = (p0) this.f663a.get(i4);
            switch (p0Var.f840a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + p0Var.f840a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i4);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p0Var.f841b);
            if (z4) {
                if (p0Var.f842c != 0 || p0Var.f843d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p0Var.f842c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p0Var.f843d));
                }
                if (p0Var.f844e != 0 || p0Var.f845f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p0Var.f844e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p0Var.f845f));
                }
            }
        }
    }

    public final void f() {
        int size = this.f663a.size();
        for (int i4 = 0; i4 < size; i4++) {
            p0 p0Var = (p0) this.f663a.get(i4);
            q qVar = p0Var.f841b;
            if (qVar != null) {
                if (qVar.I != null) {
                    qVar.d().f824c = false;
                }
                int i5 = this.f668f;
                if (qVar.I != null || i5 != 0) {
                    qVar.d();
                    qVar.I.f829h = i5;
                }
                ArrayList arrayList = this.f675m;
                ArrayList arrayList2 = this.f676n;
                qVar.d();
                o oVar = qVar.I;
                oVar.f830i = arrayList;
                oVar.f831j = arrayList2;
            }
            int i6 = p0Var.f840a;
            i0 i0Var = this.f678p;
            switch (i6) {
                case 1:
                    qVar.E(p0Var.f842c, p0Var.f843d, p0Var.f844e, p0Var.f845f);
                    i0Var.R(qVar, false);
                    i0Var.a(qVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + p0Var.f840a);
                case 3:
                    qVar.E(p0Var.f842c, p0Var.f843d, p0Var.f844e, p0Var.f845f);
                    i0Var.M(qVar);
                    break;
                case 4:
                    qVar.E(p0Var.f842c, p0Var.f843d, p0Var.f844e, p0Var.f845f);
                    i0Var.D(qVar);
                    break;
                case 5:
                    qVar.E(p0Var.f842c, p0Var.f843d, p0Var.f844e, p0Var.f845f);
                    i0Var.R(qVar, false);
                    i0.V(qVar);
                    break;
                case 6:
                    qVar.E(p0Var.f842c, p0Var.f843d, p0Var.f844e, p0Var.f845f);
                    i0Var.g(qVar);
                    break;
                case 7:
                    qVar.E(p0Var.f842c, p0Var.f843d, p0Var.f844e, p0Var.f845f);
                    i0Var.R(qVar, false);
                    i0Var.c(qVar);
                    break;
                case 8:
                    i0Var.T(qVar);
                    break;
                case 9:
                    i0Var.T(null);
                    break;
                case 10:
                    i0Var.S(qVar, p0Var.f847h);
                    break;
            }
        }
    }

    public final void g() {
        for (int size = this.f663a.size() - 1; size >= 0; size--) {
            p0 p0Var = (p0) this.f663a.get(size);
            q qVar = p0Var.f841b;
            if (qVar != null) {
                if (qVar.I != null) {
                    qVar.d().f824c = true;
                }
                int i4 = this.f668f;
                int i5 = 8194;
                if (i4 != 4097) {
                    i5 = i4 != 4099 ? i4 != 8194 ? 0 : 4097 : 4099;
                }
                if (qVar.I != null || i5 != 0) {
                    qVar.d();
                    qVar.I.f829h = i5;
                }
                ArrayList arrayList = this.f676n;
                ArrayList arrayList2 = this.f675m;
                qVar.d();
                o oVar = qVar.I;
                oVar.f830i = arrayList;
                oVar.f831j = arrayList2;
            }
            int i6 = p0Var.f840a;
            i0 i0Var = this.f678p;
            switch (i6) {
                case 1:
                    qVar.E(p0Var.f842c, p0Var.f843d, p0Var.f844e, p0Var.f845f);
                    i0Var.R(qVar, true);
                    i0Var.M(qVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + p0Var.f840a);
                case 3:
                    qVar.E(p0Var.f842c, p0Var.f843d, p0Var.f844e, p0Var.f845f);
                    i0Var.a(qVar);
                    break;
                case 4:
                    qVar.E(p0Var.f842c, p0Var.f843d, p0Var.f844e, p0Var.f845f);
                    i0Var.getClass();
                    i0.V(qVar);
                    break;
                case 5:
                    qVar.E(p0Var.f842c, p0Var.f843d, p0Var.f844e, p0Var.f845f);
                    i0Var.R(qVar, true);
                    i0Var.D(qVar);
                    break;
                case 6:
                    qVar.E(p0Var.f842c, p0Var.f843d, p0Var.f844e, p0Var.f845f);
                    i0Var.c(qVar);
                    break;
                case 7:
                    qVar.E(p0Var.f842c, p0Var.f843d, p0Var.f844e, p0Var.f845f);
                    i0Var.R(qVar, true);
                    i0Var.g(qVar);
                    break;
                case 8:
                    i0Var.T(null);
                    break;
                case 9:
                    i0Var.T(qVar);
                    break;
                case 10:
                    i0Var.S(qVar, p0Var.f846g);
                    break;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f680r >= 0) {
            sb.append(" #");
            sb.append(this.f680r);
        }
        if (this.f670h != null) {
            sb.append(" ");
            sb.append(this.f670h);
        }
        sb.append("}");
        return sb.toString();
    }
}
