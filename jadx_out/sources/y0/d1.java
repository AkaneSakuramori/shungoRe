package y0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final List f5102s = Collections.emptyList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f5104b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5112j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f5120r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5105c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5106d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5107e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5108f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5109g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d1 f5110h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d1 f5111i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f5113k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f5114l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5115m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v0 f5116n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5117o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5118p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5119q = -1;

    public d1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f5103a = view;
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
            return;
        }
        if ((1024 & this.f5112j) == 0) {
            if (this.f5113k == null) {
                ArrayList arrayList = new ArrayList();
                this.f5113k = arrayList;
                this.f5114l = Collections.unmodifiableList(arrayList);
            }
            this.f5113k.add(obj);
        }
    }

    public final void b(int i4) {
        this.f5112j = i4 | this.f5112j;
    }

    public final int c() {
        int i4 = this.f5109g;
        return i4 == -1 ? this.f5105c : i4;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.f5112j & 1024) != 0 || (arrayList = this.f5113k) == null || arrayList.size() == 0) ? f5102s : this.f5114l;
    }

    public final boolean e(int i4) {
        return (i4 & this.f5112j) != 0;
    }

    public final boolean f() {
        View view = this.f5103a;
        return (view.getParent() == null || view.getParent() == this.f5120r) ? false : true;
    }

    public final boolean g() {
        return (this.f5112j & 1) != 0;
    }

    public final boolean h() {
        return (this.f5112j & 4) != 0;
    }

    public final boolean i() {
        if ((this.f5112j & 16) == 0) {
            WeakHashMap weakHashMap = i0.v0.f2983a;
            if (!i0.e0.i(this.f5103a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return (this.f5112j & 8) != 0;
    }

    public final boolean k() {
        return this.f5116n != null;
    }

    public final boolean l() {
        return (this.f5112j & 256) != 0;
    }

    public final boolean m() {
        return (this.f5112j & 2) != 0;
    }

    public final void n(int i4, boolean z4) {
        if (this.f5106d == -1) {
            this.f5106d = this.f5105c;
        }
        if (this.f5109g == -1) {
            this.f5109g = this.f5105c;
        }
        if (z4) {
            this.f5109g += i4;
        }
        this.f5105c += i4;
        View view = this.f5103a;
        if (view.getLayoutParams() != null) {
            ((p0) view.getLayoutParams()).f5275c = true;
        }
    }

    public final void o() {
        this.f5112j = 0;
        this.f5105c = -1;
        this.f5106d = -1;
        this.f5107e = -1L;
        this.f5109g = -1;
        this.f5115m = 0;
        this.f5110h = null;
        this.f5111i = null;
        ArrayList arrayList = this.f5113k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f5112j &= -1025;
        this.f5118p = 0;
        this.f5119q = -1;
        RecyclerView.j(this);
    }

    public final void p(boolean z4) {
        int i4 = this.f5115m;
        int i5 = z4 ? i4 - 1 : i4 + 1;
        this.f5115m = i5;
        if (i5 < 0) {
            this.f5115m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z4 && i5 == 1) {
            this.f5112j |= 16;
        } else if (z4 && i5 == 0) {
            this.f5112j &= -17;
        }
    }

    public final boolean q() {
        return (this.f5112j & 128) != 0;
    }

    public final boolean r() {
        return (this.f5112j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f5105c + " id=" + this.f5107e + ", oldPos=" + this.f5106d + ", pLpos:" + this.f5109g);
        if (k()) {
            sb.append(" scrap ");
            sb.append(this.f5117o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (h()) {
            sb.append(" invalid");
        }
        if (!g()) {
            sb.append(" unbound");
        }
        if ((this.f5112j & 2) != 0) {
            sb.append(" update");
        }
        if (j()) {
            sb.append(" removed");
        }
        if (q()) {
            sb.append(" ignored");
        }
        if (l()) {
            sb.append(" tmpDetached");
        }
        if (!i()) {
            sb.append(" not recyclable(" + this.f5115m + ")");
        }
        if ((this.f5112j & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.f5103a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
