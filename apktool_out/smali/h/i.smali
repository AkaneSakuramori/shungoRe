.class public final Lh/i;
.super Lh/x;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public A:Landroid/widget/PopupWindow$OnDismissListener;

.field public B:Z

.field public final c:Landroid/content/Context;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Z

.field public final h:Landroid/os/Handler;

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;

.field public final k:Lh/e;

.field public final l:Lh/f;

.field public final m:Le/n0;

.field public n:I

.field public o:I

.field public p:Landroid/view/View;

.field public q:Landroid/view/View;

.field public r:I

.field public s:Z

.field public t:Z

.field public u:I

.field public v:I

.field public w:Z

.field public x:Z

.field public y:Lh/b0;

.field public z:Landroid/view/ViewTreeObserver;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IIZ)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lh/i;->i:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lh/i;->j:Ljava/util/ArrayList;

    new-instance v0, Lh/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lh/e;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lh/i;->k:Lh/e;

    new-instance v0, Lh/f;

    invoke-direct {v0, v1, p0}, Lh/f;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lh/i;->l:Lh/f;

    new-instance v0, Le/n0;

    const/4 v2, 0x2

    invoke-direct {v0, v2, p0}, Le/n0;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lh/i;->m:Le/n0;

    iput v1, p0, Lh/i;->n:I

    iput v1, p0, Lh/i;->o:I

    iput-object p1, p0, Lh/i;->c:Landroid/content/Context;

    iput-object p2, p0, Lh/i;->p:Landroid/view/View;

    iput p3, p0, Lh/i;->e:I

    iput p4, p0, Lh/i;->f:I

    iput-boolean p5, p0, Lh/i;->g:Z

    iput-boolean v1, p0, Lh/i;->w:Z

    sget-object p3, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {p2}, Li0/f0;->d(Landroid/view/View;)I

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    goto :goto_0

    :cond_0
    move v1, p3

    :goto_0
    iput v1, p0, Lh/i;->r:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/2addr p2, v2

    const p3, 0x7f060017

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lh/i;->d:I

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lh/i;->h:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    iget-object v0, p0, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh/h;

    iget-object v0, v0, Lh/h;->a:Li/s2;

    iget-object v0, v0, Li/m2;->A:Li/g0;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method public final b(Lh/o;Z)V
    .locals 7

    iget-object v0, p0, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh/h;

    iget-object v4, v4, Lh/h;->b:Lh/o;

    if-ne p1, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, -0x1

    :goto_1
    if-gez v3, :cond_2

    return-void

    :cond_2
    add-int/lit8 v1, v3, 0x1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh/h;

    iget-object v1, v1, Lh/h;->b:Lh/o;

    invoke-virtual {v1, v2}, Lh/o;->c(Z)V

    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh/h;

    iget-object v3, v1, Lh/h;->b:Lh/o;

    invoke-virtual {v3, p0}, Lh/o;->r(Lh/c0;)V

    iget-boolean v3, p0, Lh/i;->B:Z

    const/4 v4, 0x0

    iget-object v1, v1, Lh/h;->a:Li/s2;

    if-eqz v3, :cond_4

    iget-object v3, v1, Li/m2;->A:Li/g0;

    invoke-static {v3, v4}, Li/o2;->b(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    iget-object v3, v1, Li/m2;->A:Li/g0;

    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    :cond_4
    invoke-virtual {v1}, Li/m2;->dismiss()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x1

    if-lez v1, :cond_5

    add-int/lit8 v5, v1, -0x1

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh/h;

    iget v5, v5, Lh/h;->c:I

    iput v5, p0, Lh/i;->r:I

    goto :goto_3

    :cond_5
    iget-object v5, p0, Lh/i;->p:Landroid/view/View;

    sget-object v6, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v5}, Li0/f0;->d(Landroid/view/View;)I

    move-result v5

    if-ne v5, v3, :cond_6

    move v5, v2

    goto :goto_2

    :cond_6
    move v5, v3

    :goto_2
    iput v5, p0, Lh/i;->r:I

    :goto_3
    if-nez v1, :cond_a

    invoke-virtual {p0}, Lh/i;->dismiss()V

    iget-object p2, p0, Lh/i;->y:Lh/b0;

    if-eqz p2, :cond_7

    invoke-interface {p2, p1, v3}, Lh/b0;->b(Lh/o;Z)V

    :cond_7
    iget-object p1, p0, Lh/i;->z:Landroid/view/ViewTreeObserver;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lh/i;->z:Landroid/view/ViewTreeObserver;

    iget-object p2, p0, Lh/i;->k:Lh/e;

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_8
    iput-object v4, p0, Lh/i;->z:Landroid/view/ViewTreeObserver;

    :cond_9
    iget-object p1, p0, Lh/i;->q:Landroid/view/View;

    iget-object p2, p0, Lh/i;->l:Lh/f;

    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Lh/i;->A:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-interface {p1}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    goto :goto_4

    :cond_a
    if-eqz p2, :cond_b

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh/h;

    iget-object p1, p1, Lh/h;->b:Lh/o;

    invoke-virtual {p1, v2}, Lh/o;->c(Z)V

    :cond_b
    :goto_4
    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh/h;

    iget-object v1, v1, Lh/h;->a:Li/s2;

    iget-object v1, v1, Li/m2;->d:Li/z1;

    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    instance-of v2, v1, Landroid/widget/HeaderViewListAdapter;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    check-cast v1, Lh/l;

    goto :goto_1

    :cond_0
    check-cast v1, Lh/l;

    :goto_1
    invoke-virtual {v1}, Lh/l;->notifyDataSetChanged()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final dismiss()V
    .locals 4

    iget-object v0, p0, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1

    new-array v2, v1, [Lh/h;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh/h;

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    aget-object v2, v0, v1

    iget-object v3, v2, Lh/h;->a:Li/s2;

    iget-object v3, v3, Li/m2;->A:Li/g0;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, v2, Lh/h;->a:Li/s2;

    invoke-virtual {v2}, Li/m2;->dismiss()V

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final e(Lh/b0;)V
    .locals 0

    iput-object p1, p0, Lh/i;->y:Lh/b0;

    return-void
.end method

.method public final f()Li/z1;
    .locals 2

    iget-object v0, p0, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh/h;

    iget-object v0, v0, Lh/h;->a:Li/s2;

    iget-object v0, v0, Li/m2;->d:Li/z1;

    :goto_0
    return-object v0
.end method

.method public final h()V
    .locals 3

    invoke-virtual {p0}, Lh/i;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh/i;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh/o;

    invoke-virtual {p0, v2}, Lh/i;->v(Lh/o;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lh/i;->p:Landroid/view/View;

    iput-object v0, p0, Lh/i;->q:Landroid/view/View;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lh/i;->z:Landroid/view/ViewTreeObserver;

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lh/i;->z:Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lh/i;->k:Lh/e;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_3
    iget-object v0, p0, Lh/i;->q:Landroid/view/View;

    iget-object v1, p0, Lh/i;->l:Lh/f;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_4
    return-void
.end method

.method public final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j(Lh/i0;)Z
    .locals 4

    iget-object v0, p0, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh/h;

    iget-object v3, v1, Lh/h;->b:Lh/o;

    if-ne p1, v3, :cond_0

    iget-object p1, v1, Lh/h;->a:Li/s2;

    iget-object p1, p1, Li/m2;->d:Li/z1;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return v2

    :cond_1
    invoke-virtual {p1}, Lh/o;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1}, Lh/i;->l(Lh/o;)V

    iget-object v0, p0, Lh/i;->y:Lh/b0;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lh/b0;->k(Lh/o;)Z

    :cond_2
    return v2

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final l(Lh/o;)V
    .locals 1

    iget-object v0, p0, Lh/i;->c:Landroid/content/Context;

    invoke-virtual {p1, p0, v0}, Lh/o;->b(Lh/c0;Landroid/content/Context;)V

    invoke-virtual {p0}, Lh/i;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lh/i;->v(Lh/o;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lh/i;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lh/i;->p:Landroid/view/View;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lh/i;->p:Landroid/view/View;

    iget v0, p0, Lh/i;->n:I

    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Li0/f0;->d(Landroid/view/View;)I

    move-result p1

    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p1

    iput p1, p0, Lh/i;->o:I

    :cond_0
    return-void
.end method

.method public final o(Z)V
    .locals 0

    iput-boolean p1, p0, Lh/i;->w:Z

    return-void
.end method

.method public final onDismiss()V
    .locals 6

    iget-object v0, p0, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh/h;

    iget-object v5, v4, Lh/h;->a:Li/s2;

    iget-object v5, v5, Li/m2;->A:Li/g0;

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_2

    iget-object v0, v4, Lh/h;->b:Lh/o;

    invoke-virtual {v0, v2}, Lh/o;->c(Z)V

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

    invoke-virtual {p0}, Lh/i;->dismiss()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final p(I)V
    .locals 2

    iget v0, p0, Lh/i;->n:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lh/i;->n:I

    iget-object v0, p0, Lh/i;->p:Landroid/view/View;

    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Li0/f0;->d(Landroid/view/View;)I

    move-result v0

    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p1

    iput p1, p0, Lh/i;->o:I

    :cond_0
    return-void
.end method

.method public final q(I)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh/i;->s:Z

    iput p1, p0, Lh/i;->u:I

    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Lh/i;->A:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public final s(Z)V
    .locals 0

    iput-boolean p1, p0, Lh/i;->x:Z

    return-void
.end method

.method public final t(I)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh/i;->t:Z

    iput p1, p0, Lh/i;->v:I

    return-void
.end method

.method public final v(Lh/o;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lh/i;->c:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    new-instance v4, Lh/l;

    iget-boolean v5, v0, Lh/i;->g:Z

    const v6, 0x7f0b000b

    invoke-direct {v4, v1, v3, v5, v6}, Lh/l;-><init>(Lh/o;Landroid/view/LayoutInflater;ZI)V

    invoke-virtual/range {p0 .. p0}, Lh/i;->a()Z

    move-result v5

    const/4 v6, 0x1

    if-nez v5, :cond_0

    iget-boolean v5, v0, Lh/i;->w:Z

    if-eqz v5, :cond_0

    iput-boolean v6, v4, Lh/l;->d:Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lh/i;->a()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static/range {p1 .. p1}, Lh/x;->u(Lh/o;)Z

    move-result v5

    iput-boolean v5, v4, Lh/l;->d:Z

    :cond_1
    :goto_0
    iget v5, v0, Lh/i;->d:I

    invoke-static {v4, v2, v5}, Lh/x;->m(Lh/l;Landroid/content/Context;I)I

    move-result v5

    new-instance v7, Li/s2;

    iget v8, v0, Lh/i;->e:I

    iget v9, v0, Lh/i;->f:I

    const/4 v10, 0x0

    invoke-direct {v7, v2, v10, v8, v9}, Li/m2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iget-object v2, v0, Lh/i;->m:Le/n0;

    iput-object v2, v7, Li/s2;->D:Li/n2;

    iput-object v0, v7, Li/m2;->q:Landroid/widget/AdapterView$OnItemClickListener;

    iget-object v2, v7, Li/m2;->A:Li/g0;

    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v2, v0, Lh/i;->p:Landroid/view/View;

    iput-object v2, v7, Li/m2;->p:Landroid/view/View;

    iget v2, v0, Lh/i;->o:I

    iput v2, v7, Li/m2;->m:I

    iput-boolean v6, v7, Li/m2;->z:Z

    iget-object v2, v7, Li/m2;->A:Li/g0;

    invoke-virtual {v2, v6}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    iget-object v2, v7, Li/m2;->A:Li/g0;

    const/4 v8, 0x2

    invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    invoke-virtual {v7, v4}, Li/m2;->n(Landroid/widget/ListAdapter;)V

    invoke-virtual {v7, v5}, Li/m2;->r(I)V

    iget v2, v0, Lh/i;->o:I

    iput v2, v7, Li/m2;->m:I

    iget-object v2, v0, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_a

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v6

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh/h;

    iget-object v11, v4, Lh/h;->b:Lh/o;

    iget-object v12, v11, Lh/o;->f:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v12, :cond_3

    invoke-virtual {v11, v13}, Lh/o;->getItem(I)Landroid/view/MenuItem;

    move-result-object v14

    invoke-interface {v14}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v15

    if-eqz v15, :cond_2

    invoke-interface {v14}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v15

    if-ne v1, v15, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_3
    move-object v14, v10

    :goto_2
    if-nez v14, :cond_4

    move-object v8, v10

    goto :goto_7

    :cond_4
    iget-object v11, v4, Lh/h;->a:Li/s2;

    iget-object v11, v11, Li/m2;->d:Li/z1;

    invoke-virtual {v11}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v12

    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    if-eqz v13, :cond_5

    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    move-result v13

    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v12

    check-cast v12, Lh/l;

    goto :goto_3

    :cond_5
    check-cast v12, Lh/l;

    const/4 v13, 0x0

    :goto_3
    invoke-virtual {v12}, Lh/l;->getCount()I

    move-result v15

    const/4 v8, 0x0

    :goto_4
    const/4 v10, -0x1

    if-ge v8, v15, :cond_7

    invoke-virtual {v12, v8}, Lh/l;->b(I)Lh/q;

    move-result-object v9

    if-ne v14, v9, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_7
    move v8, v10

    :goto_5
    if-ne v8, v10, :cond_8

    goto :goto_6

    :cond_8
    add-int/2addr v8, v13

    invoke-virtual {v11}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v9

    sub-int/2addr v8, v9

    if-ltz v8, :cond_b

    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    if-lt v8, v9, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v11, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    goto :goto_7

    :cond_a
    const/4 v4, 0x0

    :cond_b
    :goto_6
    const/4 v8, 0x0

    :goto_7
    if-eqz v8, :cond_15

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v10, v7, Li/m2;->A:Li/g0;

    const/16 v11, 0x1c

    if-gt v9, v11, :cond_c

    sget-object v9, Li/s2;->E:Ljava/lang/reflect/Method;

    if-eqz v9, :cond_d

    :try_start_0
    new-array v11, v6, [Ljava/lang/Object;

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v13, 0x0

    aput-object v12, v11, v13

    invoke-virtual {v9, v10, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    const-string v9, "MenuPopupWindow"

    const-string v10, "Could not invoke setTouchModal() on PopupWindow. Oh well."

    invoke-static {v9, v10}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_8

    :cond_c
    const/4 v9, 0x0

    invoke-static {v10, v9}, Li/p2;->a(Landroid/widget/PopupWindow;Z)V

    :cond_d
    :goto_8
    iget-object v9, v7, Li/m2;->A:Li/g0;

    const/4 v10, 0x0

    invoke-static {v9, v10}, Li/o2;->a(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    sub-int/2addr v9, v6

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lh/h;

    iget-object v9, v9, Lh/h;->a:Li/s2;

    iget-object v9, v9, Li/m2;->d:Li/z1;

    const/4 v10, 0x2

    new-array v10, v10, [I

    invoke-virtual {v9, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    new-instance v11, Landroid/graphics/Rect;

    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    iget-object v12, v0, Lh/i;->q:Landroid/view/View;

    invoke-virtual {v12, v11}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget v12, v0, Lh/i;->r:I

    if-ne v12, v6, :cond_f

    const/16 v16, 0x0

    aget v10, v10, v16

    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    move-result v9

    add-int/2addr v9, v10

    add-int/2addr v9, v5

    iget v10, v11, Landroid/graphics/Rect;->right:I

    if-le v9, v10, :cond_e

    move/from16 v9, v16

    goto :goto_a

    :cond_e
    :goto_9
    move v9, v6

    goto :goto_a

    :cond_f
    const/16 v16, 0x0

    aget v9, v10, v16

    sub-int/2addr v9, v5

    if-gez v9, :cond_10

    goto :goto_9

    :cond_10
    const/4 v9, 0x0

    :goto_a
    if-ne v9, v6, :cond_11

    move v10, v6

    goto :goto_b

    :cond_11
    const/4 v10, 0x0

    :goto_b
    iput v9, v0, Lh/i;->r:I

    iput-object v8, v7, Li/m2;->p:Landroid/view/View;

    iget v9, v0, Lh/i;->o:I

    const/4 v11, 0x5

    and-int/2addr v9, v11

    if-ne v9, v11, :cond_13

    if-eqz v10, :cond_12

    goto :goto_c

    :cond_12
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v5

    const/4 v8, 0x0

    rsub-int/lit8 v5, v5, 0x0

    goto :goto_c

    :cond_13
    if-eqz v10, :cond_14

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v5

    goto :goto_c

    :cond_14
    rsub-int/lit8 v5, v5, 0x0

    :goto_c
    iput v5, v7, Li/m2;->g:I

    iput-boolean v6, v7, Li/m2;->l:Z

    iput-boolean v6, v7, Li/m2;->k:Z

    const/4 v5, 0x0

    invoke-virtual {v7, v5}, Li/m2;->l(I)V

    goto :goto_e

    :cond_15
    iget-boolean v5, v0, Lh/i;->s:Z

    if-eqz v5, :cond_16

    iget v5, v0, Lh/i;->u:I

    iput v5, v7, Li/m2;->g:I

    :cond_16
    iget-boolean v5, v0, Lh/i;->t:Z

    if-eqz v5, :cond_17

    iget v5, v0, Lh/i;->v:I

    invoke-virtual {v7, v5}, Li/m2;->l(I)V

    :cond_17
    iget-object v5, v0, Lh/x;->b:Landroid/graphics/Rect;

    if-eqz v5, :cond_18

    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10, v5}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_d

    :cond_18
    const/4 v10, 0x0

    :goto_d
    iput-object v10, v7, Li/m2;->y:Landroid/graphics/Rect;

    :goto_e
    new-instance v5, Lh/h;

    iget v6, v0, Lh/i;->r:I

    invoke-direct {v5, v7, v1, v6}, Lh/h;-><init>(Li/s2;Lh/o;I)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Li/m2;->h()V

    iget-object v2, v7, Li/m2;->d:Li/z1;

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    if-nez v4, :cond_19

    iget-boolean v4, v0, Lh/i;->x:Z

    if-eqz v4, :cond_19

    iget-object v4, v1, Lh/o;->m:Ljava/lang/CharSequence;

    if-eqz v4, :cond_19

    const v4, 0x7f0b0012

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    const v4, 0x1020016

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v3, v5}, Landroid/view/View;->setEnabled(Z)V

    iget-object v1, v1, Lh/o;->m:Ljava/lang/CharSequence;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    invoke-virtual {v2, v3, v1, v5}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    invoke-virtual {v7}, Li/m2;->h()V

    :cond_19
    return-void
.end method
