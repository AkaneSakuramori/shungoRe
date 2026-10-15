package c1;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends c0 {
    @Override // c1.c0, z0.c
    public final void g(View view, int i4) {
        view.setTransitionVisibility(i4);
    }

    @Override // c1.z
    public final float h(View view) {
        return view.getTransitionAlpha();
    }

    @Override // c1.z
    public final void i(View view, float f5) {
        view.setTransitionAlpha(f5);
    }

    @Override // c1.a0
    public final void j(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // c1.a0
    public final void k(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // c1.b0
    public final void l(View view, int i4, int i5, int i6, int i7) {
        view.setLeftTopRightBottom(i4, i5, i6, i7);
    }
}
