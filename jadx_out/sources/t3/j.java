package t3;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f4385j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f4386k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f4387l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f4388m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4397i;

    public j(String str, String str2, long j4, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f4389a = str;
        this.f4390b = str2;
        this.f4391c = j4;
        this.f4392d = str3;
        this.f4393e = str4;
        this.f4394f = z4;
        this.f4395g = z5;
        this.f4396h = z6;
        this.f4397i = z7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (c3.h.I(jVar.f4389a, this.f4389a) && c3.h.I(jVar.f4390b, this.f4390b) && jVar.f4391c == this.f4391c && c3.h.I(jVar.f4392d, this.f4392d) && c3.h.I(jVar.f4393e, this.f4393e) && jVar.f4394f == this.f4394f && jVar.f4395g == this.f4395g && jVar.f4396h == this.f4396h && jVar.f4397i == this.f4397i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4397i) + ((Boolean.hashCode(this.f4396h) + ((Boolean.hashCode(this.f4395g) + ((Boolean.hashCode(this.f4394f) + ((this.f4393e.hashCode() + ((this.f4392d.hashCode() + ((Long.hashCode(this.f4391c) + ((this.f4390b.hashCode() + ((this.f4389a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4389a);
        sb.append('=');
        sb.append(this.f4390b);
        if (this.f4396h) {
            long j4 = this.f4391c;
            if (j4 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) y3.c.f5414a.get()).format(new Date(j4));
                c3.h.a0(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.f4397i) {
            sb.append("; domain=");
            sb.append(this.f4392d);
        }
        sb.append("; path=");
        sb.append(this.f4393e);
        if (this.f4394f) {
            sb.append("; secure");
        }
        if (this.f4395g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        c3.h.a0(string, "toString()");
        return string;
    }
}
