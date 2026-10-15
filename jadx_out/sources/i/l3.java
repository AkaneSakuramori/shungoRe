package i;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.shungo.app.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l3 extends n0.b implements View.OnClickListener {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f2639y = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f2642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SearchView f2643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SearchableInfo f2644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f2645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WeakHashMap f2646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f2649r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2650s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2651t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2652u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2653v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2655x;

    public l3(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f3532c = true;
        this.f3533d = null;
        this.f3531b = false;
        this.f3534e = -1;
        this.f3535f = new n0.a(this);
        this.f3536g = new j2(1, this);
        this.f2641j = suggestionRowLayout;
        this.f2640i = suggestionRowLayout;
        this.f2642k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f2648q = 1;
        this.f2650s = -1;
        this.f2651t = -1;
        this.f2652u = -1;
        this.f2653v = -1;
        this.f2654w = -1;
        this.f2655x = -1;
        this.f2643l = searchView;
        this.f2644m = searchableInfo;
        this.f2647p = searchView.getSuggestionCommitIconResId();
        this.f2645n = context;
        this.f2646o = weakHashMap;
    }

    public static String h(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e5);
            return null;
        }
    }

    @Override // n0.b
    public final void a(View view, Cursor cursor) {
        int i4;
        Drawable drawableF;
        CharSequence charSequenceH;
        k3 k3Var = (k3) view.getTag();
        int i5 = this.f2655x;
        int i6 = i5 != -1 ? cursor.getInt(i5) : 0;
        TextView textView = k3Var.f2631a;
        if (textView != null) {
            String strH = h(cursor, this.f2650s);
            textView.setText(strH);
            if (TextUtils.isEmpty(strH)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f2645n;
        TextView textView2 = k3Var.f2632b;
        if (textView2 != null) {
            String strH2 = h(cursor, this.f2652u);
            if (strH2 != null) {
                if (this.f2649r == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f2649r = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strH2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2649r, null), 0, strH2.length(), 33);
                charSequenceH = spannableString;
            } else {
                charSequenceH = h(cursor, this.f2651t);
            }
            if (TextUtils.isEmpty(charSequenceH)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceH);
            if (TextUtils.isEmpty(charSequenceH)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = k3Var.f2633c;
        if (imageView != null) {
            int i7 = this.f2653v;
            if (i7 == -1) {
                drawableF = null;
            } else {
                drawableF = f(cursor.getString(i7));
                if (drawableF == null) {
                    ComponentName searchActivity = this.f2644m.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f2646o;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableF = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                                    drawableF = null;
                                } else {
                                    drawableF = drawable;
                                }
                            } else {
                                drawableF = null;
                            }
                        } catch (PackageManager.NameNotFoundException e5) {
                            Log.w("SuggestionsAdapter", e5.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawableF == null ? null : drawableF.getConstantState());
                    }
                    if (drawableF == null) {
                        drawableF = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableF);
            if (drawableF == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableF.setVisible(false, false);
                drawableF.setVisible(true, false);
            }
        }
        ImageView imageView2 = k3Var.f2634d;
        if (imageView2 == null) {
            i4 = 1;
        } else {
            int i8 = this.f2654w;
            Drawable drawableF2 = i8 == -1 ? null : f(cursor.getString(i8));
            imageView2.setImageDrawable(drawableF2);
            if (drawableF2 == null) {
                imageView2.setVisibility(8);
                i4 = 1;
            } else {
                imageView2.setVisibility(0);
                drawableF2.setVisible(false, false);
                i4 = 1;
                drawableF2.setVisible(true, false);
            }
        }
        int i9 = this.f2648q;
        ImageView imageView3 = k3Var.f2635e;
        if (i9 != 2 && (i9 != i4 || (i6 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // n0.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f2650s = cursor.getColumnIndex("suggest_text_1");
                this.f2651t = cursor.getColumnIndex("suggest_text_2");
                this.f2652u = cursor.getColumnIndex("suggest_text_2_url");
                this.f2653v = cursor.getColumnIndex("suggest_icon_1");
                this.f2654w = cursor.getColumnIndex("suggest_icon_2");
                this.f2655x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e5);
        }
    }

    @Override // n0.b
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f2644m;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // n0.b
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f2642k.inflate(this.f2640i, viewGroup, false);
        viewInflate.setTag(new k3(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f2647p);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f2645n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable f(String str) {
        Drawable drawableE = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i4 = Integer.parseInt(str);
                String str2 = "android.resource://" + this.f2645n.getPackageName() + "/" + i4;
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f2646o.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Context context = this.f2645n;
                Object obj = z.d.f5428a;
                Drawable drawableB = z.b.b(context, i4);
                if (drawableB != null) {
                    this.f2646o.put(str2, drawableB.getConstantState());
                }
                return drawableB;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f2646o.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableE = e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = this.f2645n.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e5) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e5);
                            }
                            drawableE = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e6) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e6);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e7) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e7.getMessage());
                }
                if (drawableE != null) {
                    this.f2646o.put(str, drawableE.getConstantState());
                }
            }
        }
        return drawableE;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f2645n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // n0.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewInflate = this.f2642k.inflate(this.f2641j, viewGroup, false);
            if (viewInflate != null) {
                ((k3) viewInflate.getTag()).f2631a.setText(e5.toString());
            }
            return viewInflate;
        }
    }

    @Override // n0.b, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewD = d(viewGroup);
            ((k3) viewD.getTag()).f2631a.setText(e5.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f3533d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f3533d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2643l.r((CharSequence) tag);
        }
    }
}
