package q3;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f3886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Charset f3887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Charset f3888c;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        c3.h.a0(charsetForName, "forName(\"UTF-8\")");
        f3886a = charsetForName;
        c3.h.a0(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        c3.h.a0(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        c3.h.a0(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        c3.h.a0(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        c3.h.a0(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
