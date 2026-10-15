package q3;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f3902b;

    public f(String str) {
        Pattern patternCompile = Pattern.compile(str);
        c3.h.a0(patternCompile, "compile(pattern)");
        this.f3902b = patternCompile;
    }

    public final boolean a(CharSequence charSequence) {
        c3.h.b0(charSequence, "input");
        return this.f3902b.matcher(charSequence).matches();
    }

    public final String toString() {
        String string = this.f3902b.toString();
        c3.h.a0(string, "nativePattern.toString()");
        return string;
    }
}
