package e;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButtonToggleGroup;
import i.f1;
import i.n2;
import i.r3;
import i0.a2;
import i0.c2;
import i0.q1;
import i0.r1;
import i0.s1;
import i0.t1;
import i0.v0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n0 implements n2, h.b0, h.m, f1, i0.s, i0.g, l0.d, w0.d, j0.b0, s1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1896c;

    public /* synthetic */ n0(int i4, Object obj) {
        this.f1895b = i4;
        this.f1896c = obj;
    }

    public static Object A(Object[] objArr, int i4, f2.e eVar) {
        int i5;
        boolean z4;
        int i6 = (i4 & 1) == 0 ? 400 : 700;
        boolean z5 = (i4 & 2) != 0;
        Object obj = null;
        int i7 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int i8 = eVar.f2033b;
            switch (i8) {
                case 0:
                    i5 = ((f0.h) obj2).f2019c;
                    break;
                default:
                    i5 = ((a0.h) obj2).f18b;
                    break;
            }
            int iAbs = Math.abs(i5 - i6) * 2;
            switch (i8) {
                case 0:
                    z4 = ((f0.h) obj2).f2020d;
                    break;
                default:
                    z4 = ((a0.h) obj2).f19c;
                    break;
            }
            int i9 = iAbs + (z4 == z5 ? 0 : 1);
            if (obj == null || i7 > i9) {
                obj = obj2;
                i7 = i9;
            }
        }
        return obj;
    }

    public f0.h B(int i4, f0.h[] hVarArr) {
        return (f0.h) A(hVarArr, i4, new f2.e(0));
    }

    public final i.r C(ProviderInfo providerInfo, PackageManager packageManager) {
        String str = providerInfo.authority;
        String str2 = providerInfo.packageName;
        Signature[] signatureArrY = ((f2.e) this.f1896c).y(packageManager, str2);
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArrY) {
            arrayList.add(signature.toByteArray());
        }
        return new i.r(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
    }

    public final long D() {
        return ((long) ((ByteBuffer) this.f1896c).getInt()) & 4294967295L;
    }

    public final void E(int i4) {
        Object obj = this.f1896c;
        ((ByteBuffer) obj).position(((ByteBuffer) obj).position() + i4);
    }

    @Override // i.f1
    public void a(int i4) {
    }

    @Override // h.b0
    public final void b(h.o oVar, boolean z4) {
        if (oVar instanceof h.i0) {
            oVar.k().c(false);
        }
        h.b0 b0Var = ((i.m) this.f1896c).f2660f;
        if (b0Var != null) {
            b0Var.b(oVar, z4);
        }
    }

    @Override // i0.g
    public final int c() {
        return ((ContentInfo) this.f1896c).getSource();
    }

    @Override // h.m
    public final void d(h.o oVar) {
        h.m mVar = ((ActionMenuView) this.f1896c).f436w;
        if (mVar != null) {
            mVar.d(oVar);
        }
    }

    @Override // h.m
    public final boolean e(h.o oVar, MenuItem menuItem) {
        i.p pVar = ((ActionMenuView) this.f1896c).B;
        if (pVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((r3) pVar).f2767b.H.f1780d).iterator();
        if (!it.hasNext()) {
            return false;
        }
        defpackage.a.n(it.next());
        throw null;
    }

    @Override // l0.d
    public final ClipDescription f() {
        switch (this.f1895b) {
            case 15:
                return ((InputContentInfo) this.f1896c).getDescription();
            default:
                return ((l0.d) this.f1896c).f();
        }
    }

    @Override // l0.d
    public final void g() {
        switch (this.f1895b) {
            case 15:
                ((InputContentInfo) this.f1896c).requestPermission();
                break;
            default:
                ((l0.d) this.f1896c).g();
                break;
        }
    }

    @Override // i0.g
    public final ClipData h() {
        return ((ContentInfo) this.f1896c).getClip();
    }

    @Override // i.n2
    public final void i(h.o oVar, MenuItem menuItem) {
        ((h.i) this.f1896c).f2391h.removeCallbacksAndMessages(oVar);
    }

    @Override // j0.b0
    public final boolean j(View view) {
        if (!((SwipeDismissBehavior) this.f1896c).r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = v0.f2983a;
        boolean z4 = i0.f0.d(view) == 1;
        int i4 = ((SwipeDismissBehavior) this.f1896c).f1350d;
        view.offsetLeftAndRight((!(i4 == 0 && z4) && (i4 != 1 || z4)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        ((SwipeDismissBehavior) this.f1896c).getClass();
        return true;
    }

    @Override // h.b0
    public final boolean k(h.o oVar) {
        Object obj = this.f1896c;
        if (oVar == ((i.m) obj).f2658d) {
            return false;
        }
        ((h.i0) oVar).A.getClass();
        ((i.m) obj).getClass();
        h.b0 b0Var = ((i.m) this.f1896c).f2660f;
        if (b0Var != null) {
            return b0Var.k(oVar);
        }
        return false;
    }

    @Override // l0.d
    public final Uri l() {
        switch (this.f1895b) {
            case 15:
                return ((InputContentInfo) this.f1896c).getLinkUri();
            default:
                return ((l0.d) this.f1896c).l();
        }
    }

    @Override // i0.g
    public final int m() {
        return ((ContentInfo) this.f1896c).getFlags();
    }

    @Override // w0.d
    public final void n() {
        w0.e.f4862b.n();
    }

    @Override // i.n2
    public final void o(h.o oVar, h.q qVar) {
        ((h.i) this.f1896c).f2391h.removeCallbacksAndMessages(null);
        int size = ((h.i) this.f1896c).f2393j.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (oVar == ((h.h) ((h.i) this.f1896c).f2393j.get(i4)).f2364b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            return;
        }
        int i5 = i4 + 1;
        ((h.i) this.f1896c).f2391h.postAtTime(new h.g(this, i5 < ((h.i) this.f1896c).f2393j.size() ? (h.h) ((h.i) this.f1896c).f2393j.get(i5) : null, qVar, oVar, 0), oVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // l0.d
    public final Object p() {
        return (InputContentInfo) this.f1896c;
    }

    @Override // i0.s
    public final c2 q(View view, c2 c2Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f1896c;
        if (!h0.b.a(coordinatorLayout.f547o, c2Var)) {
            coordinatorLayout.f547o = c2Var;
            boolean z4 = c2Var.d() > 0;
            coordinatorLayout.f548p = z4;
            coordinatorLayout.setWillNotDraw(!z4 && coordinatorLayout.getBackground() == null);
            a2 a2Var = c2Var.f2902a;
            if (!a2Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = coordinatorLayout.getChildAt(i4);
                    WeakHashMap weakHashMap = v0.f2983a;
                    if (i0.e0.b(childAt) && ((w.d) childAt.getLayoutParams()).f4819a != null && a2Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c2Var;
    }

    @Override // i0.g
    public final ContentInfo r() {
        return (ContentInfo) this.f1896c;
    }

    @Override // l0.d
    public final Uri s() {
        switch (this.f1895b) {
            case 15:
                return ((InputContentInfo) this.f1896c).getContentUri();
            default:
                return ((l0.d) this.f1896c).s();
        }
    }

    @Override // w0.d
    public final void t(int i4, Object obj) {
        w0.e.f4862b.t(i4, obj);
        ((ProfileInstallReceiver) this.f1896c).setResultCode(i4);
    }

    public final String toString() {
        switch (this.f1895b) {
            case 12:
                return "ContentInfoCompat{" + ((ContentInfo) this.f1896c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // i.f1
    public void u(int i4) {
    }

    public final c2 v() {
        return ((t1) this.f1896c).b();
    }

    public Typeface w(Context context, a0.g gVar, Resources resources, int i4) {
        long jLongValue;
        a0.h hVar = (a0.h) A(gVar.f16a, i4, new f2.e(1));
        if (hVar == null) {
            return null;
        }
        int i5 = hVar.f22f;
        String str = hVar.f17a;
        Typeface typefaceZ = b0.g.f1088a.z(context, resources, i5, str, i4);
        if (typefaceZ != null) {
            b0.g.f1089b.b(b0.g.b(resources, i5, str, 0, i4), typefaceZ);
        }
        if (typefaceZ == null) {
            jLongValue = 0;
        } else {
            try {
                Field declaredField = Typeface.class.getDeclaredField("native_instance");
                declaredField.setAccessible(true);
                jLongValue = ((Number) declaredField.get(typefaceZ)).longValue();
            } catch (IllegalAccessException e5) {
                Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e5);
                jLongValue = 0;
            } catch (NoSuchFieldException e6) {
                Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e6);
                jLongValue = 0;
            }
        }
        if (jLongValue != 0) {
            ((ConcurrentHashMap) this.f1896c).put(Long.valueOf(jLongValue), gVar);
        }
        return typefaceZ;
    }

    public Typeface x(Context context, f0.h[] hVarArr, int i4) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(B(i4, hVarArr).f2017a);
            try {
                Typeface typefaceY = y(context, inputStreamOpenInputStream);
                c3.h.l0(inputStreamOpenInputStream);
                return typefaceY;
            } catch (IOException unused) {
                c3.h.l0(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                c3.h.l0(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface y(Context context, InputStream inputStream) {
        File fileB1 = c3.h.b1(context);
        if (fileB1 == null) {
            return null;
        }
        try {
            if (c3.h.v0(fileB1, inputStream)) {
                return Typeface.createFromFile(fileB1.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileB1.delete();
        }
    }

    public Typeface z(Context context, Resources resources, int i4, String str, int i5) {
        File fileB1 = c3.h.b1(context);
        if (fileB1 == null) {
            return null;
        }
        try {
            if (c3.h.u0(fileB1, resources, i4)) {
                return Typeface.createFromFile(fileB1.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileB1.delete();
        }
    }

    public n0(c3.h hVar) {
        this.f1895b = 9;
        this.f1896c = hVar;
    }

    public n0(ViewGroup viewGroup) {
        this.f1895b = 23;
        this.f1896c = viewGroup.getOverlay();
    }

    public n0(int i4) {
        this.f1895b = i4;
        if (i4 == 10) {
            this.f1896c = new ConcurrentHashMap();
            return;
        }
        if (i4 != 14) {
            if (i4 != 21) {
                this.f1896c = new ArrayDeque();
                return;
            } else {
                this.f1896c = new HashMap();
                return;
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            this.f1896c = new s1();
        } else if (i5 >= 29) {
            this.f1896c = new r1();
        } else {
            this.f1896c = new q1();
        }
    }

    public n0(View view, int i4) {
        this.f1895b = i4;
        if (i4 == 24) {
            this.f1896c = view.getOverlay();
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                i0.y yVar = new i0.y(view);
                yVar.f2991e = view;
                this.f1896c = yVar;
                return;
            }
            this.f1896c = new i0.w(view);
        }
    }

    public n0(WindowInsetsController windowInsetsController) {
        this.f1895b = 13;
        i0.y yVar = new i0.y(null);
        yVar.f2992f = windowInsetsController;
        this.f1896c = yVar;
    }

    public n0(TextView textView) {
        this.f1895b = 20;
        if (textView != null) {
            this.f1896c = new r0.i(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }

    public n0(Object obj) {
        this.f1895b = 15;
        this.f1896c = (InputContentInfo) obj;
    }

    public n0() {
        Object dVar;
        this.f1895b = 17;
        if (Build.VERSION.SDK_INT >= 28) {
            dVar = new androidx.emoji2.text.e();
        } else {
            dVar = new androidx.emoji2.text.d();
        }
        this.f1896c = dVar;
    }

    public n0(ByteBuffer byteBuffer) {
        this.f1895b = 19;
        this.f1896c = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public n0(ContentInfo contentInfo) {
        this.f1895b = 12;
        contentInfo.getClass();
        this.f1896c = c2.e.g(contentInfo);
    }

    public n0(ClipData clipData, int i4) {
        this.f1895b = 11;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f1896c = new i0.d(clipData, i4);
        } else {
            this.f1896c = new i0.f(clipData, i4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(26, materialButtonToggleGroup);
        this.f1895b = 26;
    }

    public n0(c2 c2Var) {
        this.f1895b = 14;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f1896c = new s1(c2Var);
        } else if (i4 >= 29) {
            this.f1896c = new r1(c2Var);
        } else {
            this.f1896c = new q1(c2Var);
        }
    }
}
