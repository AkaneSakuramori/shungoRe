package m0;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static boolean a(ListView listView, int i4) {
        return listView.canScrollList(i4);
    }

    public static void b(ListView listView, int i4) {
        listView.scrollListBy(i4);
    }
}
