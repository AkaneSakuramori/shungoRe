package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f681b;

    public a0(i0 i0Var) {
        this.f681b = i0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        n0 n0VarF;
        q qVar;
        View view2;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        i0 i0Var = this.f681b;
        if (zEquals) {
            FragmentContainerView fragmentContainerView = new FragmentContainerView(context, attributeSet);
            fragmentContainerView.f662e = true;
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0.a.f4198b);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
            }
            String string = typedArrayObtainStyledAttributes.getString(1);
            typedArrayObtainStyledAttributes.recycle();
            int id = fragmentContainerView.getId();
            q qVarZ = i0Var.z(id);
            if (classAttribute != null && qVarZ == null) {
                if (id <= 0) {
                    throw new IllegalStateException(defpackage.a.g("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                }
                d0 d0VarB = i0Var.B();
                context.getClassLoader();
                q qVarA = d0VarB.a(classAttribute);
                qVarA.D = true;
                t tVar = qVarA.f866t;
                if ((tVar == null ? null : tVar.f883j) != null) {
                    qVarA.D = true;
                }
                a aVar = new a(i0Var);
                aVar.f677o = true;
                qVarA.E = fragmentContainerView;
                int id2 = fragmentContainerView.getId();
                Class<?> cls = qVarA.getClass();
                int modifiers = cls.getModifiers();
                if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
                    throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
                }
                if (string != null) {
                    String str2 = qVarA.f871y;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + qVarA + ": was " + qVarA.f871y + " now " + string);
                    }
                    qVarA.f871y = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + qVarA + " with tag " + string + " to container view with no id");
                    }
                    int i4 = qVarA.f869w;
                    if (i4 != 0 && i4 != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + qVarA + ": was " + qVarA.f869w + " now " + id2);
                    }
                    qVarA.f869w = id2;
                    qVarA.f870x = id2;
                }
                aVar.b(new p0(1, qVarA));
                i0 i0Var2 = aVar.f678p;
                qVarA.f865s = i0Var2;
                if (aVar.f669g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                if (i0Var2.f764p != null && !i0Var2.C) {
                    i0Var2.w(true);
                    aVar.a(i0Var2.E, i0Var2.F);
                    i0Var2.f750b = true;
                    try {
                        i0Var2.N(i0Var2.E, i0Var2.F);
                        i0Var2.d();
                        i0Var2.Y();
                        i0Var2.t();
                        i0Var2.f751c.f838b.values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        i0Var2.d();
                        throw th;
                    }
                }
            }
            for (n0 n0Var : i0Var.f751c.d()) {
                q qVar2 = n0Var.f819c;
                if (qVar2.f870x == fragmentContainerView.getId() && (view2 = qVar2.F) != null && view2.getParent() == null) {
                    qVar2.E = fragmentContainerView;
                    n0Var.b();
                }
            }
            return fragmentContainerView;
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, s0.a.f4197a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes2.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(1, -1);
        String string2 = typedArrayObtainStyledAttributes2.getString(2);
        typedArrayObtainStyledAttributes2.recycle();
        if (attributeValue == null) {
            return null;
        }
        try {
            if (q.class.isAssignableFrom(d0.b(context.getClassLoader(), attributeValue))) {
                int id3 = view != null ? view.getId() : 0;
                if (id3 == -1 && resourceId == -1 && string2 == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                q qVarZ2 = resourceId != -1 ? i0Var.z(resourceId) : null;
                if (qVarZ2 == null && string2 != null) {
                    o0 o0Var = i0Var.f751c;
                    ArrayList arrayList = o0Var.f837a;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            Iterator it = o0Var.f838b.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    qVarZ2 = null;
                                    break;
                                }
                                n0 n0Var2 = (n0) it.next();
                                if (n0Var2 != null) {
                                    qVar = n0Var2.f819c;
                                    if (string2.equals(qVar.f871y)) {
                                    }
                                }
                            }
                        } else {
                            qVar = (q) arrayList.get(size);
                            if (qVar == null || !string2.equals(qVar.f871y)) {
                                size--;
                            }
                        }
                        qVarZ2 = qVar;
                        break;
                    }
                }
                if (qVarZ2 == null && id3 != -1) {
                    qVarZ2 = i0Var.z(id3);
                }
                if (qVarZ2 == null) {
                    d0 d0VarB2 = i0Var.B();
                    context.getClassLoader();
                    qVarZ2 = d0VarB2.a(attributeValue);
                    qVarZ2.f860n = true;
                    qVarZ2.f869w = resourceId != 0 ? resourceId : id3;
                    qVarZ2.f870x = id3;
                    qVarZ2.f871y = string2;
                    qVarZ2.f861o = true;
                    qVarZ2.f865s = i0Var;
                    t tVar2 = i0Var.f764p;
                    qVarZ2.f866t = tVar2;
                    Context context2 = tVar2.f884k;
                    qVarZ2.D = true;
                    if ((tVar2 == null ? null : tVar2.f883j) != null) {
                        qVarZ2.D = true;
                    }
                    n0VarF = i0Var.a(qVarZ2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + qVarZ2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (qVarZ2.f861o) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id3) + " with another fragment for " + attributeValue);
                    }
                    qVarZ2.f861o = true;
                    qVarZ2.f865s = i0Var;
                    t tVar3 = i0Var.f764p;
                    qVarZ2.f866t = tVar3;
                    Context context3 = tVar3.f884k;
                    qVarZ2.D = true;
                    if ((tVar3 == null ? null : tVar3.f883j) != null) {
                        qVarZ2.D = true;
                    }
                    n0VarF = i0Var.f(qVarZ2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + qVarZ2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                qVarZ2.E = (ViewGroup) view;
                n0VarF.k();
                n0VarF.j();
                View view3 = qVarZ2.F;
                if (view3 == null) {
                    throw new IllegalStateException(defpackage.a.g("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view3.setId(resourceId);
                }
                if (qVarZ2.F.getTag() == null) {
                    qVarZ2.F.setTag(string2);
                }
                qVarZ2.F.addOnAttachStateChangeListener(new z(this, n0VarF));
                return qVarZ2.F;
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }
}
