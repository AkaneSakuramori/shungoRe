package u;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4559e;

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.f4555a = Float.NaN;
        this.f4556b = Float.NaN;
        this.f4557c = Float.NaN;
        this.f4558d = Float.NaN;
        this.f4559e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f4666j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4559e);
                this.f4559e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f4558d = typedArrayObtainStyledAttributes.getDimension(index, this.f4558d);
            } else if (index == 2) {
                this.f4556b = typedArrayObtainStyledAttributes.getDimension(index, this.f4556b);
            } else if (index == 3) {
                this.f4557c = typedArrayObtainStyledAttributes.getDimension(index, this.f4557c);
            } else if (index == 4) {
                this.f4555a = typedArrayObtainStyledAttributes.getDimension(index, this.f4555a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
