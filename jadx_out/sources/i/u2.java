package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.shungo.app.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static u2 f2788g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f2790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2791b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f2792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f2794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f2787f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t2 f2789h = new t2(6);

    public static synchronized u2 c() {
        try {
            if (f2788g == null) {
                f2788g = new u2();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2788g;
    }

    public static synchronized PorterDuffColorFilter g(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        t2 t2Var = f2789h;
        t2Var.getClass();
        int i5 = (31 + i4) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) t2Var.a(Integer.valueOf(mode.hashCode() + i5));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i4, mode);
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j4, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                n.e eVar = (n.e) this.f2791b.get(context);
                if (eVar == null) {
                    eVar = new n.e();
                    this.f2791b.put(context, eVar);
                }
                eVar.e(j4, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable b(Context context, int i4) {
        if (this.f2792c == null) {
            this.f2792c = new TypedValue();
        }
        TypedValue typedValue = this.f2792c;
        context.getResources().getValue(i4, typedValue, true);
        long j4 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableD = d(context, j4);
        if (drawableD != null) {
            return drawableD;
        }
        LayerDrawable layerDrawableD = null;
        if (this.f2794e != null) {
            if (i4 == R.drawable.abc_cab_background_top_material) {
                layerDrawableD = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i4 == R.drawable.abc_ratingbar_material) {
                layerDrawableD = w.d(this, context, R.dimen.abc_star_big);
            } else if (i4 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableD = w.d(this, context, R.dimen.abc_star_medium);
            } else if (i4 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableD = w.d(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableD != null) {
            layerDrawableD.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j4, layerDrawableD);
        }
        return layerDrawableD;
    }

    public final synchronized Drawable d(Context context, long j4) {
        n.e eVar = (n.e) this.f2791b.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.d(j4, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = n.d.b(eVar.f3498c, eVar.f3500e, j4);
            if (iB >= 0) {
                Object[] objArr = eVar.f3499d;
                Object obj = objArr[iB];
                Object obj2 = n.e.f3496f;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    eVar.f3497b = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i4) {
        return f(context, i4, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cb A[Catch: all -> 0x00da, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x0026, B:14:0x002c, B:16:0x0034, B:18:0x003b, B:25:0x0052, B:23:0x004e, B:26:0x0057, B:30:0x006e, B:37:0x00a4, B:38:0x00cb, B:43:0x00d6, B:6:0x0006, B:8:0x0012, B:10:0x0016, B:50:0x00df, B:51:0x00e8), top: B:54:0x0001 }] */
    public final synchronized Drawable f(Context context, int i4, boolean z4) {
        Drawable drawableB;
        if (!this.f2793d) {
            this.f2793d = true;
            Drawable drawableE = e(context, R.drawable.abc_vector_test);
            if (drawableE == null || (!(drawableE instanceof d1.o) && !"android.graphics.drawable.VectorDrawable".equals(drawableE.getClass().getName()))) {
                this.f2793d = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        drawableB = b(context, i4);
        if (drawableB == null) {
            Object obj = z.d.f5428a;
            drawableB = z.b.b(context, i4);
        }
        if (drawableB != null) {
            ColorStateList colorStateListH = h(context, i4);
            PorterDuff.Mode mode = null;
            if (colorStateListH != null) {
                int[] iArr = t1.f2777a;
                drawableB = drawableB.mutate();
                c0.b.h(drawableB, colorStateListH);
                if (this.f2794e != null && i4 == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
                if (mode != null) {
                    c0.b.i(drawableB, mode);
                }
            } else if (this.f2794e == null) {
                if (!i(context, i4, drawableB) && z4) {
                    drawableB = null;
                }
            } else if (i4 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawableB;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = m3.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = x.f2833b;
                w.g(drawableFindDrawableByLayerId, iC, mode2);
                w.g(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), m3.c(context, R.attr.colorControlNormal), mode2);
                w.g(layerDrawable.findDrawableByLayerId(android.R.id.progress), m3.c(context, R.attr.colorControlActivated), mode2);
            } else if (i4 == R.drawable.abc_ratingbar_material || i4 == R.drawable.abc_ratingbar_indicator_material || i4 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawableB;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = m3.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = x.f2833b;
                w.g(drawableFindDrawableByLayerId2, iB, mode3);
                w.g(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), m3.c(context, R.attr.colorControlActivated), mode3);
                w.g(layerDrawable2.findDrawableByLayerId(android.R.id.progress), m3.c(context, R.attr.colorControlActivated), mode3);
            } else if (!i(context, i4, drawableB)) {
                drawableB = null;
            }
        }
        if (drawableB != null) {
            t1.a(drawableB);
        }
        return drawableB;
    }

    public final synchronized ColorStateList h(Context context, int i4) {
        ColorStateList colorStateList;
        n.l lVar;
        WeakHashMap weakHashMap = this.f2790a;
        ColorStateList colorStateListE = null;
        colorStateList = (weakHashMap == null || (lVar = (n.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.c(i4, null);
        if (colorStateList == null) {
            w wVar = this.f2794e;
            if (wVar != null) {
                colorStateListE = wVar.e(context, i4);
            }
            if (colorStateListE != null) {
                if (this.f2790a == null) {
                    this.f2790a = new WeakHashMap();
                }
                n.l lVar2 = (n.l) this.f2790a.get(context);
                if (lVar2 == null) {
                    lVar2 = new n.l();
                    this.f2790a.put(context, lVar2);
                }
                lVar2.a(i4, colorStateListE);
            }
            colorStateList = colorStateListE;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public final boolean i(Context context, int i4, Drawable drawable) {
        int i5;
        boolean z4;
        int iRound;
        Drawable drawableMutate;
        int iC;
        w wVar = this.f2794e;
        if (wVar == null) {
            return false;
        }
        PorterDuff.Mode mode = x.f2833b;
        if (w.a((int[]) wVar.f2808b, i4)) {
            i5 = R.attr.colorControlNormal;
        } else if (w.a((int[]) wVar.f2810d, i4)) {
            i5 = R.attr.colorControlActivated;
        } else {
            if (!w.a((int[]) wVar.f2811e, i4)) {
                if (i4 == R.drawable.abc_list_divider_mtrl_alpha) {
                    z4 = true;
                    iRound = Math.round(40.8f);
                    i5 = 16842800;
                } else {
                    if (i4 != R.drawable.abc_dialog_material_background) {
                        i5 = 0;
                        z4 = false;
                    }
                    iRound = -1;
                }
                if (z4) {
                    return false;
                }
                int[] iArr = t1.f2777a;
                drawableMutate = drawable.mutate();
                iC = m3.c(context, i5);
                synchronized (x.class) {
                    PorterDuffColorFilter porterDuffColorFilterG = g(iC, mode);
                }
                drawableMutate.setColorFilter(porterDuffColorFilterG);
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            mode = PorterDuff.Mode.MULTIPLY;
            i5 = 16842801;
        }
        z4 = true;
        iRound = -1;
        if (z4) {
            return false;
        }
        int[] iArr2 = t1.f2777a;
        drawableMutate = drawable.mutate();
        iC = m3.c(context, i5);
        synchronized (x.class) {
            PorterDuffColorFilter porterDuffColorFilterG2 = g(iC, mode);
            drawableMutate.setColorFilter(porterDuffColorFilterG2);
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }
    }
}
