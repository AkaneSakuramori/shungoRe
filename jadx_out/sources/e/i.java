package e;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j0.b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1879c;

    public /* synthetic */ i(int i4, Serializable serializable) {
        this.f1878b = i4;
        this.f1879c = serializable;
    }

    public final j a() {
        e eVar = (e) this.f1879c;
        j jVar = new j(eVar.f1802a, this.f1878b);
        View view = eVar.f1806e;
        h hVar = jVar.f1882g;
        int i4 = 0;
        if (view != null) {
            hVar.f1860o = view;
        } else {
            CharSequence charSequence = eVar.f1805d;
            if (charSequence != null) {
                hVar.f1849d = charSequence;
                TextView textView = hVar.f1858m;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = eVar.f1804c;
            if (drawable != null) {
                hVar.f1856k = drawable;
                hVar.f1855j = 0;
                ImageView imageView = hVar.f1857l;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    hVar.f1857l.setImageDrawable(drawable);
                }
            }
        }
        if (eVar.f1808g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) eVar.f1803b.inflate(hVar.f1864s, (ViewGroup) null);
            int i5 = eVar.f1810i ? hVar.f1865t : hVar.f1866u;
            ListAdapter gVar = eVar.f1808g;
            if (gVar == null) {
                gVar = new g(eVar.f1802a, i5, R.id.text1, null);
            }
            hVar.f1861p = gVar;
            hVar.f1862q = eVar.f1811j;
            if (eVar.f1809h != null) {
                alertController$RecycleListView.setOnItemClickListener(new d(eVar, i4, hVar));
            }
            if (eVar.f1810i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            hVar.f1850e = alertController$RecycleListView;
        }
        eVar.getClass();
        jVar.setCancelable(true);
        eVar.getClass();
        jVar.setCanceledOnTouchOutside(true);
        eVar.getClass();
        jVar.setOnCancelListener(null);
        eVar.getClass();
        jVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = eVar.f1807f;
        if (onKeyListener != null) {
            jVar.setOnKeyListener(onKeyListener);
        }
        return jVar;
    }

    public final boolean b() {
        return this.f1878b < ((List) this.f1879c).size();
    }

    @Override // j0.b0
    public final boolean j(View view) {
        ((BottomSheetBehavior) this.f1879c).B(this.f1878b);
        return true;
    }

    public i(ArrayList arrayList) {
        this.f1879c = arrayList;
    }

    public i(Context context) {
        int iP = j.p(context, 0);
        this.f1879c = new e(new ContextThemeWrapper(context, j.p(context, iP)));
        this.f1878b = iP;
    }

    public i(BottomSheetBehavior bottomSheetBehavior, int i4) {
        this.f1879c = bottomSheetBehavior;
        this.f1878b = i4;
    }
}
