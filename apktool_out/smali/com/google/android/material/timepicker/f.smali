.class public abstract Lcom/google/android/material/timepicker/f;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final t:Lcom/google/android/material/timepicker/e;

.field public u:I

.field public final v:Lf2/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const v0, 0x7f0302ee

    invoke-direct {p0, p1, p2, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0b003d

    invoke-virtual {v1, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    new-instance v1, Lf2/h;

    invoke-direct {v1}, Lf2/h;-><init>()V

    iput-object v1, p0, Lcom/google/android/material/timepicker/f;->v:Lf2/h;

    new-instance v2, Lf2/i;

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-direct {v2, v3}, Lf2/i;-><init>(F)V

    iget-object v3, v1, Lf2/h;->b:Lf2/g;

    iget-object v3, v3, Lf2/g;->a:Lf2/l;

    invoke-virtual {v3}, Lf2/l;->e()Lf2/k;

    move-result-object v3

    iput-object v2, v3, Lf2/k;->e:Lf2/c;

    iput-object v2, v3, Lf2/k;->f:Lf2/c;

    iput-object v2, v3, Lf2/k;->g:Lf2/c;

    iput-object v2, v3, Lf2/k;->h:Lf2/c;

    invoke-virtual {v3}, Lf2/k;->a()Lf2/l;

    move-result-object v2

    invoke-virtual {v1, v2}, Lf2/h;->setShapeAppearanceModel(Lf2/l;)V

    iget-object v1, p0, Lcom/google/android/material/timepicker/f;->v:Lf2/h;

    const/4 v2, -0x1

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Lf2/h;->k(Landroid/content/res/ColorStateList;)V

    iget-object v1, p0, Lcom/google/android/material/timepicker/f;->v:Lf2/h;

    sget-object v2, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {p0, v1}, Li0/e0;->q(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    sget-object v1, Ln1/a;->t:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/material/timepicker/f;->u:I

    new-instance p2, Lcom/google/android/material/timepicker/e;

    invoke-direct {p2, p0}, Lcom/google/android/material/timepicker/e;-><init>(Lcom/google/android/material/timepicker/f;)V

    iput-object p2, p0, Lcom/google/android/material/timepicker/f;->t:Lcom/google/android/material/timepicker/e;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_0

    sget-object p2, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {}, Li0/f0;->a()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setId(I)V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/google/android/material/timepicker/f;->t:Lcom/google/android/material/timepicker/e;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public abstract n()V
.end method

.method public final onFinishInflate()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    invoke-virtual {p0}, Lcom/google/android/material/timepicker/f;->n()V

    return-void
.end method

.method public final onViewRemoved(Landroid/view/View;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/material/timepicker/f;->t:Lcom/google/android/material/timepicker/e;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final setBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/timepicker/f;->v:Lf2/h;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf2/h;->k(Landroid/content/res/ColorStateList;)V

    return-void
.end method
