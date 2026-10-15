package e2;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f1974i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f1975j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f1976k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f1977l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f1978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f1979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f1980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f1984g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f1985h;

    public a() {
        Paint paint = new Paint();
        this.f1985h = paint;
        Paint paint2 = new Paint();
        this.f1978a = paint2;
        this.f1981d = b0.a.d(-16777216, 68);
        this.f1982e = b0.a.d(-16777216, 20);
        this.f1983f = b0.a.d(-16777216, 0);
        paint2.setColor(this.f1981d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f1979b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f1980c = new Paint(paint3);
    }
}
