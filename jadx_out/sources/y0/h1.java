package y0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f5155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f5156g;

    public h1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f5156g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f5150a = -1;
        this.f5151b = Integer.MIN_VALUE;
        this.f5152c = false;
        this.f5153d = false;
        this.f5154e = false;
        int[] iArr = this.f5155f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
