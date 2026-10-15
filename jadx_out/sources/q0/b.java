package q0;

import android.content.Context;
import android.view.View;
import c3.h;
import com.shungo.app.R;
import f2.e;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3879d;

    public b() {
        if (e.f2032c == null) {
            e.f2032c = new e();
        }
    }

    public final int a(int i4) {
        if (i4 < this.f3878c) {
            return ((ByteBuffer) this.f3879d).getShort(this.f3877b + i4);
        }
        return 0;
    }

    public final void b(int i4, ByteBuffer byteBuffer) {
        this.f3879d = byteBuffer;
        if (byteBuffer == null) {
            this.f3876a = 0;
            this.f3877b = 0;
            this.f3878c = 0;
        } else {
            this.f3876a = i4;
            int i5 = i4 - byteBuffer.getInt(i4);
            this.f3877b = i5;
            this.f3878c = ((ByteBuffer) this.f3879d).getShort(i5);
        }
    }

    public b(View view) {
        Context context = view.getContext();
        this.f3879d = h.l2(context, R.attr.motionEasingStandardDecelerateInterpolator, k0.a.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.f3876a = h.k2(context, R.attr.motionDurationMedium2, 300);
        this.f3877b = h.k2(context, R.attr.motionDurationShort3, 150);
        this.f3878c = h.k2(context, R.attr.motionDurationShort2, 100);
    }
}
