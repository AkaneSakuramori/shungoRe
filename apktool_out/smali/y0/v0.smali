.class public final Ly0/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/List;

.field public e:I

.field public f:I

.field public g:Ly0/u0;

.field public final synthetic h:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/v0;->h:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ly0/v0;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Ly0/v0;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ly0/v0;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ly0/v0;->d:Ljava/util/List;

    const/4 p1, 0x2

    iput p1, p0, Ly0/v0;->e:I

    iput p1, p0, Ly0/v0;->f:I

    return-void
.end method


# virtual methods
.method public final a(Ly0/d1;Z)V
    .locals 5

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Ly0/d1;)V

    iget-object v0, p0, Ly0/v0;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->k0:Ly0/f1;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v1, Ly0/f1;->e:Ly0/e1;

    instance-of v3, v1, Ly0/e1;

    iget-object v4, p1, Ly0/d1;->a:Landroid/view/View;

    if-eqz v3, :cond_0

    iget-object v1, v1, Ly0/e1;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v1, v4}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li0/c;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {v4, v1}, Li0/v0;->l(Landroid/view/View;Li0/c;)V

    :cond_1
    if-eqz p2, :cond_2

    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:Ly0/a1;

    if-eqz p2, :cond_2

    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->g:Lj1/b0;

    invoke-virtual {p2, p1}, Lj1/b0;->p(Ly0/d1;)V

    :cond_2
    iput-object v2, p1, Ly0/d1;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Ly0/v0;->c()Ly0/u0;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, Ly0/d1;->f:I

    invoke-virtual {p2, v0}, Ly0/u0;->a(I)Ly0/t0;

    move-result-object v1

    iget-object v1, v1, Ly0/t0;->a:Ljava/util/ArrayList;

    iget-object p2, p2, Ly0/u0;->a:Landroid/util/SparseArray;

    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly0/t0;

    iget p2, p2, Ly0/t0;->b:I

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p2, v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ly0/d1;->o()V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method

.method public final b(I)I
    .locals 4

    iget-object v0, p0, Ly0/v0;->h:Landroidx/recyclerview/widget/RecyclerView;

    if-ltz p1, :cond_1

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:Ly0/a1;

    invoke-virtual {v1}, Ly0/a1;->b()I

    move-result v1

    if-ge p1, v1, :cond_1

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:Ly0/a1;

    iget-boolean v1, v1, Ly0/a1;->g:Z

    if-nez v1, :cond_0

    return p1

    :cond_0
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->e:Ly0/b;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ly0/b;->f(II)I

    move-result p1

    return p1

    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid position "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". State item count is "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:Ly0/a1;

    invoke-virtual {p1}, Ly0/a1;->b()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c()Ly0/u0;
    .locals 2

    iget-object v0, p0, Ly0/v0;->g:Ly0/u0;

    if-nez v0, :cond_0

    new-instance v0, Ly0/u0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, v0, Ly0/u0;->a:Landroid/util/SparseArray;

    const/4 v1, 0x0

    iput v1, v0, Ly0/u0;->b:I

    iput-object v0, p0, Ly0/v0;->g:Ly0/u0;

    :cond_0
    iget-object v0, p0, Ly0/v0;->g:Ly0/u0;

    return-object v0
.end method

.method public final d(I)Landroid/view/View;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, v0, v1}, Ly0/v0;->j(IJ)Ly0/d1;

    move-result-object p1

    iget-object p1, p1, Ly0/d1;->a:Landroid/view/View;

    return-object p1
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Ly0/v0;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_0

    invoke-virtual {p0, v1}, Ly0/v0;->f(I)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    iget-object v0, p0, Ly0/v0;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:Ly0/q;

    iget-object v1, v0, Ly0/q;->c:[I

    if-eqz v1, :cond_1

    const/4 v2, -0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    :cond_1
    const/4 v1, 0x0

    iput v1, v0, Ly0/q;->d:I

    return-void
.end method

.method public final f(I)V
    .locals 3

    iget-object v0, p0, Ly0/v0;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly0/d1;

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Ly0/v0;->a(Ly0/d1;Z)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public final g(Landroid/view/View;)V
    .locals 3

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ly0/d1;

    move-result-object v0

    invoke-virtual {v0}, Ly0/d1;->l()Z

    move-result v1

    iget-object v2, p0, Ly0/v0;->h:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_0
    invoke-virtual {v0}, Ly0/d1;->k()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, v0, Ly0/d1;->n:Ly0/v0;

    invoke-virtual {p1, v0}, Ly0/v0;->k(Ly0/d1;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ly0/d1;->r()Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, v0, Ly0/d1;->j:I

    and-int/lit8 p1, p1, -0x21

    iput p1, v0, Ly0/d1;->j:I

    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Ly0/v0;->h(Ly0/d1;)V

    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->I:Ly0/l0;

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Ly0/d1;->i()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->I:Ly0/l0;

    invoke-virtual {p1, v0}, Ly0/l0;->d(Ly0/d1;)V

    :cond_3
    return-void
.end method

.method public final h(Ly0/d1;)V
    .locals 11

    invoke-virtual {p1}, Ly0/d1;->k()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Ly0/v0;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, p1, Ly0/d1;->a:Landroid/view/View;

    if-nez v0, :cond_e

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    goto/16 :goto_8

    :cond_0
    invoke-virtual {p1}, Ly0/d1;->l()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p1}, Ly0/d1;->q()Z

    move-result v0

    if-nez v0, :cond_c

    iget v0, p1, Ly0/d1;->j:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_1

    sget-object v0, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v4}, Li0/e0;->i(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    invoke-virtual {p1}, Ly0/d1;->i()Z

    move-result v4

    if-eqz v4, :cond_a

    iget v4, p0, Ly0/v0;->f:I

    if-lez v4, :cond_8

    const/16 v4, 0x20e

    invoke-virtual {p1, v4}, Ly0/d1;->e(I)Z

    move-result v4

    if-nez v4, :cond_8

    iget-object v4, p0, Ly0/v0;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget v6, p0, Ly0/v0;->f:I

    if-lt v5, v6, :cond_2

    if-lez v5, :cond_2

    invoke-virtual {p0, v1}, Ly0/v0;->f(I)V

    add-int/lit8 v5, v5, -0x1

    :cond_2
    sget-object v6, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    if-lez v5, :cond_7

    iget-object v6, v3, Landroidx/recyclerview/widget/RecyclerView;->c0:Ly0/q;

    iget v7, p1, Ly0/d1;->c:I

    iget-object v8, v6, Ly0/q;->c:[I

    if-eqz v8, :cond_4

    iget v8, v6, Ly0/q;->d:I

    mul-int/lit8 v8, v8, 0x2

    move v9, v1

    :goto_1
    if-ge v9, v8, :cond_4

    iget-object v10, v6, Ly0/q;->c:[I

    aget v10, v10, v9

    if-ne v10, v7, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v9, v9, 0x2

    goto :goto_1

    :cond_4
    add-int/lit8 v5, v5, -0x1

    :goto_2
    if-ltz v5, :cond_6

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly0/d1;

    iget v6, v6, Ly0/d1;->c:I

    iget-object v7, v3, Landroidx/recyclerview/widget/RecyclerView;->c0:Ly0/q;

    iget-object v8, v7, Ly0/q;->c:[I

    if-eqz v8, :cond_6

    iget v8, v7, Ly0/q;->d:I

    mul-int/lit8 v8, v8, 0x2

    move v9, v1

    :goto_3
    if-ge v9, v8, :cond_6

    iget-object v10, v7, Ly0/q;->c:[I

    aget v10, v10, v9

    if-ne v10, v6, :cond_5

    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    :cond_5
    add-int/lit8 v9, v9, 0x2

    goto :goto_3

    :cond_6
    add-int/2addr v5, v2

    :cond_7
    :goto_4
    invoke-virtual {v4, v5, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    move v4, v2

    goto :goto_5

    :cond_8
    move v4, v1

    :goto_5
    if-nez v4, :cond_9

    invoke-virtual {p0, p1, v2}, Ly0/v0;->a(Ly0/d1;Z)V

    :goto_6
    move v1, v4

    goto :goto_7

    :cond_9
    move v2, v1

    goto :goto_6

    :cond_a
    move v2, v1

    :goto_7
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->g:Lj1/b0;

    invoke-virtual {v3, p1}, Lj1/b0;->p(Ly0/d1;)V

    if-nez v1, :cond_b

    if-nez v2, :cond_b

    if-eqz v0, :cond_b

    const/4 v0, 0x0

    iput-object v0, p1, Ly0/d1;->r:Landroidx/recyclerview/widget/RecyclerView;

    :cond_b
    return-void

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Scrapped or attached views may not be recycled. isScrap:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ly0/d1;->k()Z

    move-result p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " isAttached:"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_f

    move v1, v2

    :cond_f
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i(Landroid/view/View;)V
    .locals 3

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ly0/d1;

    move-result-object p1

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Ly0/d1;->e(I)Z

    move-result v0

    iget-object v1, p0, Ly0/v0;->h:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ly0/d1;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->I:Ly0/l0;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ly0/d1;->d()Ljava/util/List;

    move-result-object v2

    check-cast v0, Ly0/k;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v0, v0, Ly0/k;->g:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ly0/d1;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly0/v0;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ly0/v0;->b:Ljava/util/ArrayList;

    :cond_1
    iput-object p0, p1, Ly0/d1;->n:Ly0/v0;

    const/4 v0, 0x1

    iput-boolean v0, p1, Ly0/d1;->o:Z

    iget-object v0, p0, Ly0/v0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    :goto_0
    invoke-virtual {p1}, Ly0/d1;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ly0/d1;->j()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    iget-boolean v0, v0, Ly0/g0;->b:Z

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    iput-object p0, p1, Ly0/d1;->n:Ly0/v0;

    const/4 v0, 0x0

    iput-boolean v0, p1, Ly0/d1;->o:Z

    iget-object v0, p0, Ly0/v0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    return-void
.end method

.method public final j(IJ)Ly0/d1;
    .locals 22

    move-object/from16 v1, p0

    move/from16 v0, p1

    iget-object v2, v1, Ly0/v0;->h:Landroidx/recyclerview/widget/RecyclerView;

    if-ltz v0, :cond_43

    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView;->d0:Ly0/a1;

    invoke-virtual {v3}, Ly0/a1;->b()I

    move-result v3

    if-ge v0, v3, :cond_43

    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView;->d0:Ly0/a1;

    iget-boolean v4, v3, Ly0/a1;->g:Z

    const/4 v5, 0x0

    const/4 v7, 0x1

    const/16 v8, 0x20

    if-eqz v4, :cond_6

    iget-object v4, v1, Ly0/v0;->b:Ljava/util/ArrayList;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    move v9, v5

    :goto_0
    if-ge v9, v4, :cond_2

    iget-object v10, v1, Ly0/v0;->b:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly0/d1;

    invoke-virtual {v10}, Ly0/d1;->r()Z

    move-result v11

    if-nez v11, :cond_1

    invoke-virtual {v10}, Ly0/d1;->c()I

    move-result v11

    if-ne v11, v0, :cond_1

    invoke-virtual {v10, v8}, Ly0/d1;->b(I)V

    goto :goto_3

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    iget-boolean v9, v9, Ly0/g0;->b:Z

    if-eqz v9, :cond_4

    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->e:Ly0/b;

    invoke-virtual {v9, v0, v5}, Ly0/b;->f(II)I

    move-result v9

    if-lez v9, :cond_4

    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    invoke-virtual {v10}, Ly0/g0;->a()I

    move-result v10

    if-ge v9, v10, :cond_4

    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    invoke-virtual {v10, v9}, Ly0/g0;->b(I)J

    move-result-wide v9

    move v11, v5

    :goto_1
    if-ge v11, v4, :cond_4

    iget-object v12, v1, Ly0/v0;->b:Ljava/util/ArrayList;

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly0/d1;

    invoke-virtual {v12}, Ly0/d1;->r()Z

    move-result v13

    if-nez v13, :cond_3

    iget-wide v13, v12, Ly0/d1;->e:J

    cmp-long v13, v13, v9

    if-nez v13, :cond_3

    invoke-virtual {v12, v8}, Ly0/d1;->b(I)V

    move-object v10, v12

    goto :goto_3

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_5

    move v4, v7

    goto :goto_4

    :cond_5
    move v4, v5

    goto :goto_4

    :cond_6
    move v4, v5

    const/4 v10, 0x0

    :goto_4
    iget-object v9, v1, Ly0/v0;->c:Ljava/util/ArrayList;

    iget-object v11, v1, Ly0/v0;->a:Ljava/util/ArrayList;

    if-nez v10, :cond_1b

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v10

    move v12, v5

    :goto_5
    if-ge v12, v10, :cond_9

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly0/d1;

    invoke-virtual {v13}, Ly0/d1;->r()Z

    move-result v14

    if-nez v14, :cond_8

    invoke-virtual {v13}, Ly0/d1;->c()I

    move-result v14

    if-ne v14, v0, :cond_8

    invoke-virtual {v13}, Ly0/d1;->h()Z

    move-result v14

    if-nez v14, :cond_8

    iget-boolean v14, v3, Ly0/a1;->g:Z

    if-nez v14, :cond_7

    invoke-virtual {v13}, Ly0/d1;->j()Z

    move-result v14

    if-nez v14, :cond_8

    :cond_7
    invoke-virtual {v13, v8}, Ly0/d1;->b(I)V

    move-object v10, v13

    goto/16 :goto_b

    :cond_8
    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_9
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->f:Ly0/d;

    iget-object v12, v10, Ly0/d;->c:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v13

    move v14, v5

    :goto_6
    if-ge v14, v13, :cond_b

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/view/View;

    iget-object v6, v10, Ly0/d;->a:Ly0/f0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ly0/d1;

    move-result-object v6

    invoke-virtual {v6}, Ly0/d1;->c()I

    move-result v8

    if-ne v8, v0, :cond_a

    invoke-virtual {v6}, Ly0/d1;->h()Z

    move-result v8

    if-nez v8, :cond_a

    invoke-virtual {v6}, Ly0/d1;->j()Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v14, v14, 0x1

    const/16 v8, 0x20

    goto :goto_6

    :cond_b
    const/4 v15, 0x0

    :goto_7
    if-eqz v15, :cond_11

    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ly0/d1;

    move-result-object v6

    iget-object v8, v2, Landroidx/recyclerview/widget/RecyclerView;->f:Ly0/d;

    iget-object v10, v8, Ly0/d;->a:Ly0/f0;

    iget-object v10, v10, Ly0/f0;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v10, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v10

    if-ltz v10, :cond_10

    iget-object v12, v8, Ly0/d;->b:Ly0/c;

    invoke-virtual {v12, v10}, Ly0/c;->d(I)Z

    move-result v13

    if-eqz v13, :cond_f

    invoke-virtual {v12, v10}, Ly0/c;->a(I)V

    invoke-virtual {v8, v15}, Ly0/d;->k(Landroid/view/View;)V

    iget-object v8, v2, Landroidx/recyclerview/widget/RecyclerView;->f:Ly0/d;

    iget-object v10, v8, Ly0/d;->a:Ly0/f0;

    iget-object v10, v10, Ly0/f0;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v10, v15}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v10

    const/4 v12, -0x1

    if-ne v10, v12, :cond_c

    :goto_8
    move v10, v12

    goto :goto_9

    :cond_c
    iget-object v8, v8, Ly0/d;->b:Ly0/c;

    invoke-virtual {v8, v10}, Ly0/c;->d(I)Z

    move-result v13

    if-eqz v13, :cond_d

    goto :goto_8

    :cond_d
    invoke-virtual {v8, v10}, Ly0/c;->b(I)I

    move-result v8

    sub-int/2addr v10, v8

    :goto_9
    if-eq v10, v12, :cond_e

    iget-object v8, v2, Landroidx/recyclerview/widget/RecyclerView;->f:Ly0/d;

    invoke-virtual {v8, v10}, Ly0/d;->c(I)V

    invoke-virtual {v1, v15}, Ly0/v0;->i(Landroid/view/View;)V

    const/16 v8, 0x2020

    invoke-virtual {v6, v8}, Ly0/d1;->b(I)V

    move-object v10, v6

    goto :goto_b

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "layout index should not be -1 after unhiding a view:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "trying to unhide a view that was not hidden"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "view is not a child, cannot hide "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v8, v5

    :goto_a
    if-ge v8, v6, :cond_13

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly0/d1;

    invoke-virtual {v10}, Ly0/d1;->h()Z

    move-result v12

    if-nez v12, :cond_12

    invoke-virtual {v10}, Ly0/d1;->c()I

    move-result v12

    if-ne v12, v0, :cond_12

    invoke-virtual {v10}, Ly0/d1;->f()Z

    move-result v12

    if-nez v12, :cond_12

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_b

    :cond_12
    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    :cond_13
    const/4 v10, 0x0

    :goto_b
    if-eqz v10, :cond_1b

    invoke-virtual {v10}, Ly0/d1;->j()Z

    move-result v6

    if-eqz v6, :cond_14

    iget-boolean v6, v3, Ly0/a1;->g:Z

    if-nez v6, :cond_19

    goto :goto_c

    :cond_14
    iget v6, v10, Ly0/d1;->c:I

    if-ltz v6, :cond_1a

    iget-object v8, v2, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    invoke-virtual {v8}, Ly0/g0;->a()I

    move-result v8

    if-ge v6, v8, :cond_1a

    iget-boolean v6, v3, Ly0/a1;->g:Z

    if-nez v6, :cond_15

    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v6, v10, Ly0/d1;->f:I

    if-eqz v6, :cond_15

    goto :goto_c

    :cond_15
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    iget-boolean v8, v6, Ly0/g0;->b:Z

    if-eqz v8, :cond_19

    iget-wide v12, v10, Ly0/d1;->e:J

    iget v8, v10, Ly0/d1;->c:I

    invoke-virtual {v6, v8}, Ly0/g0;->b(I)J

    move-result-wide v14

    cmp-long v6, v12, v14

    if-nez v6, :cond_16

    goto :goto_e

    :cond_16
    :goto_c
    const/4 v6, 0x4

    invoke-virtual {v10, v6}, Ly0/d1;->b(I)V

    invoke-virtual {v10}, Ly0/d1;->k()Z

    move-result v6

    if-eqz v6, :cond_17

    iget-object v6, v10, Ly0/d1;->a:Landroid/view/View;

    invoke-virtual {v2, v6, v5}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    iget-object v6, v10, Ly0/d1;->n:Ly0/v0;

    invoke-virtual {v6, v10}, Ly0/v0;->k(Ly0/d1;)V

    goto :goto_d

    :cond_17
    invoke-virtual {v10}, Ly0/d1;->r()Z

    move-result v6

    if-eqz v6, :cond_18

    iget v6, v10, Ly0/d1;->j:I

    and-int/lit8 v6, v6, -0x21

    iput v6, v10, Ly0/d1;->j:I

    :cond_18
    :goto_d
    invoke-virtual {v1, v10}, Ly0/v0;->h(Ly0/d1;)V

    const/4 v10, 0x0

    goto :goto_f

    :cond_19
    :goto_e
    move v4, v7

    goto :goto_f

    :cond_1a
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Inconsistency detected. Invalid view holder adapter position"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    :goto_f
    const-wide/16 v18, 0x0

    const-wide v20, 0x7fffffffffffffffL

    if-nez v10, :cond_2d

    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->e:Ly0/b;

    invoke-virtual {v6, v0, v5}, Ly0/b;->f(II)I

    move-result v6

    if-ltz v6, :cond_2e

    iget-object v8, v2, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    invoke-virtual {v8}, Ly0/g0;->a()I

    move-result v8

    if-ge v6, v8, :cond_2e

    iget-object v8, v2, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v2, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    iget-boolean v12, v8, Ly0/g0;->b:Z

    if-eqz v12, :cond_23

    invoke-virtual {v8, v6}, Ly0/g0;->b(I)J

    move-result-wide v12

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v8, v7

    :goto_10
    if-ltz v8, :cond_1e

    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly0/d1;

    iget-wide v14, v10, Ly0/d1;->e:J

    cmp-long v14, v14, v12

    if-nez v14, :cond_1d

    invoke-virtual {v10}, Ly0/d1;->r()Z

    move-result v14

    if-nez v14, :cond_1d

    iget v14, v10, Ly0/d1;->f:I

    if-nez v14, :cond_1c

    const/16 v14, 0x20

    invoke-virtual {v10, v14}, Ly0/d1;->b(I)V

    invoke-virtual {v10}, Ly0/d1;->j()Z

    move-result v8

    if-eqz v8, :cond_22

    iget-boolean v8, v3, Ly0/a1;->g:Z

    if-nez v8, :cond_22

    iget v8, v10, Ly0/d1;->j:I

    and-int/lit8 v8, v8, -0xf

    or-int/lit8 v8, v8, 0x2

    iput v8, v10, Ly0/d1;->j:I

    goto :goto_13

    :cond_1c
    const/16 v14, 0x20

    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object v10, v10, Ly0/d1;->a:Landroid/view/View;

    invoke-virtual {v2, v10, v5}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    invoke-static {v10}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ly0/d1;

    move-result-object v10

    const/4 v15, 0x0

    iput-object v15, v10, Ly0/d1;->n:Ly0/v0;

    iput-boolean v5, v10, Ly0/d1;->o:Z

    iget v15, v10, Ly0/d1;->j:I

    and-int/lit8 v15, v15, -0x21

    iput v15, v10, Ly0/d1;->j:I

    invoke-virtual {v1, v10}, Ly0/v0;->h(Ly0/d1;)V

    goto :goto_11

    :cond_1d
    const/16 v14, 0x20

    :goto_11
    add-int/lit8 v8, v8, -0x1

    goto :goto_10

    :cond_1e
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v8, v7

    :goto_12
    if-ltz v8, :cond_20

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly0/d1;

    iget-wide v14, v10, Ly0/d1;->e:J

    cmp-long v11, v14, v12

    if-nez v11, :cond_21

    invoke-virtual {v10}, Ly0/d1;->f()Z

    move-result v11

    if-nez v11, :cond_21

    iget v11, v10, Ly0/d1;->f:I

    if-nez v11, :cond_1f

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_13

    :cond_1f
    invoke-virtual {v1, v8}, Ly0/v0;->f(I)V

    :cond_20
    const/4 v10, 0x0

    goto :goto_13

    :cond_21
    add-int/lit8 v8, v8, -0x1

    goto :goto_12

    :cond_22
    :goto_13
    if-eqz v10, :cond_23

    iput v6, v10, Ly0/d1;->c:I

    move v4, v7

    :cond_23
    if-nez v10, :cond_27

    invoke-virtual/range {p0 .. p0}, Ly0/v0;->c()Ly0/u0;

    move-result-object v6

    iget-object v6, v6, Ly0/u0;->a:Landroid/util/SparseArray;

    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly0/t0;

    if-eqz v6, :cond_25

    iget-object v6, v6, Ly0/t0;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_25

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v8, v7

    :goto_14
    if-ltz v8, :cond_25

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly0/d1;

    invoke-virtual {v9}, Ly0/d1;->f()Z

    move-result v9

    if-nez v9, :cond_24

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Ly0/d1;

    goto :goto_15

    :cond_24
    add-int/lit8 v8, v8, -0x1

    goto :goto_14

    :cond_25
    const/4 v15, 0x0

    :goto_15
    if-eqz v15, :cond_26

    invoke-virtual {v15}, Ly0/d1;->o()V

    sget-object v6, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    :cond_26
    move-object v10, v15

    :cond_27
    if-nez v10, :cond_2d

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v8

    cmp-long v6, p2, v20

    if-eqz v6, :cond_29

    iget-object v6, v1, Ly0/v0;->g:Ly0/u0;

    invoke-virtual {v6, v5}, Ly0/u0;->a(I)Ly0/t0;

    move-result-object v6

    iget-wide v10, v6, Ly0/t0;->c:J

    cmp-long v6, v10, v18

    if-eqz v6, :cond_29

    add-long/2addr v10, v8

    cmp-long v6, v10, p2

    if-gez v6, :cond_28

    goto :goto_16

    :cond_28
    const/4 v11, 0x0

    return-object v11

    :cond_29
    :goto_16
    const/4 v11, 0x0

    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    const-string v10, "RV CreateView"

    sget v12, Le0/l;->a:I

    invoke-static {v10}, Le0/k;->a(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ly0/g0;->d(Landroidx/recyclerview/widget/RecyclerView;)Ly0/d1;

    move-result-object v10

    iget-object v6, v10, Ly0/d1;->a:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    if-nez v6, :cond_2c

    iput v5, v10, Ly0/d1;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Le0/k;->b()V

    sget-object v6, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    iget-object v6, v10, Ly0/d1;->a:Landroid/view/View;

    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v6

    if-eqz v6, :cond_2a

    new-instance v12, Ljava/lang/ref/WeakReference;

    invoke-direct {v12, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v12, v10, Ly0/d1;->b:Ljava/lang/ref/WeakReference;

    :cond_2a
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v12

    iget-object v6, v1, Ly0/v0;->g:Ly0/u0;

    sub-long/2addr v12, v8

    invoke-virtual {v6, v5}, Ly0/u0;->a(I)Ly0/t0;

    move-result-object v6

    iget-wide v8, v6, Ly0/t0;->c:J

    cmp-long v14, v8, v18

    if-nez v14, :cond_2b

    goto :goto_17

    :cond_2b
    const-wide/16 v14, 0x4

    div-long/2addr v8, v14

    const-wide/16 v16, 0x3

    mul-long v8, v8, v16

    div-long/2addr v12, v14

    add-long/2addr v12, v8

    :goto_17
    iput-wide v12, v6, Ly0/t0;->c:J

    goto :goto_19

    :catchall_0
    move-exception v0

    goto :goto_18

    :cond_2c
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_18
    sget v2, Le0/l;->a:I

    invoke-static {}, Le0/k;->b()V

    throw v0

    :cond_2d
    const/4 v11, 0x0

    goto :goto_19

    :cond_2e
    new-instance v4, Ljava/lang/IndexOutOfBoundsException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "Inconsistency detected. Invalid item position "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "(offset:"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ").state:"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ly0/a1;->b()I

    move-result v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v4

    :goto_19
    if-eqz v4, :cond_2f

    iget-boolean v6, v3, Ly0/a1;->g:Z

    if-nez v6, :cond_2f

    const/16 v6, 0x2000

    invoke-virtual {v10, v6}, Ly0/d1;->e(I)Z

    move-result v6

    if-eqz v6, :cond_2f

    iget v6, v10, Ly0/d1;->j:I

    and-int/lit16 v6, v6, -0x2001

    iput v6, v10, Ly0/d1;->j:I

    iget-boolean v6, v3, Ly0/a1;->j:Z

    if-eqz v6, :cond_2f

    invoke-static {v10}, Ly0/l0;->b(Ly0/d1;)V

    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->I:Ly0/l0;

    invoke-virtual {v10}, Ly0/d1;->d()Ljava/util/List;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Ly0/k0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v6, v10}, Ly0/k0;->a(Ly0/d1;)V

    invoke-virtual {v2, v10, v6}, Landroidx/recyclerview/widget/RecyclerView;->V(Ly0/d1;Ly0/k0;)V

    :cond_2f
    iget-boolean v6, v3, Ly0/a1;->g:Z

    iget-object v8, v10, Ly0/d1;->a:Landroid/view/View;

    if-eqz v6, :cond_30

    invoke-virtual {v10}, Ly0/d1;->g()Z

    move-result v6

    if-eqz v6, :cond_30

    iput v0, v10, Ly0/d1;->g:I

    goto :goto_1a

    :cond_30
    invoke-virtual {v10}, Ly0/d1;->g()Z

    move-result v6

    if-eqz v6, :cond_33

    iget v6, v10, Ly0/d1;->j:I

    and-int/lit8 v6, v6, 0x2

    if-eqz v6, :cond_31

    goto :goto_1b

    :cond_31
    invoke-virtual {v10}, Ly0/d1;->h()Z

    move-result v6

    if-eqz v6, :cond_32

    goto :goto_1b

    :cond_32
    :goto_1a
    move v0, v5

    goto/16 :goto_1f

    :cond_33
    :goto_1b
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->e:Ly0/b;

    invoke-virtual {v6, v0, v5}, Ly0/b;->f(II)I

    move-result v6

    iput-object v2, v10, Ly0/d1;->r:Landroidx/recyclerview/widget/RecyclerView;

    iget v9, v10, Ly0/d1;->f:I

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v12

    cmp-long v14, p2, v20

    if-eqz v14, :cond_34

    iget-object v14, v1, Ly0/v0;->g:Ly0/u0;

    invoke-virtual {v14, v9}, Ly0/u0;->a(I)Ly0/t0;

    move-result-object v9

    iget-wide v14, v9, Ly0/t0;->d:J

    cmp-long v9, v14, v18

    if-eqz v9, :cond_34

    add-long/2addr v14, v12

    cmp-long v9, v14, p2

    if-gez v9, :cond_32

    :cond_34
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->l:Ly0/g0;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v6, v10, Ly0/d1;->c:I

    iget-boolean v14, v9, Ly0/g0;->b:Z

    if-eqz v14, :cond_35

    invoke-virtual {v9, v6}, Ly0/g0;->b(I)J

    move-result-wide v14

    iput-wide v14, v10, Ly0/d1;->e:J

    :cond_35
    iget v14, v10, Ly0/d1;->j:I

    and-int/lit16 v14, v14, -0x208

    or-int/2addr v14, v7

    iput v14, v10, Ly0/d1;->j:I

    sget v14, Le0/l;->a:I

    const-string v14, "RV OnBindView"

    invoke-static {v14}, Le0/k;->a(Ljava/lang/String;)V

    invoke-virtual {v10}, Ly0/d1;->d()Ljava/util/List;

    invoke-virtual {v9, v10, v6}, Ly0/g0;->c(Ly0/d1;I)V

    iget-object v6, v10, Ly0/d1;->k:Ljava/util/ArrayList;

    if-eqz v6, :cond_36

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    :cond_36
    iget v6, v10, Ly0/d1;->j:I

    and-int/lit16 v6, v6, -0x401

    iput v6, v10, Ly0/d1;->j:I

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    instance-of v9, v6, Ly0/p0;

    if-eqz v9, :cond_37

    check-cast v6, Ly0/p0;

    iput-boolean v7, v6, Ly0/p0;->c:Z

    :cond_37
    invoke-static {}, Le0/k;->b()V

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v14

    iget-object v6, v1, Ly0/v0;->g:Ly0/u0;

    iget v9, v10, Ly0/d1;->f:I

    sub-long/2addr v14, v12

    invoke-virtual {v6, v9}, Ly0/u0;->a(I)Ly0/t0;

    move-result-object v6

    iget-wide v12, v6, Ly0/t0;->d:J

    cmp-long v9, v12, v18

    if-nez v9, :cond_38

    goto :goto_1c

    :cond_38
    const-wide/16 v16, 0x4

    div-long v12, v12, v16

    const-wide/16 v18, 0x3

    mul-long v12, v12, v18

    div-long v14, v14, v16

    add-long/2addr v14, v12

    :goto_1c
    iput-wide v14, v6, Ly0/t0;->d:J

    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->y:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v6, :cond_3e

    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v6

    if-eqz v6, :cond_3e

    sget-object v6, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v8}, Li0/e0;->c(Landroid/view/View;)I

    move-result v6

    if-nez v6, :cond_39

    invoke-static {v8, v7}, Li0/e0;->s(Landroid/view/View;I)V

    :cond_39
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->k0:Ly0/f1;

    if-nez v6, :cond_3a

    goto :goto_1e

    :cond_3a
    iget-object v6, v6, Ly0/f1;->e:Ly0/e1;

    instance-of v9, v6, Ly0/e1;

    if-eqz v9, :cond_3d

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Li0/v0;->c(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object v9

    if-nez v9, :cond_3b

    goto :goto_1d

    :cond_3b
    instance-of v11, v9, Li0/a;

    if-eqz v11, :cond_3c

    check-cast v9, Li0/a;

    iget-object v9, v9, Li0/a;->a:Li0/c;

    move-object v11, v9

    goto :goto_1d

    :cond_3c
    new-instance v11, Li0/c;

    invoke-direct {v11, v9}, Li0/c;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    :goto_1d
    if-eqz v11, :cond_3d

    if-eq v11, v6, :cond_3d

    iget-object v9, v6, Ly0/e1;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v9, v8, v11}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3d
    invoke-static {v8, v6}, Li0/v0;->l(Landroid/view/View;Li0/c;)V

    :cond_3e
    :goto_1e
    iget-boolean v3, v3, Ly0/a1;->g:Z

    if-eqz v3, :cond_3f

    iput v0, v10, Ly0/d1;->g:I

    :cond_3f
    move v0, v7

    :goto_1f
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-nez v3, :cond_40

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ly0/p0;

    invoke-virtual {v8, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_20

    :cond_40
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v6

    if-nez v6, :cond_41

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ly0/p0;

    invoke-virtual {v8, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_20

    :cond_41
    move-object v2, v3

    check-cast v2, Ly0/p0;

    :goto_20
    iput-object v10, v2, Ly0/p0;->a:Ly0/d1;

    if-eqz v4, :cond_42

    if-eqz v0, :cond_42

    move v5, v7

    :cond_42
    iput-boolean v5, v2, Ly0/p0;->d:Z

    return-object v10

    :cond_43
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Invalid item position "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "). Item count:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->d0:Ly0/a1;

    invoke-virtual {v0}, Ly0/a1;->b()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method public final k(Ly0/d1;)V
    .locals 1

    iget-boolean v0, p1, Ly0/d1;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly0/v0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly0/v0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p1, Ly0/d1;->n:Ly0/v0;

    const/4 v0, 0x0

    iput-boolean v0, p1, Ly0/d1;->o:Z

    iget v0, p1, Ly0/d1;->j:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p1, Ly0/d1;->j:I

    return-void
.end method

.method public final l()V
    .locals 4

    iget-object v0, p0, Ly0/v0;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->m:Ly0/o0;

    if-eqz v0, :cond_0

    iget v0, v0, Ly0/o0;->j:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Ly0/v0;->e:I

    add-int/2addr v1, v0

    iput v1, p0, Ly0/v0;->f:I

    iget-object v0, p0, Ly0/v0;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_1
    if-ltz v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget v3, p0, Ly0/v0;->f:I

    if-le v2, v3, :cond_1

    invoke-virtual {p0, v1}, Ly0/v0;->f(I)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_1
    return-void
.end method
