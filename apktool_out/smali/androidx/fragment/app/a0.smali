.class public final Landroidx/fragment/app/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final b:Landroidx/fragment/app/i0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/a0;->b:Landroidx/fragment/app/i0;

    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const-class v4, Landroidx/fragment/app/FragmentContainerView;

    .line 2
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "Fragment "

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    iget-object v10, v1, Landroidx/fragment/app/a0;->b:Landroidx/fragment/app/i0;

    if-eqz v4, :cond_13

    .line 3
    new-instance v0, Landroidx/fragment/app/FragmentContainerView;

    .line 4
    invoke-direct {v0, v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-boolean v9, v0, Landroidx/fragment/app/FragmentContainerView;->e:Z

    .line 5
    invoke-interface/range {p4 .. p4}, Landroid/util/AttributeSet;->getClassAttribute()Ljava/lang/String;

    move-result-object v4

    sget-object v11, Ls0/a;->b:[I

    .line 6
    invoke-virtual {v2, v3, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    if-nez v4, :cond_0

    .line 7
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 8
    :cond_0
    invoke-virtual {v3, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 9
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v3

    .line 11
    invoke-virtual {v10, v3}, Landroidx/fragment/app/i0;->z(I)Landroidx/fragment/app/q;

    move-result-object v11

    if-eqz v4, :cond_10

    if-nez v11, :cond_10

    const-string v11, " with tag "

    if-gtz v3, :cond_2

    if-eqz v7, :cond_1

    .line 12
    invoke-virtual {v11, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, ""

    .line 13
    :goto_0
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "FragmentContainerView must have an android:id to add Fragment "

    .line 14
    invoke-static {v3, v4, v0}, La;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 16
    :cond_2
    invoke-virtual {v10}, Landroidx/fragment/app/i0;->B()Landroidx/fragment/app/d0;

    move-result-object v3

    invoke-virtual/range {p3 .. p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    invoke-virtual {v3, v4}, Landroidx/fragment/app/d0;->a(Ljava/lang/String;)Landroidx/fragment/app/q;

    move-result-object v2

    .line 17
    iput-boolean v9, v2, Landroidx/fragment/app/q;->D:Z

    .line 18
    iget-object v3, v2, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    if-nez v3, :cond_3

    move-object v3, v8

    goto :goto_1

    :cond_3
    iget-object v3, v3, Landroidx/fragment/app/t;->j:Landroid/app/Activity;

    :goto_1
    if-eqz v3, :cond_4

    .line 19
    iput-boolean v9, v2, Landroidx/fragment/app/q;->D:Z

    .line 20
    :cond_4
    new-instance v3, Landroidx/fragment/app/a;

    invoke-direct {v3, v10}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/i0;)V

    iput-boolean v9, v3, Landroidx/fragment/app/a;->o:Z

    .line 21
    iput-object v0, v2, Landroidx/fragment/app/q;->E:Landroid/view/ViewGroup;

    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v4

    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    .line 24
    invoke-virtual {v12}, Ljava/lang/Class;->getModifiers()I

    move-result v13

    .line 25
    invoke-virtual {v12}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v14

    if-nez v14, :cond_f

    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v14

    if-eqz v14, :cond_f

    .line 26
    invoke-virtual {v12}, Ljava/lang/Class;->isMemberClass()Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v13

    if-eqz v13, :cond_f

    :cond_5
    const-string v5, " now "

    const-string v12, ": was "

    if-eqz v7, :cond_8

    .line 27
    iget-object v13, v2, Landroidx/fragment/app/q;->y:Ljava/lang/String;

    if-eqz v13, :cond_7

    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    goto :goto_2

    .line 28
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Can\'t change tag of fragment "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Landroidx/fragment/app/q;->y:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 29
    :cond_7
    :goto_2
    iput-object v7, v2, Landroidx/fragment/app/q;->y:Ljava/lang/String;

    :cond_8
    if-eqz v4, :cond_c

    if-eq v4, v6, :cond_b

    .line 30
    iget v6, v2, Landroidx/fragment/app/q;->w:I

    if-eqz v6, :cond_a

    if-ne v6, v4, :cond_9

    goto :goto_3

    .line 31
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Can\'t change container ID of fragment "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v2, Landroidx/fragment/app/q;->w:I

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 32
    :cond_a
    :goto_3
    iput v4, v2, Landroidx/fragment/app/q;->w:I

    iput v4, v2, Landroidx/fragment/app/q;->x:I

    goto :goto_4

    .line 33
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Can\'t add fragment "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to container view with no id"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_c
    :goto_4
    new-instance v4, Landroidx/fragment/app/p0;

    invoke-direct {v4, v9, v2}, Landroidx/fragment/app/p0;-><init>(ILandroidx/fragment/app/q;)V

    invoke-virtual {v3, v4}, Landroidx/fragment/app/a;->b(Landroidx/fragment/app/p0;)V

    iget-object v4, v3, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/i0;

    .line 35
    iput-object v4, v2, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    iget-boolean v2, v3, Landroidx/fragment/app/a;->g:Z

    if-nez v2, :cond_e

    .line 36
    iget-object v2, v4, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    if-eqz v2, :cond_10

    .line 37
    iget-boolean v2, v4, Landroidx/fragment/app/i0;->C:Z

    if-eqz v2, :cond_d

    goto :goto_5

    .line 38
    :cond_d
    invoke-virtual {v4, v9}, Landroidx/fragment/app/i0;->w(Z)V

    .line 39
    iget-object v2, v4, Landroidx/fragment/app/i0;->E:Ljava/util/ArrayList;

    iget-object v5, v4, Landroidx/fragment/app/i0;->F:Ljava/util/ArrayList;

    invoke-virtual {v3, v2, v5}, Landroidx/fragment/app/a;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 40
    iput-boolean v9, v4, Landroidx/fragment/app/i0;->b:Z

    .line 41
    :try_start_0
    iget-object v2, v4, Landroidx/fragment/app/i0;->E:Ljava/util/ArrayList;

    iget-object v3, v4, Landroidx/fragment/app/i0;->F:Ljava/util/ArrayList;

    invoke-virtual {v4, v2, v3}, Landroidx/fragment/app/i0;->N(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    invoke-virtual {v4}, Landroidx/fragment/app/i0;->d()V

    .line 43
    invoke-virtual {v4}, Landroidx/fragment/app/i0;->Y()V

    .line 44
    invoke-virtual {v4}, Landroidx/fragment/app/i0;->t()V

    .line 45
    iget-object v2, v4, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object v2, v2, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    .line 46
    invoke-static {v8}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    goto :goto_5

    :catchall_0
    move-exception v0

    .line 47
    invoke-virtual {v4}, Landroidx/fragment/app/i0;->d()V

    .line 48
    throw v0

    .line 49
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "This transaction is already being added to the back stack"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " must be a public static class to be  properly recreated from instance state."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_10
    :goto_5
    iget-object v2, v10, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v2}, Landroidx/fragment/app/o0;->d()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_11
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/n0;

    .line 52
    iget-object v4, v3, Landroidx/fragment/app/n0;->c:Landroidx/fragment/app/q;

    .line 53
    iget v5, v4, Landroidx/fragment/app/q;->x:I

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v6

    if-ne v5, v6, :cond_11

    iget-object v5, v4, Landroidx/fragment/app/q;->F:Landroid/view/View;

    if-eqz v5, :cond_11

    .line 54
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    if-nez v5, :cond_11

    .line 55
    iput-object v0, v4, Landroidx/fragment/app/q;->E:Landroid/view/ViewGroup;

    .line 56
    invoke-virtual {v3}, Landroidx/fragment/app/n0;->b()V

    goto :goto_6

    :cond_12
    return-object v0

    :cond_13
    const-string v4, "fragment"

    .line 57
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    return-object v8

    :cond_14
    const-string v0, "class"

    .line 58
    invoke-interface {v3, v8, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v4, Ls0/a;->a:[I

    .line 59
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    if-nez v0, :cond_15

    .line 60
    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 61
    :cond_15
    invoke-virtual {v4, v9, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v11

    const/4 v12, 0x2

    .line 62
    invoke-virtual {v4, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 63
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v0, :cond_2c

    .line 64
    invoke-virtual/range {p3 .. p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    .line 65
    :try_start_1
    invoke-static {v4, v0}, Landroidx/fragment/app/d0;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const-class v14, Landroidx/fragment/app/q;

    .line 66
    invoke-virtual {v14, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    if-nez v4, :cond_16

    goto/16 :goto_10

    :cond_16
    if-eqz p1, :cond_17

    .line 67
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getId()I

    move-result v7

    :cond_17
    if-ne v7, v6, :cond_19

    if-ne v11, v6, :cond_19

    if-eqz v13, :cond_18

    goto :goto_7

    .line 68
    :cond_18
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p4 .. p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_19
    :goto_7
    if-eq v11, v6, :cond_1a

    .line 69
    invoke-virtual {v10, v11}, Landroidx/fragment/app/i0;->z(I)Landroidx/fragment/app/q;

    move-result-object v4

    goto :goto_8

    :cond_1a
    move-object v4, v8

    :goto_8
    if-nez v4, :cond_1f

    if-eqz v13, :cond_1f

    .line 70
    iget-object v4, v10, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    .line 71
    iget-object v14, v4, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    .line 72
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v15

    sub-int/2addr v15, v9

    :goto_9
    if-ltz v15, :cond_1c

    .line 73
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v8, v16

    check-cast v8, Landroidx/fragment/app/q;

    if-eqz v8, :cond_1b

    .line 74
    iget-object v12, v8, Landroidx/fragment/app/q;->y:Ljava/lang/String;

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1b

    :goto_a
    move-object v4, v8

    goto :goto_b

    :cond_1b
    add-int/lit8 v15, v15, -0x1

    const/4 v8, 0x0

    const/4 v12, 0x2

    goto :goto_9

    .line 75
    :cond_1c
    iget-object v4, v4, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    .line 76
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/n0;

    if-eqz v8, :cond_1d

    .line 77
    iget-object v8, v8, Landroidx/fragment/app/n0;->c:Landroidx/fragment/app/q;

    iget-object v12, v8, Landroidx/fragment/app/q;->y:Ljava/lang/String;

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1d

    goto :goto_a

    :cond_1e
    const/4 v4, 0x0

    :cond_1f
    :goto_b
    if-nez v4, :cond_20

    if-eq v7, v6, :cond_20

    .line 78
    invoke-virtual {v10, v7}, Landroidx/fragment/app/i0;->z(I)Landroidx/fragment/app/q;

    move-result-object v4

    :cond_20
    const-string v6, "FragmentManager"

    if-nez v4, :cond_24

    .line 79
    invoke-virtual {v10}, Landroidx/fragment/app/i0;->B()Landroidx/fragment/app/d0;

    move-result-object v3

    .line 80
    invoke-virtual/range {p3 .. p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 81
    invoke-virtual {v3, v0}, Landroidx/fragment/app/d0;->a(Ljava/lang/String;)Landroidx/fragment/app/q;

    move-result-object v4

    .line 82
    iput-boolean v9, v4, Landroidx/fragment/app/q;->n:Z

    if-eqz v11, :cond_21

    move v2, v11

    goto :goto_c

    :cond_21
    move v2, v7

    .line 83
    :goto_c
    iput v2, v4, Landroidx/fragment/app/q;->w:I

    .line 84
    iput v7, v4, Landroidx/fragment/app/q;->x:I

    .line 85
    iput-object v13, v4, Landroidx/fragment/app/q;->y:Ljava/lang/String;

    .line 86
    iput-boolean v9, v4, Landroidx/fragment/app/q;->o:Z

    .line 87
    iput-object v10, v4, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    .line 88
    iget-object v2, v10, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    .line 89
    iput-object v2, v4, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    .line 90
    iget-object v3, v2, Landroidx/fragment/app/t;->k:Landroid/content/Context;

    .line 91
    iput-boolean v9, v4, Landroidx/fragment/app/q;->D:Z

    if-nez v2, :cond_22

    const/4 v8, 0x0

    goto :goto_d

    .line 92
    :cond_22
    iget-object v8, v2, Landroidx/fragment/app/t;->j:Landroid/app/Activity;

    :goto_d
    if-eqz v8, :cond_23

    .line 93
    iput-boolean v9, v4, Landroidx/fragment/app/q;->D:Z

    .line 94
    :cond_23
    invoke-virtual {v10, v4}, Landroidx/fragment/app/i0;->a(Landroidx/fragment/app/q;)Landroidx/fragment/app/n0;

    move-result-object v2

    const/4 v3, 0x2

    .line 95
    invoke-static {v6, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_27

    .line 96
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " has been inflated via the <fragment> tag: id=0x"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 98
    invoke-static {v6, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_f

    .line 99
    :cond_24
    iget-boolean v2, v4, Landroidx/fragment/app/q;->o:Z

    if-nez v2, :cond_2b

    .line 100
    iput-boolean v9, v4, Landroidx/fragment/app/q;->o:Z

    .line 101
    iput-object v10, v4, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    .line 102
    iget-object v2, v10, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    .line 103
    iput-object v2, v4, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    .line 104
    iget-object v3, v2, Landroidx/fragment/app/t;->k:Landroid/content/Context;

    .line 105
    iput-boolean v9, v4, Landroidx/fragment/app/q;->D:Z

    if-nez v2, :cond_25

    const/4 v8, 0x0

    goto :goto_e

    .line 106
    :cond_25
    iget-object v8, v2, Landroidx/fragment/app/t;->j:Landroid/app/Activity;

    :goto_e
    if-eqz v8, :cond_26

    .line 107
    iput-boolean v9, v4, Landroidx/fragment/app/q;->D:Z

    .line 108
    :cond_26
    invoke-virtual {v10, v4}, Landroidx/fragment/app/i0;->f(Landroidx/fragment/app/q;)Landroidx/fragment/app/n0;

    move-result-object v2

    const/4 v3, 0x2

    .line 109
    invoke-static {v6, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_27

    .line 110
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "Retained Fragment "

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " has been re-attached via the <fragment> tag: id=0x"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 112
    invoke-static {v6, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    :cond_27
    :goto_f
    move-object/from16 v3, p1

    check-cast v3, Landroid/view/ViewGroup;

    iput-object v3, v4, Landroidx/fragment/app/q;->E:Landroid/view/ViewGroup;

    .line 114
    invoke-virtual {v2}, Landroidx/fragment/app/n0;->k()V

    .line 115
    invoke-virtual {v2}, Landroidx/fragment/app/n0;->j()V

    .line 116
    iget-object v3, v4, Landroidx/fragment/app/q;->F:Landroid/view/View;

    if-eqz v3, :cond_2a

    if-eqz v11, :cond_28

    .line 117
    invoke-virtual {v3, v11}, Landroid/view/View;->setId(I)V

    .line 118
    :cond_28
    iget-object v0, v4, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_29

    .line 119
    iget-object v0, v4, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual {v0, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 120
    :cond_29
    iget-object v0, v4, Landroidx/fragment/app/q;->F:Landroid/view/View;

    new-instance v3, Landroidx/fragment/app/z;

    invoke-direct {v3, v1, v2}, Landroidx/fragment/app/z;-><init>(Landroidx/fragment/app/a0;Landroidx/fragment/app/n0;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 121
    iget-object v0, v4, Landroidx/fragment/app/q;->F:Landroid/view/View;

    return-object v0

    .line 122
    :cond_2a
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, " did not create a view."

    .line 123
    invoke-static {v5, v0, v3}, La;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 124
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 125
    :cond_2b
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p4 .. p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": Duplicate id 0x"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", tag "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", or parent id 0x"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " with another fragment for "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :catch_0
    :goto_10
    const/4 v0, 0x0

    goto :goto_11

    :cond_2c
    move-object v0, v8

    :goto_11
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/a0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
