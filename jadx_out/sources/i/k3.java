package i;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f2631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f2632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f2633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f2634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f2635e;

    public k3(View view) {
        this.f2631a = (TextView) view.findViewById(R.id.text1);
        this.f2632b = (TextView) view.findViewById(R.id.text2);
        this.f2633c = (ImageView) view.findViewById(R.id.icon1);
        this.f2634d = (ImageView) view.findViewById(R.id.icon2);
        this.f2635e = (ImageView) view.findViewById(com.shungo.app.R.id.edit_query);
    }
}
