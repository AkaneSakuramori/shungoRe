package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import c3.h;
import f2.l;
import f2.x;
import i.t;
import i0.e0;
import i0.f0;
import i0.k0;
import i0.v0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import k2.a;
import r3.q;
import v1.b;
import v1.c;
import v1.d;
import v1.e;
import v1.f;
import z1.i;
import z1.k;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends t implements e, x, Checkable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Rect f1414x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f1415y = {R.attr.state_selected};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f1416z = {R.attr.state_checkable};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f1417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InsetDrawable f1418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RippleDrawable f1419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnClickListener f1420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f1421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f1429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f1430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f1432u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f1433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f1434w;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a.a(context, attributeSet, com.shungo.app.R.attr.chipStyle, com.shungo.app.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.shungo.app.R.attr.chipStyle);
        this.f1432u = new Rect();
        this.f1433v = new RectF();
        this.f1434w = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f fVar = new f(context2, attributeSet);
        Context context3 = fVar.f4784f0;
        int[] iArr = n1.a.f3541c;
        TypedArray typedArrayE = k.e(context3, attributeSet, iArr, com.shungo.app.R.attr.chipStyle, com.shungo.app.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.G0 = typedArrayE.hasValue(37);
        Context context4 = fVar.f4784f0;
        ColorStateList colorStateListP0 = h.P0(context4, typedArrayE, 24);
        if (fVar.f4803y != colorStateListP0) {
            fVar.f4803y = colorStateListP0;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateListP1 = h.P0(context4, typedArrayE, 11);
        if (fVar.f4805z != colorStateListP1) {
            fVar.f4805z = colorStateListP1;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = typedArrayE.getDimension(19, 0.0f);
        if (fVar.A != dimension) {
            fVar.A = dimension;
            fVar.invalidateSelf();
            fVar.v();
        }
        if (typedArrayE.hasValue(12)) {
            fVar.B(typedArrayE.getDimension(12, 0.0f));
        }
        fVar.G(h.P0(context4, typedArrayE, 22));
        fVar.H(typedArrayE.getDimension(23, 0.0f));
        fVar.Q(h.P0(context4, typedArrayE, 36));
        String text = typedArrayE.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.F, text)) {
            fVar.F = text;
            fVar.f4790l0.f5498d = true;
            fVar.invalidateSelf();
            fVar.v();
        }
        c2.d dVar = (!typedArrayE.hasValue(0) || (resourceId3 = typedArrayE.getResourceId(0, 0)) == 0) ? null : new c2.d(context4, resourceId3);
        dVar.f1253k = typedArrayE.getDimension(1, dVar.f1253k);
        fVar.R(dVar);
        int i4 = typedArrayE.getInt(3, 0);
        if (i4 == 1) {
            fVar.D0 = TextUtils.TruncateAt.START;
        } else if (i4 == 2) {
            fVar.D0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i4 == 3) {
            fVar.D0 = TextUtils.TruncateAt.END;
        }
        fVar.F(typedArrayE.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.F(typedArrayE.getBoolean(15, false));
        }
        fVar.C(h.U0(context4, typedArrayE, 14));
        if (typedArrayE.hasValue(17)) {
            fVar.E(h.P0(context4, typedArrayE, 17));
        }
        fVar.D(typedArrayE.getDimension(16, -1.0f));
        fVar.N(typedArrayE.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.N(typedArrayE.getBoolean(26, false));
        }
        fVar.I(h.U0(context4, typedArrayE, 25));
        fVar.M(h.P0(context4, typedArrayE, 30));
        fVar.K(typedArrayE.getDimension(28, 0.0f));
        fVar.x(typedArrayE.getBoolean(6, false));
        fVar.A(typedArrayE.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.A(typedArrayE.getBoolean(8, false));
        }
        fVar.y(h.U0(context4, typedArrayE, 7));
        if (typedArrayE.hasValue(9)) {
            fVar.z(h.P0(context4, typedArrayE, 9));
        }
        fVar.V = (!typedArrayE.hasValue(39) || (resourceId2 = typedArrayE.getResourceId(39, 0)) == 0) ? null : o1.b.a(context4, resourceId2);
        fVar.W = (!typedArrayE.hasValue(33) || (resourceId = typedArrayE.getResourceId(33, 0)) == 0) ? null : o1.b.a(context4, resourceId);
        float dimension2 = typedArrayE.getDimension(21, 0.0f);
        if (fVar.X != dimension2) {
            fVar.X = dimension2;
            fVar.invalidateSelf();
            fVar.v();
        }
        fVar.P(typedArrayE.getDimension(35, 0.0f));
        fVar.O(typedArrayE.getDimension(34, 0.0f));
        float dimension3 = typedArrayE.getDimension(41, 0.0f);
        if (fVar.f4779a0 != dimension3) {
            fVar.f4779a0 = dimension3;
            fVar.invalidateSelf();
            fVar.v();
        }
        float dimension4 = typedArrayE.getDimension(40, 0.0f);
        if (fVar.f4780b0 != dimension4) {
            fVar.f4780b0 = dimension4;
            fVar.invalidateSelf();
            fVar.v();
        }
        fVar.L(typedArrayE.getDimension(29, 0.0f));
        fVar.J(typedArrayE.getDimension(27, 0.0f));
        float dimension5 = typedArrayE.getDimension(13, 0.0f);
        if (fVar.f4783e0 != dimension5) {
            fVar.f4783e0 = dimension5;
            fVar.invalidateSelf();
            fVar.v();
        }
        fVar.F0 = typedArrayE.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayE.recycle();
        k.a(context2, attributeSet, com.shungo.app.R.attr.chipStyle, com.shungo.app.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, com.shungo.app.R.attr.chipStyle, com.shungo.app.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.shungo.app.R.attr.chipStyle, com.shungo.app.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1426o = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f1428q = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.j(k0.i(this));
        k.a(context2, attributeSet, com.shungo.app.R.attr.chipStyle, com.shungo.app.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, com.shungo.app.R.attr.chipStyle, com.shungo.app.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.shungo.app.R.attr.chipStyle, com.shungo.app.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f1430s = new d(this, this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f1422k);
        setText(fVar.F);
        setEllipsize(fVar.D0);
        h();
        if (!this.f1417f.E0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f1426o) {
            setMinHeight(this.f1428q);
        }
        this.f1427p = f0.d(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: v1.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f4774a.f1421j;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z4);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f1433v;
        rectF.setEmpty();
        if (c() && this.f1420i != null) {
            f fVar = this.f1417f;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.U()) {
                float f5 = fVar.f4783e0 + fVar.f4782d0 + fVar.P + fVar.f4781c0 + fVar.f4780b0;
                if (c0.c.a(fVar) == 0) {
                    float f6 = bounds.right;
                    rectF.right = f6;
                    rectF.left = f6 - f5;
                } else {
                    float f7 = bounds.left;
                    rectF.left = f7;
                    rectF.right = f7 + f5;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i4 = (int) closeIconTouchBounds.left;
        int i5 = (int) closeIconTouchBounds.top;
        int i6 = (int) closeIconTouchBounds.right;
        int i7 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f1432u;
        rect.set(i4, i5, i6, i7);
        return rect;
    }

    private c2.d getTextAppearance() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.f4790l0.f5500f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z4) {
        if (this.f1424m != z4) {
            this.f1424m = z4;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z4) {
        if (this.f1423l != z4) {
            this.f1423l = z4;
            refreshDrawableState();
        }
    }

    public final void b(int i4) {
        this.f1428q = i4;
        if (!this.f1426o) {
            InsetDrawable insetDrawable = this.f1418g;
            if (insetDrawable == null) {
                int[] iArr = d2.a.f1763a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1418g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = d2.a.f1763a;
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i4 - ((int) this.f1417f.A));
        int iMax2 = Math.max(0, i4 - this.f1417f.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f1418g;
            if (insetDrawable2 == null) {
                int[] iArr3 = d2.a.f1763a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1418g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = d2.a.f1763a;
                    f();
                    return;
                }
                return;
            }
        }
        int i5 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i6 = iMax > 0 ? iMax / 2 : 0;
        if (this.f1418g != null) {
            Rect rect = new Rect();
            this.f1418g.getPadding(rect);
            if (rect.top == i6 && rect.bottom == i6 && rect.left == i5 && rect.right == i5) {
                int[] iArr5 = d2.a.f1763a;
                f();
                return;
            }
        }
        if (getMinHeight() != i4) {
            setMinHeight(i4);
        }
        if (getMinWidth() != i4) {
            setMinWidth(i4);
        }
        this.f1418g = new InsetDrawable((Drawable) this.f1417f, i5, i6, i5, i6);
        int[] iArr6 = d2.a.f1763a;
        f();
    }

    public final boolean c() {
        f fVar = this.f1417f;
        if (fVar != null) {
            Object obj = fVar.M;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof c0.e) {
                ((c0.f) ((c0.e) obj)).getClass();
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        f fVar = this.f1417f;
        return fVar != null && fVar.R;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i4;
        if (!this.f1431t) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f1430s;
        AccessibilityManager accessibilityManager = dVar.f3720h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x4 = motionEvent.getX();
                float y4 = motionEvent.getY();
                Chip chip = dVar.f4778q;
                int i5 = (chip.c() && chip.getCloseIconTouchBounds().contains(x4, y4)) ? 1 : 0;
                int i6 = dVar.f3725m;
                if (i6 != i5) {
                    dVar.f3725m = i5;
                    dVar.q(i5, 128);
                    dVar.q(i6, 256);
                }
                if (i5 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i4 = dVar.f3725m) != Integer.MIN_VALUE) {
                if (i4 == Integer.MIN_VALUE) {
                    return true;
                }
                dVar.f3725m = Integer.MIN_VALUE;
                dVar.q(Integer.MIN_VALUE, 128);
                dVar.q(i4, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM;
        int i4;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.f1431t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f1430s;
        dVar.getClass();
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i5 = 0;
                int i6 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i6 = 33;
                                } else if (keyCode == 21) {
                                    i6 = 17;
                                } else if (keyCode != 22) {
                                    i6 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                zM = false;
                                while (i5 < repeatCount && dVar.m(i6, null)) {
                                    i5++;
                                    zM = true;
                                }
                                if (zM) {
                                    if (dVar.f3724l != Integer.MIN_VALUE) {
                                        return true;
                                    }
                                }
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i4 = dVar.f3724l;
                                if (i4 != Integer.MIN_VALUE) {
                                    chip = dVar.f4778q;
                                    if (i4 == 0) {
                                        chip.performClick();
                                    } else if (i4 == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.f1420i;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                            i5 = 1;
                                        }
                                        if (chip.f1431t) {
                                            chip.f1430s.q(1, 1);
                                        }
                                    }
                                }
                                if (dVar.f3724l != Integer.MIN_VALUE) {
                                    return true;
                                }
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i4 = dVar.f3724l;
                    if (i4 != Integer.MIN_VALUE) {
                        chip = dVar.f4778q;
                        if (i4 == 0) {
                            chip.performClick();
                        } else if (i4 == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.f1420i;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                                i5 = 1;
                            }
                            if (chip.f1431t) {
                                chip.f1430s.q(1, 1);
                            }
                        }
                    }
                    if (dVar.f3724l != Integer.MIN_VALUE) {
                        return true;
                    }
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    zM = dVar.m(2, null);
                } else if (keyEvent.hasModifiers(1)) {
                    zM = dVar.m(1, null);
                }
                if (zM) {
                    if (dVar.f3724l != Integer.MIN_VALUE) {
                        return true;
                    }
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // i.t, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i4;
        super.drawableStateChanged();
        f fVar = this.f1417f;
        if (fVar == null || !f.u(fVar.M)) {
            return;
        }
        f fVar2 = this.f1417f;
        ?? IsEnabled = isEnabled();
        if (this.f1425n) {
            i4 = IsEnabled;
            i4 = IsEnabled + 1;
        }
        i4 = IsEnabled;
        int i5 = i4;
        if (this.f1424m) {
            i5 = i4 + 1;
        }
        int i6 = i5;
        if (this.f1423l) {
            i6 = i5 + 1;
        }
        int i7 = i6;
        if (isChecked()) {
            i7 = i6 + 1;
        }
        int[] iArr = new int[i7];
        int i8 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i8 = 1;
        }
        if (this.f1425n) {
            iArr[i8] = 16842908;
            i8++;
        }
        if (this.f1424m) {
            iArr[i8] = 16843623;
            i8++;
        }
        if (this.f1423l) {
            iArr[i8] = 16842919;
            i8++;
        }
        if (isChecked()) {
            iArr[i8] = 16842913;
        }
        if (Arrays.equals(fVar2.f4806z0, iArr)) {
            return;
        }
        fVar2.f4806z0 = iArr;
        if (fVar2.U() && fVar2.w(fVar2.getState(), iArr)) {
            invalidate();
        }
    }

    public final void e() {
        f fVar;
        if (!c() || (fVar = this.f1417f) == null || !fVar.L || this.f1420i == null) {
            v0.l(this, null);
            this.f1431t = false;
        } else {
            v0.l(this, this.f1430s);
            this.f1431t = true;
        }
    }

    public final void f() {
        this.f1419h = new RippleDrawable(d2.a.a(this.f1417f.E), getBackgroundDrawable(), null);
        f fVar = this.f1417f;
        if (fVar.A0) {
            fVar.A0 = false;
            fVar.B0 = null;
            fVar.onStateChange(fVar.getState());
        }
        RippleDrawable rippleDrawable = this.f1419h;
        WeakHashMap weakHashMap = v0.f2983a;
        e0.q(this, rippleDrawable);
        g();
    }

    public final void g() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f1417f) == null) {
            return;
        }
        int iR = (int) (fVar.r() + fVar.f4783e0 + fVar.f4780b0);
        f fVar2 = this.f1417f;
        int iQ = (int) (fVar2.q() + fVar2.X + fVar2.f4779a0);
        if (this.f1418g != null) {
            Rect rect = new Rect();
            this.f1418g.getPadding(rect);
            iQ += rect.left;
            iR += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = v0.f2983a;
        f0.k(this, iQ, paddingTop, iR, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1429r)) {
            return this.f1429r;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1418g;
        return insetDrawable == null ? this.f1417f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.T;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.U;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.f4805z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return Math.max(0.0f, fVar.s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1417f;
    }

    public float getChipEndPadding() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.f4783e0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f1417f;
        if (fVar == null || (drawable = fVar.H) == 0) {
            return null;
        }
        if (!(drawable instanceof c0.e)) {
            return drawable;
        }
        ((c0.f) ((c0.e) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.J;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.I;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.A;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.D;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f1417f;
        if (fVar == null || (drawable = fVar.M) == 0) {
            return null;
        }
        if (!(drawable instanceof c0.e)) {
            return drawable;
        }
        ((c0.f) ((c0.e) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.Q;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.f4782d0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.P;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.f4781c0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.O;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.D0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1431t) {
            d dVar = this.f1430s;
            if (dVar.f3724l == 1 || dVar.f3723k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public o1.b getHideMotionSpec() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.W;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.Z;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.Y;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.E;
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        return this.f1417f.f2057b.f2035a;
    }

    public o1.b getShowMotionSpec() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.V;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.f4780b0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f1417f;
        if (fVar != null) {
            return fVar.f4779a0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        f fVar = this.f1417f;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        c2.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f1434w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.t2(this, this.f1417f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1415y);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1416z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i4, Rect rect) {
        super.onFocusChanged(z4, i4, rect);
        if (this.f1431t) {
            d dVar = this.f1430s;
            int i5 = dVar.f3724l;
            if (i5 != Integer.MIN_VALUE) {
                dVar.j(i5);
            }
            if (z4) {
                dVar.m(i4, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i4) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        if (this.f1427p != i4) {
            this.f1427p = i4;
            g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f1423l) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                }
                if (!super.onTouchEvent(motionEvent)) {
                    return false;
                }
            } else {
                if (this.f1423l) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f1420i;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f1431t) {
                        this.f1430s.q(1, 1);
                    }
                    z4 = true;
                }
                setCloseIconPressed(false);
                if (!z4) {
                    if (!super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
            z4 = false;
            setCloseIconPressed(false);
            if (!z4) {
                if (!super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        } else if (zContains) {
            setCloseIconPressed(true);
        } else if (!super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f1429r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1419h) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // i.t, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1419h) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // i.t, android.view.View
    public void setBackgroundResource(int i4) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.x(z4);
        }
    }

    public void setCheckableResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.x(fVar.f4784f0.getResources().getBoolean(i4));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        f fVar = this.f1417f;
        if (fVar == null) {
            this.f1422k = z4;
        } else if (fVar.R) {
            super.setChecked(z4);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z4) {
        setCheckedIconVisible(z4);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i4) {
        setCheckedIconVisible(i4);
    }

    public void setCheckedIconResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.y(q.g(fVar.f4784f0, i4));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.z(z.d.b(fVar.f4784f0, i4));
        }
    }

    public void setCheckedIconVisible(boolean z4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.A(z4);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f1417f;
        if (fVar == null || fVar.f4805z == colorStateList) {
            return;
        }
        fVar.f4805z = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i4) {
        ColorStateList colorStateListB;
        f fVar = this.f1417f;
        if (fVar == null || fVar.f4805z == (colorStateListB = z.d.b(fVar.f4784f0, i4))) {
            return;
        }
        fVar.f4805z = colorStateListB;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f5) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.B(f5);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.B(fVar.f4784f0.getResources().getDimension(i4));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f1417f;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.C0 = new WeakReference(null);
            }
            this.f1417f = fVar;
            fVar.E0 = false;
            fVar.C0 = new WeakReference(this);
            b(this.f1428q);
        }
    }

    public void setChipEndPadding(float f5) {
        f fVar = this.f1417f;
        if (fVar == null || fVar.f4783e0 == f5) {
            return;
        }
        fVar.f4783e0 = f5;
        fVar.invalidateSelf();
        fVar.v();
    }

    public void setChipEndPaddingResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            float dimension = fVar.f4784f0.getResources().getDimension(i4);
            if (fVar.f4783e0 != dimension) {
                fVar.f4783e0 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z4) {
        setChipIconVisible(z4);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i4) {
        setChipIconVisible(i4);
    }

    public void setChipIconResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.C(q.g(fVar.f4784f0, i4));
        }
    }

    public void setChipIconSize(float f5) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.D(f5);
        }
    }

    public void setChipIconSizeResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.D(fVar.f4784f0.getResources().getDimension(i4));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.E(z.d.b(fVar.f4784f0, i4));
        }
    }

    public void setChipIconVisible(boolean z4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.F(z4);
        }
    }

    public void setChipMinHeight(float f5) {
        f fVar = this.f1417f;
        if (fVar == null || fVar.A == f5) {
            return;
        }
        fVar.A = f5;
        fVar.invalidateSelf();
        fVar.v();
    }

    public void setChipMinHeightResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            float dimension = fVar.f4784f0.getResources().getDimension(i4);
            if (fVar.A != dimension) {
                fVar.A = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setChipStartPadding(float f5) {
        f fVar = this.f1417f;
        if (fVar == null || fVar.X == f5) {
            return;
        }
        fVar.X = f5;
        fVar.invalidateSelf();
        fVar.v();
    }

    public void setChipStartPaddingResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            float dimension = fVar.f4784f0.getResources().getDimension(i4);
            if (fVar.X != dimension) {
                fVar.X = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.G(z.d.b(fVar.f4784f0, i4));
        }
    }

    public void setChipStrokeWidth(float f5) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.H(f5);
        }
    }

    public void setChipStrokeWidthResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.H(fVar.f4784f0.getResources().getDimension(i4));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i4) {
        setText(getResources().getString(i4));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.I(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f1417f;
        if (fVar == null || fVar.Q == charSequence) {
            return;
        }
        g0.c cVarC = g0.c.c();
        fVar.Q = cVarC.d(charSequence, cVarC.f2289c);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z4) {
        setCloseIconVisible(z4);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i4) {
        setCloseIconVisible(i4);
    }

    public void setCloseIconEndPadding(float f5) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.J(f5);
        }
    }

    public void setCloseIconEndPaddingResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.J(fVar.f4784f0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.I(q.g(fVar.f4784f0, i4));
        }
        e();
    }

    public void setCloseIconSize(float f5) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.K(f5);
        }
    }

    public void setCloseIconSizeResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.K(fVar.f4784f0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconStartPadding(float f5) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.L(f5);
        }
    }

    public void setCloseIconStartPaddingResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.L(fVar.f4784f0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.M(z.d.b(fVar.f4784f0, i4));
        }
    }

    public void setCloseIconVisible(int i4) {
        setCloseIconVisible(getResources().getBoolean(i4));
    }

    @Override // i.t, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // i.t, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i6, i7);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i4, i5, i6, i7);
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.j(f5);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1417f == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.D0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        this.f1426o = z4;
        b(this.f1428q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i4) {
        if (i4 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i4);
        }
    }

    public void setHideMotionSpec(o1.b bVar) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.W = bVar;
        }
    }

    public void setHideMotionSpecResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.W = o1.b.a(fVar.f4784f0, i4);
        }
    }

    public void setIconEndPadding(float f5) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.O(f5);
        }
    }

    public void setIconEndPaddingResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.O(fVar.f4784f0.getResources().getDimension(i4));
        }
    }

    public void setIconStartPadding(float f5) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.P(f5);
        }
    }

    public void setIconStartPaddingResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.P(fVar.f4784f0.getResources().getDimension(i4));
        }
    }

    public void setInternalOnCheckedChangeListener(z1.e eVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i4) {
        if (this.f1417f == null) {
            return;
        }
        super.setLayoutDirection(i4);
    }

    @Override // android.widget.TextView
    public void setLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i4);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i4);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i4) {
        super.setMaxWidth(i4);
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.F0 = i4;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i4);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f1421j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1420i = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.Q(colorStateList);
        }
        if (this.f1417f.A0) {
            return;
        }
        f();
    }

    public void setRippleColorResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.Q(z.d.b(fVar.f4784f0, i4));
            if (this.f1417f.A0) {
                return;
            }
            f();
        }
    }

    @Override // f2.x
    public void setShapeAppearanceModel(l lVar) {
        this.f1417f.setShapeAppearanceModel(lVar);
    }

    public void setShowMotionSpec(o1.b bVar) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.V = bVar;
        }
    }

    public void setShowMotionSpecResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.V = o1.b.a(fVar.f4784f0, i4);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z4) {
        if (!z4) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z4);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f1417f;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.E0 ? null : charSequence, bufferType);
        f fVar2 = this.f1417f;
        if (fVar2 == null || TextUtils.equals(fVar2.F, charSequence)) {
            return;
        }
        fVar2.F = charSequence;
        fVar2.f4790l0.f5498d = true;
        fVar2.invalidateSelf();
        fVar2.v();
    }

    public void setTextAppearance(c2.d dVar) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.R(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i4) {
        setTextAppearance(getContext(), i4);
    }

    public void setTextEndPadding(float f5) {
        f fVar = this.f1417f;
        if (fVar == null || fVar.f4780b0 == f5) {
            return;
        }
        fVar.f4780b0 = f5;
        fVar.invalidateSelf();
        fVar.v();
    }

    public void setTextEndPaddingResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            float dimension = fVar.f4784f0.getResources().getDimension(i4);
            if (fVar.f4780b0 != dimension) {
                fVar.f4780b0 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f5) {
        super.setTextSize(i4, f5);
        f fVar = this.f1417f;
        if (fVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i4, f5, getResources().getDisplayMetrics());
            i iVar = fVar.f4790l0;
            c2.d dVar = iVar.f5500f;
            if (dVar != null) {
                dVar.f1253k = fApplyDimension;
                iVar.f5495a.setTextSize(fApplyDimension);
                fVar.v();
                fVar.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f5) {
        f fVar = this.f1417f;
        if (fVar == null || fVar.f4779a0 == f5) {
            return;
        }
        fVar.f4779a0 = f5;
        fVar.invalidateSelf();
        fVar.v();
    }

    public void setTextStartPaddingResource(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            float dimension = fVar.f4784f0.getResources().getDimension(i4);
            if (fVar.f4779a0 != dimension) {
                fVar.f4779a0 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setCheckedIconVisible(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.A(fVar.f4784f0.getResources().getBoolean(i4));
        }
    }

    public void setChipIconVisible(int i4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.F(fVar.f4784f0.getResources().getBoolean(i4));
        }
    }

    public void setCloseIconVisible(boolean z4) {
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.N(z4);
        }
        e();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.R(new c2.d(fVar.f4784f0, i4));
        }
        h();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i4) {
        super.setTextAppearance(i4);
        f fVar = this.f1417f;
        if (fVar != null) {
            fVar.R(new c2.d(fVar.f4784f0, i4));
        }
        h();
    }
}
