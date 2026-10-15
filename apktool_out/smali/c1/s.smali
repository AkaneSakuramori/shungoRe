.class public final Lc1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public b:Lc1/q;

.field public c:Landroid/view/ViewGroup;


# virtual methods
.method public final onPreDraw()Z
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lc1/s;->c:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object v1, Lc1/t;->c:Ljava/util/ArrayList;

    iget-object v3, v0, Lc1/s;->c:Landroid/view/ViewGroup;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    const/4 v8, 0x1

    if-nez v1, :cond_0

    return v8

    :cond_0
    invoke-static {}, Lc1/t;->b()Ln/b;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v3, v2}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-nez v4, :cond_2

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v3, v4}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    move-object v5, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_0
    iget-object v9, v0, Lc1/s;->b:Lc1/q;

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lc1/h;

    invoke-direct {v4, v0, v8, v1}, Lc1/h;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v9, v4}, Lc1/q;->a(Lc1/p;)V

    const/4 v1, 0x0

    invoke-virtual {v9, v3, v1}, Lc1/q;->h(Landroid/view/ViewGroup;Z)V

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc1/q;

    invoke-virtual {v5, v3}, Lc1/q;->x(Landroid/view/ViewGroup;)V

    goto :goto_1

    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v9, Lc1/q;->l:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v9, Lc1/q;->m:Ljava/util/ArrayList;

    iget-object v4, v9, Lc1/q;->h:Lg/h;

    iget-object v5, v9, Lc1/q;->i:Lg/h;

    new-instance v6, Ln/b;

    iget-object v7, v4, Lg/h;->c:Ljava/lang/Object;

    check-cast v7, Ln/b;

    invoke-direct {v6, v7}, Ln/b;-><init>(Ln/b;)V

    new-instance v7, Ln/b;

    iget-object v10, v5, Lg/h;->c:Ljava/lang/Object;

    check-cast v10, Ln/b;

    invoke-direct {v7, v10}, Ln/b;-><init>(Ln/b;)V

    move v10, v1

    :goto_2
    iget-object v11, v9, Lc1/q;->k:[I

    array-length v12, v11

    if-ge v10, v12, :cond_10

    aget v11, v11, v10

    if-eq v11, v8, :cond_d

    const/4 v12, 0x2

    if-eq v11, v12, :cond_b

    const/4 v12, 0x3

    if-eq v11, v12, :cond_9

    const/4 v12, 0x4

    if-eq v11, v12, :cond_5

    :cond_4
    move-object v8, v9

    goto/16 :goto_8

    :cond_5
    iget-object v11, v4, Lg/h;->d:Ljava/lang/Object;

    check-cast v11, Ln/e;

    iget-object v12, v5, Lg/h;->d:Ljava/lang/Object;

    check-cast v12, Ln/e;

    invoke-virtual {v11}, Ln/e;->f()I

    move-result v13

    move v14, v1

    :goto_3
    if-ge v14, v13, :cond_4

    invoke-virtual {v11, v14}, Ln/e;->g(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/view/View;

    if-eqz v15, :cond_7

    invoke-virtual {v9, v15}, Lc1/q;->s(Landroid/view/View;)Z

    move-result v16

    if-eqz v16, :cond_7

    iget-boolean v1, v11, Ln/e;->b:Z

    if-eqz v1, :cond_6

    invoke-virtual {v11}, Ln/e;->c()V

    :cond_6
    iget-object v1, v11, Ln/e;->c:[J

    move-object/from16 v17, v9

    aget-wide v8, v1, v14

    invoke-virtual {v12, v8, v9, v2}, Ln/e;->d(JLjava/lang/Long;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    move-object/from16 v8, v17

    if-eqz v1, :cond_8

    invoke-virtual {v8, v1}, Lc1/q;->s(Landroid/view/View;)Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-virtual {v6, v15, v2}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lc1/x;

    invoke-virtual {v7, v1, v2}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v2, v17

    check-cast v2, Lc1/x;

    if-eqz v9, :cond_8

    if-eqz v2, :cond_8

    iget-object v0, v8, Lc1/q;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v8, Lc1/q;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v15}, Ln/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v1}, Ln/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_7
    move-object v8, v9

    :cond_8
    :goto_4
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    move-object v9, v8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v8, 0x1

    goto :goto_3

    :cond_9
    move-object v8, v9

    iget-object v0, v4, Lg/h;->b:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseArray;

    iget-object v1, v5, Lg/h;->b:Ljava/lang/Object;

    check-cast v1, Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v2, :cond_f

    invoke-virtual {v0, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/View;

    if-eqz v11, :cond_a

    invoke-virtual {v8, v11}, Lc1/q;->s(Landroid/view/View;)Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-virtual {v0, v9}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v12

    invoke-virtual {v1, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    if-eqz v12, :cond_a

    invoke-virtual {v8, v12}, Lc1/q;->s(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    invoke-virtual {v6, v11, v13}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lc1/x;

    invoke-virtual {v7, v12, v13}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lc1/x;

    if-eqz v14, :cond_a

    if-eqz v15, :cond_a

    iget-object v13, v8, Lc1/q;->l:Ljava/util/ArrayList;

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v13, v8, Lc1/q;->m:Ljava/util/ArrayList;

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v11}, Ln/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v12}, Ln/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_b
    move-object v8, v9

    iget-object v0, v4, Lg/h;->e:Ljava/lang/Object;

    check-cast v0, Ln/b;

    iget-object v1, v5, Lg/h;->e:Ljava/lang/Object;

    check-cast v1, Ln/b;

    iget v2, v0, Ln/k;->d:I

    const/4 v9, 0x0

    :goto_6
    if-ge v9, v2, :cond_f

    invoke-virtual {v0, v9}, Ln/k;->j(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/View;

    if-eqz v11, :cond_c

    invoke-virtual {v8, v11}, Lc1/q;->s(Landroid/view/View;)Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-virtual {v0, v9}, Ln/k;->h(I)Ljava/lang/Object;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v1, v12, v13}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    if-eqz v12, :cond_c

    invoke-virtual {v8, v12}, Lc1/q;->s(Landroid/view/View;)Z

    move-result v14

    if-eqz v14, :cond_c

    invoke-virtual {v6, v11, v13}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lc1/x;

    invoke-virtual {v7, v12, v13}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lc1/x;

    if-eqz v14, :cond_c

    if-eqz v15, :cond_c

    iget-object v13, v8, Lc1/q;->l:Ljava/util/ArrayList;

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v13, v8, Lc1/q;->m:Ljava/util/ArrayList;

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v11}, Ln/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v12}, Ln/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    :cond_d
    move-object v8, v9

    iget v0, v6, Ln/k;->d:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_7
    if-ltz v0, :cond_f

    invoke-virtual {v6, v0}, Ln/k;->h(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_e

    invoke-virtual {v8, v1}, Lc1/q;->s(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {v7, v1}, Ln/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc1/x;

    if-eqz v1, :cond_e

    iget-object v2, v1, Lc1/x;->b:Landroid/view/View;

    invoke-virtual {v8, v2}, Lc1/q;->s(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {v6, v0}, Ln/k;->i(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc1/x;

    iget-object v9, v8, Lc1/q;->l:Ljava/util/ArrayList;

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v8, Lc1/q;->m:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    add-int/lit8 v0, v0, -0x1

    goto :goto_7

    :cond_f
    :goto_8
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move-object v9, v8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v8, 0x1

    goto/16 :goto_2

    :cond_10
    move-object v8, v9

    const/4 v0, 0x0

    :goto_9
    iget v1, v6, Ln/k;->d:I

    if-ge v0, v1, :cond_12

    invoke-virtual {v6, v0}, Ln/k;->j(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc1/x;

    iget-object v2, v1, Lc1/x;->b:Landroid/view/View;

    invoke-virtual {v8, v2}, Lc1/q;->s(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, v8, Lc1/q;->l:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v8, Lc1/q;->m:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_12
    const/4 v1, 0x0

    :goto_a
    iget v0, v7, Ln/k;->d:I

    if-ge v1, v0, :cond_14

    invoke-virtual {v7, v1}, Ln/k;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc1/x;

    iget-object v2, v0, Lc1/x;->b:Landroid/view/View;

    invoke-virtual {v8, v2}, Lc1/q;->s(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, v8, Lc1/q;->m:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v8, Lc1/q;->l:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_14
    invoke-static {}, Lc1/q;->o()Ln/b;

    move-result-object v0

    iget v1, v0, Ln/k;->d:I

    sget-object v2, Lc1/y;->a:Lc1/c0;

    new-instance v2, Lc1/h0;

    invoke-direct {v2, v3}, Lc1/h0;-><init>(Landroid/view/View;)V

    const/4 v4, 0x1

    sub-int/2addr v1, v4

    :goto_b
    if-ltz v1, :cond_1b

    invoke-virtual {v0, v1}, Ln/k;->h(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    if-eqz v4, :cond_19

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v5}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc1/o;

    if-eqz v6, :cond_19

    iget-object v5, v6, Lc1/o;->a:Landroid/view/View;

    if-eqz v5, :cond_19

    iget-object v7, v6, Lc1/o;->d:Lc1/i0;

    invoke-virtual {v2, v7}, Lc1/h0;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_19

    const/4 v7, 0x1

    invoke-virtual {v8, v5, v7}, Lc1/q;->q(Landroid/view/View;Z)Lc1/x;

    move-result-object v9

    invoke-virtual {v8, v5, v7}, Lc1/q;->n(Landroid/view/View;Z)Lc1/x;

    move-result-object v10

    if-nez v9, :cond_15

    if-nez v10, :cond_15

    iget-object v7, v8, Lc1/q;->i:Lg/h;

    iget-object v7, v7, Lg/h;->c:Ljava/lang/Object;

    check-cast v7, Ln/b;

    const/4 v11, 0x0

    invoke-virtual {v7, v5, v11}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lc1/x;

    goto :goto_c

    :cond_15
    const/4 v11, 0x0

    :goto_c
    if-nez v9, :cond_16

    if-eqz v10, :cond_1a

    :cond_16
    iget-object v5, v6, Lc1/o;->e:Lc1/q;

    iget-object v6, v6, Lc1/o;->c:Lc1/x;

    invoke-virtual {v5, v6, v10}, Lc1/q;->r(Lc1/x;Lc1/x;)Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-virtual {v4}, Landroid/animation/Animator;->isRunning()Z

    move-result v5

    if-nez v5, :cond_18

    invoke-virtual {v4}, Landroid/animation/Animator;->isStarted()Z

    move-result v5

    if-eqz v5, :cond_17

    goto :goto_d

    :cond_17
    invoke-virtual {v0, v4}, Ln/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_18
    :goto_d
    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    goto :goto_e

    :cond_19
    const/4 v11, 0x0

    :cond_1a
    :goto_e
    add-int/lit8 v1, v1, -0x1

    goto :goto_b

    :cond_1b
    iget-object v4, v8, Lc1/q;->h:Lg/h;

    iget-object v5, v8, Lc1/q;->i:Lg/h;

    iget-object v6, v8, Lc1/q;->l:Ljava/util/ArrayList;

    iget-object v7, v8, Lc1/q;->m:Ljava/util/ArrayList;

    move-object v2, v8

    invoke-virtual/range {v2 .. v7}, Lc1/q;->l(Landroid/view/ViewGroup;Lg/h;Lg/h;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v8}, Lc1/q;->y()V

    const/4 v0, 0x1

    return v0
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lc1/s;->c:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object p1, Lc1/t;->c:Ljava/util/ArrayList;

    iget-object v0, p0, Lc1/s;->c:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-static {}, Lc1/t;->b()Ln/b;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc1/q;

    invoke-virtual {v1, v0}, Lc1/q;->x(Landroid/view/ViewGroup;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lc1/s;->b:Lc1/q;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lc1/q;->i(Z)V

    return-void
.end method
