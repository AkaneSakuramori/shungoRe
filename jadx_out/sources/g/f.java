package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.shungo.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f2210f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f2212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f2213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f2214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f2215e;

    public f(Context context, int i4) {
        super(context);
        this.f2211a = i4;
    }

    public final void a(Configuration configuration) {
        if (this.f2215e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f2214d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f2214d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f2212b == null) {
            this.f2212b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2212b.setTo(theme);
            }
        }
        this.f2212b.applyStyle(this.f2211a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2215e == null) {
            Configuration configuration = this.f2214d;
            if (configuration == null) {
                this.f2215e = super.getResources();
            } else {
                if (f2210f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f2210f = configuration2;
                }
                if (configuration.equals(f2210f)) {
                    this.f2215e = super.getResources();
                } else {
                    this.f2215e = e.a(this, this.f2214d).getResources();
                }
            }
        }
        return this.f2215e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2213c == null) {
            this.f2213c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2213c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2212b;
        if (theme != null) {
            return theme;
        }
        if (this.f2211a == 0) {
            this.f2211a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f2212b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        if (this.f2211a != i4) {
            this.f2211a = i4;
            b();
        }
    }
}
