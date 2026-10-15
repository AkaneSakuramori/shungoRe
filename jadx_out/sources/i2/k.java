package i2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.shungo.app.R;
import i0.e0;
import i0.v0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f3020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f3021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.material.datepicker.m f3022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f3023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l0.b f3024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3025l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f3028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f3029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f3030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f3031r;

    public k(n nVar) {
        super(nVar);
        this.f3022i = new com.google.android.material.datepicker.m(2, this);
        this.f3023j = new b(this, 1);
        this.f3024k = new l0.b(this);
        this.f3028o = Long.MAX_VALUE;
        this.f3019f = c3.h.k2(nVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f3018e = c3.h.k2(nVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f3020g = c3.h.l2(nVar.getContext(), R.attr.motionEasingLinearInterpolator, o1.a.f3595a);
    }

    @Override // i2.o
    public final void a() {
        if (this.f3029p.isTouchExplorationEnabled() && this.f3021h.getInputType() != 0 && !this.f3060d.hasFocus()) {
            this.f3021h.dismissDropDown();
        }
        this.f3021h.post(new androidx.activity.d(11, this));
    }

    @Override // i2.o
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // i2.o
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // i2.o
    public final View.OnFocusChangeListener e() {
        return this.f3023j;
    }

    @Override // i2.o
    public final View.OnClickListener f() {
        return this.f3022i;
    }

    @Override // i2.o
    public final j0.d h() {
        return this.f3024k;
    }

    @Override // i2.o
    public final boolean i(int i4) {
        return i4 != 0;
    }

    @Override // i2.o
    public final boolean j() {
        return this.f3025l;
    }

    @Override // i2.o
    public final boolean l() {
        return this.f3027n;
    }

    @Override // i2.o
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f3021h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: i2.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar = this.f3016b;
                kVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - kVar.f3028o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        kVar.f3026m = false;
                    }
                    kVar.u();
                    kVar.f3026m = true;
                    kVar.f3028o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f3021h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: i2.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = this.f3017a;
                kVar.f3026m = true;
                kVar.f3028o = System.currentTimeMillis();
                kVar.t(false);
            }
        });
        this.f3021h.setThreshold(0);
        TextInputLayout textInputLayout = this.f3057a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f3029p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = v0.f2983a;
            e0.s(this.f3060d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // i2.o
    public final void n(j0.o oVar) {
        int inputType = this.f3021h.getInputType();
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f3144a;
        if (inputType == 0) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // i2.o
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (this.f3029p.isEnabled() && this.f3021h.getInputType() == 0) {
            boolean z4 = accessibilityEvent.getEventType() == 32768 && this.f3027n && !this.f3021h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z4) {
                u();
                this.f3026m = true;
                this.f3028o = System.currentTimeMillis();
            }
        }
    }

    @Override // i2.o
    public final void r() {
        int i4 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3020g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f3019f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, i4));
        this.f3031r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f3018e);
        valueAnimatorOfFloat2.addUpdateListener(new a(this, i4));
        this.f3030q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new i.d(6, this));
        this.f3029p = (AccessibilityManager) this.f3059c.getSystemService("accessibility");
    }

    @Override // i2.o
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f3021h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f3021h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z4) {
        if (this.f3027n != z4) {
            this.f3027n = z4;
            this.f3031r.cancel();
            this.f3030q.start();
        }
    }

    public final void u() {
        if (this.f3021h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f3028o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f3026m = false;
        }
        if (this.f3026m) {
            this.f3026m = false;
            return;
        }
        t(!this.f3027n);
        if (!this.f3027n) {
            this.f3021h.dismissDropDown();
        } else {
            this.f3021h.requestFocus();
            this.f3021h.showDropDown();
        }
    }
}
