package u;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f4505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f4507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r.j f4508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f4511h;

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    public final void a(String str) {
        Context context;
        int identifier;
        HashMap map;
        if (str == null || str.length() == 0 || (context = this.f4507d) == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = ((strTrim instanceof String) && (map = constraintLayout.f524n) != null && map.containsKey(strTrim)) ? constraintLayout.f524n.get(strTrim) : null;
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            } else {
                identifier = 0;
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = f(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f4511h.put(Integer.valueOf(identifier), strTrim);
            b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void b(int i4) {
        if (i4 == getId()) {
            return;
        }
        int i5 = this.f4506c + 1;
        int[] iArr = this.f4505b;
        if (i5 > iArr.length) {
            this.f4505b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f4505b;
        int i6 = this.f4506c;
        iArr2[i6] = i4;
        this.f4506c = i6 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f4507d == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof e) && strTrim.equals(((e) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i4 = 0; i4 < this.f4506c; i4++) {
            View view = (View) constraintLayout.f512b.get(this.f4505b[i4]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f4507d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4658b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f4509f = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f4510g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4505b, this.f4506c);
    }

    public abstract void h(r.d dVar, boolean z4);

    public final void i() {
        if (this.f4508e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof e) {
            ((e) layoutParams).f4544p0 = this.f4508e;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4509f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f4510g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f4509f = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f4506c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i4);
            if (iIndexOf == -1) {
                a(str.substring(i4));
                return;
            } else {
                a(str.substring(i4, iIndexOf));
                i4 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f4510g = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f4506c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i4);
            if (iIndexOf == -1) {
                c(str.substring(i4));
                return;
            } else {
                c(str.substring(i4, iIndexOf));
                i4 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f4509f = null;
        this.f4506c = 0;
        for (int i4 : iArr) {
            b(i4);
        }
    }

    @Override // android.view.View
    public final void setTag(int i4, Object obj) {
        super.setTag(i4, obj);
        if (obj == null && this.f4509f == null) {
            b(i4);
        }
    }
}
