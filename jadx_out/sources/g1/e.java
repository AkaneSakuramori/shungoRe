package g1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2310a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2311b;

    public e(String str) {
        this.f2311b = str;
    }

    public final String toString() {
        switch (this.f2310a) {
            case 1:
                return "<" + this.f2311b + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public e(Map map) {
        List<Map> list = (List) map.get("rules");
        ArrayList arrayList = new ArrayList();
        for (Map map2 : list) {
            if (!((Boolean) map2.get("verified")).booleanValue()) {
                String str = (String) map2.get("code");
                str.getClass();
                byte b5 = -1;
                switch (str.hashCode()) {
                    case -2022676432:
                        if (str.equals("lengthAtLeast")) {
                            b5 = 0;
                        }
                        break;
                    case -588526889:
                        if (str.equals("containsAtLeast")) {
                            b5 = 1;
                        }
                        break;
                    case 914712481:
                        if (str.equals("shouldContain")) {
                            b5 = 2;
                        }
                        break;
                    case 1196895272:
                        if (str.equals("identicalChars")) {
                            b5 = 3;
                        }
                        break;
                }
                if (b5 == 0) {
                    arrayList.add(String.format((String) map2.get("message"), Integer.valueOf(((Double) ((List) map2.get("format")).get(0)).intValue())));
                } else if (b5 == 1 || b5 == 2) {
                    List list2 = (List) map2.get("items");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((String) ((Map) it.next()).get("message"));
                    }
                    String strJoin = TextUtils.join(", ", arrayList2);
                    String str2 = (String) map2.get("message");
                    if (map2.containsKey("format")) {
                        List list3 = (List) map2.get("format");
                        str2 = String.format(str2, Integer.valueOf(((Double) list3.get(0)).intValue()), Integer.valueOf(((Double) list3.get(1)).intValue()));
                    }
                    arrayList.add(String.format("%s %s", str2, strJoin));
                } else if (b5 == 3) {
                    List list4 = (List) map2.get("format");
                    arrayList.add(String.format((String) map2.get("message"), Integer.valueOf(((Double) list4.get(0)).intValue()), list4.get(1)));
                }
            }
        }
        this.f2311b = TextUtils.join("; ", arrayList);
    }
}
