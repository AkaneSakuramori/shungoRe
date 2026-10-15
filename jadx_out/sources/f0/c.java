package f0;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import i.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m.c f2003a = new m.c(1);

    /* JADX WARN: Code duplicated, block: B:63:0x0188  */
    /* JADX WARN: Type inference failed for: r1v22, types: [f0.h[], java.io.Serializable] */
    public static e.i a(Context context, r rVar) throws Throwable {
        Serializable serializable;
        Cursor cursor;
        ArrayList arrayList;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) rVar.f2756c;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = (String) rVar.f2757d;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList2 = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList2.add(signature.toByteArray());
        }
        m.c cVar = f2003a;
        Collections.sort(arrayList2, cVar);
        List listB2 = (List) rVar.f2759f;
        if (listB2 == null) {
            listB2 = c3.h.b2(rVar.f2755b, resources);
        }
        int i4 = 0;
        loop1: while (true) {
            serializable = null;
            if (i4 >= listB2.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList3 = new ArrayList((Collection) listB2.get(i4));
            Collections.sort(arrayList3, cVar);
            if (arrayList2.size() == arrayList3.size()) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList2.size()) {
                        break loop1;
                    }
                    if (!Arrays.equals((byte[]) arrayList2.get(i5), (byte[]) arrayList3.get(i5))) {
                        break;
                    }
                    i5++;
                }
            }
            i4++;
        }
        int i6 = 1;
        if (providerInfoResolveContentProvider == null) {
            return new e.i(i6, serializable);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList4 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        try {
            Cursor cursorA = b.a(context.getContentResolver(), uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{(String) rVar.f2758e}, null, null);
            if (cursorA != null) {
                try {
                    if (cursorA.getCount() > 0) {
                        int columnIndex = cursorA.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = cursorA.getColumnIndex("_id");
                        int columnIndex3 = cursorA.getColumnIndex("file_id");
                        int columnIndex4 = cursorA.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorA.getColumnIndex("font_weight");
                        int columnIndex6 = cursorA.getColumnIndex("font_italic");
                        while (cursorA.moveToNext()) {
                            arrayList.add(new h(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorA.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorA.getLong(columnIndex3)), columnIndex4 != -1 ? cursorA.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorA.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorA.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorA.getInt(columnIndex) : 0));
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorA;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } else {
                arrayList = arrayList4;
            }
            if (cursorA != null) {
                cursorA.close();
            }
            return new e.i(0, (Serializable) arrayList.toArray(new h[0]));
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }
}
