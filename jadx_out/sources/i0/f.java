package i0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2907b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClipData f2908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f2911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f2912g;

    public f(f fVar) {
        ClipData clipData = fVar.f2908c;
        clipData.getClass();
        this.f2908c = clipData;
        int i4 = fVar.f2909d;
        if (i4 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }
        if (i4 > 5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
        }
        this.f2909d = i4;
        int i5 = fVar.f2910e;
        if ((i5 & 1) == i5) {
            this.f2910e = i5;
            this.f2911f = fVar.f2911f;
            this.f2912g = fVar.f2912g;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i5) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    @Override // i0.e
    public final void a(Bundle bundle) {
        this.f2912g = bundle;
    }

    @Override // i0.e
    public final void b(Uri uri) {
        this.f2911f = uri;
    }

    @Override // i0.g
    public final int c() {
        return this.f2909d;
    }

    @Override // i0.e
    public final h d() {
        return new h(new f(this));
    }

    @Override // i0.e
    public final void e(int i4) {
        this.f2910e = i4;
    }

    @Override // i0.g
    public final ClipData h() {
        return this.f2908c;
    }

    @Override // i0.g
    public final int m() {
        return this.f2910e;
    }

    @Override // i0.g
    public final ContentInfo r() {
        return null;
    }

    public final String toString() {
        String strValueOf;
        String str;
        switch (this.f2907b) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f2908c.getDescription());
                sb.append(", source=");
                int i4 = this.f2909d;
                if (i4 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i4 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i4 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i4 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i4 != 4) {
                    strValueOf = i4 != 5 ? String.valueOf(i4) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i5 = this.f2910e;
                sb.append((i5 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i5));
                if (this.f2911f == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + this.f2911f.toString().length() + ")";
                }
                sb.append(str);
                return defpackage.a.h(sb, this.f2912g != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public f(ClipData clipData, int i4) {
        this.f2908c = clipData;
        this.f2909d = i4;
    }
}
