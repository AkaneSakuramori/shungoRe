package i0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentInfo.Builder f2903b;

    public d(ClipData clipData, int i4) {
        this.f2903b = c2.e.e(clipData, i4);
    }

    @Override // i0.e
    public final void a(Bundle bundle) {
        this.f2903b.setExtras(bundle);
    }

    @Override // i0.e
    public final void b(Uri uri) {
        this.f2903b.setLinkUri(uri);
    }

    @Override // i0.e
    public final h d() {
        return new h(new e.n0(this.f2903b.build()));
    }

    @Override // i0.e
    public final void e(int i4) {
        this.f2903b.setFlags(i4);
    }
}
