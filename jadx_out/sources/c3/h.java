package c3;

import a3.n;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.webkit.URLUtil;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.p;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.shungo.app.InjectorService;
import com.shungo.app.R;
import e.n0;
import f2.w;
import i.r;
import i0.e1;
import i0.h0;
import i0.u0;
import i0.v0;
import i0.x1;
import j1.d0;
import j1.e0;
import j1.f0;
import j1.g0;
import j1.j0;
import j1.k0;
import j1.o;
import j1.q;
import j1.s;
import j1.t;
import j1.u;
import j1.z;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.Signature;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r3.i0;
import r3.p0;
import r3.q0;
import r3.v;
import r3.x;
import r3.y0;
import r3.z0;
import t3.c0;
import y0.a1;
import y0.b0;
import y0.o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f1267b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f1268c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f1269d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f1270e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f1271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f1272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Method f1273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f1274i = 0;

    public static final z2.b A0(Throwable th) {
        b0(th, "exception");
        return new z2.b(th);
    }

    public static k A1(i iVar, j jVar) {
        b0(jVar, "key");
        return I(iVar.getKey(), jVar) ? l.f1275b : iVar;
    }

    public static n3.a A2(n3.c cVar, int i4) {
        b0(cVar, "<this>");
        boolean z4 = i4 > 0;
        Integer numValueOf = Integer.valueOf(i4);
        b0(numValueOf, "step");
        if (z4) {
            if (cVar.f3567d <= 0) {
                i4 = -i4;
            }
            return new n3.a(cVar.f3565b, cVar.f3566c, i4);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static MappedByteBuffer B1(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorA = b0.l.a(context.getContentResolver(), uri, "r", null);
            if (parcelFileDescriptorA == null) {
                if (parcelFileDescriptorA != null) {
                    parcelFileDescriptorA.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorA.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorA.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static void B2(Context context) {
        b0(context, "context");
        System.out.println((Object) "kill `pidof com.nianticlabs.pokemongo`");
        x2.d.a("kill `pidof com.nianticlabs.pokemongo`").S2();
        context.stopService(new Intent(context, (Class<?>) InjectorService.class));
        kotlinx.coroutines.scheduling.d dVar = x.f4128a;
        s1(kotlinx.coroutines.internal.k.f3303a, new u2.b(context, null));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:45:0x009c A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9 A[Catch: NumberFormatException -> 0x00b7, TryCatch #0 {NumberFormatException -> 0x00b7, blocks: (B:26:0x0059, B:28:0x006c, B:29:0x0073, B:31:0x0079, B:35:0x0085, B:49:0x00a4, B:39:0x008e, B:44:0x009a, B:51:0x00a9, B:54:0x00b9, B:58:0x00c0, B:59:0x00c3), top: B:73:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0 A[Catch: NumberFormatException -> 0x00b7, TryCatch #0 {NumberFormatException -> 0x00b7, blocks: (B:26:0x0059, B:28:0x006c, B:29:0x0073, B:31:0x0079, B:35:0x0085, B:49:0x00a4, B:39:0x008e, B:44:0x009a, B:51:0x00a9, B:54:0x00b9, B:58:0x00c0, B:59:0x00c3), top: B:73:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea A[SYNTHETIC] */
    public static b0.f[] C0(String str) {
        String strTrim;
        int i4;
        float[] fArrT0;
        boolean z4;
        boolean z5;
        boolean z6;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        int i5 = 0;
        int i6 = 1;
        while (i6 < str.length()) {
            while (i6 < str.length()) {
                char cCharAt = str.charAt(i6);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i5, i6).trim();
                        if (strTrim.length() <= 0) {
                            if (strTrim.charAt(z7 ? 1 : 0) != 'z' || strTrim.charAt(z7 ? 1 : 0) == 'Z') {
                                i4 = z7 ? 1 : 0;
                                fArrT0 = new float[i4];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    m.e eVar = new m.e();
                                    int length = strTrim.length();
                                    int i7 = z7 ? 1 : 0;
                                    int i8 = 1;
                                    while (i8 < length) {
                                        eVar.f3406a = z7;
                                        boolean z8 = z7;
                                        boolean z9 = z8 ? 1 : 0;
                                        boolean z10 = z9 ? 1 : 0;
                                        int i9 = i8;
                                        boolean z11 = z9;
                                        while (i9 < strTrim.length()) {
                                            char cCharAt2 = strTrim.charAt(i9);
                                            if (cCharAt2 == ' ') {
                                                z8 = false;
                                                z4 = true;
                                                z5 = z11;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case '-':
                                                        z6 = z10;
                                                        z6 = z10;
                                                        if (i9 != i8 && !z8) {
                                                            eVar.f3406a = true;
                                                            break;
                                                        } else {
                                                            z8 = false;
                                                            z5 = z11;
                                                            z4 = z6;
                                                            break;
                                                        }
                                                    case ',':
                                                        z8 = false;
                                                        z4 = true;
                                                        z5 = z11;
                                                        break;
                                                    case '.':
                                                        if (!z11) {
                                                            z8 = false;
                                                            z5 = true;
                                                        } else {
                                                            eVar.f3406a = true;
                                                            z6 = true;
                                                            z8 = false;
                                                            z5 = z11;
                                                            z4 = z6;
                                                        }
                                                        break;
                                                    default:
                                                        z6 = z10;
                                                        z8 = false;
                                                        z5 = z11;
                                                        z4 = z6;
                                                        break;
                                                }
                                            } else {
                                                z8 = true;
                                                z5 = z11;
                                                z4 = z10;
                                            }
                                            if (z4) {
                                                z4 = z10;
                                                if (i8 < i9) {
                                                    int i10 = (i7 == true ? 1 : 0) + 1;
                                                    fArr[i7 == true ? 1 : 0] = Float.parseFloat(strTrim.substring(i8, i9));
                                                    i7 = i10;
                                                }
                                                if (eVar.f3406a) {
                                                    i8 = i9;
                                                } else {
                                                    i8 = i9 + 1;
                                                }
                                                z7 = false;
                                            } else {
                                                z4 = z10;
                                                i9++;
                                                z11 = z5;
                                                z10 = z4;
                                            }
                                        }
                                        if (i8 < i9) {
                                            int i11 = (i7 == true ? 1 : 0) + 1;
                                            fArr[i7 == true ? 1 : 0] = Float.parseFloat(strTrim.substring(i8, i9));
                                            i7 = i11;
                                        }
                                        if (eVar.f3406a) {
                                            i8 = i9;
                                        } else {
                                            i8 = i9 + 1;
                                        }
                                        z7 = false;
                                    }
                                    fArrT0 = t0(fArr, i7 == true ? 1 : 0);
                                    i4 = 0;
                                } catch (NumberFormatException e5) {
                                    throw new RuntimeException(defpackage.a.g("error in parsing \"", strTrim, "\""), e5);
                                }
                            }
                            char cCharAt3 = strTrim.charAt(i4);
                            b0.f fVar = new b0.f();
                            fVar.f1086a = cCharAt3;
                            fVar.f1087b = fArrT0;
                            arrayList.add(fVar);
                        }
                        i5 = i6;
                        z7 = false;
                        i6++;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i6++;
            }
            strTrim = str.substring(i5, i6).trim();
            if (strTrim.length() <= 0) {
                if (strTrim.charAt(z7 ? 1 : 0) != 'z') {
                    i4 = z7 ? 1 : 0;
                    fArrT0 = new float[i4];
                } else {
                    i4 = z7 ? 1 : 0;
                    fArrT0 = new float[i4];
                }
                char cCharAt4 = strTrim.charAt(i4);
                b0.f fVar2 = new b0.f();
                fVar2.f1086a = cCharAt4;
                fVar2.f1087b = fArrT0;
                arrayList.add(fVar2);
            }
            i5 = i6;
            z7 = false;
            i6++;
        }
        if (i6 - i5 == 1 && i5 < str.length()) {
            char cCharAt5 = str.charAt(i5);
            b0.f fVar3 = new b0.f();
            fVar3.f1086a = cCharAt5;
            fVar3.f1087b = new float[0];
            arrayList.add(fVar3);
        }
        return (b0.f[]) arrayList.toArray(new b0.f[arrayList.size()]);
    }

    public static void C2(ViewGroup viewGroup, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z4);
        } else if (f1267b) {
            try {
                viewGroup.suppressLayout(z4);
            } catch (NoSuchMethodError unused) {
                f1267b = false;
            }
        }
    }

    public static Path D0(String str) {
        Path path = new Path();
        b0.f[] fVarArrC0 = C0(str);
        if (fVarArrC0 == null) {
            return null;
        }
        try {
            b0.f.b(fVarArrC0, path);
            return path;
        } catch (RuntimeException e5) {
            throw new RuntimeException("Error in parsing " + str, e5);
        }
    }

    public static TypedArray D1(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final void D2(Object obj) throws Throwable {
        if (obj instanceof z2.b) {
            throw ((z2.b) obj).f5506b;
        }
    }

    public static b0.f[] E0(b0.f[] fVarArr) {
        if (fVarArr == null) {
            return null;
        }
        b0.f[] fVarArr2 = new b0.f[fVarArr.length];
        for (int i4 = 0; i4 < fVarArr.length; i4++) {
            b0.f fVar = fVarArr[i4];
            b0.f fVar2 = new b0.f();
            fVar2.f1086a = fVar.f1086a;
            float[] fArr = fVar.f1087b;
            fVar2.f1087b = t0(fArr, fArr.length);
            fVarArr2[i4] = fVar2;
        }
        return fVarArr2;
    }

    public static void E2(String str) {
        p pVar = new p(defpackage.a.g("lateinit property ", str, " has not been initialized"));
        o2(h.class.getName(), pVar);
        throw pVar;
    }

    public static void F(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        b0(th, "<this>");
        b0(th2, "exception");
        if (th != th2) {
            Integer num = h3.a.f2514a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = g3.a.f2318a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static boolean F0(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z4 = true;
        for (File file2 : fileArrListFiles) {
            z4 = F0(file2) && z4;
        }
        return z4;
    }

    public static final Map F2(Map map) {
        b0(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        a0(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }

    public static void G(StringBuilder sb, Object obj, j3.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.e(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static boolean G0(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = v0.f2983a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = u0.f2966d;
        u0 u0Var = (u0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (u0Var == null) {
            u0Var = new u0();
            u0Var.f2967a = null;
            u0Var.f2968b = null;
            u0Var.f2969c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, u0Var);
        }
        WeakReference weakReference2 = u0Var.f2969c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        u0Var.f2969c = new WeakReference(keyEvent);
        if (u0Var.f2968b == null) {
            u0Var.f2968b = new SparseArray();
        }
        SparseArray sparseArray = u0Var.f2968b;
        if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !h0.b(view2) || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        defpackage.a.n(arrayList.get(size));
        throw null;
    }

    public static String G2(String str) {
        b0(str, "<this>");
        if (!(!q3.l.b3("|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List listQ2 = p3.d.Q2(new p3.h(q3.l.e3(str, new String[]{"\r\n", "\n", "\r"}, false, 0), new a3.a(3, str)));
        int length = str.length();
        listQ2.size();
        q3.h hVar = q3.h.f3904c;
        int iW0 = W0(listQ2);
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (Object obj : listQ2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj;
            String strSubstring = null;
            if ((i4 == 0 || i4 == iW0) && q3.l.b3(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        i6 = -1;
                        break;
                    }
                    char cCharAt = str2.charAt(i6);
                    if (!(Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt))) {
                        break;
                    }
                    i6++;
                }
                if (i6 != -1 && q3.l.n3(str2, "|", i6, false)) {
                    strSubstring = str2.substring("|".length() + i6);
                    a0(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                if (strSubstring != null) {
                    str2 = (String) hVar.e(strSubstring);
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i4 = i5;
        }
        StringBuilder sb = new StringBuilder(length);
        n.f3(arrayList, sb, "\n", "", "", -1, "...", null);
        String string = sb.toString();
        a0(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static void H(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                c0.b.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                c0.b.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                c0.b.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static boolean H0(i0.l lVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        if (lVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return lVar.f(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f1268c) {
                        try {
                            f1269d = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f1268c = true;
                    }
                    Method method = f1269d;
                    if (method != null) {
                        try {
                            Object objInvoke = method.invoke(actionBar, keyEvent);
                            if (objInvoke != null && ((Boolean) objInvoke).booleanValue()) {
                                return true;
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (v0.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && v0.b(view, keyEvent)) || lVar.f(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f1270e) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f1271f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f1270e = true;
        }
        Field field = f1271f;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
                onKeyListener = null;
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (v0.b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }

    public static boolean I(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static final boolean I0(char c5, char c6, boolean z4) {
        if (c5 == c6) {
            return true;
        }
        if (!z4) {
            return false;
        }
        char upperCase = Character.toUpperCase(c5);
        char upperCase2 = Character.toUpperCase(c6);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static n3.c I2(int i4, int i5) {
        if (i5 > Integer.MIN_VALUE) {
            return new n3.c(i4, i5 - 1, 1);
        }
        n3.c cVar = n3.c.f3572e;
        return n3.c.f3572e;
    }

    public static final boolean J(int i4, int i5, int i6, byte[] bArr, byte[] bArr2) {
        b0(bArr, "a");
        b0(bArr2, "b");
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i7 + i4] != bArr2[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static final y0 J2(e eVar, k kVar, Object obj) {
        y0 y0Var = null;
        if (!(eVar instanceof e3.d)) {
            return null;
        }
        if (kVar.e(z0.f4133b) != null) {
            e3.d dVarF = (e3.d) eVar;
            while (!(dVarF instanceof v) && (dVarF = dVarF.f()) != null) {
                if (dVarF instanceof y0) {
                    y0Var = (y0) dVarF;
                    break;
                }
            }
            if (y0Var != null) {
                y0Var.f4131e.set(new z2.a(kVar, obj));
            }
        }
        return y0Var;
    }

    public static void K(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: ".concat(cls.getName()));
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: ".concat(cls.getName()));
        }
    }

    public static final k K0(k kVar, k kVar2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        r3.h hVar = r3.h.f4089e;
        boolean zBooleanValue = ((Boolean) kVar.h(bool, hVar)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) kVar2.h(bool, hVar)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return kVar.x(kVar2);
        }
        k3.m mVar = new k3.m();
        mVar.f3276b = kVar2;
        l lVar = l.f1275b;
        k kVar3 = (k) kVar.h(lVar, new q3.k(mVar, z4, 2));
        if (zBooleanValue2) {
            mVar.f3276b = ((k) mVar.f3276b).h(lVar, r3.h.f4088d);
        }
        return kVar3.x((k) mVar.f3276b);
    }

    public static void K2(com.auth0.android.request.internal.k kVar, s sVar) {
        z2.f fVar;
        int iIntValue;
        b0(kVar, "token");
        j1.a aVar = (j1.a) sVar.f3217e;
        if (aVar != null) {
            List list = aVar.f3148a;
            String str = kVar.f1321b;
            if (!list.contains(str) || "none".equalsIgnoreCase(str)) {
                b0(str, "tokenAlgorithm");
                throw new j1.p(j1.p.f3209b.f(str, list));
            }
            Signature signature = aVar.f3149b;
            StringBuilder sb = new StringBuilder();
            String[] strArr = kVar.f1320a;
            sb.append(strArr[0]);
            sb.append(".");
            sb.append(strArr[1]);
            byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
            try {
                byte[] bArrDecode = Base64.decode(strArr[2], 10);
                signature.update(bytes);
                fVar = signature.verify(bArrDecode) ? z2.f.f5511a : null;
            } catch (Exception unused) {
            }
            throw new t("Invalid ID token signature.");
        }
        if (fVar == null) {
            throw new j0("Signature Verifier should not be null");
        }
        String str2 = kVar.f1324e;
        if (TextUtils.isEmpty(str2)) {
            throw new j1.v("Issuer (iss) claim must be a string present in the ID token");
        }
        String str3 = (String) sVar.f3213a;
        if (!I(str2, str3)) {
            b0(str3, "expected");
            throw new u(u.f3221b.e(str3, str2));
        }
        if (TextUtils.isEmpty(kVar.f1323d)) {
            throw new k0("Subject (sub) claim must be a string present in the ID token");
        }
        List list2 = kVar.f1332m;
        if (list2.isEmpty()) {
            throw new j1.c("Audience (aud) claim must be a string or array of strings present in the ID token");
        }
        String str4 = (String) sVar.f3214b;
        if (!list2.contains(str4)) {
            b0(str4, "expected");
            throw new j1.b(j1.b.f3153b.f(str4, list2));
        }
        Calendar calendar = Calendar.getInstance();
        Date time = (Date) sVar.f3220h;
        if (time == null) {
            time = calendar.getTime();
        }
        Integer num = (Integer) sVar.f3219g;
        if (num != null) {
            X(num);
            iIntValue = num.intValue();
        } else {
            iIntValue = 60;
        }
        Date date = kVar.f1329j;
        if (date == null) {
            throw new j1.n("Expiration Time (exp) claim must be a number present in the ID token");
        }
        calendar.setTime(date);
        calendar.add(13, iIntValue);
        Date time2 = calendar.getTime();
        X(time);
        if (time.after(time2)) {
            long j4 = 1000;
            throw new q(q.f3212b.d(time.getTime() / j4, Long.valueOf(time2.getTime() / j4)));
        }
        if (kVar.f1328i == null) {
            throw new o("Issued At (iat) claim must be a number present in the ID token");
        }
        if (((String) sVar.f3216d) != null) {
            String str5 = kVar.f1325f;
            if (TextUtils.isEmpty(str5)) {
                throw new z("Nonce (nonce) claim must be a string present in the ID token");
            }
            if (!I((String) sVar.f3216d, str5)) {
                throw new j1.x(j1.x.f3228b.e((String) sVar.f3216d, str5));
            }
        }
        String str6 = (String) sVar.f3215c;
        if (str6 != null) {
            if (q3.l.o3(str6, "org_", false)) {
                String str7 = kVar.f1326g;
                if (TextUtils.isEmpty(str7)) {
                    throw new e0("Organization Id (org_id) claim must be a string present in the ID token");
                }
                if (!I(str6, str7)) {
                    throw new d0(d0.f3169b.e(str6, str7));
                }
            } else {
                String str8 = kVar.f1327h;
                if (TextUtils.isEmpty(str8)) {
                    throw new g0("Organization Name (org_name) claim must be a string present in the ID token");
                }
                String lowerCase = str6.toLowerCase(Locale.ROOT);
                a0(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!I(lowerCase, str8)) {
                    throw new f0(f0.f3171b.e(str6, str8));
                }
            }
        }
        if (list2.size() > 1) {
            String str9 = kVar.f1330k;
            if (TextUtils.isEmpty(str9)) {
                throw new j1.i("Authorized Party (azp) claim must be a string present in the ID token when Audience (aud) claim has multiple values");
            }
            if (!I(str4, str9)) {
                b0(str4, "expected");
                throw new j1.h(j1.h.f3174b.e(str4, str9));
            }
        }
        if (((Integer) sVar.f3218f) != null) {
            Date date2 = kVar.f1331l;
            if (date2 == null) {
                throw new j1.e("Authentication Time (auth_time) claim must be a number present in the ID token when Max Age (max_age) is specified");
            }
            calendar.setTime(date2);
            Integer num2 = (Integer) sVar.f3218f;
            X(num2);
            calendar.add(13, num2.intValue());
            calendar.add(13, iIntValue);
            Date time3 = calendar.getTime();
            if (time.after(time3)) {
                long j5 = 1000;
                throw new j1.d(j1.d.f3168b.d(time.getTime() / j5, Long.valueOf(time3.getTime() / j5)));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static boolean L(int i4, Rect rect, Rect rect2, Rect rect3) {
        int iW1;
        int i5;
        int i6;
        boolean zM = M(i4, rect, rect2);
        if (M(i4, rect, rect3) || !zM) {
            return false;
        }
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i4 != 17 && i4 != 66) {
                            iW1 = w1(i4, rect, rect2);
                            if (i4 != 17) {
                                i5 = rect.left;
                                i6 = rect3.left;
                            } else if (i4 != 33) {
                                i5 = rect.top;
                                i6 = rect3.top;
                            } else if (i4 != 66) {
                                i5 = rect3.right;
                                i6 = rect.right;
                            } else {
                                if (i4 == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i5 = rect3.bottom;
                                i6 = rect.bottom;
                            }
                            if (iW1 < Math.max(1, i5 - i6)) {
                                return true;
                            }
                            return false;
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i4 != 17) {
                        iW1 = w1(i4, rect, rect2);
                        if (i4 != 17) {
                            i5 = rect.left;
                            i6 = rect3.left;
                        } else if (i4 != 33) {
                            i5 = rect.top;
                            i6 = rect3.top;
                        } else if (i4 != 66) {
                            i5 = rect3.right;
                            i6 = rect.right;
                        } else {
                            if (i4 == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i5 = rect3.bottom;
                            i6 = rect.bottom;
                        }
                        if (iW1 < Math.max(1, i5 - i6)) {
                            return true;
                        }
                        return false;
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i4 != 17) {
                    iW1 = w1(i4, rect, rect2);
                    if (i4 != 17) {
                        i5 = rect.left;
                        i6 = rect3.left;
                    } else if (i4 != 33) {
                        i5 = rect.top;
                        i6 = rect3.top;
                    } else if (i4 != 66) {
                        i5 = rect3.right;
                        i6 = rect.right;
                    } else {
                        if (i4 == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i5 = rect3.bottom;
                        i6 = rect.bottom;
                    }
                    if (iW1 < Math.max(1, i5 - i6)) {
                        return true;
                    }
                    return false;
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i4 != 17) {
                iW1 = w1(i4, rect, rect2);
                if (i4 != 17) {
                    i5 = rect.left;
                    i6 = rect3.left;
                } else if (i4 != 33) {
                    i5 = rect.top;
                    i6 = rect3.top;
                } else if (i4 != 66) {
                    i5 = rect3.right;
                    i6 = rect.right;
                } else {
                    if (i4 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i5 = rect3.bottom;
                    i6 = rect.bottom;
                }
                if (iW1 < Math.max(1, i5 - i6)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static i L0(i iVar, j jVar) {
        b0(jVar, "key");
        if (I(iVar.getKey(), jVar)) {
            return iVar;
        }
        return null;
    }

    public static float L1(EdgeEffect edgeEffect, float f5, float f6) {
        if (Build.VERSION.SDK_INT >= 31) {
            return m0.e.c(edgeEffect, f5, f6);
        }
        m0.d.a(edgeEffect, f5, f6);
        return f5;
    }

    public static final Object L2(kotlinx.coroutines.scheduling.c cVar, j3.p pVar, e eVar) {
        Object objH;
        k kVarG = eVar.g();
        k kVarX = !((Boolean) cVar.h(Boolean.FALSE, r3.h.f4089e)).booleanValue() ? kVarG.x(cVar) : K0(kVarG, cVar, false);
        i0 i0Var = (i0) kVarX.e(r3.l.f4099c);
        if (i0Var != null && !i0Var.a()) {
            throw ((p0) i0Var).p();
        }
        if (kVarX == kVarG) {
            kotlinx.coroutines.internal.o oVar = new kotlinx.coroutines.internal.o(eVar, kVarX);
            objH = r3.q.u(oVar, oVar, pVar);
        } else {
            f fVar = f.f1265b;
            if (I(kVarX.e(fVar), kVarG.e(fVar))) {
                y0 y0Var = new y0(eVar, kVarX);
                Object objF = kotlinx.coroutines.internal.a.f(kVarX, null);
                try {
                    Object objU = r3.q.u(y0Var, y0Var, pVar);
                    kotlinx.coroutines.internal.a.c(kVarX, objF);
                    objH = objU;
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.a.c(kVarX, objF);
                    throw th;
                }
            } else {
                v vVar = new v(eVar, kVarX);
                r3.q.t(pVar, vVar, vVar);
                objH = vVar.H();
            }
        }
        d3.a aVar = d3.a.f1765b;
        return objH;
    }

    public static boolean M(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static String M0(String str, String str2, String str3) {
        if (!URLUtil.isValidUrl(str3)) {
            Log.e("h", "The Domain is invalid and the Callback URI will not be set. You used: ".concat(str3));
            return null;
        }
        Uri uriBuild = Uri.parse(str3).buildUpon().scheme(str).appendPath("android").appendPath(str2).appendPath("callback").build();
        Log.v("h", "The Callback URI is: " + uriBuild);
        return uriBuild.toString();
    }

    public static ActionMode.Callback M2(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof m0.t) || callback == null) ? callback : new m0.t(callback, textView);
    }

    public static void N(j3.p pVar) {
        if (pVar != null) {
            if (pVar instanceof k3.e) {
                if (((k3.e) pVar).d() == 2) {
                    return;
                }
            } else if (!(pVar instanceof j3.a) && !(pVar instanceof j3.l)) {
                return;
            }
            ClassCastException classCastException = new ClassCastException(pVar.getClass().getName().concat(" cannot be cast to kotlin.jvm.functions.Function2"));
            o2(h.class.getName(), classCastException);
            throw classCastException;
        }
    }

    public static int N0(Context context, int i4, int i5) {
        Integer numValueOf;
        int iA;
        TypedValue typedValueI2 = i2(context, i4);
        if (typedValueI2 != null) {
            int i6 = typedValueI2.resourceId;
            if (i6 != 0) {
                Object obj = z.d.f5428a;
                iA = z.c.a(context, i6);
            } else {
                iA = typedValueI2.data;
            }
            numValueOf = Integer.valueOf(iA);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i5;
    }

    public static void N2(m2.q qVar, t2.c cVar) {
        p2.x.f3865y.c(cVar, qVar);
    }

    public static int O0(View view, int i4) {
        Context context = view.getContext();
        TypedValue typedValueM2 = m2(i4, view.getContext(), view.getClass().getCanonicalName());
        int i5 = typedValueM2.resourceId;
        if (i5 == 0) {
            return typedValueM2.data;
        }
        Object obj = z.d.f5428a;
        return z.c.a(context, i5);
    }

    public static void O2(ByteArrayOutputStream byteArrayOutputStream, long j4, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) ((j4 >> (i5 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static ColorStateList P0(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (colorStateListB = z.d.b(context, resourceId)) == null) ? typedArray.getColorStateList(i4) : colorStateListB;
    }

    public static void P2(ByteArrayOutputStream byteArrayOutputStream, int i4) throws IOException {
        O2(byteArrayOutputStream, i4, 2);
    }

    public static boolean Q(b0.f[] fVarArr, b0.f[] fVarArr2) {
        if (fVarArr == null || fVarArr2 == null || fVarArr.length != fVarArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < fVarArr.length; i4++) {
            b0.f fVar = fVarArr[i4];
            char c5 = fVar.f1086a;
            b0.f fVar2 = fVarArr2[i4];
            if (c5 != fVar2.f1086a || fVar.f1087b.length != fVar2.f1087b.length) {
                return false;
            }
        }
        return true;
    }

    public static ColorStateList Q0(Context context, e.c cVar, int i4) {
        int iN;
        ColorStateList colorStateListB;
        return (!cVar.r(i4) || (iN = cVar.n(i4, 0)) == 0 || (colorStateListB = z.d.b(context, iN)) == null) ? cVar.c(i4) : colorStateListB;
    }

    public static a0.f Q1(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), x.a.f4924b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(4);
            String string3 = typedArrayObtainAttributes.getString(5);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(2, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
            String string4 = typedArrayObtainAttributes.getString(6);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    z2(xmlResourceParser);
                }
                return new a0.i(new r(string, string2, string3, b2(resourceId, resources)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), x.a.f4925c);
                        int i4 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z4 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i6 = typedArrayObtainAttributes2.getInt(i5, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i7, 0);
                        String string6 = typedArrayObtainAttributes2.getString(i7);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            z2(xmlResourceParser);
                        }
                        arrayList.add(new a0.h(i4, i6, resourceId2, string6, string5, z4));
                    } else {
                        z2(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new a0.g((a0.h[]) arrayList.toArray(new a0.h[0]));
            }
        } else {
            z2(xmlResourceParser);
        }
        return null;
    }

    public static ColorStateList R0(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !x1.i(drawable)) {
            return null;
        }
        return x1.b(drawable).getColorStateList();
    }

    public static PorterDuff.Mode S1(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static float T0(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return m0.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final boolean T1(String str) {
        b0(str, "method");
        return (I(str, "GET") || I(str, "HEAD")) ? false : true;
    }

    public static void U(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Drawable U0(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        Drawable drawableG;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (drawableG = r3.q.g(context, resourceId)) == null) ? typedArray.getDrawable(i4) : drawableG;
    }

    public static void U1(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = (Animator) arrayList.get(i4);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static void V(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static final Class V0(o3.b bVar) {
        b0(bVar, "<this>");
        Class clsA = ((k3.b) bVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsA : Double.class;
            case 104431:
                return !name.equals("int") ? clsA : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsA : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsA : Character.class;
            case 3327612:
                return !name.equals("long") ? clsA : Long.class;
            case 3625364:
                return !name.equals("void") ? clsA : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsA : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsA : Float.class;
            case 109413500:
                return !name.equals("short") ? clsA : Short.class;
            default:
                return clsA;
        }
    }

    public static k V1(i iVar, k kVar) {
        b0(kVar, "context");
        return W1(iVar, kVar);
    }

    public static void W(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int W0(List list) {
        b0(list, "<this>");
        return list.size() - 1;
    }

    public static k W1(k kVar, k kVar2) {
        b0(kVar2, "context");
        return kVar2 == l.f1275b ? kVar : (k) kVar2.h(kVar, c.f1261e);
    }

    public static void X(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        o2(h.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static float X0(String[] strArr, int i4) {
        float f5 = Float.parseFloat(strArr[i4]);
        if (f5 >= 0.0f && f5 <= 1.0f) {
            return f5;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f5);
    }

    public static void Y(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        o2(h.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static a0.d Y0(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i4) {
        a0.d dVarA;
        if (h1(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i4, typedValue);
            int i5 = typedValue.type;
            if (i5 >= 28 && i5 <= 31) {
                return new a0.d(null, null, typedValue.data);
            }
            try {
                dVarA = a0.d.a(typedArray.getResources(), typedArray.getResourceId(i4, 0), theme);
            } catch (Exception e5) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e5);
                dVarA = null;
            }
            if (dVarA != null) {
                return dVarA;
            }
        }
        return new a0.d(null, null, 0);
    }

    public static void Z(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final int Z0(int i4, int i5, int i6) {
        if (i6 > 0) {
            if (i4 >= i5) {
                return i5;
            }
            int i7 = i5 % i6;
            if (i7 < 0) {
                i7 += i6;
            }
            int i8 = i4 % i6;
            if (i8 < 0) {
                i8 += i6;
            }
            int i9 = (i7 - i8) % i6;
            if (i9 < 0) {
                i9 += i6;
            }
            return i5 - i9;
        }
        if (i6 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i4 <= i5) {
            return i5;
        }
        int i10 = -i6;
        int i11 = i4 % i10;
        if (i11 < 0) {
            i11 += i10;
        }
        int i12 = i5 % i10;
        if (i12 < 0) {
            i12 += i10;
        }
        int i13 = (i11 - i12) % i10;
        if (i13 < 0) {
            i13 += i10;
        }
        return i5 + i13;
    }

    public static a2.a Z1(MappedByteBuffer mappedByteBuffer) throws IOException {
        long jD;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        n0 n0Var = new n0(byteBufferDuplicate);
        n0Var.E(4);
        int i4 = ((ByteBuffer) n0Var.f1896c).getShort() & 65535;
        if (i4 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        n0Var.E(6);
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                jD = -1;
                break;
            }
            int i6 = ((ByteBuffer) n0Var.f1896c).getInt();
            n0Var.E(4);
            jD = n0Var.D();
            n0Var.E(4);
            if (1835365473 == i6) {
                break;
            }
            i5++;
        }
        if (jD != -1) {
            n0Var.E((int) (jD - ((long) ((ByteBuffer) n0Var.f1896c).position())));
            n0Var.E(12);
            long jD2 = n0Var.D();
            for (int i7 = 0; i7 < jD2; i7++) {
                int i8 = ((ByteBuffer) n0Var.f1896c).getInt();
                long jD3 = n0Var.D();
                n0Var.D();
                if (1164798569 == i8 || 1701669481 == i8) {
                    byteBufferDuplicate.position((int) (jD3 + jD));
                    a2.a aVar = new a2.a();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    aVar.b(byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position()), byteBufferDuplicate);
                    return aVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void a0(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        o2(h.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static byte[] a2(InputStream inputStream, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int i6 = inputStream.read(bArr, i5, i4 - i5);
            if (i6 < 0) {
                throw new IllegalStateException(defpackage.a.e("Not enough bytes to read: ", i4));
            }
            i5 += i6;
        }
        return bArr;
    }

    public static void b0(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = h.class.getName();
            int i4 = 0;
            while (!stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            while (stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            o2(h.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static File b1(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i4 = 0; i4 < 100; i4++) {
            File file = new File(cacheDir, str + i4);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static List b2(int i4, Resources resources) {
        if (i4 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a0.e.a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i5 = 0; i5 < typedArrayObtainTypedArray.length(); i5++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i4);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final void c0(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j5 + " byteCount=" + j6);
        }
    }

    public static g0.e c1(TextView textView) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new g0.e(m0.s.c(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        androidx.activity.result.i iVar = new androidx.activity.result.i();
        iVar.f318d = textPaint;
        iVar.f316b = 1;
        iVar.f317c = 1;
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        iVar.f319e = textDirectionHeuristic;
        iVar.f316b = m0.q.a(textView);
        iVar.f317c = m0.q.d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i4 < 28 || (textView.getInputType() & 15) != 3) {
            boolean z4 = m0.p.b(textView) == 1;
            switch (m0.p.c(textView)) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z4) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(m0.s.b(m0.r.a(m0.p.d(textView)))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        iVar.f319e = textDirectionHeuristic;
        return new g0.e(textPaint, textDirectionHeuristic, iVar.f316b, iVar.f317c);
    }

    public static byte[] c2(FileInputStream fileInputStream, int i4, int i5) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i5];
            byte[] bArr2 = new byte[2048];
            int i6 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i6 < i4) {
                int i7 = fileInputStream.read(bArr2);
                if (i7 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i4 + " bytes");
                }
                inflater.setInput(bArr2, 0, i7);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i5 - iInflate);
                    i6 += i7;
                } catch (DataFormatException e5) {
                    throw new IllegalStateException(e5.getMessage());
                }
            }
            if (i6 == i4) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i4 + " actual=" + i6);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static void d0(int i4) {
        n3.c cVar = new n3.c(2, 36, 1);
        if (2 > i4 || i4 > cVar.f3566c) {
            throw new IllegalArgumentException("radix " + i4 + " was not in valid range " + new n3.c(2, 36, 1));
        }
    }

    public static SimpleDateFormat d1(int i4, int i5) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i4 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i4 == 1) {
            str = "MMMM d, yyyy";
        } else if (i4 == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i4 != 3) {
                throw new IllegalArgumentException(defpackage.a.e("Unknown DateFormat style: ", i4));
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i5 == 0 || i5 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i5 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i5 != 3) {
                throw new IllegalArgumentException(defpackage.a.e("Unknown DateFormat style: ", i5));
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static final String d2(InputStreamReader inputStreamReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i4 = inputStreamReader.read(cArr);
        while (i4 >= 0) {
            stringWriter.write(cArr, 0, i4);
            i4 = inputStreamReader.read(cArr);
        }
        String string = stringWriter.toString();
        a0(string, "buffer.toString()");
        return string;
    }

    public static int e0(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strD = y.h.d(str);
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && h0.b.a(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManagerC = y.i.c(context);
                iC = y.i.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                if (iC == 0) {
                    iC = y.i.a(appOpsManagerC, strD, iMyUid, y.i.b(context));
                }
            } else {
                iC = y.h.c((AppOpsManager) y.h.a(context, AppOpsManager.class), strD, packageName);
            }
            if (iC != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static long e2(InputStream inputStream, int i4) throws IOException {
        byte[] bArrA2 = a2(inputStream, i4);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 += ((long) (bArrA2[i5] & 255)) << (i5 * 8);
        }
        return j4;
    }

    public static int f0(int i4, int i5, int i6) {
        if (i4 < i5) {
            return i5;
        }
        return i4 > i6 ? i6 : i4;
    }

    public static final Object f2(Object obj) {
        return obj instanceof r3.f ? A0(((r3.f) obj).f4084a) : obj;
    }

    public static final void g1(k kVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            r3.m mVar = (r3.m) kVar.e(r3.l.f4098b);
            if (mVar != null) {
                ((s3.b) mVar).z(kVar, th);
            } else {
                r3.n.a(kVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                F(runtimeException, th);
                th = runtimeException;
            }
            r3.n.a(kVar, th);
        }
    }

    public static void g2(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        c0.b.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static boolean h1(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static String h2(t3.s sVar) {
        b0(sVar, "url");
        String strB = sVar.b();
        String strD = sVar.d();
        if (strD == null) {
            return strB;
        }
        return strB + '?' + strD;
    }

    public static String i1(String str) {
        b0(str, "scope");
        List<String> listM3 = q3.l.m3(str, new String[]{" "});
        ArrayList arrayList = new ArrayList(a3.j.R2(listM3));
        for (String str2 : listM3) {
            Locale locale = Locale.ROOT;
            a0(locale, "ROOT");
            String lowerCase = str2.toLowerCase(locale);
            a0(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            arrayList.add(lowerCase);
        }
        return !arrayList.contains("openid") ? q3.l.t3(n.g3(n.h3(arrayList, "openid"), " ", null, null, null, 62)).toString() : str;
    }

    public static TypedValue i2(Context context, int i4) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static void j0(y2.k kVar) {
        while (kVar.available() != 0) {
            try {
                kVar.skip(kVar.available());
            } catch (IOException unused) {
                return;
            }
        }
    }

    public static int j1(int i4) {
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 4) {
            return 2;
        }
        if (i4 == 8) {
            return 3;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 == 32) {
            return 5;
        }
        if (i4 == 64) {
            return 6;
        }
        if (i4 == 128) {
            return 7;
        }
        if (i4 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(defpackage.a.e("type needs to be >= FIRST and <= LAST, type=", i4));
    }

    public static boolean j2(Context context, int i4, boolean z4) {
        TypedValue typedValueI2 = i2(context, i4);
        if (typedValueI2 == null || typedValueI2.type != 18) {
            return z4;
        }
        return typedValueI2.data != 0;
    }

    public static final void k0(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                F(th, th2);
            }
        }
    }

    public static e k1(e eVar) {
        b0(eVar, "<this>");
        e3.c cVar = eVar instanceof e3.c ? (e3.c) eVar : null;
        if (cVar == null) {
            return eVar;
        }
        e eVar2 = cVar.f1989d;
        if (eVar2 != null) {
            return eVar2;
        }
        k kVar = cVar.f1988c;
        X(kVar);
        g gVar = (g) kVar.e(f.f1265b);
        e cVar2 = gVar != null ? new kotlinx.coroutines.internal.c((r3.k) gVar, cVar) : cVar;
        cVar.f1989d = cVar2;
        return cVar2;
    }

    public static int k2(Context context, int i4, int i5) {
        TypedValue typedValueI2 = i2(context, i4);
        return (typedValueI2 == null || typedValueI2.type != 16) ? i5 : typedValueI2.data;
    }

    public static void l0(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean l1() {
        String property = System.getProperty("os.arch");
        StringBuilder sb = new StringBuilder("os arch: ");
        sb.append(property);
        sb.append(" - abis: ");
        String[] strArr = Build.SUPPORTED_ABIS;
        a0(strArr, "SUPPORTED_ABIS");
        sb.append(a3.j.Y2(strArr));
        String string = sb.toString();
        PrintStream printStream = System.out;
        printStream.println((Object) string);
        StringBuilder sb2 = new StringBuilder("64 bits abis: ");
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        a0(strArr2, "SUPPORTED_64_BIT_ABIS");
        sb2.append(a3.j.Y2(strArr2));
        sb2.append(" | 32 bits abis: ");
        String[] strArr3 = Build.SUPPORTED_32_BIT_ABIS;
        a0(strArr3, "SUPPORTED_32_BIT_ABIS");
        sb2.append(a3.j.Y2(strArr3));
        printStream.println((Object) sb2.toString());
        if (property != null && q3.l.R2(property, "64", false)) {
            return true;
        }
        for (String str : strArr) {
            if (I(str, "arm64-v8a")) {
                return true;
            }
            if (I(str, "armeabi-v7a")) {
                return false;
            }
        }
        return false;
    }

    public static TimeInterpolator l2(Context context, int i4, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!r1(strValueOf, "cubic-bezier") && !r1(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!r1(strValueOf, "cubic-bezier")) {
            if (r1(strValueOf, "path")) {
                return k0.a.c(D0(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return k0.a.b(X0(strArrSplit, 0), X0(strArrSplit, 1), X0(strArrSplit, 2), X0(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static double m0(double d5) {
        if (d5 < 0.0d) {
            return 0.0d;
        }
        if (d5 > 120.0d) {
            return 120.0d;
        }
        return d5;
    }

    public static boolean m1(int i4, Rect rect, Rect rect2) {
        if (i4 == 17) {
            int i5 = rect.right;
            int i6 = rect2.right;
            return (i5 > i6 || rect.left >= i6) && rect.left > rect2.left;
        }
        if (i4 == 33) {
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            return (i7 > i8 || rect.top >= i8) && rect.top > rect2.top;
        }
        if (i4 == 66) {
            int i9 = rect.left;
            int i10 = rect2.left;
            return (i9 < i10 || rect.right <= i10) && rect.right < rect2.right;
        }
        if (i4 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        return (i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom;
    }

    public static TypedValue m2(int i4, Context context, String str) {
        TypedValue typedValueI2 = i2(context, i4);
        if (typedValueI2 != null) {
            return typedValueI2;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i4)));
    }

    public static int n0(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i4 == i5 ? 0 : 1;
    }

    public static boolean n1(int i4) {
        boolean z4;
        if (i4 != 0) {
            ThreadLocal threadLocal = b0.a.f1079a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int iRed = Color.red(i4);
            int iGreen = Color.green(i4);
            int iBlue = Color.blue(i4);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d5 = ((double) iRed) / 255.0d;
            double dPow = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            double d6 = ((double) iGreen) / 255.0d;
            double dPow2 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            double d7 = ((double) iBlue) / 255.0d;
            double dPow3 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
            z4 = false;
            dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            double d8 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr[1] = d8;
            dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (d8 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z4 = false;
        }
        return z4;
    }

    public static byte[] o0(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static boolean o1() {
        try {
            if (f1273h == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f1273h == null) {
                f1272g = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1273h = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1273h.invoke(null, Long.valueOf(f1272g))).booleanValue();
        } catch (Exception e5) {
            if (!(e5 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e5);
                return false;
            }
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static void o2(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.equals(stackTrace[i5].getClassName())) {
                i4 = i5;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i4 + 1, length));
    }

    public static int p0(a1 a1Var, b0 b0Var, View view, View view2, o0 o0Var, boolean z4) {
        if (o0Var.v() == 0 || a1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return Math.abs(o0.F(view) - o0.F(view2)) + 1;
        }
        return Math.min(b0Var.g(), b0Var.b(view2) - b0Var.d(view));
    }

    public static boolean p1(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static void p2(Context context, t3.d0 d0Var, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        b0(context, "context");
        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
        try {
            f4.f fVarA = ((c0) d0Var).f4336d.A();
            try {
                X(fileOutputStreamOpenFileOutput);
                b0(fVarA, "<this>");
                byte[] bArr = new byte[8192];
                for (int i4 = fVarA.read(bArr); i4 >= 0; i4 = fVarA.read(bArr)) {
                    fileOutputStreamOpenFileOutput.write(bArr, 0, i4);
                }
                k0(fVarA, null);
                k0(fileOutputStreamOpenFileOutput, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    k0(fVarA, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                k0(fileOutputStreamOpenFileOutput, th3);
                throw th4;
            }
        }
    }

    public static int q0(a1 a1Var, b0 b0Var, View view, View view2, o0 o0Var, boolean z4, boolean z5) {
        if (o0Var.v() == 0 || a1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z5 ? Math.max(0, (a1Var.b() - Math.max(o0.F(view), o0.F(view2))) - 1) : Math.max(0, Math.min(o0.F(view), o0.F(view2)));
        if (z4) {
            return Math.round((iMax * (Math.abs(b0Var.b(view2) - b0Var.d(view)) / (Math.abs(o0.F(view) - o0.F(view2)) + 1))) + (b0Var.f() - b0Var.d(view)));
        }
        return iMax;
    }

    public static boolean q1(View view) {
        WeakHashMap weakHashMap = v0.f2983a;
        return i0.f0.d(view) == 1;
    }

    public static void q2(TextView textView, int i4) {
        W(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            m0.s.d(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = m0.o.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static int r0(a1 a1Var, b0 b0Var, View view, View view2, o0 o0Var, boolean z4) {
        if (o0Var.v() == 0 || a1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return a1Var.b();
        }
        return (int) (((b0Var.b(view2) - b0Var.d(view)) / (Math.abs(o0.F(view) - o0.F(view2)) + 1)) * a1Var.b());
    }

    public static boolean r1(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static void r2(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = v0.f2983a;
        boolean zA = i0.d0.a(checkableImageButton);
        boolean z4 = onLongClickListener != null;
        boolean z5 = zA || z4;
        checkableImageButton.setFocusable(z5);
        checkableImageButton.setClickable(zA);
        checkableImageButton.setPressable(zA);
        checkableImageButton.setLongClickable(z4);
        i0.e0.s(checkableImageButton, z5 ? 1 : 2);
    }

    public static ImageView.ScaleType s0(int i4) {
        if (i4 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i4 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i4 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i4 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i4 != 5) {
            return i4 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static void s1(q0 q0Var, j3.p pVar) {
        k kVarK0 = K0(l.f1275b, q0Var, true);
        kotlinx.coroutines.scheduling.d dVar = x.f4128a;
        if (kVarK0 != dVar && kVarK0.e(f.f1265b) == null) {
            kVarK0 = kVarK0.x(dVar);
        }
        r3.u0 u0Var = new r3.u0(kVarK0, true);
        int iA = p.h.a(1);
        if (iA == 0) {
            r3.q.t(pVar, u0Var, u0Var);
            return;
        }
        if (iA != 1) {
            if (iA == 2) {
                k1(y0(u0Var, u0Var, pVar)).b(z2.f.f5511a);
                return;
            }
            if (iA != 3) {
                throw new p();
            }
            try {
                k kVar = u0Var.f4074c;
                Object objF = kotlinx.coroutines.internal.a.f(kVar, null);
                try {
                    N(pVar);
                    Object objC = pVar.c(u0Var, u0Var);
                    kotlinx.coroutines.internal.a.c(kVar, objF);
                    if (objC != d3.a.f1765b) {
                        u0Var.b(objC);
                    }
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.a.c(kVar, objF);
                    throw th;
                }
            } catch (Throwable th2) {
                u0Var.b(A0(th2));
            }
        }
    }

    public static void s2(TextView textView, int i4) {
        W(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = m0.o.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    public static float[] t0(float[] fArr, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i4, length);
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static int t1(int i4, int i5, float f5) {
        return b0.a.b(b0.a.d(i5, Math.round(Color.alpha(i5) * f5)), i4);
    }

    public static void t2(View view, f2.h hVar) {
        y1.a aVar = hVar.f2057b.f2036b;
        if (aVar == null || !aVar.f5366a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = v0.f2983a;
            fI += i0.k0.i((View) parent);
        }
        f2.g gVar = hVar.f2057b;
        if (gVar.f2047m != fI) {
            gVar.f2047m = fI;
            hVar.n();
        }
    }

    public static boolean u0(File file, Resources resources, int i4) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i4);
            try {
                boolean zV0 = v0(file, inputStreamOpenRawResource);
                l0(inputStreamOpenRawResource);
                return zV0;
            } catch (Throwable th) {
                th = th;
                l0(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static List u1(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        a0(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }

    public static void u2(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i4);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }

    public static boolean v0(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i4 = inputStream.read(bArr);
                        if (i4 == -1) {
                            l0(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i4);
                    }
                } catch (IOException e5) {
                    e = e5;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    l0(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    l0(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x009f A[Catch: RuntimeException -> 0x00a5, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00a5, blocks: (B:59:0x0099, B:61:0x009f), top: B:72:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    public static androidx.fragment.app.x v1(Context context, androidx.fragment.app.q qVar, boolean z4, boolean z5) {
        int i4;
        Animator animatorLoadAnimator;
        int i5;
        androidx.fragment.app.o oVar = qVar.I;
        int i6 = oVar == null ? 0 : oVar.f829h;
        if (z5) {
            if (z4) {
                if (oVar == null) {
                    i4 = 0;
                } else {
                    i4 = oVar.f827f;
                }
            } else if (oVar == null) {
                i4 = 0;
            } else {
                i4 = oVar.f828g;
            }
        } else if (z4) {
            if (oVar == null) {
                i4 = 0;
            } else {
                i4 = oVar.f825d;
            }
        } else if (oVar == null) {
            i4 = 0;
        } else {
            i4 = oVar.f826e;
        }
        qVar.E(0, 0, 0, 0);
        ViewGroup viewGroup = qVar.E;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            qVar.E.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = qVar.E;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (i4 == 0 && i6 != 0) {
            if (i6 == 4097) {
                i5 = z4 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
            } else if (i6 == 4099) {
                i5 = z4 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
            } else if (i6 != 8194) {
                i5 = -1;
            } else {
                i5 = z4 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
            }
            i4 = i5;
        }
        if (i4 != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i4));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i4);
                    if (animationLoadAnimation != null) {
                        return new androidx.fragment.app.x(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e5) {
                    throw e5;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i4);
                        if (animatorLoadAnimator != null) {
                            return new androidx.fragment.app.x(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e6) {
                        if (zEquals) {
                            throw e6;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i4);
                        if (animationLoadAnimation2 != null) {
                            return new androidx.fragment.app.x(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i4);
                if (animatorLoadAnimator != null) {
                    return new androidx.fragment.app.x(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    public static void v2(Drawable drawable, int i4) {
        c0.b.g(drawable, i4);
    }

    public static androidx.emoji2.text.v w0(Context context) {
        ProviderInfo providerInfoX;
        r rVarC;
        ApplicationInfo applicationInfo;
        n0 n0Var = new n0();
        PackageManager packageManager = context.getPackageManager();
        Z(packageManager, "Package manager required to locate emoji font provider");
        Iterator it = ((f2.e) n0Var.f1896c).K(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT")).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfoX = null;
                break;
            }
            providerInfoX = ((f2.e) n0Var.f1896c).x((ResolveInfo) it.next());
            if (providerInfoX != null && (applicationInfo = providerInfoX.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfoX == null) {
            rVarC = null;
        } else {
            try {
                rVarC = n0Var.C(providerInfoX, packageManager);
            } catch (PackageManager.NameNotFoundException e5) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e5);
                rVarC = null;
            }
        }
        if (rVarC == null) {
            return null;
        }
        return new androidx.emoji2.text.v(new androidx.emoji2.text.u(context, rVarC));
    }

    public static int w1(int i4, Rect rect, Rect rect2) {
        int i5;
        int i6;
        if (i4 == 17) {
            i5 = rect.left;
            i6 = rect2.right;
        } else if (i4 == 33) {
            i5 = rect.top;
            i6 = rect2.bottom;
        } else if (i4 == 66) {
            i5 = rect2.left;
            i6 = rect.right;
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i5 = rect2.top;
            i6 = rect.bottom;
        }
        return Math.max(0, i5 - i6);
    }

    public static void w2(Drawable drawable, ColorStateList colorStateList) {
        c0.b.h(drawable, colorStateList);
    }

    public static h x0(int i4) {
        if (i4 != 0 && i4 == 1) {
            return new f2.d();
        }
        return new f2.j();
    }

    public static int x1(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static void x2(Drawable drawable, PorterDuff.Mode mode) {
        c0.b.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e y0(Object obj, e eVar, j3.p pVar) {
        b0(eVar, "completion");
        return ((e3.a) pVar).a(eVar);
    }

    public static Typeface y1(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, f0(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static void y2(Context context, String str, String str2) {
        b0(context, "context");
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(android.R.string.ok, new v2.a());
        builder.show();
    }

    public static f2.e z0() {
        return new f2.e(0);
    }

    public static int z1(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static void z2(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }

    public abstract Intent B0(androidx.activity.n nVar, Object obj);

    @Override // i0.e1
    public void C() {
    }

    public abstract Object C1(Class cls);

    public abstract void E1(Throwable th);

    public abstract View F1(int i4);

    public abstract void G1(int i4);

    public abstract void H1(Typeface typeface);

    public abstract boolean H2(View view, int i4);

    public abstract void I1(Typeface typeface, boolean z4);

    public abstract void J0(g1.c cVar);

    public abstract boolean J1();

    public abstract void K1(g.h hVar);

    public void M1(View view, int i4) {
    }

    public abstract void N1(int i4);

    public void O(int i4) {
        new Handler(Looper.getMainLooper()).post(new a0.n(i4, 0, this));
    }

    public abstract void O1(View view, int i4, int i5);

    public void P(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new e.k0(this, 1, typeface));
    }

    public abstract void P1(View view, float f5, float f6);

    public abstract boolean R(o.f fVar, o.c cVar);

    public abstract Object R1(Intent intent, int i4);

    public abstract boolean S(o.f fVar, Object obj, Object obj2);

    public abstract void S0(float f5, float f6, w wVar);

    public abstract boolean T(o.f fVar, o.e eVar, o.e eVar2);

    public abstract void X1(o.e eVar, o.e eVar2);

    public abstract void Y1(o.e eVar, Thread thread);

    public c.a a1(androidx.activity.n nVar, Object obj) {
        b0(nVar, "context");
        return null;
    }

    public int e1(View view) {
        return 0;
    }

    public int f1() {
        return 0;
    }

    public abstract int g0(View view, int i4);

    public abstract int h0(View view, int i4);

    public abstract List i0(String str, List list);

    public abstract boolean n2(j1.g gVar);

    @Override // i0.e1
    public void x(View view) {
    }
}
