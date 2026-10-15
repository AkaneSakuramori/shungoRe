package c1;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f1139e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1140f = true;

    public void j(View view, Matrix matrix) {
        if (f1139e) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f1139e = false;
            }
        }
    }

    public void k(View view, Matrix matrix) {
        if (f1140f) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f1140f = false;
            }
        }
    }
}
