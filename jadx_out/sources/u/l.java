package u;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4635d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4663g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == 1) {
                this.f4634c = typedArrayObtainStyledAttributes.getFloat(index, this.f4634c);
            } else if (index == 0) {
                int i5 = typedArrayObtainStyledAttributes.getInt(index, this.f4632a);
                this.f4632a = i5;
                this.f4632a = n.f4650d[i5];
            } else if (index == 4) {
                this.f4633b = typedArrayObtainStyledAttributes.getInt(index, this.f4633b);
            } else if (index == 3) {
                this.f4635d = typedArrayObtainStyledAttributes.getFloat(index, this.f4635d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
