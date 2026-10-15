package i;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class y2 implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2859c;

    public /* synthetic */ y2(ViewGroup viewGroup, int i4) {
        this.f2858b = i4;
        this.f2859c = viewGroup;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f2858b) {
            case 0:
                break;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) this.f2859c;
                textInputLayout.u(!textInputLayout.A0, false);
                if (textInputLayout.f1567l) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.f1583t) {
                    textInputLayout.v(editable);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        switch (this.f2858b) {
            case 0:
                SearchView searchView = (SearchView) this.f2859c;
                Editable text = searchView.f462q.getText();
                searchView.W = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.x(!zIsEmpty);
                int i7 = 8;
                if (searchView.V && !searchView.O && zIsEmpty) {
                    searchView.f467v.setVisibility(8);
                    i7 = 0;
                }
                searchView.f469x.setVisibility(i7);
                searchView.t();
                searchView.w();
                charSequence.toString();
                searchView.getClass();
                break;
        }
    }
}
