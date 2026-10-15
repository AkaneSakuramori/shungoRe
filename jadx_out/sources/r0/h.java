package r0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class h extends f2.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f4043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4044f;

    public h(TextView textView) {
        super(20);
        this.f4042d = textView;
        this.f4044f = true;
        this.f4043e = new f(textView);
    }

    @Override // f2.e
    public final void L(boolean z4) {
        if (z4) {
            T();
        }
    }

    @Override // f2.e
    public final void O(boolean z4) {
        this.f4044f = z4;
        T();
        TextView textView = this.f4042d;
        textView.setFilters(u(textView.getFilters()));
    }

    public final void T() {
        TextView textView = this.f4042d;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f4044f) {
            if (!(transformationMethod instanceof l) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new l(transformationMethod);
            }
        } else if (transformationMethod instanceof l) {
            transformationMethod = ((l) transformationMethod).f4051a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // f2.e
    public final InputFilter[] u(InputFilter[] inputFilterArr) {
        if (!this.f4044f) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i4 = 0; i4 < inputFilterArr.length; i4++) {
                InputFilter inputFilter = inputFilterArr[i4];
                if (inputFilter instanceof f) {
                    sparseArray.put(i4, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (sparseArray.indexOfKey(i6) < 0) {
                    inputFilterArr2[i5] = inputFilterArr[i6];
                    i5++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i7 = 0;
        while (true) {
            f fVar = this.f4043e;
            if (i7 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = fVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i7] == fVar) {
                return inputFilterArr;
            }
            i7++;
        }
    }
}
