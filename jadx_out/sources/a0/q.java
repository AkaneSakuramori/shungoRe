package a0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f38a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f39b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f40c = new Object();

    public static Typeface a(Context context, int i4) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i4, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    public static Typeface b(Context context, int i4, TypedValue typedValue, int i5, c3.h hVar, boolean z4, boolean z5) {
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i4) + "\" (" + Integer.toHexString(i4) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i6 = typedValue.assetCookie;
            n.f fVar = b0.g.f1089b;
            Typeface typefaceZ = (Typeface) fVar.a(b0.g.b(resources, i4, string, i6, i5));
            if (typefaceZ != null) {
                if (hVar != null) {
                    hVar.P(typefaceZ);
                }
            } else if (!z5) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        f fVarQ1 = c3.h.Q1(resources.getXml(i4), resources);
                        if (fVarQ1 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (hVar != null) {
                                hVar.O(-3);
                            }
                        } else {
                            typefaceA = b0.g.a(context, fVarQ1, resources, i4, string, typedValue.assetCookie, i5, hVar, z4);
                        }
                    } else {
                        int i7 = typedValue.assetCookie;
                        typefaceZ = b0.g.f1088a.z(context, resources, i4, string, i5);
                        if (typefaceZ != null) {
                            fVar.b(b0.g.b(resources, i4, string, i7, i5), typefaceZ);
                        }
                        if (hVar != null) {
                            if (typefaceZ != null) {
                                hVar.P(typefaceZ);
                            } else {
                                hVar.O(-3);
                            }
                        }
                    }
                } catch (IOException e5) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e5);
                    if (hVar != null) {
                        hVar.O(-3);
                    }
                } catch (XmlPullParserException e6) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e6);
                    if (hVar != null) {
                        hVar.O(-3);
                    }
                }
            }
            typefaceA = typefaceZ;
        } else if (hVar != null) {
            hVar.O(-3);
        }
        if (typefaceA != null || hVar != null || z5) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
    }
}
