package f2;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c3.h {
    @Override // c3.h
    public final void S0(float f5, float f6, w wVar) {
        wVar.d(f6 * f5, 180.0f, 90.0f);
        float f7 = f6 * 2.0f * f5;
        s sVar = new s(0.0f, 0.0f, f7, f7);
        sVar.f2133f = 180.0f;
        sVar.f2134g = 90.0f;
        wVar.f2146g.add(sVar);
        q qVar = new q(sVar);
        wVar.a(180.0f);
        wVar.f2147h.add(qVar);
        wVar.f2144e = 270.0f;
        float f8 = (0.0f + f7) * 0.5f;
        float f9 = (f7 - 0.0f) / 2.0f;
        double d5 = 270.0f;
        wVar.f2142c = (((float) Math.cos(Math.toRadians(d5))) * f9) + f8;
        wVar.f2143d = (f9 * ((float) Math.sin(Math.toRadians(d5)))) + f8;
    }
}
