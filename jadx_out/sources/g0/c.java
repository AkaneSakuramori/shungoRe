package g0;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f2282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f2283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f2284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f2285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f2286h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f2289c;

    static {
        j jVar = k.f2299c;
        f2282d = jVar;
        f2283e = Character.toString((char) 8206);
        f2284f = Character.toString((char) 8207);
        f2285g = new c(false, 2, jVar);
        f2286h = new c(true, 2, jVar);
    }

    public c(boolean z4, int i4, i iVar) {
        this.f2287a = z4;
        this.f2288b = i4;
        this.f2289c = iVar;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        b bVar = new b(charSequence);
        bVar.f2280c = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = bVar.f2280c;
            if (i7 < bVar.f2279b && i4 == 0) {
                CharSequence charSequence2 = bVar.f2278a;
                char cCharAt = charSequence2.charAt(i7);
                bVar.f2281d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, bVar.f2280c);
                    bVar.f2280c = Character.charCount(iCodePointAt) + bVar.f2280c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    bVar.f2280c++;
                    char c5 = bVar.f2281d;
                    directionality = c5 < 1792 ? b.f2277e[c5] : Character.getDirectionality(c5);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i6 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i6++;
                                i5 = -1;
                                continue;
                            case 16:
                            case 17:
                                i6++;
                                i5 = 1;
                                continue;
                            case 18:
                                i6--;
                                i5 = 0;
                                continue;
                        }
                    }
                } else if (i6 == 0) {
                    return -1;
                }
                i4 = i6;
            }
        }
        if (i4 == 0) {
            return 0;
        }
        if (i5 != 0) {
            return i5;
        }
        while (bVar.f2280c > 0) {
            switch (bVar.a()) {
                case 14:
                case 15:
                    if (i4 == i6) {
                        return -1;
                    }
                    i6--;
                    break;
                case 16:
                case 17:
                    if (i4 == i6) {
                        return 1;
                    }
                    i6--;
                    break;
                case 18:
                    i6++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        b bVar = new b(charSequence);
        bVar.f2280c = bVar.f2279b;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            while (bVar.f2280c > 0) {
                byte bA = bVar.a();
                if (bA == 0) {
                    if (i4 == 0) {
                        return -1;
                    }
                    if (i5 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i4 == 0) {
                        return 1;
                    }
                    if (i5 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i5 == i4) {
                                return -1;
                            }
                            i4--;
                            break;
                        case 16:
                        case 17:
                            if (i5 == i4) {
                                return 1;
                            }
                            i4--;
                            break;
                        case 18:
                            i4++;
                            break;
                        default:
                            if (i5 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public static c c() {
        a aVar = new a(0);
        int i4 = aVar.f2274a;
        if (i4 == 2 && ((i) aVar.f2276c) == f2282d) {
            return aVar.f2275b ? f2286h : f2285g;
        }
        return new c(aVar.f2275b, i4, (i) aVar.f2276c);
    }

    public final SpannableStringBuilder d(CharSequence charSequence, i iVar) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zB = iVar.b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i4 = this.f2288b & 2;
        String str2 = "";
        String str3 = f2284f;
        String str4 = f2283e;
        boolean z4 = this.f2287a;
        if (i4 != 0) {
            boolean zB2 = (zB ? k.f2298b : k.f2297a).b(charSequence, charSequence.length());
            if (z4 || !(zB2 || a(charSequence) == 1)) {
                str = (!z4 || (zB2 && a(charSequence) != -1)) ? "" : str3;
            } else {
                str = str4;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zB != z4) {
            spannableStringBuilder.append(zB ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zB3 = (zB ? k.f2298b : k.f2297a).b(charSequence, charSequence.length());
        if (!z4 && (zB3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z4 && (!zB3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
