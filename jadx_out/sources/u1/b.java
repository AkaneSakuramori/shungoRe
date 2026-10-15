package u1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new androidx.activity.result.a(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4676b;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i4 = this.f4676b;
        if (i4 != 1) {
            str = i4 != 2 ? "unchecked" : "indeterminate";
        } else {
            str = "checked";
        }
        return defpackage.a.h(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeValue(Integer.valueOf(this.f4676b));
    }
}
