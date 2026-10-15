package l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f3353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f3354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f3355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f3356d;

    public final a a() {
        Integer num = this.f3353a;
        a aVar = new a();
        aVar.f3353a = num;
        aVar.f3354b = this.f3354b;
        aVar.f3355c = this.f3355c;
        aVar.f3356d = this.f3356d;
        return aVar;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        Integer num = this.f3353a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f3354b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f3355c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f3356d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
