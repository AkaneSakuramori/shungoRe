package g0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f2294a = new g();

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // g0.h
    public final int a(CharSequence charSequence, int i4) {
        int i5 = 0;
        i5 = 2;
        for (int i6 = 0; i6 < i4 && i5 == 2; i6++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i6));
            j jVar = k.f2297a;
            if (directionality == 0) {
                i5 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        i5 = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        i5 = 2;
                        continue;
                }
            }
        }
        return i5;
    }
}
