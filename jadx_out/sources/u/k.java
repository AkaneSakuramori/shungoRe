package u;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f4622j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f4627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f4628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4631i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4622j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4662f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            switch (f4622j.get(index)) {
                case 1:
                    this.f4627e = typedArrayObtainStyledAttributes.getFloat(index, this.f4627e);
                    break;
                case 2:
                    this.f4625c = typedArrayObtainStyledAttributes.getInt(index, this.f4625c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = q.a.f3875a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4623a = n.f(typedArrayObtainStyledAttributes, index, this.f4623a);
                    break;
                case 6:
                    this.f4624b = typedArrayObtainStyledAttributes.getInteger(index, this.f4624b);
                    break;
                case 7:
                    this.f4626d = typedArrayObtainStyledAttributes.getFloat(index, this.f4626d);
                    break;
                case 8:
                    this.f4629g = typedArrayObtainStyledAttributes.getInteger(index, this.f4629g);
                    break;
                case 9:
                    this.f4628f = typedArrayObtainStyledAttributes.getFloat(index, this.f4628f);
                    break;
                case 10:
                    int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i5 == 1) {
                        this.f4631i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i5 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f4630h = string;
                        if (string.indexOf("/") > 0) {
                            this.f4631i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f4631i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
