package u;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f4650d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4652f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4653a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4654b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4655c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4651e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4652f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(a aVar, String str) {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < strArrSplit.length) {
            String strTrim = strArrSplit[i4].trim();
            Object obj = null;
            try {
                iIntValue = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.f524n) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.f524n.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i5] = iIntValue;
            i4++;
            i5++;
        }
        return i5 != strArrSplit.length ? Arrays.copyOf(iArr, i5) : iArr;
    }

    public static i d(Context context, AttributeSet attributeSet, boolean z4) {
        int i4;
        String str;
        String str2;
        SparseIntArray sparseIntArray;
        String str3;
        i iVar = new i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4 ? r.f4659c : r.f4657a);
        int[] iArr = f4650d;
        SparseIntArray sparseIntArray2 = f4651e;
        String[] strArr = q.a.f3875a;
        l lVar = iVar.f4575b;
        m mVar = iVar.f4578e;
        k kVar = iVar.f4576c;
        j jVar = iVar.f4577d;
        String str4 = "Unknown attribute 0x";
        if (z4) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            h hVar = new h();
            hVar.f4562a = new int[10];
            hVar.f4563b = new int[10];
            hVar.f4564c = 0;
            hVar.f4565d = new int[10];
            hVar.f4566e = new float[10];
            hVar.f4567f = 0;
            hVar.f4568g = new int[5];
            hVar.f4569h = new String[5];
            hVar.f4570i = 0;
            hVar.f4571j = new int[4];
            hVar.f4572k = new boolean[4];
            hVar.f4573l = 0;
            kVar.getClass();
            jVar.getClass();
            lVar.getClass();
            mVar.getClass();
            int i5 = 0;
            while (i5 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                int i6 = indexCount;
                switch (f4652f.get(index)) {
                    case 2:
                        str3 = str4;
                        hVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.I));
                        continue;
                        i5++;
                        indexCount = i6;
                        str4 = str3;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder(str4);
                        str3 = str4;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray2.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        str3 = str4;
                        hVar.d(typedArrayObtainStyledAttributes.getString(index), 5);
                        continue;
                        i5++;
                        indexCount = i6;
                        str4 = str3;
                        break;
                    case 6:
                        str3 = str4;
                        hVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.C));
                        break;
                    case 7:
                        str3 = str4;
                        hVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.D));
                        break;
                    case 8:
                        str3 = str4;
                        hVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case 11:
                        str3 = str4;
                        hVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.P));
                        break;
                    case 12:
                        str3 = str4;
                        hVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Q));
                        break;
                    case 13:
                        str3 = str4;
                        hVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.M));
                        break;
                    case 14:
                        str3 = str4;
                        hVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.O));
                        break;
                    case 15:
                        str3 = str4;
                        hVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.R));
                        break;
                    case 16:
                        str3 = str4;
                        hVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.N));
                        break;
                    case 17:
                        str3 = str4;
                        hVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.f4587d));
                        break;
                    case 18:
                        str3 = str4;
                        hVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.f4589e));
                        break;
                    case 19:
                        str3 = str4;
                        hVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, jVar.f4591f));
                        break;
                    case 20:
                        str3 = str4;
                        hVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, jVar.f4618w));
                        break;
                    case 21:
                        str3 = str4;
                        hVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, jVar.f4585c));
                        break;
                    case 22:
                        str3 = str4;
                        hVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, lVar.f4632a)]);
                        break;
                    case 23:
                        str3 = str4;
                        hVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, jVar.f4583b));
                        break;
                    case 24:
                        str3 = str4;
                        hVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.F));
                        break;
                    case 27:
                        str3 = str4;
                        hVar.b(27, typedArrayObtainStyledAttributes.getInt(index, jVar.E));
                        break;
                    case 28:
                        str3 = str4;
                        hVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.G));
                        break;
                    case 31:
                        str3 = str4;
                        hVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.K));
                        break;
                    case 34:
                        str3 = str4;
                        hVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.H));
                        break;
                    case 37:
                        str3 = str4;
                        hVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, jVar.f4619x));
                        break;
                    case 38:
                        str3 = str4;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, iVar.f4574a);
                        iVar.f4574a = resourceId;
                        hVar.b(38, resourceId);
                        break;
                    case 39:
                        str3 = str4;
                        hVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, jVar.U));
                        break;
                    case 40:
                        str3 = str4;
                        hVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, jVar.T));
                        break;
                    case 41:
                        str3 = str4;
                        hVar.b(41, typedArrayObtainStyledAttributes.getInt(index, jVar.V));
                        break;
                    case 42:
                        str3 = str4;
                        hVar.b(42, typedArrayObtainStyledAttributes.getInt(index, jVar.W));
                        break;
                    case 43:
                        str3 = str4;
                        hVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, lVar.f4634c));
                        break;
                    case 44:
                        str3 = str4;
                        hVar.c(44, true);
                        hVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, mVar.f4649m));
                        break;
                    case 45:
                        str3 = str4;
                        hVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, mVar.f4638b));
                        break;
                    case 46:
                        str3 = str4;
                        hVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, mVar.f4639c));
                        break;
                    case 47:
                        str3 = str4;
                        hVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, mVar.f4640d));
                        break;
                    case 48:
                        str3 = str4;
                        hVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, mVar.f4641e));
                        break;
                    case 49:
                        str3 = str4;
                        hVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, mVar.f4642f));
                        break;
                    case 50:
                        str3 = str4;
                        hVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, mVar.f4643g));
                        break;
                    case 51:
                        str3 = str4;
                        hVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, mVar.f4645i));
                        break;
                    case 52:
                        str3 = str4;
                        hVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, mVar.f4646j));
                        break;
                    case 53:
                        str3 = str4;
                        hVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, mVar.f4647k));
                        break;
                    case 54:
                        str3 = str4;
                        hVar.b(54, typedArrayObtainStyledAttributes.getInt(index, jVar.X));
                        break;
                    case 55:
                        str3 = str4;
                        hVar.b(55, typedArrayObtainStyledAttributes.getInt(index, jVar.Y));
                        break;
                    case 56:
                        str3 = str4;
                        hVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Z));
                        break;
                    case 57:
                        str3 = str4;
                        hVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f4582a0));
                        break;
                    case 58:
                        str3 = str4;
                        hVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f4584b0));
                        break;
                    case 59:
                        str3 = str4;
                        hVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f4586c0));
                        break;
                    case 60:
                        str3 = str4;
                        hVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, mVar.f4637a));
                        break;
                    case 62:
                        str3 = str4;
                        hVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.A));
                        break;
                    case 63:
                        str3 = str4;
                        hVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, jVar.B));
                        break;
                    case 64:
                        str3 = str4;
                        hVar.b(64, f(typedArrayObtainStyledAttributes, index, kVar.f4623a));
                        break;
                    case 65:
                        str3 = str4;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            hVar.d(strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)], 65);
                        } else {
                            hVar.d(typedArrayObtainStyledAttributes.getString(index), 65);
                        }
                        break;
                    case 66:
                        str3 = str4;
                        hVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        str3 = str4;
                        hVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, kVar.f4627e));
                        break;
                    case 68:
                        str3 = str4;
                        hVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, lVar.f4635d));
                        break;
                    case 69:
                        str3 = str4;
                        hVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        str3 = str4;
                        hVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        str3 = str4;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str3 = str4;
                        hVar.b(72, typedArrayObtainStyledAttributes.getInt(index, jVar.f4592f0));
                        break;
                    case 73:
                        str3 = str4;
                        hVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f4594g0));
                        break;
                    case 74:
                        str3 = str4;
                        hVar.d(typedArrayObtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        str3 = str4;
                        hVar.c(75, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f4608n0));
                        break;
                    case 76:
                        str3 = str4;
                        hVar.b(76, typedArrayObtainStyledAttributes.getInt(index, kVar.f4625c));
                        break;
                    case 77:
                        str3 = str4;
                        hVar.d(typedArrayObtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        str3 = str4;
                        hVar.b(78, typedArrayObtainStyledAttributes.getInt(index, lVar.f4633b));
                        break;
                    case 79:
                        str3 = str4;
                        hVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, kVar.f4626d));
                        break;
                    case 80:
                        str3 = str4;
                        hVar.c(80, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f4604l0));
                        break;
                    case 81:
                        str3 = str4;
                        hVar.c(81, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f4606m0));
                        break;
                    case 82:
                        str3 = str4;
                        hVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, kVar.f4624b));
                        break;
                    case 83:
                        str3 = str4;
                        hVar.b(83, f(typedArrayObtainStyledAttributes, index, mVar.f4644h));
                        break;
                    case 84:
                        str3 = str4;
                        hVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, kVar.f4629g));
                        break;
                    case 85:
                        str3 = str4;
                        hVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, kVar.f4628f));
                        break;
                    case 86:
                        str3 = str4;
                        int i7 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i7 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            kVar.f4631i = resourceId2;
                            hVar.b(89, resourceId2);
                            if (kVar.f4631i != -1) {
                                hVar.b(88, -2);
                            }
                        } else if (i7 != 3) {
                            hVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, kVar.f4631i));
                        } else {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            kVar.f4630h = string;
                            hVar.d(string, 90);
                            if (kVar.f4630h.indexOf("/") <= 0) {
                                hVar.b(88, -1);
                            } else {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                kVar.f4631i = resourceId3;
                                hVar.b(89, resourceId3);
                                hVar.b(88, -2);
                            }
                        }
                        break;
                    case 87:
                        str3 = str4;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                        break;
                    case 93:
                        str3 = str4;
                        hVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.L));
                        break;
                    case 94:
                        str3 = str4;
                        hVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.S));
                        break;
                    case 95:
                        str3 = str4;
                        g(hVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        str3 = str4;
                        g(hVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str3 = str4;
                        hVar.b(97, typedArrayObtainStyledAttributes.getInt(index, jVar.f4610o0));
                        break;
                    case 98:
                        str3 = str4;
                        int i8 = t.a.f4242t;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            iVar.f4574a = typedArrayObtainStyledAttributes.getResourceId(index, iVar.f4574a);
                        } else {
                            typedArrayObtainStyledAttributes.getString(index);
                        }
                        break;
                    case 99:
                        str3 = str4;
                        hVar.c(99, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f4593g));
                        break;
                }
                i5++;
                indexCount = i6;
                str4 = str3;
            }
        } else {
            String str5 = "CURRENTLY UNSUPPORTED";
            String str6 = "Unknown attribute 0x";
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i9 = 0;
            while (i9 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    kVar.getClass();
                    jVar.getClass();
                    lVar.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray2.get(index2)) {
                    case 1:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4611p = f(typedArrayObtainStyledAttributes, index2, jVar.f4611p);
                        break;
                    case 2:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.I);
                        break;
                    case 3:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4609o = f(typedArrayObtainStyledAttributes, index2, jVar.f4609o);
                        break;
                    case 4:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4607n = f(typedArrayObtainStyledAttributes, index2, jVar.f4607n);
                        break;
                    case 5:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4620y = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.C);
                        break;
                    case 7:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.D);
                        break;
                    case 8:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.J);
                        break;
                    case 9:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4617v = f(typedArrayObtainStyledAttributes, index2, jVar.f4617v);
                        break;
                    case 10:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4616u = f(typedArrayObtainStyledAttributes, index2, jVar.f4616u);
                        break;
                    case 11:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.P);
                        break;
                    case 12:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Q);
                        break;
                    case 13:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.M);
                        break;
                    case 14:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.O);
                        break;
                    case 15:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.R);
                        break;
                    case 16:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.N);
                        break;
                    case 17:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4587d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f4587d);
                        break;
                    case 18:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4589e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f4589e);
                        break;
                    case 19:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4591f = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f4591f);
                        break;
                    case 20:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4618w = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f4618w);
                        break;
                    case 21:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4585c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, jVar.f4585c);
                        break;
                    case 22:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        lVar.f4632a = iArr[typedArrayObtainStyledAttributes.getInt(index2, lVar.f4632a)];
                        break;
                    case 23:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4583b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, jVar.f4583b);
                        break;
                    case 24:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.F);
                        break;
                    case 25:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4595h = f(typedArrayObtainStyledAttributes, index2, jVar.f4595h);
                        break;
                    case 26:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4597i = f(typedArrayObtainStyledAttributes, index2, jVar.f4597i);
                        break;
                    case 27:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.E = typedArrayObtainStyledAttributes.getInt(index2, jVar.E);
                        break;
                    case 28:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.G);
                        break;
                    case 29:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4599j = f(typedArrayObtainStyledAttributes, index2, jVar.f4599j);
                        break;
                    case 30:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4601k = f(typedArrayObtainStyledAttributes, index2, jVar.f4601k);
                        break;
                    case 31:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.K);
                        break;
                    case 32:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4614s = f(typedArrayObtainStyledAttributes, index2, jVar.f4614s);
                        break;
                    case 33:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4615t = f(typedArrayObtainStyledAttributes, index2, jVar.f4615t);
                        break;
                    case 34:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.H);
                        break;
                    case 35:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4605m = f(typedArrayObtainStyledAttributes, index2, jVar.f4605m);
                        break;
                    case 36:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4603l = f(typedArrayObtainStyledAttributes, index2, jVar.f4603l);
                        break;
                    case 37:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4619x = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f4619x);
                        break;
                    case 38:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        iVar.f4574a = typedArrayObtainStyledAttributes.getResourceId(index2, iVar.f4574a);
                        break;
                    case 39:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.U = typedArrayObtainStyledAttributes.getFloat(index2, jVar.U);
                        break;
                    case 40:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.T = typedArrayObtainStyledAttributes.getFloat(index2, jVar.T);
                        break;
                    case 41:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.V = typedArrayObtainStyledAttributes.getInt(index2, jVar.V);
                        break;
                    case 42:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.W = typedArrayObtainStyledAttributes.getInt(index2, jVar.W);
                        break;
                    case 43:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        lVar.f4634c = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f4634c);
                        break;
                    case 44:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f4648l = true;
                        mVar.f4649m = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f4649m);
                        break;
                    case 45:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f4638b = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f4638b);
                        break;
                    case 46:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f4639c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f4639c);
                        break;
                    case 47:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f4640d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f4640d);
                        break;
                    case 48:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f4641e = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f4641e);
                        break;
                    case 49:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f4642f = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f4642f);
                        break;
                    case 50:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f4643g = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f4643g);
                        break;
                    case 51:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f4645i = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f4645i);
                        break;
                    case 52:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f4646j = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f4646j);
                        break;
                    case 53:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f4647k = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f4647k);
                        break;
                    case 54:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.X = typedArrayObtainStyledAttributes.getInt(index2, jVar.X);
                        break;
                    case 55:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.Y = typedArrayObtainStyledAttributes.getInt(index2, jVar.Y);
                        break;
                    case 56:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Z);
                        break;
                    case 57:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4582a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4582a0);
                        break;
                    case 58:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4584b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4584b0);
                        break;
                    case 59:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4586c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4586c0);
                        break;
                    case 60:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f4637a = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f4637a);
                        break;
                    case 61:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.f4621z = f(typedArrayObtainStyledAttributes, index2, jVar.f4621z);
                        break;
                    case 62:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.A);
                        break;
                    case 63:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        jVar.B = typedArrayObtainStyledAttributes.getFloat(index2, jVar.B);
                        break;
                    case 64:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f4623a = f(typedArrayObtainStyledAttributes, index2, kVar.f4623a);
                        break;
                    case 65:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            String str7 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                        } else {
                            typedArrayObtainStyledAttributes.getString(index2);
                            kVar.getClass();
                        }
                        break;
                    case 66:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 67:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        kVar.f4627e = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f4627e);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 68:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        lVar.f4635d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f4635d);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 69:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        jVar.f4588d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 70:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        jVar.f4590e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 71:
                        i4 = indexCount2;
                        str = str5;
                        str2 = str6;
                        Log.e("ConstraintSet", str);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 72:
                        i4 = indexCount2;
                        str2 = str6;
                        jVar.f4592f0 = typedArrayObtainStyledAttributes.getInt(index2, jVar.f4592f0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 73:
                        i4 = indexCount2;
                        str2 = str6;
                        jVar.f4594g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4594g0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 74:
                        i4 = indexCount2;
                        str2 = str6;
                        jVar.f4600j0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 75:
                        i4 = indexCount2;
                        str2 = str6;
                        jVar.f4608n0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.f4608n0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 76:
                        i4 = indexCount2;
                        str2 = str6;
                        kVar.f4625c = typedArrayObtainStyledAttributes.getInt(index2, kVar.f4625c);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 77:
                        i4 = indexCount2;
                        str2 = str6;
                        jVar.f4602k0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 78:
                        i4 = indexCount2;
                        str2 = str6;
                        lVar.f4633b = typedArrayObtainStyledAttributes.getInt(index2, lVar.f4633b);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 79:
                        i4 = indexCount2;
                        str2 = str6;
                        kVar.f4626d = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f4626d);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 80:
                        i4 = indexCount2;
                        str2 = str6;
                        jVar.f4604l0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.f4604l0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 81:
                        i4 = indexCount2;
                        str2 = str6;
                        jVar.f4606m0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.f4606m0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 82:
                        i4 = indexCount2;
                        str2 = str6;
                        kVar.f4624b = typedArrayObtainStyledAttributes.getInteger(index2, kVar.f4624b);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 83:
                        i4 = indexCount2;
                        str2 = str6;
                        mVar.f4644h = f(typedArrayObtainStyledAttributes, index2, mVar.f4644h);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 84:
                        i4 = indexCount2;
                        str2 = str6;
                        kVar.f4629g = typedArrayObtainStyledAttributes.getInteger(index2, kVar.f4629g);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 85:
                        i4 = indexCount2;
                        str2 = str6;
                        kVar.f4628f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f4628f);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 86:
                        i4 = indexCount2;
                        str2 = str6;
                        int i10 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i10 == 1) {
                            kVar.f4631i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i10 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            kVar.f4630h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.f4631i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, kVar.f4631i);
                        }
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 87:
                        i4 = indexCount2;
                        str2 = str6;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray2.get(index2));
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str2 = str6;
                        StringBuilder sb2 = new StringBuilder(str2);
                        i4 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray2.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 91:
                        i4 = indexCount2;
                        str2 = str6;
                        jVar.f4612q = f(typedArrayObtainStyledAttributes, index2, jVar.f4612q);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 92:
                        i4 = indexCount2;
                        str2 = str6;
                        jVar.f4613r = f(typedArrayObtainStyledAttributes, index2, jVar.f4613r);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 93:
                        i4 = indexCount2;
                        str2 = str6;
                        jVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.L);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 94:
                        i4 = indexCount2;
                        str2 = str6;
                        jVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.S);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 95:
                        i4 = indexCount2;
                        str2 = str6;
                        g(jVar, typedArrayObtainStyledAttributes, index2, 0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 96:
                        i4 = indexCount2;
                        str2 = str6;
                        g(jVar, typedArrayObtainStyledAttributes, index2, 1);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 97:
                        i4 = indexCount2;
                        str2 = str6;
                        jVar.f4610o0 = typedArrayObtainStyledAttributes.getInt(index2, jVar.f4610o0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                }
                i9++;
                indexCount2 = i4;
                str6 = str2;
                sparseIntArray2 = sparseIntArray;
                str5 = str;
            }
            if (jVar.f4600j0 != null) {
                jVar.f4598i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i4, i5);
        return resourceId == -1 ? typedArray.getInt(i4, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    public static void g(Object obj, TypedArray typedArray, int i4, int i5) {
        int dimensionPixelSize;
        h hVar;
        j jVar;
        e eVar;
        if (obj == null) {
            return;
        }
        int i6 = typedArray.peekValue(i4).type;
        boolean z4 = true;
        int i7 = 0;
        if (i6 != 3) {
            if (i6 != 5) {
                dimensionPixelSize = typedArray.getInt(i4, 0);
                if (dimensionPixelSize == -4) {
                    i7 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z4 = false;
                }
                if (obj instanceof e) {
                    eVar = (e) obj;
                    if (i5 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar).width = i7;
                        eVar.W = z4;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).height = i7;
                        eVar.X = z4;
                        return;
                    }
                }
                if (obj instanceof j) {
                    jVar = (j) obj;
                    if (i5 == 0) {
                        jVar.f4583b = i7;
                        jVar.f4604l0 = z4;
                        return;
                    } else {
                        jVar.f4585c = i7;
                        jVar.f4606m0 = z4;
                        return;
                    }
                }
                if (obj instanceof h) {
                    hVar = (h) obj;
                    if (i5 == 0) {
                        hVar.b(23, i7);
                        hVar.c(80, z4);
                        return;
                    } else {
                        hVar.b(21, i7);
                        hVar.c(81, z4);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i4, 0);
            z4 = false;
            i7 = dimensionPixelSize;
            if (obj instanceof e) {
                eVar = (e) obj;
                if (i5 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar).width = i7;
                    eVar.W = z4;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar).height = i7;
                    eVar.X = z4;
                    return;
                }
            }
            if (obj instanceof j) {
                jVar = (j) obj;
                if (i5 == 0) {
                    jVar.f4583b = i7;
                    jVar.f4604l0 = z4;
                    return;
                } else {
                    jVar.f4585c = i7;
                    jVar.f4606m0 = z4;
                    return;
                }
            }
            if (obj instanceof h) {
                hVar = (h) obj;
                if (i5 == 0) {
                    hVar.b(23, i7);
                    hVar.c(80, z4);
                    return;
                } else {
                    hVar.b(21, i7);
                    hVar.c(81, z4);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i4);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof e) {
                    e eVar2 = (e) obj;
                    if (i5 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                    }
                    h(eVar2, strTrim2);
                    return;
                }
                if (obj instanceof j) {
                    ((j) obj).f4620y = strTrim2;
                    return;
                } else {
                    if (obj instanceof h) {
                        ((h) obj).d(strTrim2, 5);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f5 = Float.parseFloat(strTrim2);
                    if (obj instanceof e) {
                        e eVar3 = (e) obj;
                        if (i5 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                            eVar3.H = f5;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                            eVar3.I = f5;
                        }
                    } else if (obj instanceof j) {
                        j jVar2 = (j) obj;
                        if (i5 == 0) {
                            jVar2.f4583b = 0;
                            jVar2.U = f5;
                        } else {
                            jVar2.f4585c = 0;
                            jVar2.T = f5;
                        }
                    } else if (obj instanceof h) {
                        h hVar2 = (h) obj;
                        if (i5 == 0) {
                            hVar2.b(23, 0);
                            hVar2.a(39, f5);
                        } else {
                            hVar2.b(21, 0);
                            hVar2.a(40, f5);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof e) {
                        e eVar4 = (e) obj;
                        if (i5 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar4).width = 0;
                            eVar4.R = fMax;
                            eVar4.L = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar4).height = 0;
                            eVar4.S = fMax;
                            eVar4.M = 2;
                        }
                    } else if (obj instanceof j) {
                        j jVar3 = (j) obj;
                        if (i5 == 0) {
                            jVar3.f4583b = 0;
                            jVar3.f4588d0 = fMax;
                            jVar3.X = 2;
                        } else {
                            jVar3.f4585c = 0;
                            jVar3.f4590e0 = fMax;
                            jVar3.Y = 2;
                        }
                    } else if (obj instanceof h) {
                        h hVar3 = (h) obj;
                        if (i5 == 0) {
                            hVar3.b(23, 0);
                            hVar3.b(54, 2);
                        } else {
                            hVar3.b(21, 0);
                            hVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i4 = 0;
            int i5 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i4 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i5 = i4;
                i4 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i4);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i4, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f5 = Float.parseFloat(strSubstring3);
                        float f6 = Float.parseFloat(strSubstring4);
                        if (f5 > 0.0f && f6 > 0.0f) {
                            if (i5 == 1) {
                                Math.abs(f6 / f5);
                            } else {
                                Math.abs(f5 / f6);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        ViewGroup viewGroup;
        int i4;
        int i5;
        String resourceEntryName;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = nVar.f4655c;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = constraintLayout.getChildAt(i6);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (nVar.f4654b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        i iVar = (i) map.get(Integer.valueOf(id));
                        if (iVar != null) {
                            if (childAt instanceof a) {
                                j jVar = iVar.f4577d;
                                jVar.f4596h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(jVar.f4592f0);
                                aVar.setMargin(jVar.f4594g0);
                                aVar.setAllowsGoneWidget(jVar.f4608n0);
                                int[] iArr = jVar.f4598i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str = jVar.f4600j0;
                                    if (str != null) {
                                        int[] iArrC = c(aVar, str);
                                        jVar.f4598i0 = iArrC;
                                        aVar.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap map2 = iVar.f4579f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map2.keySet()) {
                                b bVar = (b) map2.get(str2);
                                String str3 = bVar.f4498a ? str2 : "set" + str2;
                                try {
                                    switch (p.h.a(bVar.f4499b)) {
                                        case 0:
                                            i5 = childCount;
                                            Class<?>[] clsArr = new Class[1];
                                            try {
                                                clsArr[0] = Integer.TYPE;
                                                cls.getMethod(str3, clsArr).invoke(childAt, Integer.valueOf(bVar.f4500c));
                                            } catch (IllegalAccessException e5) {
                                                e = e5;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e6) {
                                                e = e6;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str3);
                                            } catch (InvocationTargetException e7) {
                                                e = e7;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 1:
                                            i5 = childCount;
                                            cls.getMethod(str3, Float.TYPE).invoke(childAt, Float.valueOf(bVar.f4501d));
                                            break;
                                        case 2:
                                            i5 = childCount;
                                            cls.getMethod(str3, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f4504g));
                                            break;
                                        case 3:
                                            i5 = childCount;
                                            Method method = cls.getMethod(str3, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(bVar.f4504g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            i5 = childCount;
                                            cls.getMethod(str3, CharSequence.class).invoke(childAt, bVar.f4502e);
                                            break;
                                        case 5:
                                            i5 = childCount;
                                            cls.getMethod(str3, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f4503f));
                                            break;
                                        case 6:
                                            i5 = childCount;
                                            cls.getMethod(str3, Float.TYPE).invoke(childAt, Float.valueOf(bVar.f4501d));
                                            break;
                                        case 7:
                                            i5 = childCount;
                                            try {
                                                cls.getMethod(str3, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f4500c));
                                            } catch (IllegalAccessException e8) {
                                                e = e8;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e9) {
                                                e = e9;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str3);
                                            } catch (InvocationTargetException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                            }
                                            break;
                                        default:
                                            i5 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e11) {
                                    e = e11;
                                    i5 = childCount;
                                } catch (NoSuchMethodException e12) {
                                    e = e12;
                                    i5 = childCount;
                                } catch (InvocationTargetException e13) {
                                    e = e13;
                                    i5 = childCount;
                                }
                                map2 = map2;
                                childCount = i5;
                            }
                            i4 = childCount;
                            childAt.setLayoutParams(eVar);
                            l lVar = iVar.f4575b;
                            if (lVar.f4633b == 0) {
                                childAt.setVisibility(lVar.f4632a);
                            }
                            childAt.setAlpha(lVar.f4634c);
                            m mVar = iVar.f4578e;
                            childAt.setRotation(mVar.f4637a);
                            childAt.setRotationX(mVar.f4638b);
                            childAt.setRotationY(mVar.f4639c);
                            childAt.setScaleX(mVar.f4640d);
                            childAt.setScaleY(mVar.f4641e);
                            if (mVar.f4644h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(mVar.f4644h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f4642f)) {
                                    childAt.setPivotX(mVar.f4642f);
                                }
                                if (!Float.isNaN(mVar.f4643g)) {
                                    childAt.setPivotY(mVar.f4643g);
                                }
                            }
                            childAt.setTranslationX(mVar.f4645i);
                            childAt.setTranslationY(mVar.f4646j);
                            childAt.setTranslationZ(mVar.f4647k);
                            if (mVar.f4648l) {
                                childAt.setElevation(mVar.f4649m);
                            }
                        }
                    } else {
                        i4 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i6++;
                nVar = this;
                childCount = i4;
            }
            i4 = childCount;
            i6++;
            nVar = this;
            childCount = i4;
        }
        int i7 = childCount;
        for (Integer num : hashSet) {
            i iVar2 = (i) map.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.f4577d;
                if (jVar2.f4596h0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.f4505b = new int[32];
                    aVar2.f4511h = new HashMap();
                    aVar2.f4507d = context;
                    aVar2.g(null);
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = jVar2.f4598i0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str4 = jVar2.f4600j0;
                        if (str4 != null) {
                            int[] iArrC2 = c(aVar2, str4);
                            jVar2.f4598i0 = iArrC2;
                            aVar2.setReferencedIds(iArrC2);
                        }
                    }
                    aVar2.setType(jVar2.f4592f0);
                    aVar2.setMargin(jVar2.f4594g0);
                    e eVarG = ConstraintLayout.g();
                    aVar2.i();
                    iVar2.a(eVarG);
                    viewGroup = constraintLayout;
                    viewGroup.addView(aVar2, eVarG);
                } else {
                    viewGroup = constraintLayout;
                }
                if (jVar2.f4581a) {
                    p pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    e eVarG2 = ConstraintLayout.g();
                    iVar2.a(eVarG2);
                    viewGroup.addView(pVar, eVarG2);
                }
            }
        }
        for (int i8 = 0; i8 < i7; i8++) {
            View childAt2 = constraintLayout.getChildAt(i8);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i4;
        int i5;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = nVar.f4655c;
        map.clear();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = constraintLayout.getChildAt(i6);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4654b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) map.get(Integer.valueOf(id));
            if (iVar == null) {
                i4 = childCount;
            } else {
                HashMap map2 = nVar.f4653a;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    b bVar = (b) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i5 = childCount;
                        } else {
                            i5 = childCount;
                            try {
                                map3.put(str, new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e5) {
                                e = e5;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e6) {
                                e = e6;
                                e.printStackTrace();
                            } catch (InvocationTargetException e7) {
                                e = e7;
                                e.printStackTrace();
                            }
                        }
                    } catch (IllegalAccessException e8) {
                        e = e8;
                        i5 = childCount;
                    } catch (NoSuchMethodException e9) {
                        e = e9;
                        i5 = childCount;
                    } catch (InvocationTargetException e10) {
                        e = e10;
                        i5 = childCount;
                    }
                    childCount = i5;
                }
                i4 = childCount;
                iVar.f4579f = map3;
                iVar.f4574a = id;
                int i7 = eVar.f4521e;
                j jVar = iVar.f4577d;
                jVar.f4595h = i7;
                jVar.f4597i = eVar.f4523f;
                jVar.f4599j = eVar.f4525g;
                jVar.f4601k = eVar.f4527h;
                jVar.f4603l = eVar.f4529i;
                jVar.f4605m = eVar.f4531j;
                jVar.f4607n = eVar.f4533k;
                jVar.f4609o = eVar.f4535l;
                jVar.f4611p = eVar.f4537m;
                jVar.f4612q = eVar.f4539n;
                jVar.f4613r = eVar.f4541o;
                jVar.f4614s = eVar.f4547s;
                jVar.f4615t = eVar.f4548t;
                jVar.f4616u = eVar.f4549u;
                jVar.f4617v = eVar.f4550v;
                jVar.f4618w = eVar.E;
                jVar.f4619x = eVar.F;
                jVar.f4620y = eVar.G;
                jVar.f4621z = eVar.f4543p;
                jVar.A = eVar.f4545q;
                jVar.B = eVar.f4546r;
                jVar.C = eVar.T;
                jVar.D = eVar.U;
                jVar.E = eVar.V;
                jVar.f4591f = eVar.f4517c;
                jVar.f4587d = eVar.f4513a;
                jVar.f4589e = eVar.f4515b;
                jVar.f4583b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.f4585c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.L = eVar.D;
                jVar.T = eVar.I;
                jVar.U = eVar.H;
                jVar.W = eVar.K;
                jVar.V = eVar.J;
                jVar.f4604l0 = eVar.W;
                jVar.f4606m0 = eVar.X;
                jVar.X = eVar.L;
                jVar.Y = eVar.M;
                jVar.Z = eVar.P;
                jVar.f4582a0 = eVar.Q;
                jVar.f4584b0 = eVar.N;
                jVar.f4586c0 = eVar.O;
                jVar.f4588d0 = eVar.R;
                jVar.f4590e0 = eVar.S;
                jVar.f4602k0 = eVar.Y;
                jVar.N = eVar.f4552x;
                jVar.P = eVar.f4554z;
                jVar.M = eVar.f4551w;
                jVar.O = eVar.f4553y;
                jVar.R = eVar.A;
                jVar.Q = eVar.B;
                jVar.S = eVar.C;
                jVar.f4610o0 = eVar.Z;
                jVar.J = eVar.getMarginEnd();
                jVar.K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = iVar.f4575b;
                lVar.f4632a = visibility;
                lVar.f4634c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = iVar.f4578e;
                mVar.f4637a = rotation;
                mVar.f4638b = childAt.getRotationX();
                mVar.f4639c = childAt.getRotationY();
                mVar.f4640d = childAt.getScaleX();
                mVar.f4641e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f4642f = pivotX;
                    mVar.f4643g = pivotY;
                }
                mVar.f4645i = childAt.getTranslationX();
                mVar.f4646j = childAt.getTranslationY();
                mVar.f4647k = childAt.getTranslationZ();
                if (mVar.f4648l) {
                    mVar.f4649m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    jVar.f4608n0 = aVar.getAllowsGoneWidget();
                    jVar.f4598i0 = aVar.getReferencedIds();
                    jVar.f4592f0 = aVar.getType();
                    jVar.f4594g0 = aVar.getMargin();
                }
            }
            i6++;
            nVar = this;
            childCount = i4;
        }
    }

    public final void e(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    i iVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        iVarD.f4577d.f4581a = true;
                    }
                    this.f4655c.put(Integer.valueOf(iVarD.f4574a), iVarD);
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        } catch (XmlPullParserException e6) {
            e6.printStackTrace();
        }
    }
}
