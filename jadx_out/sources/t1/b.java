package t1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.shungo.app.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y0.m0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f4250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4251b;

    public b() {
        Paint paint = new Paint();
        this.f4250a = paint;
        this.f4251b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // y0.m0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int iB;
        Paint paint = this.f4250a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (e eVar : this.f4251b) {
            eVar.getClass();
            ThreadLocal threadLocal = b0.a.f1079a;
            float f5 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f5)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f5)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f5)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f5))));
            int iE = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                eVar.getClass();
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1412p;
                switch (cVar.f4252b) {
                    case 0:
                        break;
                    default:
                        iE = cVar.f4253c.E();
                        break;
                }
                float f6 = iE;
                eVar.getClass();
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1412p;
                int i4 = cVar2.f4252b;
                CarouselLayoutManager carouselLayoutManager = cVar2.f4253c;
                switch (i4) {
                    case 0:
                        iB = carouselLayoutManager.f5242o;
                        break;
                    default:
                        iB = carouselLayoutManager.f5242o - carouselLayoutManager.B();
                        break;
                }
                canvas.drawLine(0.0f, f6, 0.0f, iB, paint);
            } else {
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1412p;
                switch (cVar3.f4252b) {
                    case 0:
                        iE = cVar3.f4253c.C();
                        break;
                }
                eVar.getClass();
                float fA = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1412p.a();
                eVar.getClass();
                canvas.drawLine(iE, 0.0f, fA, 0.0f, paint);
            }
        }
    }
}
