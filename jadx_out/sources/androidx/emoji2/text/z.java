package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class z extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f656b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f655a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f657c = 1.0f;

    public z(q qVar) {
        if (qVar == null) {
            throw new NullPointerException("metadata cannot be null");
        }
        this.f656b = qVar;
    }

    @Override // android.text.style.ReplacementSpan
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f655a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        q qVar = this.f656b;
        q0.a aVarC = qVar.c();
        int iA = aVarC.a(14);
        this.f657c = fAbs / (iA != 0 ? ((ByteBuffer) aVarC.f3879d).getShort(iA + aVarC.f3876a) : (short) 0);
        q0.a aVarC2 = qVar.c();
        int iA2 = aVarC2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) aVarC2.f3879d).getShort(iA2 + aVarC2.f3876a);
        }
        q0.a aVarC3 = qVar.c();
        int iA3 = aVarC3.a(12);
        short s4 = (short) ((iA3 != 0 ? ((ByteBuffer) aVarC3.f3879d).getShort(iA3 + aVarC3.f3876a) : (short) 0) * this.f657c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s4;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f5, int i6, int i7, int i8, Paint paint) {
        m.a().getClass();
        q qVar = this.f656b;
        g.h hVar = qVar.f626b;
        Typeface typeface = (Typeface) hVar.f2226e;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) hVar.f2223b, qVar.f625a * 2, 2, f5, i7, paint);
        paint.setTypeface(typeface2);
    }
}
