package c1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import com.shungo.app.R;
import e.n0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String[] f1176z = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1177y;

    public i(int i4) {
        this.f1177y = 3;
        if ((i4 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f1177y = i4;
    }

    public static void H(x xVar) {
        int visibility = xVar.f1229b.getVisibility();
        HashMap map = xVar.f1228a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = xVar.f1229b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static g0 J(x xVar, x xVar2) {
        g0 g0Var = new g0();
        g0Var.f1166a = false;
        g0Var.f1167b = false;
        if (xVar != null) {
            HashMap map = xVar.f1228a;
            if (map.containsKey("android:visibility:visibility")) {
                g0Var.f1168c = ((Integer) map.get("android:visibility:visibility")).intValue();
                g0Var.f1170e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                g0Var.f1168c = -1;
                g0Var.f1170e = null;
            }
        } else {
            g0Var.f1168c = -1;
            g0Var.f1170e = null;
        }
        if (xVar2 != null) {
            HashMap map2 = xVar2.f1228a;
            if (map2.containsKey("android:visibility:visibility")) {
                g0Var.f1169d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                g0Var.f1171f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                g0Var.f1169d = -1;
                g0Var.f1171f = null;
            }
        } else {
            g0Var.f1169d = -1;
            g0Var.f1171f = null;
        }
        if (xVar != null && xVar2 != null) {
            int i4 = g0Var.f1168c;
            int i5 = g0Var.f1169d;
            if (i4 != i5 || g0Var.f1170e != g0Var.f1171f) {
                if (i4 != i5) {
                    if (i4 == 0) {
                        g0Var.f1167b = false;
                        g0Var.f1166a = true;
                    } else if (i5 == 0) {
                        g0Var.f1167b = true;
                        g0Var.f1166a = true;
                    }
                } else if (g0Var.f1171f == null) {
                    g0Var.f1167b = false;
                    g0Var.f1166a = true;
                } else if (g0Var.f1170e == null) {
                    g0Var.f1167b = true;
                    g0Var.f1166a = true;
                }
            }
        } else if (xVar == null && g0Var.f1169d == 0) {
            g0Var.f1167b = true;
            g0Var.f1166a = true;
        } else if (xVar2 == null && g0Var.f1168c == 0) {
            g0Var.f1167b = false;
            g0Var.f1166a = true;
        }
        return g0Var;
    }

    public final ObjectAnimator I(View view, float f5, float f6) {
        if (f5 == f6) {
            return null;
        }
        y.f1231a.i(view, f5);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, y.f1232b, f6);
        objectAnimatorOfFloat.addListener(new y0.n(view));
        a(new h(this, 0, view));
        return objectAnimatorOfFloat;
    }

    @Override // c1.q
    public final void d(x xVar) {
        H(xVar);
    }

    @Override // c1.q
    public final void g(x xVar) {
        H(xVar);
        xVar.f1228a.put("android:fade:transitionAlpha", Float.valueOf(y.f1231a.h(xVar.f1229b)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x0172  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0213  */
    /* JADX WARN: Code duplicated, block: B:90:0x0223  */
    /* JADX WARN: Code duplicated, block: B:93:0x022a  */
    @Override // c1.q
    public final Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        boolean z4;
        View view;
        int i4;
        Object obj;
        View view2;
        float f5;
        View view3;
        int id;
        ImageView imageView;
        boolean z5;
        boolean zIsAttachedToWindow;
        boolean z6;
        ViewGroup viewGroup2;
        int i5;
        int iRound;
        Bitmap bitmapCreateBitmap;
        float f6;
        float fFloatValue;
        ObjectAnimator objectAnimatorI;
        Float f7;
        g0 g0VarJ = J(xVar, xVar2);
        if (g0VarJ.f1166a && (g0VarJ.f1170e != null || g0VarJ.f1171f != null)) {
            boolean z7 = false;
            if (g0VarJ.f1167b) {
                if ((this.f1177y & 1) != 1 || xVar2 == null) {
                    objectAnimatorI = null;
                } else {
                    View view4 = xVar2.f1229b;
                    if (xVar == null) {
                        View view5 = (View) view4.getParent();
                        if (J(n(view5, false), q(view5, false)).f1166a) {
                            objectAnimatorI = null;
                        }
                    }
                    float fFloatValue2 = (xVar == null || (f7 = (Float) xVar.f1228a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f7.floatValue();
                    objectAnimatorI = I(view4, fFloatValue2 != 1.0f ? fFloatValue2 : 0.0f, 1.0f);
                }
                return objectAnimatorI;
            }
            int i6 = g0VarJ.f1169d;
            if ((this.f1177y & 2) == 2 && xVar != null) {
                View view6 = xVar2 != null ? xVar2.f1229b : null;
                View view7 = xVar.f1229b;
                View view8 = (View) view7.getTag(R.id.save_overlay_view);
                if (view8 != null) {
                    xVar = xVar;
                    i4 = i6;
                    obj = "android:fade:transitionAlpha";
                    f5 = 1.0f;
                    z7 = true;
                    view2 = null;
                } else {
                    if (view6 == null || view6.getParent() == null) {
                        if (view6 != null) {
                            z4 = false;
                        }
                        view = null;
                        if (!z4) {
                            i4 = i6;
                            obj = "android:fade:transitionAlpha";
                            view = view;
                            view8 = view6;
                            view2 = view;
                            f5 = 1.0f;
                            z7 = false;
                        } else if (view7.getParent() == null) {
                            xVar = xVar;
                            i4 = i6;
                            obj = "android:fade:transitionAlpha";
                            f5 = 1.0f;
                            view2 = view;
                            view8 = view7;
                        } else {
                            if (view7.getParent() instanceof View) {
                                view3 = (View) view7.getParent();
                                if (J(q(view3, true), n(view3, true)).f1166a) {
                                    i4 = i6;
                                    obj = "android:fade:transitionAlpha";
                                    view = view;
                                    id = view3.getId();
                                    if (view3.getParent() == null && id != -1) {
                                        viewGroup.findViewById(id);
                                    }
                                } else {
                                    boolean z8 = w.f1225a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view3.getScrollX(), -view3.getScrollY());
                                    c0 c0Var = y.f1231a;
                                    c0Var.j(view7, matrix);
                                    c0Var.k(viewGroup, matrix);
                                    RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                    matrix.mapRect(rectF);
                                    int iRound2 = Math.round(rectF.left);
                                    int iRound3 = Math.round(rectF.top);
                                    int iRound4 = Math.round(rectF.right);
                                    int iRound5 = Math.round(rectF.bottom);
                                    imageView = new ImageView(view7.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    if (w.f1225a) {
                                        z5 = !view7.isAttachedToWindow();
                                        zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                    } else {
                                        z5 = false;
                                        zIsAttachedToWindow = false;
                                    }
                                    z6 = w.f1226b;
                                    if (z6 || !z5) {
                                        viewGroup2 = null;
                                        i5 = 0;
                                    } else {
                                        if (zIsAttachedToWindow) {
                                            ViewGroup viewGroup3 = (ViewGroup) view7.getParent();
                                            int iIndexOfChild = viewGroup3.indexOfChild(view7);
                                            viewGroup.getOverlay().add(view7);
                                            viewGroup2 = viewGroup3;
                                            i5 = iIndexOfChild;
                                        } else {
                                            i4 = i6;
                                            obj = "android:fade:transitionAlpha";
                                            view = view;
                                            bitmapCreateBitmap = null;
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                        imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                        view8 = imageView;
                                    }
                                    i4 = i6;
                                    iRound = Math.round(rectF.width());
                                    int iRound6 = Math.round(rectF.height());
                                    if (iRound > 0 || iRound6 <= 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound6));
                                        int iRound7 = Math.round(iRound * fMin);
                                        int iRound8 = Math.round(iRound6 * fMin);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(fMin, fMin);
                                        if (w.f1227c) {
                                            Picture picture = new Picture();
                                            Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                            canvasBeginRecording.concat(matrix);
                                            view7.draw(canvasBeginRecording);
                                            picture.endRecording();
                                            bitmapCreateBitmap = Bitmap.createBitmap(picture);
                                        } else {
                                            bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                                            canvas.concat(matrix);
                                            view7.draw(canvas);
                                        }
                                    }
                                    if (z6 && z5) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i5);
                                    }
                                    if (bitmapCreateBitmap != null) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                    imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                    view8 = imageView;
                                }
                                view2 = view;
                                f5 = 1.0f;
                                z7 = false;
                            } else {
                                i4 = i6;
                                obj = "android:fade:transitionAlpha";
                                view = view;
                            }
                            view8 = view6;
                            view2 = view;
                            f5 = 1.0f;
                            z7 = false;
                        }
                    } else {
                        if (i6 == 4 || view7 == view6) {
                            view = view6;
                            z4 = false;
                            view6 = null;
                        }
                        if (!z4) {
                            i4 = i6;
                            obj = "android:fade:transitionAlpha";
                            view = view;
                            view8 = view6;
                            view2 = view;
                            f5 = 1.0f;
                            z7 = false;
                        } else if (view7.getParent() == null) {
                            xVar = xVar;
                            i4 = i6;
                            obj = "android:fade:transitionAlpha";
                            f5 = 1.0f;
                            view2 = view;
                            view8 = view7;
                        } else {
                            if (view7.getParent() instanceof View) {
                                view3 = (View) view7.getParent();
                                if (J(q(view3, true), n(view3, true)).f1166a) {
                                    boolean z9 = w.f1225a;
                                    Matrix matrix2 = new Matrix();
                                    matrix2.setTranslate(-view3.getScrollX(), -view3.getScrollY());
                                    c0 c0Var2 = y.f1231a;
                                    c0Var2.j(view7, matrix2);
                                    c0Var2.k(viewGroup, matrix2);
                                    RectF rectF2 = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                    matrix2.mapRect(rectF2);
                                    int iRound9 = Math.round(rectF2.left);
                                    int iRound10 = Math.round(rectF2.top);
                                    int iRound11 = Math.round(rectF2.right);
                                    int iRound12 = Math.round(rectF2.bottom);
                                    imageView = new ImageView(view7.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    if (w.f1225a) {
                                        z5 = !view7.isAttachedToWindow();
                                        zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                    } else {
                                        z5 = false;
                                        zIsAttachedToWindow = false;
                                    }
                                    z6 = w.f1226b;
                                    if (z6) {
                                        viewGroup2 = null;
                                        i5 = 0;
                                        i4 = i6;
                                        iRound = Math.round(rectF2.width());
                                        int iRound13 = Math.round(rectF2.height());
                                        if (iRound > 0) {
                                            obj = "android:fade:transitionAlpha";
                                            bitmapCreateBitmap = null;
                                        } else {
                                            obj = "android:fade:transitionAlpha";
                                            bitmapCreateBitmap = null;
                                        }
                                        if (z6) {
                                            viewGroup.getOverlay().remove(view7);
                                            viewGroup2.addView(view7, i5);
                                        }
                                    } else {
                                        viewGroup2 = null;
                                        i5 = 0;
                                        i4 = i6;
                                        iRound = Math.round(rectF2.width());
                                        int iRound14 = Math.round(rectF2.height());
                                        if (iRound > 0) {
                                            obj = "android:fade:transitionAlpha";
                                            bitmapCreateBitmap = null;
                                        } else {
                                            obj = "android:fade:transitionAlpha";
                                            bitmapCreateBitmap = null;
                                        }
                                        if (z6) {
                                            viewGroup.getOverlay().remove(view7);
                                            viewGroup2.addView(view7, i5);
                                        }
                                    }
                                    if (bitmapCreateBitmap != null) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound11 - iRound9, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound12 - iRound10, 1073741824));
                                    imageView.layout(iRound9, iRound10, iRound11, iRound12);
                                    view8 = imageView;
                                } else {
                                    i4 = i6;
                                    obj = "android:fade:transitionAlpha";
                                    view = view;
                                    id = view3.getId();
                                    if (view3.getParent() == null) {
                                        viewGroup.findViewById(id);
                                    }
                                }
                                view2 = view;
                                f5 = 1.0f;
                                z7 = false;
                            } else {
                                i4 = i6;
                                obj = "android:fade:transitionAlpha";
                                view = view;
                            }
                            view8 = view6;
                            view2 = view;
                            f5 = 1.0f;
                            z7 = false;
                        }
                    }
                    z4 = true;
                    view6 = null;
                    view = null;
                    if (!z4) {
                        i4 = i6;
                        obj = "android:fade:transitionAlpha";
                        view = view;
                        view8 = view6;
                        view2 = view;
                        f5 = 1.0f;
                        z7 = false;
                    } else if (view7.getParent() == null) {
                        xVar = xVar;
                        i4 = i6;
                        obj = "android:fade:transitionAlpha";
                        f5 = 1.0f;
                        view2 = view;
                        view8 = view7;
                    } else {
                        if (view7.getParent() instanceof View) {
                            view3 = (View) view7.getParent();
                            if (J(q(view3, true), n(view3, true)).f1166a) {
                                boolean z10 = w.f1225a;
                                Matrix matrix3 = new Matrix();
                                matrix3.setTranslate(-view3.getScrollX(), -view3.getScrollY());
                                c0 c0Var3 = y.f1231a;
                                c0Var3.j(view7, matrix3);
                                c0Var3.k(viewGroup, matrix3);
                                RectF rectF3 = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                matrix3.mapRect(rectF3);
                                int iRound15 = Math.round(rectF3.left);
                                int iRound16 = Math.round(rectF3.top);
                                int iRound17 = Math.round(rectF3.right);
                                int iRound18 = Math.round(rectF3.bottom);
                                imageView = new ImageView(view7.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                if (w.f1225a) {
                                    z5 = !view7.isAttachedToWindow();
                                    zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                } else {
                                    z5 = false;
                                    zIsAttachedToWindow = false;
                                }
                                z6 = w.f1226b;
                                if (z6) {
                                    viewGroup2 = null;
                                    i5 = 0;
                                    i4 = i6;
                                    iRound = Math.round(rectF3.width());
                                    int iRound19 = Math.round(rectF3.height());
                                    if (iRound > 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    }
                                    if (z6) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i5);
                                    }
                                } else {
                                    viewGroup2 = null;
                                    i5 = 0;
                                    i4 = i6;
                                    iRound = Math.round(rectF3.width());
                                    int iRound110 = Math.round(rectF3.height());
                                    if (iRound > 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    }
                                    if (z6) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i5);
                                    }
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound17 - iRound15, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound18 - iRound16, 1073741824));
                                imageView.layout(iRound15, iRound16, iRound17, iRound18);
                                view8 = imageView;
                            } else {
                                i4 = i6;
                                obj = "android:fade:transitionAlpha";
                                view = view;
                                id = view3.getId();
                                if (view3.getParent() == null) {
                                    viewGroup.findViewById(id);
                                }
                            }
                            view2 = view;
                            f5 = 1.0f;
                            z7 = false;
                        } else {
                            i4 = i6;
                            obj = "android:fade:transitionAlpha";
                            view = view;
                        }
                        view8 = view6;
                        view2 = view;
                        f5 = 1.0f;
                        z7 = false;
                    }
                }
                HashMap map = xVar.f1228a;
                if (view8 != null) {
                    if (!z7) {
                        int[] iArr = (int[]) map.get("android:visibility:screenLocation");
                        int i7 = iArr[0];
                        int i8 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view8.offsetLeftAndRight((i7 - iArr2[0]) - view8.getLeft());
                        view8.offsetTopAndBottom((i8 - iArr2[1]) - view8.getTop());
                        ((ViewGroupOverlay) new n0(viewGroup).f1896c).add(view8);
                    }
                    y.f1231a.getClass();
                    Float f8 = (Float) map.get(obj);
                    if (f8 != null) {
                        fFloatValue = f8.floatValue();
                        f6 = 0.0f;
                    } else {
                        f6 = 0.0f;
                        fFloatValue = f5;
                    }
                    ObjectAnimator objectAnimatorI2 = I(view8, fFloatValue, f6);
                    if (z7) {
                        return objectAnimatorI2;
                    }
                    if (objectAnimatorI2 == null) {
                        ((ViewGroupOverlay) new n0(viewGroup).f1896c).remove(view8);
                        return objectAnimatorI2;
                    }
                    view7.setTag(R.id.save_overlay_view, view8);
                    a(new e0(this, viewGroup, view8, view7));
                    return objectAnimatorI2;
                }
                Object obj2 = obj;
                if (view2 != null) {
                    int visibility = view2.getVisibility();
                    c0 c0Var4 = y.f1231a;
                    c0Var4.g(view2, 0);
                    c0Var4.getClass();
                    Float f9 = (Float) map.get(obj2);
                    ObjectAnimator objectAnimatorI3 = I(view2, f9 != null ? f9.floatValue() : f5, 0.0f);
                    if (objectAnimatorI3 != null) {
                        f0 f0Var = new f0(view2, i4);
                        objectAnimatorI3.addListener(f0Var);
                        objectAnimatorI3.addPauseListener(f0Var);
                        a(f0Var);
                    } else {
                        c0Var4.g(view2, visibility);
                    }
                    return objectAnimatorI3;
                }
            }
        }
        return null;
    }

    @Override // c1.q
    public final /* bridge */ /* synthetic */ String[] p() {
        return f1176z;
    }

    @Override // c1.q
    public final boolean r(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f1228a.containsKey("android:visibility:visibility") != xVar.f1228a.containsKey("android:visibility:visibility")) {
            return false;
        }
        g0 g0VarJ = J(xVar, xVar2);
        if (g0VarJ.f1166a) {
            return g0VarJ.f1168c == 0 || g0VarJ.f1169d == 0;
        }
        return false;
    }
}
