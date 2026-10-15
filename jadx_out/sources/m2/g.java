package m2;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f3446c;

    static {
        a aVar = new a();
        f3445b = aVar;
        f3446c = new g[]{aVar, new g() { // from class: m2.b
            @Override // m2.h
            public final String a(Field field) {
                return g.c(field.getName());
            }
        }, new g() { // from class: m2.c
            @Override // m2.h
            public final String a(Field field) {
                return g.c(g.b(field.getName(), " "));
            }
        }, new g() { // from class: m2.d
            @Override // m2.h
            public final String a(Field field) {
                return g.b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        }, new g() { // from class: m2.e
            @Override // m2.h
            public final String a(Field field) {
                return g.b(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        }, new g() { // from class: m2.f
            @Override // m2.h
            public final String a(Field field) {
                return g.b(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length() - 1;
        int i4 = 0;
        while (!Character.isLetter(str.charAt(i4)) && i4 < length) {
            i4++;
        }
        char cCharAt = str.charAt(i4);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i4 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i4) + upperCase + str.substring(i4 + 1);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f3446c.clone();
    }
}
