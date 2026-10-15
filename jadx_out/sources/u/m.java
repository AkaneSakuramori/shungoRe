package u;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4636n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f4637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f4641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f4642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f4643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f4646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f4649m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4636n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4665i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            switch (f4636n.get(index)) {
                case 1:
                    this.f4637a = typedArrayObtainStyledAttributes.getFloat(index, this.f4637a);
                    break;
                case 2:
                    this.f4638b = typedArrayObtainStyledAttributes.getFloat(index, this.f4638b);
                    break;
                case 3:
                    this.f4639c = typedArrayObtainStyledAttributes.getFloat(index, this.f4639c);
                    break;
                case 4:
                    this.f4640d = typedArrayObtainStyledAttributes.getFloat(index, this.f4640d);
                    break;
                case 5:
                    this.f4641e = typedArrayObtainStyledAttributes.getFloat(index, this.f4641e);
                    break;
                case 6:
                    this.f4642f = typedArrayObtainStyledAttributes.getDimension(index, this.f4642f);
                    break;
                case 7:
                    this.f4643g = typedArrayObtainStyledAttributes.getDimension(index, this.f4643g);
                    break;
                case 8:
                    this.f4645i = typedArrayObtainStyledAttributes.getDimension(index, this.f4645i);
                    break;
                case 9:
                    this.f4646j = typedArrayObtainStyledAttributes.getDimension(index, this.f4646j);
                    break;
                case 10:
                    this.f4647k = typedArrayObtainStyledAttributes.getDimension(index, this.f4647k);
                    break;
                case 11:
                    this.f4648l = true;
                    this.f4649m = typedArrayObtainStyledAttributes.getDimension(index, this.f4649m);
                    break;
                case 12:
                    this.f4644h = n.f(typedArrayObtainStyledAttributes, index, this.f4644h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
