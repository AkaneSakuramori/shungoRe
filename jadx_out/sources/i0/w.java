package i0;

import android.R;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class w extends f2.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f2990d;

    public w(View view) {
        super(8);
        this.f2990d = view;
    }

    @Override // f2.e
    public void P() {
        View viewFindViewById;
        View view = this.f2990d;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new androidx.activity.d(5, viewFindViewById));
    }
}
