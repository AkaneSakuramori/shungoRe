.class public final Lg2/c;
.super Lc3/h;
.source "SourceFile"


# instance fields
.field public final synthetic j:Lcom/google/android/material/sidesheet/SideSheetBehavior;


# direct methods
.method public constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/c;->j:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    return-void
.end method


# virtual methods
.method public final H2(Landroid/view/View;I)Z
    .locals 3

    iget-object p2, p0, Lg2/c;->j:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget v0, p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    iget-object p2, p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p1, :cond_1

    move v1, v2

    :cond_1
    return v1
.end method

.method public final N1(I)V
    .locals 2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lg2/c;->j:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-boolean v1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->g:Z

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    :cond_0
    return-void
.end method

.method public final O1(Landroid/view/View;II)V
    .locals 6

    iget-object p3, p0, Lg2/c;->j:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v0, p3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->q:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v2, :cond_2

    iget-object v3, p3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lg2/a;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result p1

    iget v5, v3, Lg2/a;->j:I

    iget-object v3, v3, Lg2/a;->k:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    packed-switch v5, :pswitch_data_0

    iget p1, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    if-gt v4, p1, :cond_1

    sub-int/2addr p1, v4

    iput p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_1

    :pswitch_0
    iget v3, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    if-gt v4, v3, :cond_1

    iput p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :cond_1
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    iget-object p1, p3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u:Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object p3, p3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lg2/a;

    invoke-virtual {p3, p2}, Lg2/a;->Q2(I)F

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La;->n(Ljava/lang/Object;)V

    throw v1

    :cond_4
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final P1(Landroid/view/View;FF)V
    .locals 4

    iget-object v0, p0, Lg2/c;->j:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lg2/a;

    invoke-virtual {v1, p2}, Lg2/a;->T2(F)Z

    move-result v1

    const/4 v2, 0x3

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lg2/a;

    invoke-virtual {v1, p1, p2}, Lg2/a;->W2(Landroid/view/View;F)Z

    move-result v1

    const/4 v3, 0x5

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lg2/a;

    invoke-virtual {v1, p2, p3}, Lg2/a;->V2(FF)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lg2/a;

    invoke-virtual {p2, p1}, Lg2/a;->U2(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_1
    :goto_0
    move v2, v3

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    cmpl-float v1, p2, v1

    if-eqz v1, :cond_3

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpl-float p2, p2, p3

    if-lez p2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    iget-object p3, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lg2/a;

    invoke-virtual {p3}, Lg2/a;->R2()I

    move-result p3

    sub-int p3, p2, p3

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lg2/a;

    invoke-virtual {v1}, Lg2/a;->S2()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-ge p3, p2, :cond_1

    :cond_4
    :goto_1
    const/4 p2, 0x1

    invoke-virtual {v0, p1, v2, p2}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t(Landroid/view/View;IZ)V

    return-void
.end method

.method public final e1(Landroid/view/View;)I
    .locals 1

    iget-object p1, p0, Lg2/c;->j:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget v0, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->l:I

    iget p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->o:I

    add-int/2addr v0, p1

    return v0
.end method

.method public final g0(Landroid/view/View;I)I
    .locals 2

    iget-object p1, p0, Lg2/c;->j:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v0, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lg2/a;

    iget v1, v0, Lg2/a;->j:I

    packed-switch v1, :pswitch_data_0

    invoke-virtual {v0}, Lg2/a;->R2()I

    move-result v0

    goto :goto_0

    :pswitch_0
    iget-object v0, v0, Lg2/a;->k:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget v0, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->l:I

    neg-int v0, v0

    :goto_0
    iget-object p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lg2/a;

    iget v1, p1, Lg2/a;->j:I

    iget-object p1, p1, Lg2/a;->k:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    packed-switch v1, :pswitch_data_1

    iget p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    goto :goto_1

    :pswitch_1
    iget p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->o:I

    :goto_1
    invoke-static {p2, v0, p1}, Lc3/h;->f0(III)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method

.method public final h0(Landroid/view/View;I)I
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    return p1
.end method
