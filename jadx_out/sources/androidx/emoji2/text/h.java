package androidx.emoji2.text;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import e.n0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile s f603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile g.h f604e;

    public final void F() {
        try {
            ((m) this.f1896c).f615f.a(new g(this));
        } catch (Throwable th) {
            ((m) this.f1896c).d(th);
        }
    }

    public final CharSequence G(CharSequence charSequence, int i4, int i5, boolean z4) {
        b0 b0Var;
        int iCharCount;
        z[] zVarArr;
        s sVar = this.f603d;
        sVar.getClass();
        boolean z5 = charSequence instanceof y;
        if (z5) {
            ((y) charSequence).a();
        }
        if (!z5) {
            try {
                b0Var = charSequence instanceof Spannable ? new b0((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i4 + (-1), i5 + 1, z.class) > i5) ? null : new b0(charSequence);
            } finally {
                if (z5) {
                    ((y) charSequence).b();
                }
            }
        }
        if (b0Var != null && (zVarArr = (z[]) b0Var.f599c.getSpans(i4, i5, z.class)) != null && zVarArr.length > 0) {
            for (z zVar : zVarArr) {
                int spanStart = b0Var.f599c.getSpanStart(zVar);
                int spanEnd = b0Var.f599c.getSpanEnd(zVar);
                if (spanStart != i5) {
                    b0Var.removeSpan(zVar);
                }
                i4 = Math.min(spanStart, i4);
                i5 = Math.max(spanEnd, i5);
            }
        }
        if (i4 != i5 && i4 < charSequence.length()) {
            r rVar = new r((w) sVar.f635b.f2225d);
            int iCodePointAt = Character.codePointAt(charSequence, i4);
            int i6 = 0;
            b0 b0Var2 = b0Var;
            loop1: while (true) {
                iCharCount = i4;
                while (true) {
                    if (i4 >= i5 || i6 >= Integer.MAX_VALUE) {
                        break loop1;
                    }
                    int iA = rVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i5) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i4 = iCharCount;
                    } else if (iA == 2) {
                        i4 += Character.charCount(iCodePointAt);
                        if (i4 < i5) {
                            iCodePointAt = Character.codePointAt(charSequence, i4);
                        }
                    } else if (iA != 3) {
                    }
                }
                if (z4 || !sVar.b(charSequence, iCharCount, i4, rVar.f631d.f650b)) {
                    if (b0Var2 == null) {
                        b0Var2 = new b0((Spannable) new SpannableString(charSequence));
                    }
                    q qVar = rVar.f631d.f650b;
                    sVar.f634a.getClass();
                    b0Var2.setSpan(new z(qVar), iCharCount, i4, 33);
                    i6++;
                }
            }
            if (rVar.f628a == 2 && rVar.f630c.f650b != null && ((rVar.f633f > 1 || rVar.c()) && i6 < Integer.MAX_VALUE && (z4 || !sVar.b(charSequence, iCharCount, i4, rVar.f630c.f650b)))) {
                if (b0Var2 == null) {
                    b0Var2 = new b0(charSequence);
                }
                q qVar2 = rVar.f630c.f650b;
                sVar.f634a.getClass();
                b0Var2.setSpan(new z(qVar2), iCharCount, i4, 33);
            }
            if (b0Var2 != null) {
                return b0Var2.f599c;
            }
            if (!z5) {
                return charSequence;
            }
        } else if (!z5) {
            return charSequence;
        }
        return charSequence;
    }

    public final void H(EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        a2.a aVar = (a2.a) this.f604e.f2224c;
        int iA = aVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) aVar.f3879d).getInt(iA + aVar.f3876a) : 0);
        Bundle bundle2 = editorInfo.extras;
        ((m) this.f1896c).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
