package j0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f3128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3129c;

    public a(int i4, o oVar, int i5) {
        this.f3127a = i4;
        this.f3128b = oVar;
        this.f3129c = i5;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3127a);
        this.f3128b.f3144a.performAction(this.f3129c, bundle);
    }
}
