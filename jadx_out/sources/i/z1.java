package i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.shungo.app.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class z1 extends ListView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f2869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x1 f2875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2877j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2878k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m0.g f2879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.activity.j f2880m;

    public z1(Context context, boolean z4) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2869b = new Rect();
        this.f2870c = 0;
        this.f2871d = 0;
        this.f2872e = 0;
        this.f2873f = 0;
        this.f2877j = z4;
        setCacheColorHint(0);
    }

    public final int a(int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i4, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i5) {
                return i5;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0149  */
    /* JADX WARN: Code duplicated, block: B:84:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:88:0x0168  */
    /* JADX WARN: Code duplicated, block: B:90:0x0179  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0181  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(MotionEvent motionEvent, int i4) {
        boolean z4;
        boolean zA;
        View childAt;
        View childAt2;
        m0.g gVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z5 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z4 = true;
            } else if (actionMasked != 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 || z5) {
                this.f2878k = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f2874g - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z4) {
                if (this.f2879l == null) {
                    this.f2879l = new m0.g(this);
                }
                m0.g gVar2 = this.f2879l;
                boolean z6 = gVar2.f3435q;
                gVar2.f3435q = true;
                gVar2.d(this, motionEvent);
            } else {
                gVar = this.f2879l;
                if (gVar != null) {
                    if (gVar.f3435q) {
                        gVar.e();
                    }
                    gVar.f3435q = false;
                }
            }
            return z4;
        }
        z4 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i4);
        if (iFindPointerIndex < 0) {
            z4 = false;
        } else {
            int x4 = (int) motionEvent.getX(iFindPointerIndex);
            int y4 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x4, y4);
            if (iPointToPosition == -1) {
                z5 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f5 = x4;
                float f6 = y4;
                this.f2878k = true;
                u1.a(this, f5, f6);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i5 = this.f2874g;
                if (i5 != -1 && (childAt = getChildAt(i5 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f2874g = iPointToPosition;
                u1.a(childAt3, f5 - childAt3.getLeft(), f6 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z7 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z7) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f2869b;
                rect.set(left, top, right, bottom);
                rect.left -= this.f2870c;
                rect.top -= this.f2871d;
                rect.right += this.f2872e;
                rect.bottom += this.f2873f;
                if (e0.b.a()) {
                    zA = w1.a(this);
                } else {
                    Field field = y1.f2857a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e5) {
                            e5.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z8 = !zA;
                    if (e0.b.a()) {
                        w1.b(this, z8);
                    } else {
                        Field field2 = y1.f2857a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z8));
                            } catch (IllegalAccessException e6) {
                                e6.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z7) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    c0.b.e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    c0.b.e(selector2, f5, f6);
                }
                x1 x1Var = this.f2875h;
                if (x1Var != null) {
                    x1Var.f2836c = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z4 = true;
                z5 = false;
            }
        }
        if (z4) {
            this.f2878k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2874g - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f2878k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2874g - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z4) {
            if (this.f2879l == null) {
                this.f2879l = new m0.g(this);
            }
            m0.g gVar3 = this.f2879l;
            boolean z9 = gVar3.f3435q;
            gVar3.f3435q = true;
            gVar3.d(this, motionEvent);
        } else {
            gVar = this.f2879l;
            if (gVar != null) {
                if (gVar.f3435q) {
                    gVar.e();
                }
                gVar.f3435q = false;
            }
        }
        return z4;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2869b;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2880m != null) {
            return;
        }
        super.drawableStateChanged();
        x1 x1Var = this.f2875h;
        if (x1Var != null) {
            x1Var.f2836c = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2878k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2877j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2877j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2877j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2877j && this.f2876i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2880m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i4 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        int i5 = 2;
        if (actionMasked == 10 && this.f2880m == null) {
            androidx.activity.j jVar = new androidx.activity.j(i5, this);
            this.f2880m = jVar;
            post(jVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i4 < 30 || !v1.f2806d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            v1.f2803a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            v1.f2804b.invoke(this, Integer.valueOf(iPointToPosition));
                            v1.f2805c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e5) {
                            e5.printStackTrace();
                        } catch (InvocationTargetException e6) {
                            e6.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f2878k && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2874g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.activity.j jVar = this.f2880m;
        if (jVar != null) {
            z1 z1Var = (z1) jVar.f265c;
            z1Var.f2880m = null;
            z1Var.removeCallbacks(jVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f2876i = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        x1 x1Var;
        if (drawable != null) {
            x1Var = new x1(drawable);
            x1Var.f2836c = true;
        } else {
            x1Var = null;
        }
        this.f2875h = x1Var;
        super.setSelector(x1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2870c = rect.left;
        this.f2871d = rect.top;
        this.f2872e = rect.right;
        this.f2873f = rect.bottom;
    }
}
