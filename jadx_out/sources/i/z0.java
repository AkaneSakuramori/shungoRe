package i;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f2866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typeface f2867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2868d;

    public z0(TextView textView, Typeface typeface, int i4) {
        this.f2866b = textView;
        this.f2867c = typeface;
        this.f2868d = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2866b.setTypeface(this.f2867c, this.f2868d);
    }
}
