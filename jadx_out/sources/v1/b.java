package v1;

import android.graphics.Typeface;
import c3.h;
import com.google.android.material.chip.Chip;
import z1.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4776k;

    public /* synthetic */ b(int i4, Object obj) {
        this.f4775j = i4;
        this.f4776k = obj;
    }

    @Override // c3.h
    public final void G1(int i4) {
        switch (this.f4775j) {
            case 0:
                break;
            default:
                i iVar = (i) this.f4776k;
                iVar.f5498d = true;
                z1.h hVar = (z1.h) iVar.f5499e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.v();
                    fVar.invalidateSelf();
                }
                break;
        }
    }

    @Override // c3.h
    public final void I1(Typeface typeface, boolean z4) {
        int i4 = this.f4775j;
        Object obj = this.f4776k;
        switch (i4) {
            case 0:
                Chip chip = (Chip) obj;
                f fVar = chip.f1417f;
                chip.setText(fVar.E0 ? fVar.F : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z4) {
                    i iVar = (i) obj;
                    iVar.f5498d = true;
                    z1.h hVar = (z1.h) iVar.f5499e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.v();
                        fVar2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }
}
