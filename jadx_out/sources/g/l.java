package g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import h.r;
import i.t1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class l extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f2258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f2259f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f2260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f2261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2263d;

    static {
        Class[] clsArr = {Context.class};
        f2258e = clsArr;
        f2259f = clsArr;
    }

    public l(Context context) {
        super(context);
        this.f2262c = context;
        Object[] objArr = {context};
        this.f2260a = objArr;
        this.f2261b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i4;
        ColorStateList colorStateList;
        k kVar = new k(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            i4 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i4) {
                if (!z5) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    l lVar = kVar.E;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = lVar.f2262c.obtainStyledAttributes(attributeSet, d.a.f1669p);
                        kVar.f2233b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        kVar.f2234c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        kVar.f2235d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        kVar.f2236e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        kVar.f2237f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        kVar.f2238g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        Context context = lVar.f2262c;
                        e.c cVar = new e.c(context, context.obtainStyledAttributes(attributeSet, d.a.f1670q));
                        kVar.f2240i = cVar.n(2, 0);
                        kVar.f2241j = (cVar.k(5, kVar.f2234c) & (-65536)) | (cVar.k(6, kVar.f2235d) & 65535);
                        kVar.f2242k = cVar.q(7);
                        kVar.f2243l = cVar.q(8);
                        kVar.f2244m = cVar.n(0, 0);
                        String strO = cVar.o(9);
                        kVar.f2245n = strO == null ? (char) 0 : strO.charAt(0);
                        kVar.f2246o = cVar.k(16, 4096);
                        String strO2 = cVar.o(10);
                        kVar.f2247p = strO2 == null ? (char) 0 : strO2.charAt(0);
                        kVar.f2248q = cVar.k(20, 4096);
                        if (cVar.r(11)) {
                            kVar.f2249r = cVar.b(11, false) ? 1 : 0;
                        } else {
                            kVar.f2249r = kVar.f2236e;
                        }
                        kVar.f2250s = cVar.b(3, false);
                        kVar.f2251t = cVar.b(4, kVar.f2237f);
                        kVar.f2252u = cVar.b(1, kVar.f2238g);
                        kVar.f2253v = cVar.k(21, -1);
                        kVar.f2256y = cVar.o(12);
                        kVar.f2254w = cVar.n(13, 0);
                        kVar.f2255x = cVar.o(15);
                        String strO3 = cVar.o(14);
                        boolean z6 = strO3 != null;
                        if (z6 && kVar.f2254w == 0 && kVar.f2255x == null) {
                            kVar.f2257z = (r) kVar.a(strO3, f2259f, lVar.f2261b);
                        } else {
                            if (z6) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            kVar.f2257z = null;
                        }
                        kVar.A = cVar.q(17);
                        kVar.B = cVar.q(22);
                        if (cVar.r(19)) {
                            kVar.D = t1.b(cVar.k(19, -1), kVar.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            kVar.D = null;
                        }
                        if (cVar.r(18)) {
                            kVar.C = cVar.c(18);
                        } else {
                            kVar.C = colorStateList;
                        }
                        cVar.v();
                        kVar.f2239h = false;
                    } else if (name2.equals("menu")) {
                        kVar.f2239h = true;
                        SubMenu subMenuAddSubMenu = kVar.f2232a.addSubMenu(kVar.f2233b, kVar.f2240i, kVar.f2241j, kVar.f2242k);
                        kVar.b(subMenuAddSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        str = name2;
                        z5 = true;
                    }
                }
                z4 = z4;
            } else if (eventType != 3) {
                z4 = z4;
            } else {
                String name3 = xmlResourceParser.getName();
                if (z5 && name3.equals(str)) {
                    z5 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        kVar.f2233b = 0;
                        kVar.f2234c = 0;
                        kVar.f2235d = 0;
                        kVar.f2236e = 0;
                        kVar.f2237f = true;
                        kVar.f2238g = true;
                    } else if (name3.equals("item")) {
                        if (!kVar.f2239h) {
                            r rVar = kVar.f2257z;
                            if (rVar == null || !rVar.f2479a.hasSubMenu()) {
                                kVar.f2239h = true;
                                kVar.b(kVar.f2232a.add(kVar.f2233b, kVar.f2240i, kVar.f2241j, kVar.f2242k));
                            } else {
                                kVar.f2239h = true;
                                kVar.b(kVar.f2232a.addSubMenu(kVar.f2233b, kVar.f2240i, kVar.f2241j, kVar.f2242k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z4 = true;
                    }
                    z4 = z4;
                }
            }
            eventType = xmlResourceParser.next();
            i4 = 2;
            z4 = z4;
            z5 = z5;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i4, Menu menu) {
        if (!(menu instanceof d0.a)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f2262c.getResources().getLayout(i4);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e5) {
                    throw new InflateException("Error inflating menu XML", e5);
                }
            } catch (XmlPullParserException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
