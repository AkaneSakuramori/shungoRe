package u;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class p extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4656b;

    public p(Context context) {
        super(context);
        this.f4656b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z4) {
        this.f4656b = z4;
    }

    public void setGuidelineBegin(int i4) {
        e eVar = (e) getLayoutParams();
        if (this.f4656b && eVar.f4513a == i4) {
            return;
        }
        eVar.f4513a = i4;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i4) {
        e eVar = (e) getLayoutParams();
        if (this.f4656b && eVar.f4515b == i4) {
            return;
        }
        eVar.f4515b = i4;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f5) {
        e eVar = (e) getLayoutParams();
        if (this.f4656b && eVar.f4517c == f5) {
            return;
        }
        eVar.f4517c = f5;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
    }
}
