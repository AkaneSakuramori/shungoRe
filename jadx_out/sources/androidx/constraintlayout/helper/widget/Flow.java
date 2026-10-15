package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import r.c;
import r.d;
import r.e;
import r.f;
import r.g;
import r.h;
import s.b;
import s.n;
import u.r;
import u.t;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f510k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4505b = new int[32];
        this.f4511h = new HashMap();
        this.f4507d = context;
        g(attributeSet);
    }

    @Override // u.t, u.c
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        g gVar = new g();
        gVar.f4008s0 = 0;
        gVar.f4009t0 = 0;
        gVar.f4010u0 = 0;
        gVar.f4011v0 = 0;
        gVar.f4012w0 = 0;
        gVar.f4013x0 = 0;
        gVar.f4014y0 = false;
        gVar.f4015z0 = 0;
        gVar.A0 = 0;
        gVar.B0 = new b();
        gVar.C0 = null;
        gVar.D0 = -1;
        gVar.E0 = -1;
        gVar.F0 = -1;
        gVar.G0 = -1;
        gVar.H0 = -1;
        gVar.I0 = -1;
        gVar.J0 = 0.5f;
        gVar.K0 = 0.5f;
        gVar.L0 = 0.5f;
        gVar.M0 = 0.5f;
        gVar.N0 = 0.5f;
        gVar.O0 = 0.5f;
        gVar.P0 = 0;
        gVar.Q0 = 0;
        gVar.R0 = 2;
        gVar.S0 = 2;
        gVar.T0 = 0;
        gVar.U0 = -1;
        gVar.V0 = 0;
        gVar.W0 = new ArrayList();
        gVar.X0 = null;
        gVar.Y0 = null;
        gVar.Z0 = null;
        gVar.b1 = 0;
        this.f510k = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4658b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == 0) {
                    this.f510k.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f510k;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f4008s0 = dimensionPixelSize;
                    gVar2.f4009t0 = dimensionPixelSize;
                    gVar2.f4010u0 = dimensionPixelSize;
                    gVar2.f4011v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f510k;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f4010u0 = dimensionPixelSize2;
                    gVar3.f4012w0 = dimensionPixelSize2;
                    gVar3.f4013x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f510k.f4011v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f510k.f4012w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f510k.f4008s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f510k.f4013x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f510k.f4009t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f510k.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f510k.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f510k.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f510k.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f510k.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f510k.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f510k.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f510k.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f510k.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f510k.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f510k.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f510k.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f510k.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f510k.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f510k.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f510k.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f510k.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f510k.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f4508e = this.f510k;
        i();
    }

    @Override // u.c
    public final void h(d dVar, boolean z4) {
        g gVar = this.f510k;
        int i4 = gVar.f4010u0;
        if (i4 > 0 || gVar.f4011v0 > 0) {
            if (z4) {
                gVar.f4012w0 = gVar.f4011v0;
                gVar.f4013x0 = i4;
            } else {
                gVar.f4012w0 = i4;
                gVar.f4013x0 = gVar.f4011v0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0203  */
    /* JADX WARN: Code duplicated, block: B:110:0x020b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0227  */
    /* JADX WARN: Code duplicated, block: B:115:0x0232  */
    /* JADX WARN: Code duplicated, block: B:117:0x0242  */
    /* JADX WARN: Code duplicated, block: B:134:0x027f A[PHI: r1 r30
      0x027f: PHI (r1v85 r.f) = (r1v83 r.f), (r1v87 r.f) binds: [B:136:0x0284, B:133:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r30v18 r.d[]) = (r30v15 r.d[]), (r30v19 r.d[]) binds: [B:136:0x0284, B:133:0x0263] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x0286  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:151:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:154:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:163:0x0306  */
    /* JADX WARN: Code duplicated, block: B:166:0x0338  */
    /* JADX WARN: Code duplicated, block: B:168:0x0344  */
    /* JADX WARN: Code duplicated, block: B:170:0x034a  */
    /* JADX WARN: Code duplicated, block: B:171:0x035d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0391  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:180:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:182:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:189:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:192:0x03da  */
    /* JADX WARN: Code duplicated, block: B:195:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:196:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:198:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:200:0x03ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:205:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:208:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:214:0x040b  */
    /* JADX WARN: Code duplicated, block: B:223:0x041d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x041f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0429  */
    /* JADX WARN: Code duplicated, block: B:230:0x0439  */
    /* JADX WARN: Code duplicated, block: B:239:0x0450  */
    /* JADX WARN: Code duplicated, block: B:242:0x0457  */
    /* JADX WARN: Code duplicated, block: B:244:0x045a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0460  */
    /* JADX WARN: Code duplicated, block: B:257:0x047e  */
    /* JADX WARN: Code duplicated, block: B:262:0x0492  */
    /* JADX WARN: Code duplicated, block: B:267:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:269:0x04ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:270:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:275:0x04be  */
    /* JADX WARN: Code duplicated, block: B:277:0x04c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:278:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:283:0x04da  */
    /* JADX WARN: Code duplicated, block: B:286:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:287:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:292:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:295:0x0516  */
    /* JADX WARN: Code duplicated, block: B:297:0x0531  */
    /* JADX WARN: Code duplicated, block: B:299:0x0537  */
    /* JADX WARN: Code duplicated, block: B:301:0x0545  */
    /* JADX WARN: Code duplicated, block: B:319:0x058a A[PHI: r0 r8 r21 r30
      0x058a: PHI (r0v33 r.d) = (r0v30 r.d), (r0v34 r.d) binds: [B:321:0x0592, B:318:0x0568] A[DONT_GENERATE, DONT_INLINE]
      0x058a: PHI (r8v27 r.f) = (r8v25 r.f), (r8v30 r.f) binds: [B:321:0x0592, B:318:0x0568] A[DONT_GENERATE, DONT_INLINE]
      0x058a: PHI (r21v8 int[]) = (r21v6 int[]), (r21v9 int[]) binds: [B:321:0x0592, B:318:0x0568] A[DONT_GENERATE, DONT_INLINE]
      0x058a: PHI (r30v5 int) = (r30v3 int), (r30v6 int) binds: [B:321:0x0592, B:318:0x0568] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:322:0x0594  */
    /* JADX WARN: Code duplicated, block: B:325:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:327:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:329:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:347:0x0608 A[PHI: r8 r36
      0x0608: PHI (r8v12 r.f) = (r8v10 r.f), (r8v15 r.f) binds: [B:349:0x060e, B:346:0x05e6] A[DONT_GENERATE, DONT_INLINE]
      0x0608: PHI (r36v3 r.d[]) = (r36v1 r.d[]), (r36v4 r.d[]) binds: [B:349:0x060e, B:346:0x05e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:350:0x0610  */
    /* JADX WARN: Code duplicated, block: B:358:0x0639  */
    /* JADX WARN: Code duplicated, block: B:363:0x0641  */
    /* JADX WARN: Code duplicated, block: B:365:0x0649  */
    /* JADX WARN: Code duplicated, block: B:366:0x0653  */
    /* JADX WARN: Code duplicated, block: B:370:0x066e  */
    /* JADX WARN: Code duplicated, block: B:372:0x0676  */
    /* JADX WARN: Code duplicated, block: B:374:0x067a  */
    /* JADX WARN: Code duplicated, block: B:375:0x068b  */
    /* JADX WARN: Code duplicated, block: B:378:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:380:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:382:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:383:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:386:0x0716  */
    /* JADX WARN: Code duplicated, block: B:390:0x072b  */
    /* JADX WARN: Code duplicated, block: B:393:0x0748  */
    /* JADX WARN: Code duplicated, block: B:395:0x074e  */
    /* JADX WARN: Code duplicated, block: B:396:0x0764  */
    /* JADX WARN: Code duplicated, block: B:399:0x07a7 A[LOOP:18: B:398:0x07a5->B:399:0x07a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:403:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:404:0x07d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:405:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:407:0x07e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:408:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:409:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:411:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:412:0x07ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:413:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:414:0x07f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:415:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:416:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:419:0x0809  */
    /* JADX WARN: Code duplicated, block: B:420:0x080b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:430:0x00d8 A[EDGE_INSN: B:430:0x00d8->B:59:0x00d8 BREAK  A[LOOP:1: B:53:0x00c4->B:58:0x00d4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x03e0 A[EDGE_INSN: B:449:0x03e0->B:194:0x03e0 BREAK  A[LOOP:7: B:183:0x03c6->B:193:0x03dd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:465:0x04b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x04cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:470:0x0405 A[EDGE_INSN: B:470:0x0405->B:210:0x0405 BREAK  A[LOOP:13: B:199:0x03eb->B:209:0x0402], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00da  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:72:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:76:0x012b  */
    /* JADX WARN: Code duplicated, block: B:78:0x012e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0142  */
    /* JADX WARN: Code duplicated, block: B:83:0x0147  */
    /* JADX WARN: Code duplicated, block: B:85:0x0180  */
    /* JADX WARN: Code duplicated, block: B:87:0x0186  */
    /* JADX WARN: Code duplicated, block: B:89:0x019c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // u.t
    public final void j(g gVar, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        d[] dVarArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr2;
        int i16;
        d[] dVarArr2;
        int i17;
        ArrayList arrayList;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int[] iArr3;
        int i27;
        f fVar;
        int i28;
        char c5;
        char c6;
        int i29;
        int i30;
        int i31;
        int iMin;
        int iMin2;
        boolean z4;
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        int[] iArr4;
        d[] dVarArr3;
        int i32;
        ArrayList arrayList2;
        int i33;
        f fVar2;
        int[] iArr5;
        int i34;
        f fVar3;
        int i35;
        int i36;
        int i37;
        d dVar;
        int iT;
        boolean z5;
        d[] dVarArr4;
        int i38;
        int size;
        int i39;
        int i40;
        boolean z6;
        int i41;
        c cVar5;
        c cVar6;
        c cVar7;
        int i42;
        int i43;
        int i44;
        int i45;
        c cVar8;
        f fVar4;
        ArrayList arrayList3;
        int iD;
        int iC;
        int i46;
        f fVar5;
        f fVar6;
        int i47;
        int i48;
        d dVar2;
        int iU;
        boolean z7;
        int[] iArr6;
        d dVar3;
        int i49;
        int i50;
        d[] dVarArr5;
        int i51;
        int i52;
        int iCeil;
        int iCeil2;
        int i53;
        int i54;
        int i55;
        d dVar4;
        int iT2;
        boolean z8;
        d[] dVarArr6;
        Object obj;
        d[] dVarArr7;
        int i56;
        int i57;
        int iU2;
        int i58;
        int iT3;
        d dVar5;
        d dVar6;
        int i59;
        int i60;
        d[] dVarArr8;
        d dVar7;
        d dVar8;
        d dVar9;
        int i61;
        int i62;
        int i63;
        d dVar10;
        int iU3;
        int i64;
        f fVar7;
        int i65;
        int i66;
        ArrayList arrayList4;
        int i67;
        int i68;
        int i69;
        int i70;
        int i71;
        d dVar11;
        int iT4;
        boolean z9;
        d[] dVarArr9;
        int i72;
        int size2;
        int i73;
        int i74;
        int i75;
        boolean z10;
        int i76;
        c cVar9;
        c cVar10;
        c cVar11;
        c cVar12;
        int i77;
        int i78;
        int i79;
        f fVar8;
        ArrayList arrayList5;
        int iD2;
        int iC2;
        int i80;
        f fVar9;
        int i81;
        int i82;
        int i83;
        d dVar12;
        int i84;
        int iU4;
        boolean z11;
        int i85;
        int i86;
        int i87;
        d dVar13;
        int mode = View.MeasureSpec.getMode(i4);
        int size3 = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size4 = View.MeasureSpec.getSize(i5);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (gVar.f4023r0 <= 0) {
            i6 = gVar.f4012w0;
            i7 = gVar.f4013x0;
            i8 = gVar.f4008s0;
            i9 = gVar.f4009t0;
            iArr = new int[2];
            i10 = (size3 - i6) - i7;
            i11 = gVar.V0;
            if (i11 == 1) {
                i10 = (size4 - i8) - i9;
            }
            if (i11 == 0) {
                if (gVar.D0 == -1) {
                    gVar.D0 = 0;
                }
                if (gVar.E0 == -1) {
                    gVar.E0 = 0;
                }
            } else {
                if (gVar.D0 == -1) {
                    gVar.D0 = 0;
                }
                if (gVar.E0 == -1) {
                    gVar.E0 = 0;
                }
            }
            dVarArr = gVar.f4022q0;
            i12 = 0;
            i13 = 0;
            while (true) {
                i14 = gVar.f4023r0;
                if (i12 < i14) {
                    break;
                }
                if (gVar.f4022q0[i12].f3951g0 == 8) {
                    i13++;
                }
                i12++;
            }
            if (i13 > 0) {
                dVarArr = new d[i14 - i13];
                i87 = 0;
                i16 = 0;
                while (i87 < gVar.f4023r0) {
                    dVar13 = gVar.f4022q0[i87];
                    int i88 = i10;
                    int[] iArr7 = iArr;
                    if (dVar13.f3951g0 != 8) {
                        dVarArr[i16] = dVar13;
                        i16++;
                    }
                    i87++;
                    i10 = i88;
                    iArr = iArr7;
                }
                i15 = i10;
                iArr2 = iArr;
            } else {
                i15 = i10;
                iArr2 = iArr;
                i16 = i14;
            }
            dVarArr2 = dVarArr;
            gVar.f4007a1 = dVarArr2;
            gVar.b1 = i16;
            i17 = gVar.T0;
            arrayList = gVar.W0;
            if (i17 != 0) {
                cVar = gVar.J;
                cVar2 = gVar.I;
                cVar3 = gVar.K;
                cVar4 = gVar.L;
                iArr4 = gVar.f3969p0;
                if (i17 != 1) {
                    i25 = size4;
                    if (i17 != 2) {
                        i18 = i9;
                        i19 = i8;
                        i20 = i7;
                        i21 = i6;
                        i22 = mode;
                        i23 = size3;
                        i24 = mode2;
                        dVarArr5 = dVarArr2;
                        i51 = i15;
                        iArr3 = iArr2;
                        i52 = gVar.V0;
                        if (i52 == 0) {
                            i61 = gVar.U0;
                            if (i61 <= 0) {
                                i63 = 0;
                                iCeil2 = 0;
                                for (i62 = 0; i62 < i16; i62++) {
                                    if (i62 > 0) {
                                        i63 += gVar.P0;
                                    }
                                    dVar10 = dVarArr5[i62];
                                    if (dVar10 != null) {
                                        iU3 = gVar.U(i51, dVar10) + i63;
                                        if (iU3 > i51) {
                                            break;
                                        }
                                        iCeil2++;
                                        i63 = iU3;
                                    }
                                }
                            } else {
                                iCeil2 = i61;
                            }
                            iCeil = 0;
                        } else {
                            iCeil = gVar.U0;
                            if (iCeil <= 0) {
                                i54 = 0;
                                i55 = 0;
                                for (i53 = 0; i53 < i16; i53++) {
                                    if (i53 > 0) {
                                        i54 += gVar.Q0;
                                    }
                                    dVar4 = dVarArr5[i53];
                                    if (dVar4 != null) {
                                        iT2 = gVar.T(i51, dVar4) + i54;
                                        if (iT2 > i51) {
                                            break;
                                        }
                                        i55++;
                                        i54 = iT2;
                                    }
                                }
                                iCeil = i55;
                            }
                            iCeil2 = 0;
                        }
                        if (gVar.Z0 == null) {
                            gVar.Z0 = new int[2];
                        }
                        z8 = (iCeil != 0 && i52 == 1) || (iCeil2 == 0 && i52 == 0);
                        while (!z8) {
                            if (i52 == 0) {
                                iCeil = (int) Math.ceil(i16 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i16 / iCeil);
                            }
                            dVarArr6 = gVar.Y0;
                            if (dVarArr6 != null || dVarArr6.length < iCeil2) {
                                obj = null;
                                gVar.Y0 = new d[iCeil2];
                            } else {
                                obj = null;
                                Arrays.fill(dVarArr6, (Object) null);
                            }
                            dVarArr7 = gVar.X0;
                            if (dVarArr7 != null || dVarArr7.length < iCeil) {
                                gVar.X0 = new d[iCeil];
                            } else {
                                Arrays.fill(dVarArr7, obj);
                            }
                            for (i56 = 0; i56 < iCeil2; i56++) {
                                i59 = 0;
                                while (i59 < iCeil) {
                                    i60 = (i59 * iCeil2) + i56;
                                    if (i52 == 1) {
                                        i60 = (i56 * iCeil) + i59;
                                    }
                                    dVarArr8 = dVarArr5;
                                    if (i60 < dVarArr8.length && (dVar7 = dVarArr8[i60]) != null) {
                                        int iU5 = gVar.U(i51, dVar7);
                                        dVar8 = gVar.Y0[i56];
                                        if (dVar8 != null || dVar8.r() < iU5) {
                                            gVar.Y0[i56] = dVar7;
                                        }
                                        int iT5 = gVar.T(i51, dVar7);
                                        dVar9 = gVar.X0[i59];
                                        if (dVar9 != null || dVar9.l() < iT5) {
                                            gVar.X0[i59] = dVar7;
                                        }
                                    }
                                    i59++;
                                    dVarArr5 = dVarArr8;
                                }
                            }
                            d[] dVarArr10 = dVarArr5;
                            iU2 = 0;
                            for (i57 = 0; i57 < iCeil2; i57++) {
                                dVar6 = gVar.Y0[i57];
                                if (dVar6 == null) {
                                    if (i57 > 0) {
                                        iU2 += gVar.P0;
                                    }
                                    iU2 = gVar.U(i51, dVar6) + iU2;
                                }
                            }
                            iT3 = 0;
                            for (i58 = 0; i58 < iCeil; i58++) {
                                dVar5 = gVar.X0[i58];
                                if (dVar5 == null) {
                                    if (i58 > 0) {
                                        iT3 += gVar.Q0;
                                    }
                                    iT3 = gVar.T(i51, dVar5) + iT3;
                                }
                            }
                            iArr3[0] = iU2;
                            iArr3[1] = iT3;
                            if (i52 == 0) {
                                if (iU2 > i51 || iCeil2 <= 1) {
                                    z8 = true;
                                } else {
                                    iCeil2--;
                                }
                            } else if (iT3 > i51 || iCeil <= 1) {
                                z8 = true;
                            } else {
                                iCeil--;
                            }
                            dVarArr5 = dVarArr10;
                        }
                        int[] iArr8 = gVar.Z0;
                        iArr8[0] = iCeil2;
                        iArr8[1] = iCeil;
                    } else if (i17 != 3) {
                        i18 = i9;
                        i19 = i8;
                        i20 = i7;
                        i21 = i6;
                        i22 = mode;
                        i23 = size3;
                        i24 = mode2;
                        iArr3 = iArr2;
                    } else {
                        i64 = gVar.V0;
                        if (i16 == 0) {
                            i18 = i9;
                            i19 = i8;
                            i20 = i7;
                            i21 = i6;
                            i22 = mode;
                            i23 = size3;
                            i24 = mode2;
                            iArr3 = iArr2;
                        } else {
                            arrayList.clear();
                            i65 = i15;
                            iArr3 = iArr2;
                            i18 = i9;
                            i19 = i8;
                            i66 = i7;
                            i21 = i6;
                            i24 = mode2;
                            arrayList4 = arrayList;
                            fVar7 = new f(gVar, i64, gVar.I, gVar.J, gVar.K, gVar.L, i65);
                            arrayList4.add(fVar7);
                            if (i64 == 0) {
                                i81 = 0;
                                i71 = 0;
                                i82 = 0;
                                i83 = 0;
                                while (i83 < i16) {
                                    int i89 = i81 + 1;
                                    dVar12 = dVarArr2[i83];
                                    i84 = i65;
                                    iU4 = gVar.U(i84, dVar12);
                                    if (dVar12.f3969p0[0] == 3) {
                                        i71++;
                                    }
                                    int i90 = i71;
                                    z11 = (i82 != i84 || (gVar.P0 + i82) + iU4 > i84) && fVar7.f3990b != null;
                                    if ((!z11 || i83 <= 0 || (i86 = gVar.U0) <= 0 || i89 <= i86) && !z11) {
                                        i65 = i84;
                                        i85 = i83;
                                        if (i85 > 0) {
                                            i82 = gVar.P0 + iU4 + i82;
                                        } else {
                                            i82 = iU4;
                                        }
                                        i81 = 0;
                                    } else {
                                        i65 = i84;
                                        i85 = i83;
                                        f fVar10 = new f(gVar, i64, gVar.I, gVar.J, gVar.K, gVar.L, i65);
                                        fVar10.f4002n = i85;
                                        arrayList4.add(fVar10);
                                        fVar7 = fVar10;
                                        i82 = iU4;
                                        i81 = i89;
                                    }
                                    fVar7.a(dVar12);
                                    i83 = i85 + 1;
                                    i71 = i90;
                                    size3 = size3;
                                    mode = mode;
                                    i66 = i66;
                                }
                                i22 = mode;
                                i23 = size3;
                                i20 = i66;
                                i70 = i65;
                            } else {
                                i22 = mode;
                                i23 = size3;
                                i20 = i66;
                                i67 = 0;
                                i68 = 0;
                                i69 = 0;
                                while (i69 < i16) {
                                    dVar11 = dVarArr2[i69];
                                    int i91 = i65;
                                    iT4 = gVar.T(i91, dVar11);
                                    if (dVar11.f3969p0[1] == 3) {
                                        i67++;
                                    }
                                    int i92 = i67;
                                    z9 = (i68 != i91 || (gVar.Q0 + i68) + iT4 > i91) && fVar7.f3990b != null;
                                    if ((!z9 || i69 <= 0 || (i72 = gVar.U0) <= 0 || i72 >= 0) && !z9) {
                                        dVarArr9 = dVarArr2;
                                        if (i69 > 0) {
                                            i68 = gVar.Q0 + iT4 + i68;
                                        }
                                        fVar7.a(dVar11);
                                        i69++;
                                        i67 = i92;
                                        dVarArr2 = dVarArr9;
                                        i65 = i91;
                                    } else {
                                        dVarArr9 = dVarArr2;
                                        f fVar11 = new f(gVar, i64, gVar.I, gVar.J, gVar.K, gVar.L, i91);
                                        fVar11.f4002n = i69;
                                        arrayList4.add(fVar11);
                                        fVar7 = fVar11;
                                    }
                                    i68 = iT4;
                                    fVar7.a(dVar11);
                                    i69++;
                                    i67 = i92;
                                    dVarArr2 = dVarArr9;
                                    i65 = i91;
                                }
                                i70 = i65;
                                i71 = i67;
                            }
                            size2 = arrayList4.size();
                            int i93 = gVar.f4012w0;
                            i73 = gVar.f4008s0;
                            i74 = gVar.f4013x0;
                            i75 = gVar.f4009t0;
                            if (iArr4[0] != 2 || iArr4[1] == 2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (i71 > 0 && z10) {
                                for (i80 = 0; i80 < size2; i80++) {
                                    fVar9 = (f) arrayList4.get(i80);
                                    if (i64 == 0) {
                                        fVar9.e(i70 - fVar9.d());
                                    } else {
                                        fVar9.e(i70 - fVar9.c());
                                    }
                                }
                            }
                            i76 = i93;
                            cVar9 = cVar;
                            cVar10 = cVar2;
                            cVar11 = cVar3;
                            cVar12 = cVar4;
                            i77 = 0;
                            i78 = 0;
                            i79 = 0;
                            while (i77 < size2) {
                                fVar8 = (f) arrayList4.get(i77);
                                if (i64 == 0) {
                                    if (i77 < size2 - 1) {
                                        cVar12 = ((f) arrayList4.get(i77 + 1)).f3990b.J;
                                        i75 = 0;
                                    } else {
                                        i75 = gVar.f4009t0;
                                        cVar12 = cVar4;
                                    }
                                    c cVar13 = fVar8.f3990b.L;
                                    fVar8.f(i64, cVar10, cVar9, cVar11, cVar12, i76, i73, i74, i75, i70);
                                    int iMax = Math.max(i78, fVar8.d());
                                    iC2 = fVar8.c() + i79;
                                    if (i77 > 0) {
                                        iC2 += gVar.Q0;
                                    }
                                    size2 = size2;
                                    i78 = iMax;
                                    i79 = iC2;
                                    cVar9 = cVar13;
                                    arrayList4 = arrayList4;
                                    i73 = 0;
                                } else {
                                    arrayList5 = arrayList4;
                                    if (i77 < size2 - 1) {
                                        arrayList4 = arrayList5;
                                        cVar11 = ((f) arrayList4.get(i77 + 1)).f3990b.I;
                                        i74 = 0;
                                    } else {
                                        arrayList4 = arrayList5;
                                        i74 = gVar.f4013x0;
                                        cVar11 = cVar3;
                                    }
                                    c cVar14 = fVar8.f3990b.K;
                                    fVar8.f(i64, cVar10, cVar9, cVar11, cVar12, i76, i73, i74, i75, i70);
                                    iD2 = fVar8.d() + i78;
                                    int iMax2 = Math.max(i79, fVar8.c());
                                    if (i77 > 0) {
                                        iD2 += gVar.P0;
                                    }
                                    i78 = iD2;
                                    cVar10 = cVar14;
                                    i79 = iMax2;
                                    i76 = 0;
                                }
                                i77++;
                                size2 = size2;
                            }
                            iArr3[0] = i78;
                            iArr3[1] = i79;
                        }
                    }
                } else {
                    i18 = i9;
                    i19 = i8;
                    i20 = i7;
                    i21 = i6;
                    i22 = mode;
                    i23 = size3;
                    i24 = mode2;
                    i25 = size4;
                    dVarArr3 = dVarArr2;
                    i32 = i15;
                    iArr3 = iArr2;
                    arrayList2 = arrayList;
                    i33 = gVar.V0;
                    if (i16 != 0) {
                        arrayList2.clear();
                        fVar2 = new f(gVar, i33, gVar.I, gVar.J, gVar.K, gVar.L, i32);
                        arrayList2.add(fVar2);
                        if (i33 == 0) {
                            i36 = 0;
                            i47 = 0;
                            i48 = 0;
                            while (i48 < i16) {
                                dVar2 = dVarArr3[i48];
                                iU = gVar.U(i32, dVar2);
                                if (dVar2.f3969p0[0] == 3) {
                                    fVar6 = fVar2;
                                    i36++;
                                }
                                fVar6 = fVar2;
                                int i94 = i36;
                                z7 = (i47 != i32 || (gVar.P0 + i47) + iU > i32) && fVar6.f3990b != null;
                                if ((!z7 || i48 <= 0 || (i50 = gVar.U0) <= 0 || i48 % i50 != 0) && !z7) {
                                    iArr6 = iArr4;
                                    dVar3 = dVar2;
                                    i49 = i33;
                                    if (i48 > 0) {
                                        i47 = gVar.P0 + iU + i47;
                                    }
                                    fVar6.a(dVar3);
                                    i48++;
                                    i36 = i94;
                                    iArr4 = iArr6;
                                    i33 = i49;
                                } else {
                                    iArr6 = iArr4;
                                    dVar3 = dVar2;
                                    i49 = i33;
                                    f fVar12 = new f(gVar, i33, gVar.I, gVar.J, gVar.K, gVar.L, i32);
                                    fVar12.f4002n = i48;
                                    arrayList2.add(fVar12);
                                    fVar6 = fVar12;
                                }
                                i47 = iU;
                                fVar6.a(dVar3);
                                i48++;
                                i36 = i94;
                                iArr4 = iArr6;
                                i33 = i49;
                            }
                            fVar6 = fVar2;
                            iArr5 = iArr4;
                            i34 = i33;
                        } else {
                            iArr5 = iArr4;
                            i34 = i33;
                            i35 = 0;
                            i36 = 0;
                            i37 = 0;
                            while (i35 < i16) {
                                dVar = dVarArr3[i35];
                                iT = gVar.T(i32, dVar);
                                if (dVar.f3969p0[1] == 3) {
                                    fVar3 = fVar2;
                                    i36++;
                                }
                                fVar3 = fVar2;
                                int i95 = i36;
                                z5 = (i37 != i32 || (gVar.Q0 + i37) + iT > i32) && fVar3.f3990b != null;
                                if ((!z5 || i35 <= 0 || (i38 = gVar.U0) <= 0 || i35 % i38 != 0) && !z5) {
                                    dVarArr4 = dVarArr3;
                                    if (i35 > 0) {
                                        i37 = gVar.Q0 + iT + i37;
                                    }
                                    fVar3.a(dVar);
                                    i35++;
                                    i36 = i95;
                                    dVarArr3 = dVarArr4;
                                } else {
                                    dVarArr4 = dVarArr3;
                                    f fVar13 = new f(gVar, i34, gVar.I, gVar.J, gVar.K, gVar.L, i32);
                                    fVar13.f4002n = i35;
                                    arrayList2.add(fVar13);
                                    fVar3 = fVar13;
                                }
                                i37 = iT;
                                fVar3.a(dVar);
                                i35++;
                                i36 = i95;
                                dVarArr3 = dVarArr4;
                            }
                            fVar3 = fVar2;
                        }
                        size = arrayList2.size();
                        int i96 = gVar.f4012w0;
                        int i97 = gVar.f4008s0;
                        i39 = gVar.f4013x0;
                        i40 = gVar.f4009t0;
                        if (iArr5[0] != 2 || iArr5[1] == 2) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i36 > 0 && z6) {
                            for (i46 = 0; i46 < size; i46++) {
                                fVar5 = (f) arrayList2.get(i46);
                                if (i34 == 0) {
                                    fVar5.e(i32 - fVar5.d());
                                } else {
                                    fVar5.e(i32 - fVar5.c());
                                }
                            }
                        }
                        i41 = i97;
                        cVar5 = cVar2;
                        cVar6 = cVar3;
                        cVar7 = cVar4;
                        i42 = 0;
                        i43 = 0;
                        i44 = 0;
                        i45 = i96;
                        cVar8 = cVar;
                        while (i42 < size) {
                            fVar4 = (f) arrayList2.get(i42);
                            if (i34 == 0) {
                                if (i42 < size - 1) {
                                    cVar7 = ((f) arrayList2.get(i42 + 1)).f3990b.J;
                                    i40 = 0;
                                } else {
                                    i40 = gVar.f4009t0;
                                    cVar7 = cVar4;
                                }
                                c cVar15 = fVar4.f3990b.L;
                                fVar4.f(i34, cVar5, cVar8, cVar6, cVar7, i45, i41, i39, i40, i32);
                                int iMax3 = Math.max(i43, fVar4.d());
                                iC = fVar4.c() + i44;
                                if (i42 > 0) {
                                    iC += gVar.Q0;
                                }
                                size = size;
                                i43 = iMax3;
                                i44 = iC;
                                cVar8 = cVar15;
                                arrayList2 = arrayList2;
                                i41 = 0;
                            } else {
                                arrayList3 = arrayList2;
                                if (i42 < size - 1) {
                                    arrayList2 = arrayList3;
                                    cVar6 = ((f) arrayList2.get(i42 + 1)).f3990b.I;
                                    i39 = 0;
                                } else {
                                    arrayList2 = arrayList3;
                                    i39 = gVar.f4013x0;
                                    cVar6 = cVar3;
                                }
                                c cVar16 = fVar4.f3990b.K;
                                fVar4.f(i34, cVar5, cVar8, cVar6, cVar7, i45, i41, i39, i40, i32);
                                iD = fVar4.d() + i43;
                                int iMax4 = Math.max(i44, fVar4.c());
                                if (i42 > 0) {
                                    iD += gVar.P0;
                                }
                                i43 = iD;
                                i44 = iMax4;
                                i45 = 0;
                                cVar5 = cVar16;
                            }
                            i42++;
                            size = size;
                        }
                        iArr3[0] = i43;
                        iArr3[1] = i44;
                    }
                }
            } else {
                i18 = i9;
                i19 = i8;
                i20 = i7;
                i21 = i6;
                i22 = mode;
                i23 = size3;
                i24 = mode2;
                i25 = size4;
                i26 = i15;
                iArr3 = iArr2;
                i27 = gVar.V0;
                if (i16 == 0) {
                    if (arrayList.size() == 0) {
                        fVar = new f(gVar, i27, gVar.I, gVar.J, gVar.K, gVar.L, i26);
                        arrayList.add(fVar);
                    } else {
                        fVar = (f) arrayList.get(0);
                        fVar.f3991c = 0;
                        fVar.f3990b = null;
                        fVar.f4000l = 0;
                        fVar.f4001m = 0;
                        fVar.f4002n = 0;
                        fVar.f4003o = 0;
                        fVar.f4004p = 0;
                        fVar.f(i27, gVar.I, gVar.J, gVar.K, gVar.L, gVar.f4012w0, gVar.f4008s0, gVar.f4013x0, gVar.f4009t0, i26);
                    }
                    for (i28 = 0; i28 < i16; i28++) {
                        fVar.a(dVarArr2[i28]);
                    }
                    c5 = 0;
                    iArr3[0] = fVar.d();
                    c6 = 1;
                    iArr3[1] = fVar.c();
                }
                i29 = iArr3[c5] + i21 + i20;
                i30 = iArr3[c6] + i19 + i18;
                i31 = i22;
                if (i31 == 1073741824) {
                    iMin = i23;
                } else if (i31 == Integer.MIN_VALUE) {
                    iMin = Math.min(i29, i23);
                } else if (i31 == 0) {
                    iMin = i29;
                } else {
                    iMin = 0;
                }
                if (i24 == 1073741824) {
                    iMin2 = i25;
                } else if (i24 == -2147483648) {
                    iMin2 = Math.min(i30, i25);
                } else if (i24 == 0) {
                    iMin2 = i30;
                } else {
                    iMin2 = 0;
                }
                gVar.f4015z0 = iMin;
                gVar.A0 = iMin2;
                gVar.P(iMin);
                gVar.M(iMin2);
                if (gVar.f4023r0 > 0) {
                    z4 = c6;
                } else {
                    z4 = 0;
                }
                gVar.f4014y0 = z4;
            }
            c5 = 0;
            c6 = 1;
            i29 = iArr3[c5] + i21 + i20;
            i30 = iArr3[c6] + i19 + i18;
            i31 = i22;
            if (i31 == 1073741824) {
                iMin = i23;
            } else if (i31 == Integer.MIN_VALUE) {
                iMin = Math.min(i29, i23);
            } else if (i31 == 0) {
                iMin = i29;
            } else {
                iMin = 0;
            }
            if (i24 == 1073741824) {
                iMin2 = i25;
            } else if (i24 == -2147483648) {
                iMin2 = Math.min(i30, i25);
            } else if (i24 == 0) {
                iMin2 = i30;
            } else {
                iMin2 = 0;
            }
            gVar.f4015z0 = iMin;
            gVar.A0 = iMin2;
            gVar.P(iMin);
            gVar.M(iMin2);
            if (gVar.f4023r0 > 0) {
                z4 = c6;
            } else {
                z4 = 0;
            }
            gVar.f4014y0 = z4;
        } else {
            d dVar14 = gVar.T;
            n nVar = dVar14 != null ? ((e) dVar14).f3983u0 : null;
            if (nVar == null) {
                gVar.f4015z0 = 0;
                gVar.A0 = 0;
                gVar.f4014y0 = false;
            } else {
                for (int i98 = 0; i98 < gVar.f4023r0; i98++) {
                    d dVar15 = gVar.f4022q0[i98];
                    if (dVar15 != null && !(dVar15 instanceof h)) {
                        int iK = dVar15.k(0);
                        int iK2 = dVar15.k(1);
                        if (iK != 3 || dVar15.f3971r == 1 || iK2 != 3 || dVar15.f3972s == 1) {
                            if (iK == 3) {
                                iK = 2;
                            }
                            if (iK2 == 3) {
                                iK2 = 2;
                            }
                            b bVar = gVar.B0;
                            bVar.f4134a = iK;
                            bVar.f4135b = iK2;
                            bVar.f4136c = dVar15.r();
                            gVar.B0.f4137d = dVar15.l();
                            nVar.b(dVar15, gVar.B0);
                            dVar15.P(gVar.B0.f4138e);
                            dVar15.M(gVar.B0.f4139f);
                            dVar15.J(gVar.B0.f4140g);
                        }
                    }
                }
                i6 = gVar.f4012w0;
                i7 = gVar.f4013x0;
                i8 = gVar.f4008s0;
                i9 = gVar.f4009t0;
                iArr = new int[2];
                i10 = (size3 - i6) - i7;
                i11 = gVar.V0;
                if (i11 == 1) {
                    i10 = (size4 - i8) - i9;
                }
                if (i11 == 0) {
                    if (gVar.D0 == -1) {
                        gVar.D0 = 0;
                    }
                    if (gVar.E0 == -1) {
                        gVar.E0 = 0;
                    }
                } else {
                    if (gVar.D0 == -1) {
                        gVar.D0 = 0;
                    }
                    if (gVar.E0 == -1) {
                        gVar.E0 = 0;
                    }
                }
                dVarArr = gVar.f4022q0;
                i12 = 0;
                i13 = 0;
                while (true) {
                    i14 = gVar.f4023r0;
                    if (i12 < i14) {
                        break;
                        break;
                    } else {
                        if (gVar.f4022q0[i12].f3951g0 == 8) {
                            i13++;
                        }
                        i12++;
                    }
                }
                if (i13 > 0) {
                    dVarArr = new d[i14 - i13];
                    i87 = 0;
                    i16 = 0;
                    while (i87 < gVar.f4023r0) {
                        dVar13 = gVar.f4022q0[i87];
                        int i810 = i10;
                        int[] iArr9 = iArr;
                        if (dVar13.f3951g0 != 8) {
                            dVarArr[i16] = dVar13;
                            i16++;
                        }
                        i87++;
                        i10 = i810;
                        iArr = iArr9;
                    }
                    i15 = i10;
                    iArr2 = iArr;
                } else {
                    i15 = i10;
                    iArr2 = iArr;
                    i16 = i14;
                }
                dVarArr2 = dVarArr;
                gVar.f4007a1 = dVarArr2;
                gVar.b1 = i16;
                i17 = gVar.T0;
                arrayList = gVar.W0;
                if (i17 != 0) {
                    cVar = gVar.J;
                    cVar2 = gVar.I;
                    cVar3 = gVar.K;
                    cVar4 = gVar.L;
                    iArr4 = gVar.f3969p0;
                    if (i17 != 1) {
                        i25 = size4;
                        if (i17 != 2) {
                            i18 = i9;
                            i19 = i8;
                            i20 = i7;
                            i21 = i6;
                            i22 = mode;
                            i23 = size3;
                            i24 = mode2;
                            dVarArr5 = dVarArr2;
                            i51 = i15;
                            iArr3 = iArr2;
                            i52 = gVar.V0;
                            if (i52 == 0) {
                                i61 = gVar.U0;
                                if (i61 <= 0) {
                                    i63 = 0;
                                    iCeil2 = 0;
                                    while (i62 < i16) {
                                        if (i62 > 0) {
                                            i63 += gVar.P0;
                                        }
                                        dVar10 = dVarArr5[i62];
                                        if (dVar10 != null) {
                                            iU3 = gVar.U(i51, dVar10) + i63;
                                            if (iU3 > i51) {
                                                break;
                                                break;
                                            } else {
                                                iCeil2++;
                                                i63 = iU3;
                                            }
                                        }
                                    }
                                } else {
                                    iCeil2 = i61;
                                }
                                iCeil = 0;
                            } else {
                                iCeil = gVar.U0;
                                if (iCeil <= 0) {
                                    i54 = 0;
                                    i55 = 0;
                                    while (i53 < i16) {
                                        if (i53 > 0) {
                                            i54 += gVar.Q0;
                                        }
                                        dVar4 = dVarArr5[i53];
                                        if (dVar4 != null) {
                                            iT2 = gVar.T(i51, dVar4) + i54;
                                            if (iT2 > i51) {
                                                break;
                                                break;
                                            } else {
                                                i55++;
                                                i54 = iT2;
                                            }
                                        }
                                    }
                                    iCeil = i55;
                                }
                                iCeil2 = 0;
                            }
                            if (gVar.Z0 == null) {
                                gVar.Z0 = new int[2];
                            }
                            if (iCeil != 0) {
                            }
                            while (!z8) {
                                if (i52 == 0) {
                                    iCeil = (int) Math.ceil(i16 / iCeil2);
                                } else {
                                    iCeil2 = (int) Math.ceil(i16 / iCeil);
                                }
                                dVarArr6 = gVar.Y0;
                                if (dVarArr6 != null) {
                                    obj = null;
                                    gVar.Y0 = new d[iCeil2];
                                } else {
                                    obj = null;
                                    gVar.Y0 = new d[iCeil2];
                                }
                                dVarArr7 = gVar.X0;
                                if (dVarArr7 != null) {
                                    gVar.X0 = new d[iCeil];
                                } else {
                                    gVar.X0 = new d[iCeil];
                                }
                                while (i56 < iCeil2) {
                                    i59 = 0;
                                    while (i59 < iCeil) {
                                        i60 = (i59 * iCeil2) + i56;
                                        if (i52 == 1) {
                                            i60 = (i56 * iCeil) + i59;
                                        }
                                        dVarArr8 = dVarArr5;
                                        if (i60 < dVarArr8.length) {
                                            int iU6 = gVar.U(i51, dVar7);
                                            dVar8 = gVar.Y0[i56];
                                            if (dVar8 != null) {
                                                gVar.Y0[i56] = dVar7;
                                            } else {
                                                gVar.Y0[i56] = dVar7;
                                            }
                                            int iT6 = gVar.T(i51, dVar7);
                                            dVar9 = gVar.X0[i59];
                                            if (dVar9 != null) {
                                                gVar.X0[i59] = dVar7;
                                            } else {
                                                gVar.X0[i59] = dVar7;
                                            }
                                        }
                                        i59++;
                                        dVarArr5 = dVarArr8;
                                    }
                                }
                                d[] dVarArr11 = dVarArr5;
                                iU2 = 0;
                                while (i57 < iCeil2) {
                                    dVar6 = gVar.Y0[i57];
                                    if (dVar6 == null) {
                                        if (i57 > 0) {
                                            iU2 += gVar.P0;
                                        }
                                        iU2 = gVar.U(i51, dVar6) + iU2;
                                    }
                                }
                                iT3 = 0;
                                while (i58 < iCeil) {
                                    dVar5 = gVar.X0[i58];
                                    if (dVar5 == null) {
                                        if (i58 > 0) {
                                            iT3 += gVar.Q0;
                                        }
                                        iT3 = gVar.T(i51, dVar5) + iT3;
                                    }
                                }
                                iArr3[0] = iU2;
                                iArr3[1] = iT3;
                                if (i52 == 0) {
                                    if (iU2 > i51) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                } else if (iT3 > i51) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                dVarArr5 = dVarArr11;
                            }
                            int[] iArr10 = gVar.Z0;
                            iArr10[0] = iCeil2;
                            iArr10[1] = iCeil;
                        } else if (i17 != 3) {
                            i18 = i9;
                            i19 = i8;
                            i20 = i7;
                            i21 = i6;
                            i22 = mode;
                            i23 = size3;
                            i24 = mode2;
                            iArr3 = iArr2;
                        } else {
                            i64 = gVar.V0;
                            if (i16 == 0) {
                                i18 = i9;
                                i19 = i8;
                                i20 = i7;
                                i21 = i6;
                                i22 = mode;
                                i23 = size3;
                                i24 = mode2;
                                iArr3 = iArr2;
                            } else {
                                arrayList.clear();
                                i65 = i15;
                                iArr3 = iArr2;
                                i18 = i9;
                                i19 = i8;
                                i66 = i7;
                                i21 = i6;
                                i24 = mode2;
                                arrayList4 = arrayList;
                                fVar7 = new f(gVar, i64, gVar.I, gVar.J, gVar.K, gVar.L, i65);
                                arrayList4.add(fVar7);
                                if (i64 == 0) {
                                    i81 = 0;
                                    i71 = 0;
                                    i82 = 0;
                                    i83 = 0;
                                    while (i83 < i16) {
                                        int i811 = i81 + 1;
                                        dVar12 = dVarArr2[i83];
                                        i84 = i65;
                                        iU4 = gVar.U(i84, dVar12);
                                        if (dVar12.f3969p0[0] == 3) {
                                            i71++;
                                        }
                                        int i99 = i71;
                                        if (i82 != i84) {
                                        }
                                        if (z11) {
                                            i65 = i84;
                                            i85 = i83;
                                            if (i85 > 0) {
                                                i82 = gVar.P0 + iU4 + i82;
                                            } else {
                                                i82 = iU4;
                                            }
                                            i81 = 0;
                                        } else {
                                            i65 = i84;
                                            i85 = i83;
                                            if (i85 > 0) {
                                                i82 = gVar.P0 + iU4 + i82;
                                            } else {
                                                i82 = iU4;
                                            }
                                            i81 = 0;
                                        }
                                        fVar7.a(dVar12);
                                        i83 = i85 + 1;
                                        i71 = i99;
                                        size3 = size3;
                                        mode = mode;
                                        i66 = i66;
                                    }
                                    i22 = mode;
                                    i23 = size3;
                                    i20 = i66;
                                    i70 = i65;
                                } else {
                                    i22 = mode;
                                    i23 = size3;
                                    i20 = i66;
                                    i67 = 0;
                                    i68 = 0;
                                    i69 = 0;
                                    while (i69 < i16) {
                                        dVar11 = dVarArr2[i69];
                                        int i910 = i65;
                                        iT4 = gVar.T(i910, dVar11);
                                        if (dVar11.f3969p0[1] == 3) {
                                            i67++;
                                        }
                                        int i911 = i67;
                                        if (i68 != i910) {
                                        }
                                        if (z9) {
                                            dVarArr9 = dVarArr2;
                                            if (i69 > 0) {
                                                i68 = gVar.Q0 + iT4 + i68;
                                            } else {
                                                i68 = iT4;
                                            }
                                        } else {
                                            dVarArr9 = dVarArr2;
                                            if (i69 > 0) {
                                                i68 = gVar.Q0 + iT4 + i68;
                                            } else {
                                                i68 = iT4;
                                            }
                                        }
                                        fVar7.a(dVar11);
                                        i69++;
                                        i67 = i911;
                                        dVarArr2 = dVarArr9;
                                        i65 = i910;
                                    }
                                    i70 = i65;
                                    i71 = i67;
                                }
                                size2 = arrayList4.size();
                                int i912 = gVar.f4012w0;
                                i73 = gVar.f4008s0;
                                i74 = gVar.f4013x0;
                                i75 = gVar.f4009t0;
                                if (iArr4[0] != 2) {
                                    z10 = true;
                                } else {
                                    z10 = true;
                                }
                                if (i71 > 0) {
                                    while (i80 < size2) {
                                        fVar9 = (f) arrayList4.get(i80);
                                        if (i64 == 0) {
                                            fVar9.e(i70 - fVar9.d());
                                        } else {
                                            fVar9.e(i70 - fVar9.c());
                                        }
                                    }
                                }
                                i76 = i912;
                                cVar9 = cVar;
                                cVar10 = cVar2;
                                cVar11 = cVar3;
                                cVar12 = cVar4;
                                i77 = 0;
                                i78 = 0;
                                i79 = 0;
                                while (i77 < size2) {
                                    fVar8 = (f) arrayList4.get(i77);
                                    if (i64 == 0) {
                                        if (i77 < size2 - 1) {
                                            cVar12 = ((f) arrayList4.get(i77 + 1)).f3990b.J;
                                            i75 = 0;
                                        } else {
                                            i75 = gVar.f4009t0;
                                            cVar12 = cVar4;
                                        }
                                        c cVar17 = fVar8.f3990b.L;
                                        fVar8.f(i64, cVar10, cVar9, cVar11, cVar12, i76, i73, i74, i75, i70);
                                        int iMax5 = Math.max(i78, fVar8.d());
                                        iC2 = fVar8.c() + i79;
                                        if (i77 > 0) {
                                            iC2 += gVar.Q0;
                                        }
                                        size2 = size2;
                                        i78 = iMax5;
                                        i79 = iC2;
                                        cVar9 = cVar17;
                                        arrayList4 = arrayList4;
                                        i73 = 0;
                                    } else {
                                        arrayList5 = arrayList4;
                                        if (i77 < size2 - 1) {
                                            arrayList4 = arrayList5;
                                            cVar11 = ((f) arrayList4.get(i77 + 1)).f3990b.I;
                                            i74 = 0;
                                        } else {
                                            arrayList4 = arrayList5;
                                            i74 = gVar.f4013x0;
                                            cVar11 = cVar3;
                                        }
                                        c cVar18 = fVar8.f3990b.K;
                                        fVar8.f(i64, cVar10, cVar9, cVar11, cVar12, i76, i73, i74, i75, i70);
                                        iD2 = fVar8.d() + i78;
                                        int iMax6 = Math.max(i79, fVar8.c());
                                        if (i77 > 0) {
                                            iD2 += gVar.P0;
                                        }
                                        i78 = iD2;
                                        cVar10 = cVar18;
                                        i79 = iMax6;
                                        i76 = 0;
                                    }
                                    i77++;
                                    size2 = size2;
                                }
                                iArr3[0] = i78;
                                iArr3[1] = i79;
                            }
                        }
                    } else {
                        i18 = i9;
                        i19 = i8;
                        i20 = i7;
                        i21 = i6;
                        i22 = mode;
                        i23 = size3;
                        i24 = mode2;
                        i25 = size4;
                        dVarArr3 = dVarArr2;
                        i32 = i15;
                        iArr3 = iArr2;
                        arrayList2 = arrayList;
                        i33 = gVar.V0;
                        if (i16 != 0) {
                            arrayList2.clear();
                            fVar2 = new f(gVar, i33, gVar.I, gVar.J, gVar.K, gVar.L, i32);
                            arrayList2.add(fVar2);
                            if (i33 == 0) {
                                i36 = 0;
                                i47 = 0;
                                i48 = 0;
                                while (i48 < i16) {
                                    dVar2 = dVarArr3[i48];
                                    iU = gVar.U(i32, dVar2);
                                    if (dVar2.f3969p0[0] == 3) {
                                        fVar6 = fVar2;
                                        i36++;
                                    }
                                    fVar6 = fVar2;
                                    int i913 = i36;
                                    if (i47 != i32) {
                                    }
                                    if (z7) {
                                        iArr6 = iArr4;
                                        dVar3 = dVar2;
                                        i49 = i33;
                                        if (i48 > 0) {
                                            i47 = gVar.P0 + iU + i47;
                                        } else {
                                            i47 = iU;
                                        }
                                    } else {
                                        iArr6 = iArr4;
                                        dVar3 = dVar2;
                                        i49 = i33;
                                        if (i48 > 0) {
                                            i47 = gVar.P0 + iU + i47;
                                        } else {
                                            i47 = iU;
                                        }
                                    }
                                    fVar6.a(dVar3);
                                    i48++;
                                    i36 = i913;
                                    iArr4 = iArr6;
                                    i33 = i49;
                                }
                                fVar6 = fVar2;
                                iArr5 = iArr4;
                                i34 = i33;
                            } else {
                                iArr5 = iArr4;
                                i34 = i33;
                                i35 = 0;
                                i36 = 0;
                                i37 = 0;
                                while (i35 < i16) {
                                    dVar = dVarArr3[i35];
                                    iT = gVar.T(i32, dVar);
                                    if (dVar.f3969p0[1] == 3) {
                                        fVar3 = fVar2;
                                        i36++;
                                    }
                                    fVar3 = fVar2;
                                    int i914 = i36;
                                    if (i37 != i32) {
                                    }
                                    if (z5) {
                                        dVarArr4 = dVarArr3;
                                        if (i35 > 0) {
                                            i37 = gVar.Q0 + iT + i37;
                                        } else {
                                            i37 = iT;
                                        }
                                    } else {
                                        dVarArr4 = dVarArr3;
                                        if (i35 > 0) {
                                            i37 = gVar.Q0 + iT + i37;
                                        } else {
                                            i37 = iT;
                                        }
                                    }
                                    fVar3.a(dVar);
                                    i35++;
                                    i36 = i914;
                                    dVarArr3 = dVarArr4;
                                }
                                fVar3 = fVar2;
                            }
                            size = arrayList2.size();
                            int i915 = gVar.f4012w0;
                            int i916 = gVar.f4008s0;
                            i39 = gVar.f4013x0;
                            i40 = gVar.f4009t0;
                            if (iArr5[0] != 2) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            if (i36 > 0) {
                                while (i46 < size) {
                                    fVar5 = (f) arrayList2.get(i46);
                                    if (i34 == 0) {
                                        fVar5.e(i32 - fVar5.d());
                                    } else {
                                        fVar5.e(i32 - fVar5.c());
                                    }
                                }
                            }
                            i41 = i916;
                            cVar5 = cVar2;
                            cVar6 = cVar3;
                            cVar7 = cVar4;
                            i42 = 0;
                            i43 = 0;
                            i44 = 0;
                            i45 = i915;
                            cVar8 = cVar;
                            while (i42 < size) {
                                fVar4 = (f) arrayList2.get(i42);
                                if (i34 == 0) {
                                    if (i42 < size - 1) {
                                        cVar7 = ((f) arrayList2.get(i42 + 1)).f3990b.J;
                                        i40 = 0;
                                    } else {
                                        i40 = gVar.f4009t0;
                                        cVar7 = cVar4;
                                    }
                                    c cVar19 = fVar4.f3990b.L;
                                    fVar4.f(i34, cVar5, cVar8, cVar6, cVar7, i45, i41, i39, i40, i32);
                                    int iMax7 = Math.max(i43, fVar4.d());
                                    iC = fVar4.c() + i44;
                                    if (i42 > 0) {
                                        iC += gVar.Q0;
                                    }
                                    size = size;
                                    i43 = iMax7;
                                    i44 = iC;
                                    cVar8 = cVar19;
                                    arrayList2 = arrayList2;
                                    i41 = 0;
                                } else {
                                    arrayList3 = arrayList2;
                                    if (i42 < size - 1) {
                                        arrayList2 = arrayList3;
                                        cVar6 = ((f) arrayList2.get(i42 + 1)).f3990b.I;
                                        i39 = 0;
                                    } else {
                                        arrayList2 = arrayList3;
                                        i39 = gVar.f4013x0;
                                        cVar6 = cVar3;
                                    }
                                    c cVar110 = fVar4.f3990b.K;
                                    fVar4.f(i34, cVar5, cVar8, cVar6, cVar7, i45, i41, i39, i40, i32);
                                    iD = fVar4.d() + i43;
                                    int iMax8 = Math.max(i44, fVar4.c());
                                    if (i42 > 0) {
                                        iD += gVar.P0;
                                    }
                                    i43 = iD;
                                    i44 = iMax8;
                                    i45 = 0;
                                    cVar5 = cVar110;
                                }
                                i42++;
                                size = size;
                            }
                            iArr3[0] = i43;
                            iArr3[1] = i44;
                        }
                    }
                } else {
                    i18 = i9;
                    i19 = i8;
                    i20 = i7;
                    i21 = i6;
                    i22 = mode;
                    i23 = size3;
                    i24 = mode2;
                    i25 = size4;
                    i26 = i15;
                    iArr3 = iArr2;
                    i27 = gVar.V0;
                    if (i16 == 0) {
                        if (arrayList.size() == 0) {
                            fVar = new f(gVar, i27, gVar.I, gVar.J, gVar.K, gVar.L, i26);
                            arrayList.add(fVar);
                        } else {
                            fVar = (f) arrayList.get(0);
                            fVar.f3991c = 0;
                            fVar.f3990b = null;
                            fVar.f4000l = 0;
                            fVar.f4001m = 0;
                            fVar.f4002n = 0;
                            fVar.f4003o = 0;
                            fVar.f4004p = 0;
                            fVar.f(i27, gVar.I, gVar.J, gVar.K, gVar.L, gVar.f4012w0, gVar.f4008s0, gVar.f4013x0, gVar.f4009t0, i26);
                        }
                        while (i28 < i16) {
                            fVar.a(dVarArr2[i28]);
                        }
                        c5 = 0;
                        iArr3[0] = fVar.d();
                        c6 = 1;
                        iArr3[1] = fVar.c();
                    }
                    i29 = iArr3[c5] + i21 + i20;
                    i30 = iArr3[c6] + i19 + i18;
                    i31 = i22;
                    if (i31 == 1073741824) {
                        iMin = i23;
                    } else if (i31 == Integer.MIN_VALUE) {
                        iMin = Math.min(i29, i23);
                    } else if (i31 == 0) {
                        iMin = i29;
                    } else {
                        iMin = 0;
                    }
                    if (i24 == 1073741824) {
                        iMin2 = i25;
                    } else if (i24 == -2147483648) {
                        iMin2 = Math.min(i30, i25);
                    } else if (i24 == 0) {
                        iMin2 = i30;
                    } else {
                        iMin2 = 0;
                    }
                    gVar.f4015z0 = iMin;
                    gVar.A0 = iMin2;
                    gVar.P(iMin);
                    gVar.M(iMin2);
                    if (gVar.f4023r0 > 0) {
                        z4 = c6;
                    } else {
                        z4 = 0;
                    }
                    gVar.f4014y0 = z4;
                }
                c5 = 0;
                c6 = 1;
                i29 = iArr3[c5] + i21 + i20;
                i30 = iArr3[c6] + i19 + i18;
                i31 = i22;
                if (i31 == 1073741824) {
                    iMin = i23;
                } else if (i31 == Integer.MIN_VALUE) {
                    iMin = Math.min(i29, i23);
                } else if (i31 == 0) {
                    iMin = i29;
                } else {
                    iMin = 0;
                }
                if (i24 == 1073741824) {
                    iMin2 = i25;
                } else if (i24 == -2147483648) {
                    iMin2 = Math.min(i30, i25);
                } else if (i24 == 0) {
                    iMin2 = i30;
                } else {
                    iMin2 = 0;
                }
                gVar.f4015z0 = iMin;
                gVar.A0 = iMin2;
                gVar.P(iMin);
                gVar.M(iMin2);
                if (gVar.f4023r0 > 0) {
                    z4 = c6;
                } else {
                    z4 = 0;
                }
                gVar.f4014y0 = z4;
            }
        }
        setMeasuredDimension(gVar.f4015z0, gVar.A0);
    }

    @Override // u.c, android.view.View
    public final void onMeasure(int i4, int i5) {
        j(this.f510k, i4, i5);
    }

    public void setFirstHorizontalBias(float f5) {
        this.f510k.L0 = f5;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i4) {
        this.f510k.F0 = i4;
        requestLayout();
    }

    public void setFirstVerticalBias(float f5) {
        this.f510k.M0 = f5;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i4) {
        this.f510k.G0 = i4;
        requestLayout();
    }

    public void setHorizontalAlign(int i4) {
        this.f510k.R0 = i4;
        requestLayout();
    }

    public void setHorizontalBias(float f5) {
        this.f510k.J0 = f5;
        requestLayout();
    }

    public void setHorizontalGap(int i4) {
        this.f510k.P0 = i4;
        requestLayout();
    }

    public void setHorizontalStyle(int i4) {
        this.f510k.D0 = i4;
        requestLayout();
    }

    public void setLastHorizontalBias(float f5) {
        this.f510k.N0 = f5;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i4) {
        this.f510k.H0 = i4;
        requestLayout();
    }

    public void setLastVerticalBias(float f5) {
        this.f510k.O0 = f5;
        requestLayout();
    }

    public void setLastVerticalStyle(int i4) {
        this.f510k.I0 = i4;
        requestLayout();
    }

    public void setMaxElementsWrap(int i4) {
        this.f510k.U0 = i4;
        requestLayout();
    }

    public void setOrientation(int i4) {
        this.f510k.V0 = i4;
        requestLayout();
    }

    public void setPadding(int i4) {
        g gVar = this.f510k;
        gVar.f4008s0 = i4;
        gVar.f4009t0 = i4;
        gVar.f4010u0 = i4;
        gVar.f4011v0 = i4;
        requestLayout();
    }

    public void setPaddingBottom(int i4) {
        this.f510k.f4009t0 = i4;
        requestLayout();
    }

    public void setPaddingLeft(int i4) {
        this.f510k.f4012w0 = i4;
        requestLayout();
    }

    public void setPaddingRight(int i4) {
        this.f510k.f4013x0 = i4;
        requestLayout();
    }

    public void setPaddingTop(int i4) {
        this.f510k.f4008s0 = i4;
        requestLayout();
    }

    public void setVerticalAlign(int i4) {
        this.f510k.S0 = i4;
        requestLayout();
    }

    public void setVerticalBias(float f5) {
        this.f510k.K0 = f5;
        requestLayout();
    }

    public void setVerticalGap(int i4) {
        this.f510k.Q0 = i4;
        requestLayout();
    }

    public void setVerticalStyle(int i4) {
        this.f510k.E0 = i4;
        requestLayout();
    }

    public void setWrapMode(int i4) {
        this.f510k.T0 = i4;
        requestLayout();
    }
}
