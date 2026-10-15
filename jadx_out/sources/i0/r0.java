package i0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static h b(View view, h hVar) {
        ContentInfo contentInfoR = hVar.f2916a.r();
        Objects.requireNonNull(contentInfoR);
        ContentInfo contentInfoG = c2.e.g(contentInfoR);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoG);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoG ? hVar : new h(new e.n0(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, t tVar) {
        if (tVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new s0(tVar));
        }
    }
}
