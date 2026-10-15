package i2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import i0.e0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s extends ArrayAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f3093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f3094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f3095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, int i4, String[] strArr) {
        super(context, i4, strArr);
        this.f3095d = tVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        t tVar = this.f3095d;
        ColorStateList colorStateList2 = tVar.f3103m;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f3094c = colorStateList;
        if (tVar.f3102l != 0 && tVar.f3103m != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{b0.a.b(tVar.f3103m.getColorForState(iArr3, 0), tVar.f3102l), b0.a.b(tVar.f3103m.getColorForState(iArr2, 0), tVar.f3102l), tVar.f3102l});
        }
        this.f3093b = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i4, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            t tVar = this.f3095d;
            Drawable rippleDrawable = null;
            if (tVar.getText().toString().contentEquals(textView.getText()) && tVar.f3102l != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(tVar.f3102l);
                if (this.f3094c != null) {
                    c0.b.h(colorDrawable, this.f3093b);
                    rippleDrawable = new RippleDrawable(this.f3094c, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = v0.f2983a;
            e0.q(textView, rippleDrawable);
        }
        return view2;
    }
}
