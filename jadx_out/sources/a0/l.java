package a0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f27a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f28b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29c;

    public l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f27a = colorStateList;
        this.f28b = configuration;
        this.f29c = theme == null ? 0 : theme.hashCode();
    }
}
