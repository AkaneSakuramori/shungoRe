package androidx.activity.result;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import i0.c2;
import i0.s;
import java.util.ArrayList;
import u.n;
import u.r;

/* JADX INFO: loaded from: classes.dex */
public final class i implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f318d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f319e;

    public i(Context context, XmlResourceParser xmlResourceParser) {
        this.f317c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f4664h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                this.f316b = typedArrayObtainStyledAttributes.getResourceId(index, this.f316b);
            } else if (index == 1) {
                this.f317c = typedArrayObtainStyledAttributes.getResourceId(index, this.f317c);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f317c);
                context.getResources().getResourceName(this.f317c);
                if ("layout".equals(resourceTypeName)) {
                    n nVar = new n();
                    this.f319e = nVar;
                    nVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f317c, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // i0.s
    public final c2 q(View view, c2 c2Var) {
        int i4 = c2Var.f2902a.f(7).f1082b;
        int i5 = this.f316b;
        Object obj = this.f318d;
        if (i5 >= 0) {
            View view2 = (View) obj;
            view2.getLayoutParams().height = this.f316b + i4;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = (View) obj;
        view3.setPadding(view3.getPaddingLeft(), this.f317c + i4, view3.getPaddingRight(), view3.getPaddingBottom());
        return c2Var;
    }
}
