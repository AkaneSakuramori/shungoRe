.class public final Lh/h0;
.super Lh/x;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Lh/o;

.field public final e:Lh/l;

.field public final f:Z

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:Li/s2;

.field public final k:Lh/e;

.field public final l:Lh/f;

.field public m:Landroid/widget/PopupWindow$OnDismissListener;

.field public n:Landroid/view/View;

.field public o:Landroid/view/View;

.field public p:Lh/b0;

.field public q:Landroid/view/ViewTreeObserver;

.field public r:Z

.field public s:Z

.field public t:I

.field public u:I

.field public v:Z


# direct methods
.method public constructor <init>(IILandroid/content/Context;Landroid/view/View;Lh/o;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Lh/e;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lh/h0;->k:Lh/e;

    new-instance v0, Lh/f;

    invoke-direct {v0, v1, p0}, Lh/f;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lh/h0;->l:Lh/f;

    const/4 v0, 0x0

    iput v0, p0, Lh/h0;->u:I

    iput-object p3, p0, Lh/h0;->c:Landroid/content/Context;

    iput-object p5, p0, Lh/h0;->d:Lh/o;

    iput-boolean p6, p0, Lh/h0;->f:Z

    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    new-instance v1, Lh/l;

    const v2, 0x7f0b0013

    invoke-direct {v1, p5, v0, p6, v2}, Lh/l;-><init>(Lh/o;Landroid/view/LayoutInflater;ZI)V

    iput-object v1, p0, Lh/h0;->e:Lh/l;

    iput p1, p0, Lh/h0;->h:I

    iput p2, p0, Lh/h0;->i:I

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p6

    invoke-virtual {p6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v0, v0, 0x2

    const v1, 0x7f060017

    invoke-virtual {p6, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p6

    invoke-static {v0, p6}, Ljava/lang/Math;->max(II)I

    move-result p6

    iput p6, p0, Lh/h0;->g:I

    iput-object p4, p0, Lh/h0;->n:Landroid/view/View;

    new-instance p4, Li/s2;

    const/4 p6, 0x0

    invoke-direct {p4, p3, p6, p1, p2}, Li/m2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object p4, p0, Lh/h0;->j:Li/s2;

    invoke-virtual {p5, p0, p3}, Lh/o;->b(Lh/c0;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lh/h0;->r:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/h0;->j:Li/s2;

    iget-object v0, v0, Li/m2;->A:Li/g0;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b(Lh/o;Z)V
    .locals 1

    iget-object v0, p0, Lh/h0;->d:Lh/o;

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lh/h0;->dismiss()V

    iget-object v0, p0, Lh/h0;->p:Lh/b0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lh/b0;->b(Lh/o;Z)V

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh/h0;->s:Z

    iget-object v0, p0, Lh/h0;->e:Lh/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh/l;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final dismiss()V
    .locals 1

    invoke-virtual {p0}, Lh/h0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh/h0;->j:Li/s2;

    invoke-virtual {v0}, Li/m2;->dismiss()V

    :cond_0
    return-void
.end method

.method public final e(Lh/b0;)V
    .locals 0

    iput-object p1, p0, Lh/h0;->p:Lh/b0;

    return-void
.end method

.method public final f()Li/z1;
    .locals 1

    iget-object v0, p0, Lh/h0;->j:Li/s2;

    iget-object v0, v0, Li/m2;->d:Li/z1;

    return-object v0
.end method

.method public final h()V
    .locals 8

    invoke-virtual {p0}, Lh/h0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-boolean v0, p0, Lh/h0;->r:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Lh/h0;->n:Landroid/view/View;

    if-eqz v0, :cond_7

    iput-object v0, p0, Lh/h0;->o:Landroid/view/View;

    iget-object v0, p0, Lh/h0;->j:Li/s2;

    iget-object v1, v0, Li/m2;->A:Li/g0;

    invoke-virtual {v1, p0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    iput-object p0, v0, Li/m2;->q:Landroid/widget/AdapterView$OnItemClickListener;

    const/4 v1, 0x1

    iput-boolean v1, v0, Li/m2;->z:Z

    iget-object v2, v0, Li/m2;->A:Li/g0;

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    iget-object v2, p0, Lh/h0;->o:Landroid/view/View;

    iget-object v3, p0, Lh/h0;->q:Landroid/view/ViewTreeObserver;

    const/4 v4, 0x0

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v4

    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v5

    iput-object v5, p0, Lh/h0;->q:Landroid/view/ViewTreeObserver;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lh/h0;->k:Lh/e;

    invoke-virtual {v5, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_2
    iget-object v3, p0, Lh/h0;->l:Lh/f;

    invoke-virtual {v2, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iput-object v2, v0, Li/m2;->p:Landroid/view/View;

    iget v2, p0, Lh/h0;->u:I

    iput v2, v0, Li/m2;->m:I

    iget-boolean v2, p0, Lh/h0;->s:Z

    iget-object v3, p0, Lh/h0;->c:Landroid/content/Context;

    iget-object v5, p0, Lh/h0;->e:Lh/l;

    if-nez v2, :cond_3

    iget v2, p0, Lh/h0;->g:I

    invoke-static {v5, v3, v2}, Lh/x;->m(Lh/l;Landroid/content/Context;I)I

    move-result v2

    iput v2, p0, Lh/h0;->t:I

    iput-boolean v1, p0, Lh/h0;->s:Z

    :cond_3
    iget v1, p0, Lh/h0;->t:I

    invoke-virtual {v0, v1}, Li/m2;->r(I)V

    const/4 v1, 0x2

    iget-object v2, v0, Li/m2;->A:Li/g0;

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    iget-object v1, p0, Lh/x;->b:Landroid/graphics/Rect;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_1

    :cond_4
    move-object v6, v2

    :goto_1
    iput-object v6, v0, Li/m2;->y:Landroid/graphics/Rect;

    invoke-virtual {v0}, Li/m2;->h()V

    iget-object v1, v0, Li/m2;->d:Li/z1;

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-boolean v6, p0, Lh/h0;->v:Z

    if-eqz v6, :cond_6

    iget-object v6, p0, Lh/h0;->d:Lh/o;

    iget-object v7, v6, Lh/o;->m:Ljava/lang/CharSequence;

    if-eqz v7, :cond_6

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v7, 0x7f0b0012

    invoke-virtual {v3, v7, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    const v7, 0x1020016

    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_5

    iget-object v6, v6, Lh/o;->m:Ljava/lang/CharSequence;

    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    invoke-virtual {v3, v4}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {v1, v3, v2, v4}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    :cond_6
    invoke-virtual {v0, v5}, Li/m2;->n(Landroid/widget/ListAdapter;)V

    invoke-virtual {v0}, Li/m2;->h()V

    :goto_2
    return-void

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "StandardMenuPopup cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j(Lh/i0;)Z
    .locals 9

    invoke-virtual {p1}, Lh/o;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    new-instance v0, Lh/a0;

    iget-object v5, p0, Lh/h0;->c:Landroid/content/Context;

    iget-object v6, p0, Lh/h0;->o:Landroid/view/View;

    iget-boolean v8, p0, Lh/h0;->f:Z

    iget v3, p0, Lh/h0;->h:I

    iget v4, p0, Lh/h0;->i:I

    move-object v2, v0

    move-object v7, p1

    invoke-direct/range {v2 .. v8}, Lh/a0;-><init>(IILandroid/content/Context;Landroid/view/View;Lh/o;Z)V

    iget-object v2, p0, Lh/h0;->p:Lh/b0;

    iput-object v2, v0, Lh/a0;->i:Lh/b0;

    iget-object v3, v0, Lh/a0;->j:Lh/x;

    if-eqz v3, :cond_0

    invoke-interface {v3, v2}, Lh/c0;->e(Lh/b0;)V

    :cond_0
    invoke-static {p1}, Lh/x;->u(Lh/o;)Z

    move-result v2

    iput-boolean v2, v0, Lh/a0;->h:Z

    iget-object v3, v0, Lh/a0;->j:Lh/x;

    if-eqz v3, :cond_1

    invoke-virtual {v3, v2}, Lh/x;->o(Z)V

    :cond_1
    iget-object v2, p0, Lh/h0;->m:Landroid/widget/PopupWindow$OnDismissListener;

    iput-object v2, v0, Lh/a0;->k:Landroid/widget/PopupWindow$OnDismissListener;

    const/4 v2, 0x0

    iput-object v2, p0, Lh/h0;->m:Landroid/widget/PopupWindow$OnDismissListener;

    iget-object v2, p0, Lh/h0;->d:Lh/o;

    invoke-virtual {v2, v1}, Lh/o;->c(Z)V

    iget-object v2, p0, Lh/h0;->j:Li/s2;

    iget v3, v2, Li/m2;->g:I

    invoke-virtual {v2}, Li/m2;->j()I

    move-result v2

    iget v4, p0, Lh/h0;->u:I

    iget-object v5, p0, Lh/h0;->n:Landroid/view/View;

    sget-object v6, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v5}, Li0/f0;->d(Landroid/view/View;)I

    move-result v5

    invoke-static {v4, v5}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v4

    and-int/lit8 v4, v4, 0x7

    const/4 v5, 0x5

    if-ne v4, v5, :cond_2

    iget-object v4, p0, Lh/h0;->n:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v3, v4

    :cond_2
    invoke-virtual {v0}, Lh/a0;->b()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    iget-object v4, v0, Lh/a0;->f:Landroid/view/View;

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v0, v3, v2, v5, v5}, Lh/a0;->d(IIZZ)V

    :goto_0
    iget-object v0, p0, Lh/h0;->p:Lh/b0;

    if-eqz v0, :cond_5

    invoke-interface {v0, p1}, Lh/b0;->k(Lh/o;)Z

    :cond_5
    return v5

    :cond_6
    :goto_1
    return v1
.end method

.method public final l(Lh/o;)V
    .locals 0

    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lh/h0;->n:Landroid/view/View;

    return-void
.end method

.method public final o(Z)V
    .locals 1

    iget-object v0, p0, Lh/h0;->e:Lh/l;

    iput-boolean p1, v0, Lh/l;->d:Z

    return-void
.end method

.method public final onDismiss()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh/h0;->r:Z

    iget-object v1, p0, Lh/h0;->d:Lh/o;

    invoke-virtual {v1, v0}, Lh/o;->c(Z)V

    iget-object v0, p0, Lh/h0;->q:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/h0;->o:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lh/h0;->q:Landroid/view/ViewTreeObserver;

    :cond_0
    iget-object v0, p0, Lh/h0;->q:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Lh/h0;->k:Lh/e;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lh/h0;->q:Landroid/view/ViewTreeObserver;

    :cond_1
    iget-object v0, p0, Lh/h0;->o:Landroid/view/View;

    iget-object v1, p0, Lh/h0;->l:Lh/f;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Lh/h0;->m:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    const/16 p1, 0x52

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lh/h0;->dismiss()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final p(I)V
    .locals 0

    iput p1, p0, Lh/h0;->u:I

    return-void
.end method

.method public final q(I)V
    .locals 1

    iget-object v0, p0, Lh/h0;->j:Li/s2;

    iput p1, v0, Li/m2;->g:I

    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Lh/h0;->m:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public final s(Z)V
    .locals 0

    iput-boolean p1, p0, Lh/h0;->v:Z

    return-void
.end method

.method public final t(I)V
    .locals 1

    iget-object v0, p0, Lh/h0;->j:Li/s2;

    invoke-virtual {v0, p1}, Li/m2;->l(I)V

    return-void
.end method
