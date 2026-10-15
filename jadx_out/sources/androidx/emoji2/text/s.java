package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.e f634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.h f635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f636c;

    public s(g.h hVar, f2.e eVar, f fVar) {
        this.f634a = eVar;
        this.f635b = hVar;
        this.f636c = fVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z4) {
        z[] zVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (zVarArr = (z[]) editable.getSpans(selectionStart, selectionEnd, z.class)) != null && zVarArr.length > 0) {
            for (z zVar : zVarArr) {
                int spanStart = editable.getSpanStart(zVar);
                int spanEnd = editable.getSpanEnd(zVar);
                if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i4, int i5, q qVar) {
        if (qVar.f627c == 0) {
            j jVar = this.f636c;
            q0.a aVarC = qVar.c();
            int iA = aVarC.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarC.f3879d).getShort(iA + aVarC.f3876a);
            }
            f fVar = (f) jVar;
            fVar.getClass();
            ThreadLocal threadLocal = f.f600b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i4 < i5) {
                sb.append(charSequence.charAt(i4));
                i4++;
            }
            TextPaint textPaint = fVar.f601a;
            String string = sb.toString();
            int i6 = b0.e.f1085a;
            qVar.f627c = b0.d.a(textPaint, string) ? 2 : 1;
        }
        return qVar.f627c == 2;
    }
}
