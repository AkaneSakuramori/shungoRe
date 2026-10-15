package t1;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f4253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i4, CarouselLayoutManager carouselLayoutManager, int i5) {
        super(i4);
        this.f4252b = i5;
        this.f4253c = carouselLayoutManager;
    }

    public final int a() {
        int i4 = this.f4252b;
        CarouselLayoutManager carouselLayoutManager = this.f4253c;
        switch (i4) {
            case 0:
                return carouselLayoutManager.f5241n - carouselLayoutManager.D();
            default:
                return carouselLayoutManager.f5241n;
        }
    }
}
