.class public final Landroidx/fragment/app/h;
.super Landroidx/fragment/app/d1;
.source "SourceFile"


# direct methods
.method public static i(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0}, Li0/y0;->b(Landroid/view/ViewGroup;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    invoke-static {p0, v2}, Landroidx/fragment/app/h;->i(Ljava/util/ArrayList;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public static j(Ln/b;Landroid/view/View;)V
    .locals 4

    sget-object v0, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Li0/k0;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, p1}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    invoke-static {p0, v2}, Landroidx/fragment/app/h;->j(Ln/b;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static k(Ln/b;Ljava/util/Collection;)V
    .locals 2

    invoke-virtual {p0}, Ln/b;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ln/h;

    invoke-virtual {p0}, Ln/h;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget-object v1, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Li0/k0;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final b(Ljava/util/ArrayList;Z)V
    .locals 33

    move-object/from16 v6, p0

    move/from16 v7, p2

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/c1;

    iget-object v2, v1, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    iget-object v2, v2, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-static {v2}, La;->c(Landroid/view/View;)I

    move-result v2

    iget v3, v1, Landroidx/fragment/app/c1;->a:I

    invoke-static {v3}, Lp/h;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    if-eq v3, v13, :cond_1

    if-eq v3, v12, :cond_2

    if-eq v3, v11, :cond_2

    goto :goto_0

    :cond_1
    if-eq v2, v12, :cond_0

    move-object v10, v1

    goto :goto_0

    :cond_2
    if-ne v2, v12, :cond_0

    if-nez v9, :cond_0

    move-object v9, v1

    goto :goto_0

    :cond_3
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    move-object/from16 v0, p1

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/c1;

    new-instance v2, Le0/e;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1}, Landroidx/fragment/app/c1;->d()V

    iget-object v3, v1, Landroidx/fragment/app/c1;->e:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v12, Landroidx/fragment/app/f;

    invoke-direct {v12, v1, v2}, Le/b0;-><init>(Landroidx/fragment/app/c1;Le0/e;)V

    iput-boolean v4, v12, Landroidx/fragment/app/f;->d:Z

    iput-boolean v7, v12, Landroidx/fragment/app/f;->c:Z

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Le0/e;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1}, Landroidx/fragment/app/c1;->d()V

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroidx/fragment/app/g;

    if-eqz v7, :cond_4

    if-ne v1, v9, :cond_5

    :goto_2
    move v4, v13

    goto :goto_3

    :cond_4
    if-ne v1, v10, :cond_5

    goto :goto_2

    :cond_5
    :goto_3
    invoke-direct {v3, v1, v2, v7, v4}, Landroidx/fragment/app/g;-><init>(Landroidx/fragment/app/c1;Le0/e;ZZ)V

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Landroidx/fragment/app/q0;

    invoke-direct {v2, v6, v5, v1}, Landroidx/fragment/app/q0;-><init>(Landroidx/fragment/app/h;Ljava/util/ArrayList;Landroidx/fragment/app/c1;)V

    iget-object v1, v1, Landroidx/fragment/app/c1;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v12, 0x2

    goto :goto_1

    :cond_6
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/g;

    invoke-virtual {v1}, Le/b0;->e()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    iget-object v2, v1, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Landroidx/fragment/app/g;->h(Ljava/lang/Object;)Landroidx/fragment/app/y0;

    move-result-object v11

    iget-object v8, v1, Landroidx/fragment/app/g;->e:Ljava/lang/Object;

    invoke-virtual {v1, v8}, Landroidx/fragment/app/g;->h(Ljava/lang/Object;)Landroidx/fragment/app/y0;

    move-result-object v4

    const-string v13, " returned Transition "

    move-object/from16 v16, v0

    const-string v0, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    if-eqz v11, :cond_9

    if-eqz v4, :cond_9

    if-ne v11, v4, :cond_8

    goto :goto_5

    :cond_8
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v1, Le/b0;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/c1;

    iget-object v0, v0, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " which uses a different Transition  type than its shared element transition "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_9
    :goto_5
    if-eqz v11, :cond_a

    goto :goto_6

    :cond_a
    move-object v11, v4

    :goto_6
    if-nez v3, :cond_b

    move-object v3, v11

    goto :goto_7

    :cond_b
    if-eqz v11, :cond_d

    if-ne v3, v11, :cond_c

    goto :goto_7

    :cond_c
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v1, Le/b0;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/c1;

    iget-object v0, v0, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " which uses a different Transition  type than other Fragments."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_d
    :goto_7
    move-object/from16 v0, v16

    const/4 v4, 0x0

    const/4 v11, 0x3

    const/4 v13, 0x1

    goto/16 :goto_4

    :cond_e
    iget-object v8, v6, Landroidx/fragment/app/d1;->a:Landroid/view/ViewGroup;

    const-string v11, "FragmentManager"

    if-nez v3, :cond_10

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/g;

    iget-object v2, v1, Le/b0;->a:Ljava/lang/Object;

    check-cast v2, Landroidx/fragment/app/c1;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v12, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Le/b0;->b()V

    goto :goto_8

    :cond_f
    move-object/from16 v23, v5

    move-object v7, v6

    move-object v2, v12

    move-object/from16 v26, v14

    const/4 v0, 0x0

    move-object v14, v11

    goto/16 :goto_21

    :cond_10
    new-instance v13, Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v13, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ln/b;

    invoke-direct {v0}, Ln/k;-><init>()V

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v24

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v25, 0x0

    :goto_9
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_22

    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v26, v14

    move-object/from16 v14, v18

    check-cast v14, Landroidx/fragment/app/g;

    iget-object v14, v14, Landroidx/fragment/app/g;->e:Ljava/lang/Object;

    if-eqz v14, :cond_21

    if-eqz v9, :cond_21

    if-eqz v10, :cond_21

    invoke-virtual {v3, v14}, Landroidx/fragment/app/y0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/fragment/app/y0;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iget-object v4, v10, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    move-object/from16 v27, v11

    iget-object v11, v4, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-eqz v11, :cond_12

    iget-object v11, v11, Landroidx/fragment/app/o;->i:Ljava/util/ArrayList;

    if-nez v11, :cond_11

    goto :goto_b

    :cond_11
    :goto_a
    move-object/from16 v28, v5

    goto :goto_c

    :cond_12
    :goto_b
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    goto :goto_a

    :goto_c
    iget-object v5, v9, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    iget-object v6, v5, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-eqz v6, :cond_14

    iget-object v6, v6, Landroidx/fragment/app/o;->i:Ljava/util/ArrayList;

    if-nez v6, :cond_13

    goto :goto_e

    :cond_13
    :goto_d
    move-object/from16 v29, v15

    goto :goto_f

    :cond_14
    :goto_e
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    goto :goto_d

    :goto_f
    iget-object v15, v5, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-eqz v15, :cond_15

    iget-object v15, v15, Landroidx/fragment/app/o;->j:Ljava/util/ArrayList;

    if-nez v15, :cond_16

    :cond_15
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :cond_16
    move-object/from16 v30, v12

    move-object/from16 v31, v13

    const/4 v12, 0x0

    :goto_10
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-ge v12, v13, :cond_18

    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v18, v15

    const/4 v15, -0x1

    if-eq v13, v15, :cond_17

    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v11, v13, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_17
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v15, v18

    goto :goto_10

    :cond_18
    iget-object v6, v4, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-eqz v6, :cond_19

    iget-object v6, v6, Landroidx/fragment/app/o;->j:Ljava/util/ArrayList;

    if-nez v6, :cond_1a

    :cond_19
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :cond_1a
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_11
    if-ge v13, v12, :cond_1b

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    move/from16 v19, v12

    move-object/from16 v12, v18

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v0, v15, v12}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v13, v13, 0x1

    move/from16 v12, v19

    goto :goto_11

    :cond_1b
    new-instance v12, Ln/b;

    invoke-direct {v12}, Ln/k;-><init>()V

    iget-object v13, v5, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-static {v12, v13}, Landroidx/fragment/app/h;->j(Ln/b;Landroid/view/View;)V

    invoke-static {v12, v11}, Lh/d;->n(Ljava/util/Map;Ljava/util/Collection;)Z

    invoke-virtual {v12}, Ln/b;->keySet()Ljava/util/Set;

    move-result-object v13

    invoke-static {v0, v13}, Lh/d;->n(Ljava/util/Map;Ljava/util/Collection;)Z

    new-instance v13, Ln/b;

    invoke-direct {v13}, Ln/k;-><init>()V

    iget-object v15, v4, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-static {v13, v15}, Landroidx/fragment/app/h;->j(Ln/b;Landroid/view/View;)V

    invoke-static {v13, v6}, Lh/d;->n(Ljava/util/Map;Ljava/util/Collection;)Z

    invoke-virtual {v0}, Ln/b;->values()Ljava/util/Collection;

    move-result-object v15

    invoke-static {v13, v15}, Lh/d;->n(Ljava/util/Map;Ljava/util/Collection;)Z

    sget-object v15, Landroidx/fragment/app/r0;->a:Landroidx/fragment/app/w0;

    iget v15, v0, Ln/k;->d:I

    const/16 v18, 0x1

    add-int/lit8 v15, v15, -0x1

    :goto_12
    if-ltz v15, :cond_1d

    invoke-virtual {v0, v15}, Ln/k;->j(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v6

    move-object/from16 v6, v18

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v13, v6}, Ln/k;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1c

    invoke-virtual {v0, v15}, Ln/k;->i(I)Ljava/lang/Object;

    :cond_1c
    add-int/lit8 v15, v15, -0x1

    move-object/from16 v6, v19

    goto :goto_12

    :cond_1d
    move-object/from16 v19, v6

    invoke-virtual {v0}, Ln/b;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-static {v12, v6}, Landroidx/fragment/app/h;->k(Ln/b;Ljava/util/Collection;)V

    invoke-virtual {v0}, Ln/b;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-static {v13, v6}, Landroidx/fragment/app/h;->k(Ln/b;Ljava/util/Collection;)V

    invoke-virtual {v0}, Ln/k;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    move-object v12, v0

    move-object v13, v1

    move-object v15, v2

    move-object/from16 p1, v16

    move-object/from16 v7, v17

    move-object/from16 v5, v28

    move-object/from16 v2, v30

    move-object/from16 v0, v31

    const/4 v4, 0x0

    goto/16 :goto_15

    :cond_1e
    invoke-static {v4, v5, v7}, Landroidx/fragment/app/r0;->a(Landroidx/fragment/app/q;Landroidx/fragment/app/q;Z)V

    new-instance v4, Landroidx/fragment/app/e;

    invoke-direct {v4, v10, v9, v7, v13}, Landroidx/fragment/app/e;-><init>(Landroidx/fragment/app/c1;Landroidx/fragment/app/c1;ZLn/b;)V

    invoke-static {v8, v4}, Li0/v;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    invoke-virtual {v12}, Ln/b;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1f

    const/4 v4, 0x0

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v12, v5, v4}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    invoke-virtual {v3, v5, v14}, Landroidx/fragment/app/y0;->n(Landroid/view/View;Ljava/lang/Object;)V

    move-object/from16 v28, v5

    :cond_1f
    invoke-virtual {v13}, Ln/b;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_20

    move-object/from16 v6, v19

    const/4 v4, 0x0

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v13, v5, v6}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    if-eqz v5, :cond_20

    new-instance v6, Lh/g;

    const/4 v11, 0x1

    move-object v12, v0

    move-object v0, v6

    move-object v13, v1

    move-object/from16 v1, p0

    move-object v15, v2

    move-object v2, v3

    move-object/from16 v32, v3

    move-object v3, v5

    move v5, v4

    move-object/from16 p1, v16

    move-object/from16 v4, p1

    move-object/from16 v7, v17

    move v5, v11

    invoke-direct/range {v0 .. v5}, Lh/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v8, v6}, Li0/v;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    move-object/from16 v0, v31

    move-object/from16 v3, v32

    const/16 v25, 0x1

    goto :goto_13

    :cond_20
    move-object v12, v0

    move-object v13, v1

    move-object v15, v2

    move-object/from16 v32, v3

    move-object/from16 p1, v16

    move-object/from16 v7, v17

    move-object/from16 v0, v31

    move-object/from16 v3, v32

    :goto_13
    invoke-virtual {v3, v14, v0, v15}, Landroidx/fragment/app/y0;->r(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, v3

    move-object/from16 v17, v14

    move-object/from16 v22, v14

    move-object/from16 v23, v13

    invoke-virtual/range {v16 .. v23}, Landroidx/fragment/app/y0;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v2, v30

    invoke-virtual {v2, v9, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v10, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v4, v14

    :goto_14
    move-object/from16 v5, v28

    goto :goto_15

    :cond_21
    move-object/from16 v28, v5

    move-object/from16 v27, v11

    move-object/from16 v29, v15

    move-object/from16 p1, v16

    move-object/from16 v7, v17

    move-object v15, v2

    move-object v2, v12

    move-object v12, v0

    move-object v0, v13

    move-object v13, v1

    goto :goto_14

    :goto_15
    move-object/from16 v6, p0

    move-object/from16 v16, p1

    move-object/from16 v17, v7

    move-object v1, v13

    move-object/from16 v14, v26

    move-object/from16 v11, v27

    move/from16 v7, p2

    move-object v13, v0

    move-object v0, v12

    move-object v12, v2

    move-object v2, v15

    move-object/from16 v15, v29

    goto/16 :goto_9

    :cond_22
    move-object/from16 v28, v5

    move-object/from16 v27, v11

    move-object/from16 v26, v14

    move-object/from16 v29, v15

    move-object/from16 p1, v16

    move-object/from16 v7, v17

    move-object v15, v2

    move-object v2, v12

    move-object v12, v0

    move-object v0, v13

    move-object v13, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {v29 .. v29}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v11, 0x0

    :goto_16
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/fragment/app/g;

    invoke-virtual {v14}, Le/b0;->e()Z

    move-result v16

    if-eqz v16, :cond_23

    move-object/from16 p2, v5

    iget-object v5, v14, Le/b0;->a:Ljava/lang/Object;

    check-cast v5, Landroidx/fragment/app/c1;

    move-object/from16 v24, v12

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v5, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v14}, Le/b0;->b()V

    move-object/from16 v5, p2

    move-object/from16 v12, v24

    goto :goto_16

    :cond_23
    move-object/from16 p2, v5

    move-object/from16 v24, v12

    iget-object v5, v14, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    invoke-virtual {v3, v5}, Landroidx/fragment/app/y0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iget-object v12, v14, Le/b0;->a:Ljava/lang/Object;

    check-cast v12, Landroidx/fragment/app/c1;

    if-eqz v4, :cond_25

    if-eq v12, v9, :cond_24

    if-ne v12, v10, :cond_25

    :cond_24
    const/16 v16, 0x1

    goto :goto_17

    :cond_25
    const/16 v16, 0x0

    :goto_17
    if-nez v5, :cond_27

    if-nez v16, :cond_26

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v12, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v14}, Le/b0;->b()V

    :cond_26
    move-object/from16 v16, v0

    move-object/from16 v31, v4

    move-object/from16 v23, v7

    move-object/from16 v30, v10

    move-object/from16 v4, v28

    const/4 v10, 0x0

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    goto/16 :goto_1b

    :cond_27
    move-object/from16 v30, v10

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v31, v4

    iget-object v4, v12, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    iget-object v4, v4, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-static {v10, v4}, Landroidx/fragment/app/h;->i(Ljava/util/ArrayList;Landroid/view/View;)V

    if-eqz v16, :cond_29

    if-ne v12, v9, :cond_28

    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    goto :goto_18

    :cond_28
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    :cond_29
    :goto_18
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2b

    invoke-virtual {v3, v0, v5}, Landroidx/fragment/app/y0;->a(Landroid/view/View;Ljava/lang/Object;)V

    move-object/from16 v16, v0

    :cond_2a
    move-object/from16 v23, v7

    move-object/from16 v7, p0

    goto :goto_19

    :cond_2b
    invoke-virtual {v3, v5, v10}, Landroidx/fragment/app/y0;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v16, v3

    move-object/from16 v17, v5

    move-object/from16 v18, v5

    move-object/from16 v19, v10

    invoke-virtual/range {v16 .. v23}, Landroidx/fragment/app/y0;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    iget v4, v12, Landroidx/fragment/app/c1;->a:I

    move-object/from16 v16, v0

    const/4 v0, 0x3

    if-ne v4, v0, :cond_2a

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v4, v12, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    move-object/from16 v23, v7

    iget-object v7, v4, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v4, v4, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual {v3, v5, v4, v0}, Landroidx/fragment/app/y0;->l(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    new-instance v0, Li/j;

    const/4 v4, 0x5

    move-object/from16 v7, p0

    invoke-direct {v0, v7, v4, v10}, Li/j;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v8, v0}, Li0/v;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    :goto_19
    iget v0, v12, Landroidx/fragment/app/c1;->a:I

    const/4 v4, 0x2

    if-ne v0, v4, :cond_2d

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object/from16 v0, p1

    if-eqz v25, :cond_2c

    invoke-virtual {v3, v5, v0}, Landroidx/fragment/app/y0;->o(Ljava/lang/Object;Landroid/graphics/Rect;)V

    :cond_2c
    move-object/from16 v4, v28

    goto :goto_1a

    :cond_2d
    move-object/from16 v0, p1

    move-object/from16 v4, v28

    invoke-virtual {v3, v4, v5}, Landroidx/fragment/app/y0;->n(Landroid/view/View;Ljava/lang/Object;)V

    :goto_1a
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v10, v14, Landroidx/fragment/app/g;->d:Z

    if-eqz v10, :cond_2e

    const/4 v10, 0x0

    invoke-virtual {v3, v6, v5, v10}, Landroidx/fragment/app/y0;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    goto :goto_1b

    :cond_2e
    const/4 v10, 0x0

    invoke-virtual {v3, v11, v5, v10}, Landroidx/fragment/app/y0;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    :goto_1b
    move-object/from16 v5, p2

    move-object/from16 p1, v0

    move-object/from16 v28, v4

    move-object/from16 v0, v16

    move-object/from16 v7, v23

    move-object/from16 v12, v24

    move-object/from16 v10, v30

    move-object/from16 v4, v31

    goto/16 :goto_16

    :cond_2f
    move-object v5, v4

    move-object/from16 v23, v7

    move-object/from16 v30, v10

    move-object/from16 v24, v12

    move-object/from16 v7, p0

    invoke-virtual {v3, v6, v11, v5}, Landroidx/fragment/app/y0;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual/range {v29 .. v29}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_37

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/g;

    invoke-virtual {v6}, Le/b0;->e()Z

    move-result v10

    if-eqz v10, :cond_30

    goto :goto_1c

    :cond_30
    iget-object v10, v6, Le/b0;->a:Ljava/lang/Object;

    check-cast v10, Landroidx/fragment/app/c1;

    move-object/from16 v11, v30

    if-eqz v5, :cond_32

    if-eq v10, v9, :cond_31

    if-ne v10, v11, :cond_32

    :cond_31
    const/4 v12, 0x1

    goto :goto_1d

    :cond_32
    const/4 v12, 0x0

    :goto_1d
    iget-object v14, v6, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    if-nez v14, :cond_34

    if-eqz v12, :cond_33

    goto :goto_1e

    :cond_33
    move-object/from16 p1, v4

    move-object/from16 v14, v27

    goto :goto_20

    :cond_34
    :goto_1e
    sget-object v12, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v8}, Li0/h0;->c(Landroid/view/View;)Z

    move-result v12

    if-nez v12, :cond_36

    move-object/from16 v14, v27

    const/4 v12, 0x2

    invoke-static {v14, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v16

    if-eqz v16, :cond_35

    new-instance v12, Ljava/lang/StringBuilder;

    move-object/from16 p1, v4

    const-string v4, "SpecialEffectsController: Container "

    invoke-direct {v12, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " has not been laid out. Completing operation "

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v14, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1f

    :cond_35
    move-object/from16 p1, v4

    :goto_1f
    invoke-virtual {v6}, Le/b0;->b()V

    goto :goto_20

    :cond_36
    move-object/from16 p1, v4

    move-object/from16 v14, v27

    iget-object v4, v6, Le/b0;->a:Ljava/lang/Object;

    check-cast v4, Landroidx/fragment/app/c1;

    iget-object v4, v4, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    new-instance v4, Li/j;

    const/4 v10, 0x6

    invoke-direct {v4, v7, v10, v6}, Li/j;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v3, v0, v4}, Landroidx/fragment/app/y0;->p(Ljava/lang/Object;Ljava/lang/Runnable;)V

    :goto_20
    move-object/from16 v4, p1

    move-object/from16 v30, v11

    move-object/from16 v27, v14

    goto :goto_1c

    :cond_37
    move-object/from16 v14, v27

    sget-object v4, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v8}, Li0/h0;->c(Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_38

    const/4 v0, 0x0

    goto :goto_21

    :cond_38
    const/4 v4, 0x4

    invoke-static {v1, v4}, Landroidx/fragment/app/r0;->b(Ljava/util/ArrayList;I)V

    invoke-static {v13}, Landroidx/fragment/app/y0;->k(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v3, v8, v0}, Landroidx/fragment/app/y0;->c(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    move-object/from16 v0, v24

    invoke-static {v8, v15, v13, v4, v0}, Landroidx/fragment/app/y0;->q(Landroid/view/ViewGroup;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ln/b;)V

    const/4 v0, 0x0

    invoke-static {v1, v0}, Landroidx/fragment/app/r0;->b(Ljava/util/ArrayList;I)V

    invoke-virtual {v3, v5, v15, v13}, Landroidx/fragment/app/y0;->s(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :goto_21
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {v26 .. v26}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v0

    :goto_22
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_40

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/f;

    invoke-virtual {v9}, Le/b0;->e()Z

    move-result v10

    if-eqz v10, :cond_39

    invoke-virtual {v9}, Le/b0;->b()V

    goto :goto_22

    :cond_39
    invoke-virtual {v9, v3}, Landroidx/fragment/app/f;->h(Landroid/content/Context;)Landroidx/fragment/app/x;

    move-result-object v10

    if-nez v10, :cond_3a

    invoke-virtual {v9}, Le/b0;->b()V

    goto :goto_22

    :cond_3a
    iget-object v10, v10, Landroidx/fragment/app/x;->b:Landroid/animation/Animator;

    if-nez v10, :cond_3b

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_22

    :cond_3b
    iget-object v11, v9, Le/b0;->a:Ljava/lang/Object;

    check-cast v11, Landroidx/fragment/app/c1;

    iget-object v12, v11, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v13, v15}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3d

    const/4 v13, 0x2

    invoke-static {v14, v13}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v10

    if-eqz v10, :cond_3c

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Ignoring Animator set on "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, " as this Fragment was involved in a Transition."

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v14, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3c
    invoke-virtual {v9}, Le/b0;->b()V

    goto :goto_22

    :cond_3d
    iget v6, v11, Landroidx/fragment/app/c1;->a:I

    const/4 v13, 0x3

    if-ne v6, v13, :cond_3e

    const/16 v20, 0x1

    goto :goto_23

    :cond_3e
    move/from16 v20, v0

    :goto_23
    move-object/from16 v15, v23

    if-eqz v20, :cond_3f

    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_3f
    iget-object v6, v12, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual {v8, v6}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v12, Landroidx/fragment/app/c;

    move-object/from16 v17, v12

    move-object/from16 v18, v8

    move-object/from16 v19, v6

    move-object/from16 v21, v11

    move-object/from16 v22, v9

    invoke-direct/range {v17 .. v22}, Landroidx/fragment/app/c;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/c1;Landroidx/fragment/app/f;)V

    invoke-virtual {v10, v12}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v10, v6}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    invoke-virtual {v10}, Landroid/animation/Animator;->start()V

    iget-object v6, v9, Le/b0;->b:Ljava/lang/Object;

    check-cast v6, Le0/e;

    new-instance v9, Li/a0;

    const/4 v11, 0x7

    invoke-direct {v9, v7, v10, v11}, Li/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v6, v9}, Le0/e;->b(Le0/d;)V

    move-object/from16 v23, v15

    const/4 v6, 0x1

    goto/16 :goto_22

    :cond_40
    move-object/from16 v15, v23

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_46

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/f;

    iget-object v4, v2, Le/b0;->a:Ljava/lang/Object;

    check-cast v4, Landroidx/fragment/app/c1;

    iget-object v5, v4, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    const-string v9, "Ignoring Animation set on "

    if-eqz v1, :cond_42

    const/4 v10, 0x2

    invoke-static {v14, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_41

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " as Animations cannot run alongside Transitions."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v14, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_41
    invoke-virtual {v2}, Le/b0;->b()V

    goto :goto_24

    :cond_42
    if-eqz v6, :cond_44

    const/4 v10, 0x2

    invoke-static {v14, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_43

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " as Animations cannot run alongside Animators."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v14, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_43
    invoke-virtual {v2}, Le/b0;->b()V

    goto :goto_24

    :cond_44
    const/4 v10, 0x2

    iget-object v5, v5, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroidx/fragment/app/f;->h(Landroid/content/Context;)Landroidx/fragment/app/x;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v9, v9, Landroidx/fragment/app/x;->a:Landroid/view/animation/Animation;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v4, Landroidx/fragment/app/c1;->a:I

    const/4 v11, 0x1

    if-eq v4, v11, :cond_45

    invoke-virtual {v5, v9}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v2}, Le/b0;->b()V

    goto :goto_25

    :cond_45
    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v4, Landroidx/fragment/app/y;

    invoke-direct {v4, v9, v8, v5}, Landroidx/fragment/app/y;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    new-instance v9, Landroidx/fragment/app/d;

    invoke-direct {v9, v5, v8, v2, v7}, Landroidx/fragment/app/d;-><init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/f;Landroidx/fragment/app/h;)V

    invoke-virtual {v4, v9}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v5, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :goto_25
    iget-object v4, v2, Le/b0;->b:Ljava/lang/Object;

    check-cast v4, Le0/e;

    new-instance v9, Lg/h;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    iput-object v7, v9, Lg/h;->e:Ljava/lang/Object;

    iput-object v5, v9, Lg/h;->c:Ljava/lang/Object;

    iput-object v8, v9, Lg/h;->b:Ljava/lang/Object;

    iput-object v2, v9, Lg/h;->d:Ljava/lang/Object;

    invoke-virtual {v4, v9}, Le0/e;->b(Le0/d;)V

    goto/16 :goto_24

    :cond_46
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_47

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/c1;

    iget-object v2, v1, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    iget-object v2, v2, Landroidx/fragment/app/q;->F:Landroid/view/View;

    iget v1, v1, Landroidx/fragment/app/c1;->a:I

    invoke-static {v1, v2}, La;->a(ILandroid/view/View;)V

    goto :goto_26

    :cond_47
    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
