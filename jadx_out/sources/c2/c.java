package c2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import c3.h;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f1239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TextPaint f1240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f1241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f1242m;

    public c(d dVar, Context context, TextPaint textPaint, h hVar) {
        this.f1242m = dVar;
        this.f1239j = context;
        this.f1240k = textPaint;
        this.f1241l = hVar;
    }

    @Override // c3.h
    public final void G1(int i4) {
        this.f1241l.G1(i4);
    }

    @Override // c3.h
    public final void I1(Typeface typeface, boolean z4) {
        this.f1242m.g(this.f1239j, this.f1240k, typeface);
        this.f1241l.I1(typeface, z4);
    }
}
