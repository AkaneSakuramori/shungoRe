package d1;

import a0.q;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f implements Animatable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f1693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i.d f1694e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f1695f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.a f1696g = new f.a(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f1692c = new c();

    public e(Context context) {
        this.f1693d = context;
    }

    @Override // d1.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            c0.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            return c0.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f1692c;
        cVar.f1687a.draw(canvas);
        if (cVar.f1688b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1697b;
        return drawable != null ? c0.a.a(drawable) : this.f1692c.f1687a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f1692c.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1697b;
        return drawable != null ? c0.b.c(drawable) : this.f1692c.f1687a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1697b != null) {
            return new d(this.f1697b.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1697b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1692c.f1687a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1697b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1692c.f1687a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1697b;
        return drawable != null ? drawable.getOpacity() : this.f1692c.f1687a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar;
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            c0.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            cVar = this.f1692c;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayD1 = c3.h.D1(resources, theme, attributeSet, a.f1684e);
                    int resourceId = typedArrayD1.getResourceId(0, 0);
                    if (resourceId != 0) {
                        o oVar = new o();
                        ThreadLocal threadLocal = q.f38a;
                        oVar.f1697b = a0.j.a(resources, resourceId, theme);
                        new n(oVar.f1697b.getConstantState());
                        oVar.f1759g = false;
                        oVar.setCallback(this.f1696g);
                        o oVar2 = cVar.f1687a;
                        if (oVar2 != null) {
                            oVar2.setCallback(null);
                        }
                        cVar.f1687a = oVar;
                    }
                    typedArrayD1.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f1685f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1693d;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(cVar.f1687a.f1755c.f1742b.f1740o.getOrDefault(string, null));
                        if (cVar.f1689c == null) {
                            cVar.f1689c = new ArrayList();
                            cVar.f1690d = new n.b();
                        }
                        cVar.f1689c.add(animatorLoadAnimator);
                        cVar.f1690d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (cVar.f1688b == null) {
            cVar.f1688b = new AnimatorSet();
        }
        cVar.f1688b.playTogether(cVar.f1689c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1697b;
        return drawable != null ? c0.a.d(drawable) : this.f1692c.f1687a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f1697b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1692c.f1688b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f1697b;
        return drawable != null ? drawable.isStateful() : this.f1692c.f1687a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1692c.f1687a.setBounds(rect);
        }
    }

    @Override // d1.f, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        Drawable drawable = this.f1697b;
        return drawable != null ? drawable.setLevel(i4) : this.f1692c.f1687a.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1697b;
        return drawable != null ? drawable.setState(iArr) : this.f1692c.f1687a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else {
            this.f1692c.f1687a.setAlpha(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            c0.a.e(drawable, z4);
        } else {
            this.f1692c.f1687a.setAutoMirrored(z4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1692c.f1687a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            c3.h.v2(drawable, i4);
        } else {
            this.f1692c.f1687a.setTint(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            c3.h.w2(drawable, colorStateList);
        } else {
            this.f1692c.f1687a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            c3.h.x2(drawable, mode);
        } else {
            this.f1692c.f1687a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            return drawable.setVisible(z4, z5);
        }
        this.f1692c.f1687a.setVisible(z4, z5);
        return super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f1692c;
        if (cVar.f1688b.isStarted()) {
            return;
        }
        cVar.f1688b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f1697b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1692c.f1688b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
