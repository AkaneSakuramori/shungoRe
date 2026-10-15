package h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f2419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2420c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflater f2423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2424g;

    public l(o oVar, LayoutInflater layoutInflater, boolean z4, int i4) {
        this.f2422e = z4;
        this.f2423f = layoutInflater;
        this.f2419b = oVar;
        this.f2424g = i4;
        a();
    }

    public final void a() {
        o oVar = this.f2419b;
        q qVar = oVar.f2447v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f2435j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((q) arrayList.get(i4)) == qVar) {
                    this.f2420c = i4;
                    return;
                }
            }
        }
        this.f2420c = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i4) {
        ArrayList arrayListL;
        boolean z4 = this.f2422e;
        o oVar = this.f2419b;
        if (z4) {
            oVar.i();
            arrayListL = oVar.f2435j;
        } else {
            arrayListL = oVar.l();
        }
        int i5 = this.f2420c;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (q) arrayListL.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z4 = this.f2422e;
        o oVar = this.f2419b;
        if (z4) {
            oVar.i();
            arrayListL = oVar.f2435j;
        } else {
            arrayListL = oVar.l();
        }
        return this.f2420c < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.f2423f.inflate(this.f2424g, viewGroup, false);
        }
        int i5 = getItem(i4).f2454b;
        int i6 = i4 - 1;
        int i7 = i6 >= 0 ? getItem(i6).f2454b : i5;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2419b.m() && i5 != i7) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        d0 d0Var = (d0) view;
        if (this.f2421d) {
            listMenuItemView.setForceShowIcon(true);
        }
        d0Var.c(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
