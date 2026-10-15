package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import c4.i;
import com.shungo.app.R;
import i.a3;
import i.b3;
import i.c3;
import i.d3;
import i.e2;
import i.e3;
import i.f3;
import i.g2;
import i.g3;
import i.i3;
import i.j3;
import i.l3;
import i.q;
import i.y2;
import i.y3;
import i.z2;
import i0.e0;
import i0.v0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends e2 implements g.d {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final i f454h0;
    public final Rect A;
    public final Rect B;
    public final int[] C;
    public final int[] D;
    public final ImageView E;
    public final Drawable F;
    public final int G;
    public final int H;
    public final Intent I;
    public final Intent J;
    public final CharSequence K;
    public View.OnFocusChangeListener L;
    public View.OnClickListener M;
    public boolean N;
    public boolean O;
    public n0.b P;
    public boolean Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public CharSequence W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f455a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f456b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public SearchableInfo f457c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Bundle f458d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final z2 f459e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final z2 f460f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final WeakHashMap f461g0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SearchAutoComplete f462q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f463r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f464s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f465t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f466u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f467v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f469x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f470y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j3 f471z;

    public static class SearchAutoComplete extends q {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public SearchView f473g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f474h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final d f475i;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f475i = new d(this);
            this.f472f = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i4 < 600) {
                return (i4 < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            i iVar = SearchView.f454h0;
            iVar.getClass();
            i.a();
            Method method = iVar.f1295c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f472f <= 0 || super.enoughToFilter();
        }

        @Override // i.q, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f474h) {
                d dVar = this.f475i;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z4, int i4, Rect rect) {
            super.onFocusChanged(z4, i4, rect);
            SearchView searchView = this.f473g;
            searchView.y(searchView.O);
            searchView.post(searchView.f459e0);
            if (searchView.f462q.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f473g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z4) {
            super.onWindowFocusChanged(z4);
            if (z4 && this.f473g.hasFocus() && getVisibility() == 0) {
                this.f474h = true;
                Context context = getContext();
                i iVar = SearchView.f454h0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f475i;
            if (!z4) {
                this.f474h = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f474h = true;
                    return;
                }
                this.f474h = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f473g = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f472f = i4;
        }
    }

    static {
        i iVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            i iVar2 = new i();
            iVar2.f1293a = null;
            iVar2.f1294b = null;
            iVar2.f1295c = null;
            i.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                iVar2.f1293a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                iVar2.f1294b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                iVar2.f1295c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            iVar = iVar2;
        }
        f454h0 = iVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f462q;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // g.d
    public final void a() {
        if (this.f455a0) {
            return;
        }
        this.f455a0 = true;
        SearchAutoComplete searchAutoComplete = this.f462q;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f456b0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.T = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f462q;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.T = false;
    }

    @Override // g.d
    public final void d() {
        SearchAutoComplete searchAutoComplete = this.f462q;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.W = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f456b0);
        this.f455a0 = false;
    }

    public int getImeOptions() {
        return this.f462q.getImeOptions();
    }

    public int getInputType() {
        return this.f462q.getInputType();
    }

    public int getMaxWidth() {
        return this.U;
    }

    public CharSequence getQuery() {
        return this.f462q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f457c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.K : getContext().getText(this.f457c0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    public int getSuggestionRowLayout() {
        return this.G;
    }

    public n0.b getSuggestionsAdapter() {
        return this.P;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f458d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f457c0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f458d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i4 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f462q;
        if (i4 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        i iVar = f454h0;
        iVar.getClass();
        i.a();
        Method method = iVar.f1293a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        iVar.getClass();
        i.a();
        Method method2 = iVar.f1294b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f462q;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.N) {
            clearFocus();
            y(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f459e0);
        post(this.f460f0);
        super.onDetachedFromWindow();
    }

    @Override // i.e2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4) {
            int[] iArr = this.C;
            SearchAutoComplete searchAutoComplete = this.f462q;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.D;
            getLocationInWindow(iArr2);
            int i8 = iArr[1] - iArr2[1];
            int i9 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i9;
            int height = searchAutoComplete.getHeight() + i8;
            Rect rect = this.A;
            rect.set(i9, i8, width, height);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = i7 - i5;
            Rect rect2 = this.B;
            rect2.set(i10, 0, i11, i12);
            j3 j3Var = this.f471z;
            if (j3Var == null) {
                j3 j3Var2 = new j3(rect2, rect, searchAutoComplete);
                this.f471z = j3Var2;
                setTouchDelegate(j3Var2);
            } else {
                j3Var.f2622b.set(rect2);
                Rect rect3 = j3Var.f2624d;
                rect3.set(rect2);
                int i13 = -j3Var.f2625e;
                rect3.inset(i13, i13);
                j3Var.f2623c.set(rect);
            }
        }
    }

    @Override // i.e2, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.O) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.U;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.U;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.U) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i3 i3Var = (i3) parcelable;
        super.onRestoreInstanceState(i3Var.f3594b);
        y(i3Var.f2614d);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i3 i3Var = new i3(super.onSaveInstanceState());
        i3Var.f2614d = this.O;
        return i3Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        post(this.f459e0);
    }

    public final void p(int i4) {
        int position;
        String strH;
        Cursor cursor = this.P.f3533d;
        if (cursor != null && cursor.moveToPosition(i4)) {
            Intent intentL = null;
            try {
                int i5 = l3.f2639y;
                String strH2 = l3.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f457c0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = l3.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f457c0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = l3.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentL = l(strH2, strH3 == null ? null : Uri.parse(strH3), l3.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), l3.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e5) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e5);
            }
            if (intentL != null) {
                try {
                    getContext().startActivity(intentL);
                } catch (RuntimeException e6) {
                    Log.e("SearchView", "Failed launch activity: " + intentL, e6);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f462q;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i4) {
        Editable text = this.f462q.getText();
        Cursor cursor = this.P.f3533d;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i4)) {
            setQuery(text);
            return;
        }
        String strC = this.P.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i4, Rect rect) {
        if (this.T || !isFocusable()) {
            return false;
        }
        if (this.O) {
            return super.requestFocus(i4, rect);
        }
        boolean zRequestFocus = this.f462q.requestFocus(i4, rect);
        if (zRequestFocus) {
            y(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f462q;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f457c0 != null) {
            getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f458d0 = bundle;
    }

    public void setIconified(boolean z4) {
        if (z4) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.f462q;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.N == z4) {
            return;
        }
        this.N = z4;
        y(z4);
        v();
    }

    public void setImeOptions(int i4) {
        this.f462q.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f462q.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.U = i4;
        requestLayout();
    }

    public void setOnCloseListener(e3 e3Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(f3 f3Var) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.M = onClickListener;
    }

    public void setOnSuggestionListener(g3 g3Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.R = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.S = z4;
        n0.b bVar = this.P;
        if (bVar instanceof l3) {
            ((l3) bVar).f2648q = z4 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f457c0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f462q;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f457c0.getImeOptions());
            int inputType = this.f457c0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f457c0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            n0.b bVar = this.P;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f457c0.getSuggestAuthority() != null) {
                l3 l3Var = new l3(getContext(), this, this.f457c0, this.f461g0);
                this.P = l3Var;
                searchAutoComplete.setAdapter(l3Var);
                ((l3) this.P).f2648q = this.S ? 2 : 1;
            }
            v();
        }
        SearchableInfo searchableInfo2 = this.f457c0;
        boolean z4 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f457c0.getVoiceSearchLaunchWebSearch()) {
                intent = this.I;
            } else if (this.f457c0.getVoiceSearchLaunchRecognizer()) {
                intent = this.J;
            }
            if (intent != null) {
                z4 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.V = z4;
        if (z4) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        y(this.O);
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.Q = z4;
        y(this.O);
    }

    public void setSuggestionsAdapter(n0.b bVar) {
        this.P = bVar;
        this.f462q.setAdapter(bVar);
    }

    public final void t() {
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(this.f462q.getText());
        if (!z5 && (!this.N || this.f455a0)) {
            z4 = false;
        }
        int i4 = z4 ? 0 : 8;
        ImageView imageView = this.f468w;
        imageView.setVisibility(i4);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z5 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void u() {
        int[] iArr = this.f462q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f464s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f465t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z4 = this.N;
        SearchAutoComplete searchAutoComplete = this.f462q;
        CharSequence charSequence2 = charSequence;
        if (z4 && (drawable = this.F) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void w() {
        this.f465t.setVisibility(((this.Q || this.V) && !this.O && (this.f467v.getVisibility() == 0 || this.f469x.getVisibility() == 0)) ? 0 : 8);
    }

    public final void x(boolean z4) {
        boolean z5 = this.Q;
        this.f467v.setVisibility((!z5 || !(z5 || this.V) || this.O || !hasFocus() || (!z4 && this.V)) ? 8 : 0);
    }

    public final void y(boolean z4) {
        this.O = z4;
        int i4 = 8;
        int i5 = z4 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f462q.getText());
        this.f466u.setVisibility(i5);
        x(!zIsEmpty);
        this.f463r.setVisibility(z4 ? 8 : 0);
        ImageView imageView = this.E;
        imageView.setVisibility((imageView.getDrawable() == null || this.N) ? 8 : 0);
        t();
        if (this.V && !this.O && zIsEmpty) {
            this.f467v.setVisibility(8);
            i4 = 0;
        }
        this.f469x.setVisibility(i4);
        w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        int i5 = 0;
        this.f459e0 = new z2(this, i5);
        this.f460f0 = new z2(this, 1);
        this.f461g0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        c3 c3Var = new c3(this);
        d3 d3Var = new d3(this, i5);
        g2 g2Var = new g2(1, this);
        y2 y2Var = new y2(this, 0);
        int[] iArr = d.a.f1674u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        e.c cVar = new e.c(context, typedArrayObtainStyledAttributes);
        v0.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i4);
        LayoutInflater.from(context).inflate(cVar.n(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f462q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f463r = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f464s = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f465t = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f466u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f467v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f468w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f469x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.E = imageView5;
        e0.q(viewFindViewById, cVar.h(20));
        e0.q(viewFindViewById2, cVar.h(25));
        imageView.setImageDrawable(cVar.h(23));
        imageView2.setImageDrawable(cVar.h(15));
        imageView3.setImageDrawable(cVar.h(12));
        imageView4.setImageDrawable(cVar.h(28));
        imageView5.setImageDrawable(cVar.h(23));
        this.F = cVar.h(22);
        y3.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.G = cVar.n(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.H = cVar.n(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(y2Var);
        searchAutoComplete.setOnEditorActionListener(c3Var);
        searchAutoComplete.setOnItemClickListener(d3Var);
        searchAutoComplete.setOnItemSelectedListener(g2Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new a3(this));
        setIconifiedByDefault(cVar.b(18, true));
        int iE = cVar.e(2, -1);
        if (iE != -1) {
            setMaxWidth(iE);
        }
        this.K = cVar.q(14);
        this.R = cVar.q(21);
        int iK = cVar.k(6, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = cVar.k(5, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(cVar.b(1, true));
        cVar.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f470y = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new b3(0, this));
        }
        y(this.N);
        v();
    }
}
