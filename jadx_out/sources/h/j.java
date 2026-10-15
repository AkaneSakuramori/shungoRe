package h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.shungo.app.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2411b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f2412c;

    public j(k kVar) {
        this.f2412c = kVar;
        a();
    }

    public final void a() {
        o oVar = this.f2412c.f2415d;
        q qVar = oVar.f2447v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f2435j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((q) arrayList.get(i4)) == qVar) {
                    this.f2411b = i4;
                    return;
                }
            }
        }
        this.f2411b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i4) {
        k kVar = this.f2412c;
        o oVar = kVar.f2415d;
        oVar.i();
        ArrayList arrayList = oVar.f2435j;
        kVar.getClass();
        int i5 = this.f2411b;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (q) arrayList.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        k kVar = this.f2412c;
        o oVar = kVar.f2415d;
        oVar.i();
        int size = oVar.f2435j.size();
        kVar.getClass();
        return this.f2411b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2412c.f2414c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((d0) view).c(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
