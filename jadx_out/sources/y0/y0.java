package y0;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f5346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5348g;

    public final void a(RecyclerView recyclerView) {
        int i4 = this.f5345d;
        if (i4 >= 0) {
            this.f5345d = -1;
            recyclerView.M(i4);
            this.f5347f = false;
            return;
        }
        if (!this.f5347f) {
            this.f5348g = 0;
            return;
        }
        Interpolator interpolator = this.f5346e;
        if (interpolator != null && this.f5344c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i5 = this.f5344c;
        if (i5 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1019a0.b(this.f5342a, this.f5343b, i5, interpolator);
        int i6 = this.f5348g + 1;
        this.f5348g = i6;
        if (i6 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f5347f = false;
    }
}
