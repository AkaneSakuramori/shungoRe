package c1;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1143a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Class cls, String str, int i4) {
        super(cls, str);
        this.f1143a = i4;
    }

    public final Float a(View view) {
        switch (this.f1143a) {
            case 5:
                return Float.valueOf(y.f1231a.h(view));
            case 6:
            default:
                WeakHashMap weakHashMap = v0.f2983a;
                return Float.valueOf(i0.f0.e(view));
            case 7:
                return Float.valueOf(view.getLayoutParams().width);
            case 8:
                return Float.valueOf(view.getLayoutParams().height);
            case 9:
                WeakHashMap weakHashMap2 = v0.f2983a;
                return Float.valueOf(i0.f0.f(view));
        }
    }

    public final void b(View view, PointF pointF) {
        switch (this.f1143a) {
            case 2:
                y.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                break;
            case 3:
                y.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                break;
            default:
                int iRound = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                y.a(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
                break;
        }
    }

    public final void c(View view, Float f5) {
        switch (this.f1143a) {
            case 5:
                y.f1231a.i(view, f5.floatValue());
                break;
            case 6:
            default:
                WeakHashMap weakHashMap = v0.f2983a;
                i0.f0.k(view, i0.f0.f(view), view.getPaddingTop(), f5.intValue(), view.getPaddingBottom());
                break;
            case 7:
                view.getLayoutParams().width = f5.intValue();
                view.requestLayout();
                break;
            case 8:
                view.getLayoutParams().height = f5.intValue();
                view.requestLayout();
                break;
            case 9:
                int iIntValue = f5.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = v0.f2983a;
                i0.f0.k(view, iIntValue, paddingTop, i0.f0.e(view), view.getPaddingBottom());
                break;
        }
    }

    public final void d(f fVar, PointF pointF) {
        switch (this.f1143a) {
            case 0:
                fVar.getClass();
                fVar.f1151a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                fVar.f1152b = iRound;
                int i4 = fVar.f1156f + 1;
                fVar.f1156f = i4;
                if (i4 == fVar.f1157g) {
                    y.a(fVar.f1155e, fVar.f1151a, iRound, fVar.f1153c, fVar.f1154d);
                    fVar.f1156f = 0;
                    fVar.f1157g = 0;
                }
                break;
            default:
                fVar.getClass();
                fVar.f1153c = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                fVar.f1154d = iRound2;
                int i5 = fVar.f1157g + 1;
                fVar.f1157g = i5;
                if (fVar.f1156f == i5) {
                    y.a(fVar.f1155e, fVar.f1151a, fVar.f1152b, fVar.f1153c, iRound2);
                    fVar.f1156f = 0;
                    fVar.f1157g = 0;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f1143a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return a((View) obj);
            case 6:
                WeakHashMap weakHashMap = v0.f2983a;
                return i0.g0.a((View) obj);
            case 7:
                return a((View) obj);
            case 8:
                return a((View) obj);
            case 9:
                return a((View) obj);
            default:
                return a((View) obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f1143a) {
            case 0:
                d((f) obj, (PointF) obj2);
                break;
            case 1:
                d((f) obj, (PointF) obj2);
                break;
            case 2:
                b((View) obj, (PointF) obj2);
                break;
            case 3:
                b((View) obj, (PointF) obj2);
                break;
            case 4:
                b((View) obj, (PointF) obj2);
                break;
            case 5:
                c((View) obj, (Float) obj2);
                break;
            case 6:
                WeakHashMap weakHashMap = v0.f2983a;
                i0.g0.c((View) obj, (Rect) obj2);
                break;
            case 7:
                c((View) obj, (Float) obj2);
                break;
            case 8:
                c((View) obj, (Float) obj2);
                break;
            case 9:
                c((View) obj, (Float) obj2);
                break;
            default:
                c((View) obj, (Float) obj2);
                break;
        }
    }
}
