.class public Lcom/google/android/material/carousel/CarouselLayoutManager;
.super Ly0/o0;
.source "SourceFile"

# interfaces
.implements Ly0/z0;


# instance fields
.field public p:Lt1/c;

.field public final q:Lt1/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ly0/o0;-><init>()V

    .line 2
    new-instance v0, Lt1/b;

    invoke-direct {v0}, Lt1/b;-><init>()V

    .line 3
    new-instance v0, Lt1/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt1/a;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;I)V

    iput-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->q:Lt1/a;

    .line 4
    invoke-virtual {p0}, Ly0/o0;->j0()V

    .line 5
    invoke-virtual {p0, v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->F0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Ly0/o0;-><init>()V

    .line 7
    new-instance p3, Lt1/b;

    invoke-direct {p3}, Lt1/b;-><init>()V

    .line 8
    new-instance p3, Lt1/a;

    const/4 p4, 0x1

    invoke-direct {p3, p0, p4}, Lt1/a;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;I)V

    iput-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->q:Lt1/a;

    .line 9
    invoke-virtual {p0}, Ly0/o0;->j0()V

    if-eqz p2, :cond_0

    sget-object p3, Ln1/a;->b:[I

    .line 10
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    .line 11
    invoke-virtual {p1, p2, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 12
    invoke-virtual {p0}, Ly0/o0;->j0()V

    .line 13
    invoke-virtual {p1, p2, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->F0(I)V

    .line 14
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    return-void
.end method

.method public static A0(FLi/a0;)F
    .locals 4

    iget-object v0, p1, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Lt1/e;

    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Li/a0;->d:Ljava/lang/Object;

    check-cast p1, Lt1/e;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v3, v0, p0}, Lo1/a;->b(FFFFF)F

    move-result p0

    return p0
.end method

.method public static B0(FLjava/util/List;Z)Li/a0;
    .locals 13

    const/4 v0, -0x1

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    const v2, -0x800001

    const/4 v3, 0x0

    move v6, v0

    move v7, v6

    move v8, v7

    move v9, v8

    move v4, v2

    move v5, v3

    move v2, v1

    move v3, v2

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v10

    if-ge v5, v10, :cond_4

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lt1/e;

    const/4 v11, 0x0

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sub-float v10, v11, p0

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    cmpg-float v12, v11, p0

    if-gtz v12, :cond_0

    cmpg-float v12, v10, v1

    if-gtz v12, :cond_0

    move v6, v5

    move v1, v10

    :cond_0
    cmpl-float v12, v11, p0

    if-lez v12, :cond_1

    cmpg-float v12, v10, v2

    if-gtz v12, :cond_1

    move v8, v5

    move v2, v10

    :cond_1
    cmpg-float v10, v11, v3

    if-gtz v10, :cond_2

    move v7, v5

    move v3, v11

    :cond_2
    cmpl-float v10, v11, v4

    if-lez v10, :cond_3

    move v9, v5

    move v4, v11

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    if-ne v6, v0, :cond_5

    move v6, v7

    :cond_5
    if-ne v8, v0, :cond_6

    move v8, v9

    :cond_6
    new-instance p0, Li/a0;

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lt1/e;

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt1/e;

    invoke-direct {p0, p2, p1}, Li/a0;-><init>(Lt1/e;Lt1/e;)V

    return-object p0
.end method


# virtual methods
.method public final C0()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->p:Lt1/c;

    iget v0, v0, Lt1/d;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final D0()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->C0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly0/o0;->A()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final E0()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final F0(I)V
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid orientation:"

    invoke-static {v1, p1}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ly0/o0;->c(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->p:Lt1/c;

    if-eqz v1, :cond_2

    iget v1, v1, Lt1/d;->a:I

    if-eq p1, v1, :cond_5

    :cond_2
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    if-ne p1, v0, :cond_3

    new-instance p1, Lt1/c;

    invoke-direct {p1, v0, p0, v1}, Lt1/c;-><init>(ILcom/google/android/material/carousel/CarouselLayoutManager;I)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid orientation"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lt1/c;

    invoke-direct {p1, v1, p0, v0}, Lt1/c;-><init>(ILcom/google/android/material/carousel/CarouselLayoutManager;I)V

    :goto_1
    iput-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->p:Lt1/c;

    invoke-virtual {p0}, Ly0/o0;->j0()V

    :cond_5
    return-void
.end method

.method public final O(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    invoke-virtual {p0}, Ly0/o0;->j0()V

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->q:Lt1/a;

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public final P(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->q:Lt1/a;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public final Q(Landroid/view/View;ILy0/v0;Ly0/a1;)Landroid/view/View;
    .locals 5

    invoke-virtual {p0}, Ly0/o0;->v()I

    move-result p4

    const/4 v0, 0x0

    if-nez p4, :cond_0

    return-object v0

    :cond_0
    iget-object p4, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->p:Lt1/c;

    iget p4, p4, Lt1/d;->a:I

    const/high16 v1, -0x80000000

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eq p2, v3, :cond_7

    const/4 v4, 0x2

    if-eq p2, v4, :cond_6

    const/16 v4, 0x11

    if-eq p2, v4, :cond_5

    const/16 v4, 0x21

    if-eq p2, v4, :cond_4

    const/16 v4, 0x42

    if-eq p2, v4, :cond_3

    const/16 v4, 0x82

    if-eq p2, v4, :cond_2

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v4, "Unknown focus request:"

    invoke-direct {p4, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p4, "CarouselLayoutManager"

    invoke-static {p4, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    move p2, v1

    goto :goto_2

    :cond_2
    if-ne p4, v3, :cond_1

    goto :goto_0

    :cond_3
    if-nez p4, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->D0()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_1

    :cond_4
    if-ne p4, v3, :cond_1

    goto :goto_1

    :cond_5
    if-nez p4, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->D0()Z

    move-result p2

    if-eqz p2, :cond_7

    :cond_6
    :goto_0
    move p2, v3

    goto :goto_2

    :cond_7
    :goto_1
    move p2, v2

    :goto_2
    if-ne p2, v1, :cond_8

    return-object v0

    :cond_8
    const/4 p4, 0x0

    if-ne p2, v2, :cond_d

    invoke-static {p1}, Ly0/o0;->F(Landroid/view/View;)I

    move-result p1

    if-nez p1, :cond_9

    return-object v0

    :cond_9
    invoke-virtual {p0, p4}, Ly0/o0;->u(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Ly0/o0;->F(Landroid/view/View;)I

    move-result p1

    sub-int/2addr p1, v3

    if-ltz p1, :cond_b

    invoke-virtual {p0}, Ly0/o0;->z()I

    move-result p2

    if-lt p1, p2, :cond_a

    goto :goto_3

    :cond_a
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->y0(I)V

    invoke-virtual {p3, p1}, Ly0/v0;->d(I)Landroid/view/View;

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->E0()V

    throw v0

    :cond_b
    :goto_3
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->D0()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Ly0/o0;->v()I

    move-result p1

    add-int/lit8 p4, p1, -0x1

    :cond_c
    invoke-virtual {p0, p4}, Ly0/o0;->u(I)Landroid/view/View;

    move-result-object p1

    goto :goto_6

    :cond_d
    invoke-static {p1}, Ly0/o0;->F(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p0}, Ly0/o0;->z()I

    move-result p2

    sub-int/2addr p2, v3

    if-ne p1, p2, :cond_e

    return-object v0

    :cond_e
    invoke-virtual {p0}, Ly0/o0;->v()I

    move-result p1

    sub-int/2addr p1, v3

    invoke-virtual {p0, p1}, Ly0/o0;->u(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Ly0/o0;->F(Landroid/view/View;)I

    move-result p1

    add-int/2addr p1, v3

    if-ltz p1, :cond_10

    invoke-virtual {p0}, Ly0/o0;->z()I

    move-result p2

    if-lt p1, p2, :cond_f

    goto :goto_4

    :cond_f
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->y0(I)V

    invoke-virtual {p3, p1}, Ly0/v0;->d(I)Landroid/view/View;

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->E0()V

    throw v0

    :cond_10
    :goto_4
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->D0()Z

    move-result p1

    if-eqz p1, :cond_11

    goto :goto_5

    :cond_11
    invoke-virtual {p0}, Ly0/o0;->v()I

    move-result p1

    add-int/lit8 p4, p1, -0x1

    :goto_5
    invoke-virtual {p0, p4}, Ly0/o0;->u(I)Landroid/view/View;

    move-result-object p1

    :goto_6
    return-object p1
.end method

.method public final R(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Ly0/o0;->R(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, Ly0/o0;->v()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly0/o0;->u(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Ly0/o0;->F(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p0}, Ly0/o0;->v()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ly0/o0;->u(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Ly0/o0;->F(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_0
    return-void
.end method

.method public final U(II)V
    .locals 0

    invoke-virtual {p0}, Ly0/o0;->z()I

    return-void
.end method

.method public final X(II)V
    .locals 0

    invoke-virtual {p0}, Ly0/o0;->z()I

    return-void
.end method

.method public final Z(Ly0/v0;Ly0/a1;)V
    .locals 1

    invoke-virtual {p2}, Ly0/a1;->b()I

    move-result p2

    if-lez p2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->z0()I

    move-result p2

    int-to-float p2, p2

    const/4 v0, 0x0

    cmpg-float p2, p2, v0

    if-gtz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->D0()Z

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ly0/v0;->d(I)Landroid/view/View;

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->E0()V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ly0/o0;->e0(Ly0/v0;)V

    return-void
.end method

.method public final a(I)Landroid/graphics/PointF;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final a0(Ly0/a1;)V
    .locals 0

    invoke-virtual {p0}, Ly0/o0;->v()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ly0/o0;->u(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Ly0/o0;->F(Landroid/view/View;)I

    :goto_0
    return-void
.end method

.method public final d()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->C0()Z

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->C0()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final i0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final j(Ly0/a1;)I
    .locals 0

    invoke-virtual {p0}, Ly0/o0;->v()I

    const/4 p1, 0x0

    return p1
.end method

.method public final k(Ly0/a1;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final k0(ILy0/v0;Ly0/a1;)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->C0()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Ly0/o0;->v()I

    move-result p3

    if-eqz p3, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v0}, Ly0/v0;->d(I)Landroid/view/View;

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->E0()V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return v0
.end method

.method public final l(Ly0/a1;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final l0(I)V
    .locals 0

    return-void
.end method

.method public final m(Ly0/a1;)I
    .locals 0

    invoke-virtual {p0}, Ly0/o0;->v()I

    const/4 p1, 0x0

    return p1
.end method

.method public final m0(ILy0/v0;Ly0/a1;)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Ly0/o0;->v()I

    move-result p3

    if-eqz p3, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v0}, Ly0/v0;->d(I)Landroid/view/View;

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->E0()V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return v0
.end method

.method public final n(Ly0/a1;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final o(Ly0/a1;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final r()Ly0/p0;
    .locals 2

    new-instance v0, Ly0/p0;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Ly0/p0;-><init>(II)V

    return-object v0
.end method

.method public final v0(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 2

    new-instance v0, Ly0/c0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Ly0/c0;-><init>(Ljava/lang/Object;Landroid/content/Context;I)V

    iput p2, v0, Ly0/z;->a:I

    invoke-virtual {p0, v0}, Ly0/o0;->w0(Ly0/z;)V

    return-void
.end method

.method public final y(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1, p2}, Ly0/o0;->y(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->C0()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method public final y0(I)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->p:Lt1/c;

    iget v0, p1, Lt1/c;->b:I

    iget-object v1, p1, Lt1/c;->c:Lcom/google/android/material/carousel/CarouselLayoutManager;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->D0()Z

    move-result v0

    if-nez v0, :cond_0

    iget p1, p1, Lt1/c;->b:I

    packed-switch p1, :pswitch_data_1

    goto :goto_0

    :pswitch_0
    invoke-virtual {v1}, Ly0/o0;->C()I

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lt1/c;->a()I

    goto :goto_0

    :pswitch_1
    packed-switch v0, :pswitch_data_2

    invoke-virtual {v1}, Ly0/o0;->E()I

    :goto_0
    :pswitch_2
    const/4 p1, 0x0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method

.method public final z0()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->C0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ly0/o0;->n:I

    return v0

    :cond_0
    iget v0, p0, Ly0/o0;->o:I

    return v0
.end method
