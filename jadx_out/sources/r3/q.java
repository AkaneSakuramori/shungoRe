package r3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import i.u2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1.e f4112a = new g1.e("CLOSED_EMPTY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1.e f4113b = new g1.e("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1.e f4114c = new g1.e("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g1.e f4115d = new g1.e("COMPLETING_RETRY");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g1.e f4116e = new g1.e("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g1.e f4117f = new g1.e("SEALED");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z f4118g = new z(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z f4119h = new z(true);

    public static final void a(w3.a aVar, w3.c cVar, String str) {
        Logger loggerW = w3.f.f4913h.w();
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f4906b);
        sb.append(' ');
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        c3.h.a0(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(aVar.f4899a);
        loggerW.fine(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:184:0x0285  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:203:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:205:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:207:0x0303  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:408:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:409:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:412:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:413:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:416:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:417:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:419:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:421:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:424:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:426:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:436:0x0709 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x010b  */
    public static void b(r.e eVar, p.d dVar, ArrayList arrayList, int i4) {
        int i5;
        r.b[] bVarArr;
        int i6;
        int i7;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        r.c[] cVarArr;
        int i8;
        r.b[] bVarArr2;
        r.d dVar2;
        int i9;
        int i10;
        int i11;
        r.d dVar3;
        p.i iVar;
        p.i iVar2;
        r.c cVar;
        r.c cVar2;
        p.i iVar3;
        r.d dVar4;
        r.c[] cVarArr2;
        r.d dVar5;
        int i12;
        r.c cVar3;
        r.c cVar4;
        p.i iVar4;
        r.c cVar5;
        p.i iVar5;
        int size;
        boolean z8;
        r.c cVar6;
        r.d dVar6;
        int i13;
        r.d dVar7;
        r.e eVar2 = eVar;
        int i14 = 2;
        if (i4 == 0) {
            i5 = eVar2.f3988z0;
            bVarArr = eVar2.C0;
            i6 = 0;
        } else {
            i5 = eVar2.A0;
            bVarArr = eVar2.B0;
            i6 = 2;
        }
        int i15 = 0;
        while (i15 < i5) {
            r.b bVar = bVarArr[i15];
            boolean z9 = bVar.f3928q;
            r.d dVar8 = bVar.f3912a;
            int i16 = 3;
            int i17 = 1;
            int i18 = 8;
            if (z9) {
                i7 = i15;
                z4 = true;
            } else {
                int i19 = bVar.f3923l;
                int i20 = i19 * 2;
                r.d dVar9 = dVar8;
                r.d dVar10 = dVar9;
                boolean z10 = false;
                while (!z10) {
                    bVar.f3920i += i17;
                    dVar9.f3963m0[i19] = null;
                    dVar9.f3961l0[i19] = null;
                    int i21 = dVar9.f3951g0;
                    r.c[] cVarArr3 = dVar9.Q;
                    if (i21 != i18) {
                        dVar9.k(i19);
                        cVarArr3[i20].e();
                        int i22 = i20 + 1;
                        cVarArr3[i22].e();
                        cVarArr3[i20].e();
                        cVarArr3[i22].e();
                        if (bVar.f3913b == null) {
                            bVar.f3913b = dVar9;
                        }
                        bVar.f3915d = dVar9;
                        int i23 = dVar9.f3969p0[i19];
                        if (i23 == i16) {
                            int i24 = dVar9.f3973t[i19];
                            if (i24 == 0 || i24 == i16 || i24 == i14) {
                                bVar.f3921j++;
                                float f5 = dVar9.f3959k0[i19];
                                if (f5 > 0.0f) {
                                    bVar.f3922k += f5;
                                }
                                if (dVar9.f3951g0 != 8 && i23 == 3 && (i24 == 0 || i24 == 3)) {
                                    if (f5 < 0.0f) {
                                        bVar.f3925n = true;
                                    } else {
                                        bVar.f3926o = true;
                                    }
                                    if (bVar.f3919h == null) {
                                        bVar.f3919h = new ArrayList();
                                    }
                                    bVar.f3919h.add(dVar9);
                                }
                                if (bVar.f3917f == null) {
                                    bVar.f3917f = dVar9;
                                }
                                r.d dVar11 = bVar.f3918g;
                                if (dVar11 != null) {
                                    dVar11.f3961l0[i19] = dVar9;
                                }
                                bVar.f3918g = dVar9;
                            }
                            if (i19 == 0) {
                                if (dVar9.f3971r == 0 && dVar9.f3974u == 0) {
                                    int i25 = dVar9.f3975v;
                                }
                            } else if (dVar9.f3972s == 0 && dVar9.f3977x == 0) {
                                int i26 = dVar9.f3978y;
                            }
                        } else {
                            i15 = i15;
                        }
                    } else {
                        i15 = i15;
                    }
                    r.d dVar12 = dVar10;
                    if (dVar12 != dVar9) {
                        dVar12.f3963m0[i19] = dVar9;
                    }
                    r.c cVar7 = cVarArr3[i20 + 1].f3934f;
                    if (cVar7 != null) {
                        dVar7 = cVar7.f3932d;
                        r.c cVar8 = dVar7.Q[i20].f3934f;
                        if (cVar8 == null || cVar8.f3932d != dVar9) {
                            dVar7 = null;
                        }
                    } else {
                        dVar7 = null;
                    }
                    if (dVar7 == null) {
                        dVar7 = dVar9;
                        z10 = true;
                    }
                    dVar10 = dVar9;
                    i15 = i15;
                    i17 = 1;
                    i18 = 8;
                    i14 = 2;
                    dVar9 = dVar7;
                    i16 = 3;
                }
                i7 = i15;
                r.d dVar13 = bVar.f3913b;
                if (dVar13 != null) {
                    dVar13.Q[i20].e();
                }
                r.d dVar14 = bVar.f3915d;
                if (dVar14 != null) {
                    dVar14.Q[i20 + 1].e();
                }
                bVar.f3914c = dVar9;
                if (i19 == 0 && bVar.f3924m) {
                    bVar.f3916e = dVar9;
                } else {
                    bVar.f3916e = dVar8;
                }
                bVar.f3927p = bVar.f3926o && bVar.f3925n;
                z4 = true;
            }
            bVar.f3928q = z4;
            if (arrayList == 0 || arrayList.contains(dVar8)) {
                r.d dVar15 = bVar.f3914c;
                r.d dVar16 = bVar.f3913b;
                r.d dVar17 = bVar.f3915d;
                r.d dVar18 = bVar.f3916e;
                float f6 = bVar.f3922k;
                boolean z11 = eVar2.f3969p0[i4] == 2;
                if (i4 == 0) {
                    int i27 = dVar18.f3955i0;
                    boolean z12 = i27 == 0;
                    z7 = i27 == 1;
                    z5 = i27 == 2;
                    z6 = z12;
                } else {
                    int i28 = dVar18.f3957j0;
                    boolean z13 = i28 == 0;
                    boolean z14 = i28 == 1;
                    z5 = i28 == 2;
                    z6 = z13;
                    z7 = z14;
                }
                boolean z15 = false;
                while (true) {
                    cVarArr = eVar2.Q;
                    if (z15) {
                        break;
                    }
                    r.c cVar9 = dVar8.Q[i6];
                    int i29 = z5 ? 1 : 4;
                    int iE = cVar9.e();
                    boolean z16 = z15;
                    int[] iArr = dVar8.f3969p0;
                    int i30 = i5;
                    r.b[] bVarArr3 = bVarArr;
                    boolean z17 = iArr[i4] == 3 && dVar8.f3973t[i4] == 0;
                    r.c cVar10 = cVar9.f3934f;
                    if (cVar10 != null && dVar8 != dVar8) {
                        iE = cVar10.e() + iE;
                    }
                    int i31 = iE;
                    if (z5 && dVar8 != dVar8 && dVar8 != dVar16) {
                        i29 = 8;
                    }
                    r.c cVar11 = cVar9.f3934f;
                    if (cVar11 != null) {
                        if (dVar8 == dVar16) {
                            dVar.f(cVar9.f3937i, cVar11.f3937i, i31, 6);
                        } else {
                            dVar.f(cVar9.f3937i, cVar11.f3937i, i31, 8);
                        }
                        if (z17 && !z5) {
                            i29 = 5;
                        }
                        dVar.e(cVar9.f3937i, cVar9.f3934f.f3937i, i31, (dVar8 == dVar16 && z5 && dVar8.S[i4]) ? 5 : i29);
                    } else {
                        bVar = bVar;
                        dVar8 = dVar8;
                    }
                    r.c[] cVarArr4 = dVar8.Q;
                    if (z11) {
                        if (dVar8.f3951g0 == 8 || iArr[i4] != 3) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            dVar.f(cVarArr4[i6 + 1].f3937i, cVarArr4[i6].f3937i, 0, 5);
                        }
                        dVar.f(cVarArr4[i6].f3937i, cVarArr[i6].f3937i, i13, 8);
                    }
                    r.c cVar12 = cVarArr4[i6 + 1].f3934f;
                    if (cVar12 != null) {
                        dVar6 = cVar12.f3932d;
                        r.c cVar13 = dVar6.Q[i6].f3934f;
                        if (cVar13 == null || cVar13.f3932d != dVar8) {
                            dVar6 = null;
                        }
                    } else {
                        dVar6 = null;
                    }
                    if (dVar6 != null) {
                        dVar8 = dVar6;
                        z15 = z16;
                    } else {
                        z15 = true;
                    }
                    dVar18 = dVar18;
                    i5 = i30;
                    bVarArr = bVarArr3;
                    dVar8 = dVar8;
                    bVar = bVar;
                }
                r.b bVar2 = bVar;
                r.d dVar19 = dVar18;
                r.d dVar20 = dVar8;
                i8 = i5;
                bVarArr2 = bVarArr;
                if (dVar17 != null) {
                    int i32 = i6 + 1;
                    if (dVar15.Q[i32].f3934f != null) {
                        r.c cVar14 = dVar17.Q[i32];
                        if (dVar17.f3969p0[i4] == 3 && dVar17.f3973t[i4] == 0 && !z5) {
                            r.c cVar15 = cVar14.f3934f;
                            if (cVar15.f3932d == eVar2) {
                                dVar.e(cVar14.f3937i, cVar15.f3937i, -cVar14.e(), 5);
                            } else if (z5) {
                                cVar6 = cVar14.f3934f;
                                if (cVar6.f3932d == eVar2) {
                                    dVar.e(cVar14.f3937i, cVar6.f3937i, -cVar14.e(), 4);
                                }
                            }
                        } else if (z5) {
                            cVar6 = cVar14.f3934f;
                            if (cVar6.f3932d == eVar2) {
                                dVar.e(cVar14.f3937i, cVar6.f3937i, -cVar14.e(), 4);
                            }
                        }
                        dVar.g(cVar14.f3937i, dVar15.Q[i32].f3934f.f3937i, -cVar14.e(), 6);
                    }
                }
                if (z11) {
                    int i33 = i6 + 1;
                    p.i iVar6 = cVarArr[i33].f3937i;
                    r.c cVar16 = dVar15.Q[i33];
                    dVar.f(iVar6, cVar16.f3937i, cVar16.e(), 8);
                }
                ArrayList arrayList2 = bVar2.f3919h;
                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                    float f7 = (!bVar2.f3925n || bVar2.f3927p) ? f6 : bVar2.f3921j;
                    r.d dVar21 = null;
                    float f8 = 0.0f;
                    int i34 = 0;
                    while (i34 < size) {
                        r.d dVar22 = (r.d) arrayList2.get(i34);
                        float f9 = dVar22.f3959k0[i4];
                        r.c[] cVarArr5 = dVar22.Q;
                        if (f9 < 0.0f) {
                            if (bVar2.f3927p) {
                                p.i iVar7 = cVarArr5[i6 + 1].f3937i;
                                p.i iVar8 = cVarArr5[i6].f3937i;
                                z8 = false;
                                dVar.e(iVar7, iVar8, 0, 4);
                            } else {
                                f9 = 1.0f;
                            }
                            arrayList2 = arrayList2;
                            size = size;
                            i34++;
                            size = size;
                            arrayList2 = arrayList2;
                        }
                        if (f9 == 0.0f) {
                            p.i iVar9 = cVarArr5[i6 + 1].f3937i;
                            p.i iVar10 = cVarArr5[i6].f3937i;
                            z8 = false;
                            dVar.e(iVar9, iVar10, 0, 8);
                            arrayList2 = arrayList2;
                            size = size;
                        } else {
                            if (dVar21 != null) {
                                r.c[] cVarArr6 = dVar21.Q;
                                p.i iVar11 = cVarArr6[i6].f3937i;
                                int i35 = i6 + 1;
                                p.i iVar12 = cVarArr6[i35].f3937i;
                                p.i iVar13 = cVarArr5[i6].f3937i;
                                p.i iVar14 = cVarArr5[i35].f3937i;
                                p.c cVarL = dVar.l();
                                cVarL.f3670b = 0.0f;
                                if (f7 == 0.0f || f8 == f9) {
                                    cVarL.f3672d.d(iVar11, 1.0f);
                                    cVarL.f3672d.d(iVar12, -1.0f);
                                    cVarL.f3672d.d(iVar14, 1.0f);
                                    cVarL.f3672d.d(iVar13, -1.0f);
                                } else if (f8 == 0.0f) {
                                    cVarL.f3672d.d(iVar11, 1.0f);
                                    cVarL.f3672d.d(iVar12, -1.0f);
                                } else if (f9 == 0.0f) {
                                    cVarL.f3672d.d(iVar13, 1.0f);
                                    cVarL.f3672d.d(iVar14, -1.0f);
                                } else {
                                    float f10 = (f8 / f7) / (f9 / f7);
                                    cVarL.f3672d.d(iVar11, 1.0f);
                                    cVarL.f3672d.d(iVar12, -1.0f);
                                    cVarL.f3672d.d(iVar14, f10);
                                    cVarL.f3672d.d(iVar13, -f10);
                                }
                                dVar.c(cVarL);
                            } else {
                                f9 = f9;
                            }
                            f8 = f9;
                            dVar21 = dVar22;
                        }
                        i34++;
                        size = size;
                        arrayList2 = arrayList2;
                    }
                }
                if (dVar16 == null || !(dVar16 == dVar17 || z5)) {
                    dVar2 = dVar17;
                    i9 = i7;
                    if (!z6 || dVar16 == null) {
                        int i36 = 8;
                        if (z7 && dVar16 != null) {
                            int i37 = bVar2.f3921j;
                            boolean z18 = i37 > 0 && bVar2.f3920i == i37;
                            r.d dVar23 = dVar16;
                            r.d dVar24 = dVar23;
                            while (dVar24 != null) {
                                r.d dVar25 = dVar24.f3963m0[i4];
                                while (dVar25 != null && dVar25.f3951g0 == i36) {
                                    dVar25 = dVar25.f3963m0[i4];
                                }
                                if (dVar24 == dVar16 || dVar24 == dVar2 || dVar25 == null) {
                                    dVar23 = dVar23;
                                    i9 = i9;
                                    i11 = i36;
                                } else {
                                    r.d dVar26 = dVar25 == dVar2 ? null : dVar25;
                                    r.c[] cVarArr7 = dVar24.Q;
                                    r.c cVar17 = cVarArr7[i6];
                                    p.i iVar15 = cVar17.f3937i;
                                    int i38 = i6 + 1;
                                    p.i iVar16 = dVar23.Q[i38].f3937i;
                                    int iE2 = cVar17.e();
                                    int iE3 = cVarArr7[i38].e();
                                    if (dVar26 != null) {
                                        cVar = dVar26.Q[i6];
                                        iVar = cVar.f3937i;
                                        dVar3 = dVar26;
                                        r.c cVar18 = cVar.f3934f;
                                        iVar2 = cVar18 != null ? cVar18.f3937i : null;
                                    } else {
                                        dVar3 = dVar26;
                                        r.c cVar19 = dVar2.Q[i6];
                                        iVar = cVar19 != null ? cVar19.f3937i : null;
                                        iVar2 = cVarArr7[i38].f3937i;
                                        cVar = cVar19;
                                    }
                                    int iE4 = cVar != null ? cVar.e() + iE3 : iE3;
                                    int iE5 = dVar23.Q[i38].e() + iE2;
                                    int i39 = z18 ? 8 : 4;
                                    if (iVar15 == null || iVar16 == null || iVar == null || iVar2 == null) {
                                        i11 = 8;
                                    } else {
                                        i11 = 8;
                                        dVar.b(iVar15, iVar16, iE5, 0.5f, iVar, iVar2, iE4, i39);
                                    }
                                    dVar25 = dVar3;
                                }
                                dVar23 = dVar24.f3951g0 != i11 ? dVar24 : dVar23;
                                dVar24 = dVar25;
                                i36 = i11;
                                i9 = i9;
                            }
                            i10 = i9;
                            r.c cVar20 = dVar16.Q[i6];
                            r.c cVar21 = dVar20.Q[i6].f3934f;
                            int i40 = i6 + 1;
                            r.c cVar22 = dVar2.Q[i40];
                            r.c cVar23 = dVar15.Q[i40].f3934f;
                            if (cVar21 != null) {
                                if (dVar16 != dVar2) {
                                    dVar.e(cVar20.f3937i, cVar21.f3937i, cVar20.e(), 5);
                                } else if (cVar23 != null) {
                                    dVar.b(cVar20.f3937i, cVar21.f3937i, cVar20.e(), 0.5f, cVar22.f3937i, cVar23.f3937i, cVar22.e(), 5);
                                }
                            }
                            if (cVar23 != null && dVar16 != dVar2) {
                                dVar.e(cVar22.f3937i, cVar23.f3937i, -cVar22.e(), 5);
                            }
                        }
                        if ((z6 || z7) && dVar16 != null && dVar16 != dVar2) {
                            cVarArr2 = dVar16.Q;
                            r.c cVar24 = cVarArr2[i6];
                            if (dVar2 == null) {
                                dVar5 = dVar16;
                            } else {
                                dVar5 = dVar2;
                            }
                            i12 = i6 + 1;
                            r.c[] cVarArr8 = dVar5.Q;
                            cVar3 = cVarArr8[i12];
                            cVar4 = cVar24.f3934f;
                            if (cVar4 != null) {
                                iVar4 = cVar4.f3937i;
                            } else {
                                iVar4 = null;
                            }
                            cVar5 = cVar3.f3934f;
                            if (cVar5 != null) {
                                iVar5 = cVar5.f3937i;
                            } else {
                                iVar5 = null;
                            }
                            if (dVar15 != dVar5) {
                                r.c cVar25 = dVar15.Q[i12].f3934f;
                                iVar5 = cVar25 != null ? cVar25.f3937i : null;
                            }
                            if (dVar16 == dVar5) {
                                cVar3 = cVarArr2[i12];
                            }
                            if (iVar4 == null && iVar5 != null) {
                                dVar.b(cVar24.f3937i, iVar4, cVar24.e(), 0.5f, iVar5, cVar3.f3937i, cVarArr8[i12].e(), 5);
                            }
                        }
                    } else {
                        int i41 = bVar2.f3921j;
                        boolean z19 = i41 > 0 && bVar2.f3920i == i41;
                        r.d dVar27 = dVar16;
                        r.d dVar28 = dVar27;
                        while (dVar28 != null) {
                            r.d dVar29 = dVar28.f3963m0[i4];
                            while (dVar29 != null && dVar29.f3951g0 == 8) {
                                dVar29 = dVar29.f3963m0[i4];
                            }
                            if (dVar29 != null || dVar28 == dVar2) {
                                r.c[] cVarArr9 = dVar28.Q;
                                r.c cVar26 = cVarArr9[i6];
                                p.i iVar17 = cVar26.f3937i;
                                r.c cVar27 = cVar26.f3934f;
                                p.i iVar18 = cVar27 != null ? cVar27.f3937i : null;
                                if (dVar27 != dVar28) {
                                    iVar18 = dVar27.Q[i6 + 1].f3937i;
                                } else if (dVar28 == dVar16) {
                                    r.c cVar28 = dVar20.Q[i6].f3934f;
                                    iVar18 = cVar28 != null ? cVar28.f3937i : null;
                                }
                                int iE6 = cVar26.e();
                                int i42 = i6 + 1;
                                int iE7 = cVarArr9[i42].e();
                                if (dVar29 != null) {
                                    cVar2 = dVar29.Q[i6];
                                    iVar3 = cVar2.f3937i;
                                } else {
                                    cVar2 = dVar15.Q[i42].f3934f;
                                    iVar3 = cVar2 != null ? cVar2.f3937i : null;
                                }
                                p.i iVar19 = cVarArr9[i42].f3937i;
                                if (cVar2 != null) {
                                    iE7 = cVar2.e() + iE7;
                                }
                                int iE8 = dVar27.Q[i42].e() + iE6;
                                if (iVar17 == null || iVar18 == null || iVar3 == null || iVar19 == null) {
                                    dVar4 = dVar29;
                                } else {
                                    if (dVar28 == dVar16) {
                                        iE8 = dVar16.Q[i6].e();
                                    }
                                    if (dVar28 == dVar2) {
                                        iE7 = dVar2.Q[i42].e();
                                    }
                                    int i43 = iE7;
                                    dVar4 = dVar29;
                                    dVar.b(iVar17, iVar18, iE8, 0.5f, iVar3, iVar19, i43, z19 ? 8 : 5);
                                }
                            } else {
                                dVar4 = dVar29;
                            }
                            dVar27 = dVar28.f3951g0 != 8 ? dVar28 : dVar27;
                            dVar28 = dVar4;
                        }
                    }
                } else {
                    r.c cVar29 = dVar20.Q[i6];
                    int i44 = i6 + 1;
                    r.c cVar30 = dVar15.Q[i44];
                    r.c cVar31 = cVar29.f3934f;
                    p.i iVar20 = cVar31 != null ? cVar31.f3937i : null;
                    r.c cVar32 = cVar30.f3934f;
                    p.i iVar21 = cVar32 != null ? cVar32.f3937i : null;
                    r.c cVar33 = dVar16.Q[i6];
                    if (dVar17 != null) {
                        cVar30 = dVar17.Q[i44];
                    }
                    if (iVar20 == null || iVar21 == null) {
                        dVar2 = dVar17;
                        i9 = i7;
                    } else {
                        dVar2 = dVar17;
                        i9 = i7;
                        dVar.b(cVar33.f3937i, iVar20, cVar33.e(), i4 == 0 ? dVar19.f3945d0 : dVar19.f3947e0, iVar21, cVar30.f3937i, cVar30.e(), 7);
                    }
                }
                i10 = i9;
                if (z6) {
                    cVarArr2 = dVar16.Q;
                    r.c cVar210 = cVarArr2[i6];
                    if (dVar2 == null) {
                        dVar5 = dVar16;
                    } else {
                        dVar5 = dVar2;
                    }
                    i12 = i6 + 1;
                    r.c[] cVarArr10 = dVar5.Q;
                    cVar3 = cVarArr10[i12];
                    cVar4 = cVar210.f3934f;
                    if (cVar4 != null) {
                        iVar4 = cVar4.f3937i;
                    } else {
                        iVar4 = null;
                    }
                    cVar5 = cVar3.f3934f;
                    if (cVar5 != null) {
                        iVar5 = cVar5.f3937i;
                    } else {
                        iVar5 = null;
                    }
                    if (dVar15 != dVar5) {
                        r.c cVar211 = dVar15.Q[i12].f3934f;
                        iVar5 = cVar211 != null ? cVar211.f3937i : null;
                    }
                    if (dVar16 == dVar5) {
                        cVar3 = cVarArr2[i12];
                    }
                    if (iVar4 == null) {
                    }
                } else {
                    cVarArr2 = dVar16.Q;
                    r.c cVar212 = cVarArr2[i6];
                    if (dVar2 == null) {
                        dVar5 = dVar16;
                    } else {
                        dVar5 = dVar2;
                    }
                    i12 = i6 + 1;
                    r.c[] cVarArr11 = dVar5.Q;
                    cVar3 = cVarArr11[i12];
                    cVar4 = cVar212.f3934f;
                    if (cVar4 != null) {
                        iVar4 = cVar4.f3937i;
                    } else {
                        iVar4 = null;
                    }
                    cVar5 = cVar3.f3934f;
                    if (cVar5 != null) {
                        iVar5 = cVar5.f3937i;
                    } else {
                        iVar5 = null;
                    }
                    if (dVar15 != dVar5) {
                        r.c cVar213 = dVar15.Q[i12].f3934f;
                        iVar5 = cVar213 != null ? cVar213.f3937i : null;
                    }
                    if (dVar16 == dVar5) {
                        cVar3 = cVarArr2[i12];
                    }
                    if (iVar4 == null) {
                    }
                }
            } else {
                i8 = i5;
                bVarArr2 = bVarArr;
                i10 = i7;
            }
            i15 = i10 + 1;
            i14 = 2;
            eVar2 = eVar;
            i5 = i8;
            bVarArr = bVarArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[LOOP:2: B:25:0x004c->B:50:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1 A[LOOP:1: B:56:0x00a5->B:59:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b7 A[EDGE_INSN: B:82:0x00b7->B:60:0x00b7 BREAK  A[LOOP:1: B:56:0x00a5->B:59:0x00b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public static final InetAddress c(int i4, int i5, String str) {
        int i6;
        ?? r14;
        int i7;
        char cCharAt;
        int i8;
        int i9;
        int i10;
        int iQ;
        int i11 = 16;
        byte[] bArr = new byte[16];
        boolean z4 = false;
        int i12 = i4;
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        while (true) {
            if (i12 >= i5) {
                i6 = i11;
                break;
            }
            if (i13 == i11) {
                return null;
            }
            int i16 = i12 + 2;
            if (i16 <= i5 && q3.l.n3(str, "::", i12, z4)) {
                if (i14 != -1) {
                    return null;
                }
                i13 += 2;
                if (i16 == i5) {
                    i6 = i11;
                    i14 = i13;
                    break;
                }
                i14 = i13;
                i15 = i16;
                i12 = i15;
                i9 = 0;
                while (i12 < i5) {
                    iQ = u3.b.q(str.charAt(i12));
                    if (iQ != -1) {
                        break;
                        break;
                    }
                    i9 = (i9 << 4) + iQ;
                    i12++;
                }
                i10 = i12 - i15;
                if (i10 != 0) {
                }
                return null;
            }
            if (i13 != 0) {
                if (!q3.l.n3(str, ":", i12, z4)) {
                    if (q3.l.n3(str, ".", i12, z4)) {
                        int i17 = i13 - 2;
                        int i18 = i17;
                        while (i15 < i5) {
                            if (i18 != i11) {
                                if (i18 == i17) {
                                    r14 = z4;
                                    i7 = i15;
                                    while (i7 < i5) {
                                        cCharAt = str.charAt(i7);
                                        if (c3.h.n0(cCharAt, 48) < 0 || c3.h.n0(cCharAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 != 0 || i15 == i7) && (i8 = ((r14 * 10) + cCharAt) - 48) <= 255) {
                                            i7++;
                                            r14 = i8;
                                        }
                                    }
                                    if (i7 - i15 == 0) {
                                        bArr[i18] = (byte) r14;
                                        i18++;
                                        i15 = i7;
                                        i11 = 16;
                                        z4 = false;
                                    }
                                } else if (str.charAt(i15) == '.') {
                                    i15++;
                                    r14 = z4;
                                    i7 = i15;
                                    while (i7 < i5) {
                                        cCharAt = str.charAt(i7);
                                        if (c3.h.n0(cCharAt, 48) < 0) {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    if (i7 - i15 == 0) {
                                        bArr[i18] = (byte) r14;
                                        i18++;
                                        i15 = i7;
                                        i11 = 16;
                                        z4 = false;
                                    }
                                }
                            }
                        }
                        if (i18 == i13 + 2) {
                            i13 += 2;
                            i6 = 16;
                            break;
                        }
                    }
                    return null;
                }
                i12++;
            }
            i15 = i12;
            i12 = i15;
            i9 = 0;
            while (i12 < i5) {
                iQ = u3.b.q(str.charAt(i12));
                if (iQ != -1) {
                    break;
                }
                i9 = (i9 << 4) + iQ;
                i12++;
            }
            i10 = i12 - i15;
            if (i10 != 0 || i10 > 4) {
                return null;
            }
            int i19 = i13 + 1;
            bArr[i13] = (byte) ((i9 >>> 8) & 255);
            i13 += 2;
            bArr[i19] = (byte) (i9 & 255);
            i11 = 16;
            z4 = false;
        }
        if (i13 != i6) {
            if (i14 == -1) {
                return null;
            }
            int i20 = i13 - i14;
            System.arraycopy(bArr, i14, bArr, 16 - i20, i20);
            Arrays.fill(bArr, i14, (16 - i13) + i14, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static s.o d(r.d dVar, int i4, ArrayList arrayList, s.o oVar) {
        int i5;
        int i6 = i4 == 0 ? dVar.f3965n0 : dVar.f3967o0;
        if (i6 != -1 && (oVar == null || i6 != oVar.f4183b)) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                s.o oVar2 = (s.o) arrayList.get(i7);
                if (oVar2.f4183b == i6) {
                    if (oVar != null) {
                        oVar.c(i4, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                    break;
                }
            }
        } else if (i6 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (dVar instanceof r.j) {
                r.j jVar = (r.j) dVar;
                int i8 = 0;
                while (true) {
                    if (i8 >= jVar.f4023r0) {
                        i5 = -1;
                        break;
                    }
                    r.d dVar2 = jVar.f4022q0[i8];
                    if ((i4 == 0 && (i5 = dVar2.f3965n0) != -1) || (i4 == 1 && (i5 = dVar2.f3967o0) != -1)) {
                        break;
                    }
                    i8++;
                }
                if (i5 != -1) {
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        s.o oVar3 = (s.o) arrayList.get(i9);
                        if (oVar3.f4183b == i5) {
                            oVar = oVar3;
                            break;
                        }
                    }
                }
            }
            if (oVar == null) {
                oVar = new s.o();
                oVar.f4182a = new ArrayList();
                oVar.f4185d = null;
                oVar.f4186e = -1;
                int i10 = s.o.f4181f;
                s.o.f4181f = i10 + 1;
                oVar.f4183b = i10;
                oVar.f4184c = i4;
            }
            arrayList.add(oVar);
        }
        ArrayList arrayList2 = oVar.f4182a;
        if (!arrayList2.contains(dVar)) {
            arrayList2.add(dVar);
            if (dVar instanceof r.h) {
                r.h hVar = (r.h) dVar;
                hVar.f4019t0.c(hVar.f4020u0 == 0 ? 1 : 0, oVar, arrayList);
            }
            int i11 = oVar.f4183b;
            if (i4 == 0) {
                dVar.f3965n0 = i11;
                dVar.I.c(i4, oVar, arrayList);
                dVar.K.c(i4, oVar, arrayList);
            } else {
                dVar.f3967o0 = i11;
                dVar.J.c(i4, oVar, arrayList);
                dVar.M.c(i4, oVar, arrayList);
                dVar.L.c(i4, oVar, arrayList);
            }
            dVar.P.c(i4, oVar, arrayList);
        }
        return oVar;
    }

    public static final String e(long j4) {
        String str;
        if (j4 <= -999500000) {
            str = ((j4 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j4 <= -999500) {
            str = ((j4 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j4 <= 0) {
            str = ((j4 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j4 < 999500) {
            str = ((j4 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j4 < 999500000) {
            str = ((j4 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j4 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        c3.h.a0(str2, "format(format, *args)");
        return str2;
    }

    public static byte[] f(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static Drawable g(Context context, int i4) {
        return u2.c().e(context, i4);
    }

    public static final String h(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static Intent i(Activity activity) {
        Intent intentA = y.l.a(activity);
        if (intentA != null) {
            return intentA;
        }
        try {
            String strK = k(activity, activity.getComponentName());
            if (strK == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strK);
            try {
                return k(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strK + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static Intent j(Context context, ComponentName componentName) {
        String strK = k(context, componentName);
        if (strK == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strK);
        return k(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String k(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c2  */
    public static y l(i0 i0Var, boolean z4, l0 l0Var, int i4) {
        l0 h0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thD;
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        boolean z5 = (i4 & 2) != 0;
        p0 p0Var = (p0) i0Var;
        p0Var.getClass();
        if (z4) {
            h0Var = l0Var instanceof k0 ? (k0) l0Var : null;
            if (h0Var == null) {
                h0Var = new h0(l0Var);
            }
        } else {
            h0Var = l0Var;
        }
        h0Var.f4100e = p0Var;
        while (true) {
            Object objR = p0Var.r();
            if (objR instanceof z) {
                z zVar = (z) objR;
                if (zVar.f4132b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p0.f4111b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(p0Var, objR, h0Var)) {
                        if (atomicReferenceFieldUpdater2.get(p0Var) != objR) {
                        }
                    }
                    return h0Var;
                }
                r0 r0Var = new r0();
                f0 e0Var = zVar.f4132b ? r0Var : new e0(r0Var);
                do {
                    atomicReferenceFieldUpdater = p0.f4111b;
                    if (atomicReferenceFieldUpdater.compareAndSet(p0Var, zVar, e0Var)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(p0Var) == zVar);
            } else {
                if (!(objR instanceof f0)) {
                    if (z5) {
                        f fVar = objR instanceof f ? (f) objR : null;
                        l0Var.e(fVar != null ? fVar.f4084a : null);
                    }
                    return s0.f4123b;
                }
                r0 r0VarB = ((f0) objR).b();
                if (r0VarB != null) {
                    y yVar = s0.f4123b;
                    if (z4 && (objR instanceof n0)) {
                        synchronized (objR) {
                            try {
                                thD = ((n0) objR).d();
                                if (thD == null || ((l0Var instanceof d) && !((n0) objR).f())) {
                                    if (p0Var.c(objR, r0VarB, h0Var)) {
                                        if (thD == null) {
                                            return h0Var;
                                        }
                                        yVar = h0Var;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thD != null) {
                            if (z5) {
                                l0Var.e(thD);
                            }
                            return yVar;
                        }
                        if (p0Var.c(objR, r0VarB, h0Var)) {
                            return h0Var;
                        }
                    } else {
                        thD = null;
                        if (thD != null) {
                            if (z5) {
                                l0Var.e(thD);
                            }
                            return yVar;
                        }
                        if (p0Var.c(objR, r0VarB, h0Var)) {
                            return h0Var;
                        }
                    }
                } else {
                    if (objR == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    p0Var.E((l0) objR);
                }
            }
        }
    }

    public static final boolean m(AssertionError assertionError) {
        String message;
        Logger logger = f4.n.f2181a;
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !q3.l.R2(message, "getsockname failed", false)) ? false : true;
    }

    public static void n(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void o(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e5);
                if (fileOutputStreamOpenFileOutput != null) {
                    fileOutputStreamOpenFileOutput.close();
                }
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[EXC_TOP_SPLITTER, PHI: r2
      0x0045: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:25:0x004e, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String p(Context context) {
        String attributeValue = "";
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    int depth = xmlPullParserNewPullParser.getDepth();
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                            if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException | XmlPullParserException unused2) {
                    Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                }
                if (attributeValue.isEmpty()) {
                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                } else {
                    Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(attributeValue));
                }
                return attributeValue;
            } catch (Throwable th) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused4) {
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final int q(f4.t tVar, int i4) {
        int i5;
        c3.h.b0(tVar, "<this>");
        int i6 = i4 + 1;
        int length = tVar.f2200f.length;
        int[] iArr = tVar.f2201g;
        c3.h.b0(iArr, "<this>");
        int i7 = length - 1;
        int i8 = 0;
        while (i8 <= i7) {
            i5 = (i8 + i7) >>> 1;
            int i9 = iArr[i5];
            if (i9 < i6) {
                i8 = i5 + 1;
            } else {
                if (i9 <= i6) {
                    if (i5 >= 0) {
                        return i5;
                    }
                    return ~i5;
                }
                i7 = i5 - 1;
            }
        }
        i5 = (-i8) - 1;
        if (i5 >= 0) {
            return i5;
        }
        return ~i5;
    }

    public static final f4.c r(Socket socket) throws IOException {
        Logger logger = f4.n.f2181a;
        f4.v vVar = new f4.v(socket);
        OutputStream outputStream = socket.getOutputStream();
        c3.h.a0(outputStream, "getOutputStream(...)");
        return new f4.c(vVar, new f4.c(outputStream, vVar));
    }

    public static final f4.d s(Socket socket) throws IOException {
        Logger logger = f4.n.f2181a;
        f4.v vVar = new f4.v(socket);
        InputStream inputStream = socket.getInputStream();
        c3.h.a0(inputStream, "getInputStream(...)");
        return new f4.d(vVar, new f4.d(inputStream, vVar));
    }

    public static void t(j3.p pVar, a aVar, a aVar2) {
        try {
            kotlinx.coroutines.internal.a.d(c3.h.k1(c3.h.y0(aVar, aVar2, pVar)), z2.f.f5511a, null);
        } catch (Throwable th) {
            aVar2.b(c3.h.A0(th));
            throw th;
        }
    }

    public static final Object u(kotlinx.coroutines.internal.o oVar, kotlinx.coroutines.internal.o oVar2, j3.p pVar) {
        Object fVar;
        Object objY;
        f0 f0Var;
        try {
            c3.h.N(pVar);
            fVar = pVar.c(oVar2, oVar);
        } catch (Throwable th) {
            fVar = new f(th);
        }
        d3.a aVar = d3.a.f1765b;
        if (fVar == aVar || (objY = oVar.y(fVar)) == f4114c) {
            return aVar;
        }
        if (objY instanceof f) {
            throw ((f) objY).f4084a;
        }
        g0 g0Var = objY instanceof g0 ? (g0) objY : null;
        return (g0Var == null || (f0Var = g0Var.f4087a) == null) ? objY : f0Var;
    }

    public static final long v(String str, long j4, long j5, long j6) {
        String property;
        boolean z4;
        String str2;
        Long lValueOf;
        int i4 = kotlinx.coroutines.internal.p.f3306a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j4;
        }
        c3.h.d0(10);
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
        } else {
            int i5 = 0;
            char cCharAt = property.charAt(0);
            long j7 = -9223372036854775807L;
            if (c3.h.n0(cCharAt, 48) < 0) {
                z4 = true;
                if (length != 1) {
                    if (cCharAt == '-') {
                        j7 = Long.MIN_VALUE;
                        i5 = 1;
                    } else {
                        if (cCharAt == '+') {
                            z4 = false;
                            i5 = 1;
                        }
                        lValueOf = null;
                    }
                }
                str2 = property;
                lValueOf = null;
            } else {
                z4 = false;
            }
            long j8 = 0;
            long j9 = -256204778801521550L;
            while (true) {
                if (i5 >= length) {
                    str2 = property;
                    lValueOf = z4 ? Long.valueOf(j8) : Long.valueOf(-j8);
                } else {
                    int iDigit = Character.digit((int) property.charAt(i5), 10);
                    if (iDigit >= 0) {
                        if (j8 < j9) {
                            if (j9 == -256204778801521550L) {
                                str2 = property;
                                j9 = j7 / ((long) 10);
                                if (j8 < j9) {
                                }
                            }
                            lValueOf = null;
                        } else {
                            str2 = property;
                        }
                        long j10 = j8 * ((long) 10);
                        long j11 = iDigit;
                        if (j10 < j7 + j11) {
                            lValueOf = null;
                        } else {
                            j8 = j10 - j11;
                            i5++;
                            property = str2;
                        }
                    }
                    str2 = property;
                    lValueOf = null;
                }
            }
        }
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j5 <= jLongValue && jLongValue <= j6) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j6 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int w(String str, int i4, int i5, int i6, int i7) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return (int) v(str, i4, i5, i6);
    }

    public static final String x(String str) {
        c3.h.b0(str, "<this>");
        int i4 = 0;
        int i5 = -1;
        if (!q3.l.R2(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                c3.h.a0(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                c3.h.a0(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                c3.h.a0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i6 = 0; i6 < length; i6++) {
                    char cCharAt = lowerCase.charAt(i6);
                    if (c3.h.n0(cCharAt, 31) <= 0 || c3.h.n0(cCharAt, 127) >= 0 || q3.l.Y2(" #%/:?@[\\]", cCharAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressC = (q3.l.o3(str, "[", false) && str.endsWith("]")) ? c(1, str.length() - 1, str) : c(0, str.length(), str);
        if (inetAddressC == null) {
            return null;
        }
        byte[] address = inetAddressC.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressC.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < address.length) {
            int i9 = i7;
            while (i9 < 16 && address[i9] == 0 && address[i9 + 1] == 0) {
                i9 += 2;
            }
            int i10 = i9 - i7;
            if (i10 > i8 && i10 >= 4) {
                i5 = i7;
                i8 = i10;
            }
            i7 = i9 + 2;
        }
        f4.g gVar = new f4.g();
        while (i4 < address.length) {
            if (i4 == i5) {
                gVar.K(58);
                i4 += i8;
                if (i4 == 16) {
                    gVar.K(58);
                }
            } else {
                if (i4 > 0) {
                    gVar.K(58);
                }
                byte b5 = address[i4];
                byte[] bArr = u3.b.f4761a;
                gVar.L(((b5 & 255) << 8) | (address[i4 + 1] & 255));
                i4 += 2;
            }
        }
        return gVar.C(gVar.f2166c, q3.a.f3886a);
    }

    public static boolean y(int i4, int i5, int i6, int i7) {
        return (i6 == 1 || i6 == 2 || (i6 == 4 && i4 != 2)) || (i7 == 1 || i7 == 2 || (i7 == 4 && i5 != 2));
    }
}
