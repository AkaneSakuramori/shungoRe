package y0;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5074m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5075n;

    public final void a(int i4) {
        if ((this.f5065d & i4) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i4) + " but it is " + Integer.toBinaryString(this.f5065d));
    }

    public final int b() {
        return this.f5068g ? this.f5063b - this.f5064c : this.f5066e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f5062a + ", mData=null, mItemCount=" + this.f5066e + ", mIsMeasuring=" + this.f5070i + ", mPreviousLayoutItemCount=" + this.f5063b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5064c + ", mStructureChanged=" + this.f5067f + ", mInPreLayout=" + this.f5068g + ", mRunSimpleAnimations=" + this.f5071j + ", mRunPredictiveAnimations=" + this.f5072k + '}';
    }
}
