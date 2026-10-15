package i0;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f2963a;

    public s0(t tVar) {
        this.f2963a = tVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        h hVar = new h(new e.n0(contentInfo));
        h hVarA = ((m0.u) this.f2963a).a(view, hVar);
        if (hVarA == null) {
            return null;
        }
        if (hVarA == hVar) {
            return contentInfo;
        }
        ContentInfo contentInfoR = hVarA.f2916a.r();
        Objects.requireNonNull(contentInfoR);
        return c2.e.g(contentInfoR);
    }
}
