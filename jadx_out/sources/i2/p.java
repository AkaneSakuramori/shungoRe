package i2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import i.h1;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f3062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f3064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f3065e;

    public p(r rVar, int i4, TextView textView, int i5, TextView textView2) {
        this.f3065e = rVar;
        this.f3061a = i4;
        this.f3062b = textView;
        this.f3063c = i5;
        this.f3064d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h1 h1Var;
        int i4 = this.f3061a;
        r rVar = this.f3065e;
        rVar.f3080n = i4;
        rVar.f3078l = null;
        TextView textView = this.f3062b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f3063c == 1 && (h1Var = rVar.f3084r) != null) {
                h1Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f3064d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f3064d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
