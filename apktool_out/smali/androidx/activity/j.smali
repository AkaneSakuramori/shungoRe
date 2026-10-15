.class public final Landroidx/activity/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/activity/j;->b:I

    iput-object p2, p0, Landroidx/activity/j;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    iget v0, p0, Landroidx/activity/j;->b:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object v0, p0, Landroidx/activity/j;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Li2/n;

    iget-object v0, v0, Li2/n;->h:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/activity/j;->c:Ljava/lang/Object;

    check-cast v0, Lr1/d;

    iput-boolean v1, v0, Lr1/d;->c:Z

    iget-object v1, v0, Lr1/d;->e:Lw/a;

    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v1, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:Lp0/e;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lp0/e;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v0, Lr1/d;->b:I

    invoke-virtual {v0, v1}, Lr1/d;->a(I)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lr1/d;->e:Lw/a;

    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    iget v0, v0, Lr1/d;->b:I

    invoke-virtual {v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(I)V

    :cond_1
    :goto_0
    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/activity/j;->c:Ljava/lang/Object;

    check-cast v0, Lp0/e;

    invoke-virtual {v0, v1}, Lp0/e;->n(I)V

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/activity/j;->c:Ljava/lang/Object;

    check-cast v0, Lm0/g;

    iget-boolean v2, v0, Lm0/g;->p:Z

    if-nez v2, :cond_2

    goto/16 :goto_2

    :cond_2
    iget-boolean v2, v0, Lm0/g;->n:Z

    if-eqz v2, :cond_3

    iput-boolean v1, v0, Lm0/g;->n:Z

    iget-object v2, v0, Lm0/g;->b:Lm0/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Lm0/a;->e:J

    const-wide/16 v5, -0x1

    iput-wide v5, v2, Lm0/a;->g:J

    iput-wide v3, v2, Lm0/a;->f:J

    const/high16 v3, 0x3f000000    # 0.5f

    iput v3, v2, Lm0/a;->h:F

    :cond_3
    iget-object v2, v0, Lm0/g;->b:Lm0/a;

    iget-wide v3, v2, Lm0/a;->g:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-lez v3, :cond_4

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v3

    iget-wide v7, v2, Lm0/a;->g:J

    iget v9, v2, Lm0/a;->i:I

    int-to-long v9, v9

    add-long/2addr v7, v9

    cmp-long v3, v3, v7

    if-lez v3, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lm0/g;->f()Z

    move-result v3

    if-nez v3, :cond_5

    :goto_1
    iput-boolean v1, v0, Lm0/g;->p:Z

    goto :goto_2

    :cond_5
    iget-boolean v3, v0, Lm0/g;->o:Z

    if-eqz v3, :cond_6

    iput-boolean v1, v0, Lm0/g;->o:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-wide v7, v9

    invoke-static/range {v7 .. v14}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v1

    iget-object v3, v0, Lm0/g;->d:Landroid/view/View;

    invoke-virtual {v3, v1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    :cond_6
    iget-wide v3, v2, Lm0/a;->f:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lm0/a;->a(J)F

    move-result v1

    const/high16 v5, -0x3f800000    # -4.0f

    mul-float/2addr v5, v1

    mul-float/2addr v5, v1

    const/high16 v6, 0x40800000    # 4.0f

    mul-float/2addr v1, v6

    add-float/2addr v1, v5

    iget-wide v5, v2, Lm0/a;->f:J

    sub-long v5, v3, v5

    iput-wide v3, v2, Lm0/a;->f:J

    long-to-float v3, v5

    mul-float/2addr v3, v1

    iget v1, v2, Lm0/a;->d:F

    mul-float/2addr v3, v1

    float-to-int v1, v3

    iget-object v2, v0, Lm0/g;->r:Landroid/widget/ListView;

    invoke-static {v2, v1}, Lm0/h;->b(Landroid/widget/ListView;I)V

    iget-object v0, v0, Lm0/g;->d:Landroid/view/View;

    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0, p0}, Li0/e0;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    :goto_2
    return-void

    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot compute scroll delta before calling start()"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_4
    iget-object v0, p0, Landroidx/activity/j;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_8

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->u:Li/m;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Li/m;->l()Z

    :cond_8
    return-void

    :pswitch_5
    iget-object v0, p0, Landroidx/activity/j;->c:Ljava/lang/Object;

    check-cast v0, Li/z1;

    const/4 v1, 0x0

    iput-object v1, v0, Li/z1;->m:Landroidx/activity/j;

    invoke-virtual {v0}, Li/z1;->drawableStateChanged()V

    return-void

    :pswitch_6
    iget-object v0, p0, Landroidx/activity/j;->c:Ljava/lang/Object;

    check-cast v0, Lf/b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf/b;->a(Z)V

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    :pswitch_7
    :try_start_0
    iget-object v0, p0, Landroidx/activity/j;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/n;

    invoke-static {v0}, Landroidx/activity/n;->g(Landroidx/activity/n;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_4

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference"

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_5

    :cond_9
    throw v0

    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Can not perform this action after onSaveInstanceState"

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_5
    return-void

    :cond_a
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
