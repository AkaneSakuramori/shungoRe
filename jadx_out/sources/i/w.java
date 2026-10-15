package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.shungo.app.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f2809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f2812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2813g;

    public w(t3.s sVar, String str, t3.q qVar, t3.z zVar, Map map) {
        this.f2807a = 1;
        c3.h.b0(str, "method");
        this.f2808b = sVar;
        this.f2809c = str;
        this.f2810d = qVar;
        this.f2811e = zVar;
        this.f2812f = map;
    }

    public static boolean a(int[] iArr, int i4) {
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList c(Context context, int i4) {
        int iC = m3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{m3.f2711b, m3.f2713d, m3.f2712c, m3.f2715f}, new int[]{m3.b(context, R.attr.colorButtonNormal), b0.a.b(iC, i4), b0.a.b(iC, i4), i4});
    }

    public static LayerDrawable d(u2 u2Var, Context context, int i4) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
        Drawable drawableE = u2Var.e(context, R.drawable.abc_star_black_48dp);
        Drawable drawableE2 = u2Var.e(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableE instanceof BitmapDrawable) && drawableE.getIntrinsicWidth() == dimensionPixelSize && drawableE.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableE;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableE.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableE2 instanceof BitmapDrawable) && drawableE2.getIntrinsicWidth() == dimensionPixelSize && drawableE2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableE2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableE2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void g(Drawable drawable, int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterG;
        int[] iArr = t1.f2777a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = x.f2833b;
        }
        PorterDuff.Mode mode2 = x.f2833b;
        synchronized (x.class) {
            porterDuffColorFilterG = u2.g(i4, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterG);
    }

    public final t3.c b() {
        t3.c cVar = (t3.c) this.f2813g;
        if (cVar != null) {
            return cVar;
        }
        int i4 = t3.c.f4320n;
        t3.c cVarF = j1.y.f((t3.q) this.f2810d);
        this.f2813g = cVarF;
        return cVarF;
    }

    public final ColorStateList e(Context context, int i4) {
        if (i4 == R.drawable.abc_edit_text_material) {
            return z.d.b(context, R.color.abc_tint_edittext);
        }
        if (i4 == R.drawable.abc_switch_track_mtrl_alpha) {
            return z.d.b(context, R.color.abc_tint_switch_track);
        }
        if (i4 != R.drawable.abc_switch_thumb_material) {
            if (i4 == R.drawable.abc_btn_default_mtrl_shape) {
                return c(context, m3.c(context, R.attr.colorButtonNormal));
            }
            if (i4 == R.drawable.abc_btn_borderless_material) {
                return c(context, 0);
            }
            if (i4 == R.drawable.abc_btn_colored_material) {
                return c(context, m3.c(context, R.attr.colorAccent));
            }
            if (i4 == R.drawable.abc_spinner_mtrl_am_alpha || i4 == R.drawable.abc_spinner_textfield_background_material) {
                return z.d.b(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.f2809c, i4)) {
                return m3.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.f2812f, i4)) {
                return z.d.b(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.f2813g, i4)) {
                return z.d.b(context, R.color.abc_tint_btn_checkable);
            }
            if (i4 == R.drawable.abc_seekbar_thumb_material) {
                return z.d.b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = m3.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = m3.f2711b;
            iArr2[0] = m3.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = m3.f2714e;
            iArr2[1] = m3.c(context, R.attr.colorControlActivated);
            iArr[2] = m3.f2715f;
            iArr2[2] = m3.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = m3.f2711b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = m3.f2714e;
            iArr2[1] = m3.c(context, R.attr.colorControlActivated);
            iArr[2] = m3.f2715f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public final t3.y f() {
        t3.y yVar = new t3.y();
        yVar.f4490e = new LinkedHashMap();
        yVar.f4486a = (t3.s) this.f2808b;
        yVar.f4487b = (String) this.f2809c;
        yVar.f4489d = (t3.z) this.f2811e;
        Map map = (Map) this.f2812f;
        yVar.f4490e = map.isEmpty() ? new LinkedHashMap() : a3.j.d3(map);
        yVar.f4488c = ((t3.q) this.f2810d).c();
        return yVar;
    }

    public final String toString() {
        switch (this.f2807a) {
            case 1:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f2809c);
                sb.append(", url=");
                sb.append((t3.s) this.f2808b);
                t3.q qVar = (t3.q) this.f2810d;
                if (qVar.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = qVar.iterator();
                    int i4 = 0;
                    while (true) {
                        a3.c cVar = (a3.c) it;
                        if (cVar.hasNext()) {
                            Object next = cVar.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            z2.a aVar = (z2.a) next;
                            String str = (String) aVar.f5504b;
                            String str2 = (String) aVar.f5505c;
                            if (i4 > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            sb.append(str2);
                            i4 = i5;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                Map map = (Map) this.f2812f;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String string = sb.toString();
                c3.h.a0(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.io.Serializable] */
    public w() {
        this.f2807a = 0;
        this.f2808b = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f2809c = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f2810d = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f2811e = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f2812f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f2813g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }
}
