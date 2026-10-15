.class public final Landroidx/fragment/app/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Ljava/util/ArrayList;

.field public F:Ljava/util/ArrayList;

.field public G:Ljava/util/ArrayList;

.field public H:Landroidx/fragment/app/k0;

.field public final I:Landroidx/fragment/app/v;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Landroidx/fragment/app/o0;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Landroidx/fragment/app/a0;

.field public g:Landroidx/activity/z;

.field public final h:Landroidx/fragment/app/c0;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;

.field public final k:Ljava/util/Map;

.field public final l:Landroidx/fragment/app/b0;

.field public final m:Li/a0;

.field public final n:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public o:I

.field public p:Landroidx/fragment/app/t;

.field public q:Lc3/h;

.field public r:Landroidx/fragment/app/q;

.field public s:Landroidx/fragment/app/q;

.field public final t:Landroidx/fragment/app/d0;

.field public final u:Landroidx/fragment/app/b0;

.field public v:Landroidx/activity/result/d;

.field public w:Landroidx/activity/result/d;

.field public x:Landroidx/activity/result/d;

.field public y:Ljava/util/ArrayDeque;

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    new-instance v0, Landroidx/fragment/app/o0;

    invoke-direct {v0}, Landroidx/fragment/app/o0;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    new-instance v0, Landroidx/fragment/app/a0;

    invoke-direct {v0, p0}, Landroidx/fragment/app/a0;-><init>(Landroidx/fragment/app/i0;)V

    iput-object v0, p0, Landroidx/fragment/app/i0;->f:Landroidx/fragment/app/a0;

    new-instance v0, Landroidx/fragment/app/c0;

    invoke-direct {v0, p0}, Landroidx/fragment/app/c0;-><init>(Landroidx/fragment/app/i0;)V

    iput-object v0, p0, Landroidx/fragment/app/i0;->h:Landroidx/fragment/app/c0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/i0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/i0;->j:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/i0;->k:Ljava/util/Map;

    new-instance v0, Landroidx/fragment/app/b0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/b0;-><init>(Landroidx/fragment/app/i0;I)V

    iput-object v0, p0, Landroidx/fragment/app/i0;->l:Landroidx/fragment/app/b0;

    new-instance v0, Li/a0;

    invoke-direct {v0, p0}, Li/a0;-><init>(Landroidx/fragment/app/i0;)V

    iput-object v0, p0, Landroidx/fragment/app/i0;->m:Li/a0;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/i0;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/i0;->o:I

    new-instance v0, Landroidx/fragment/app/d0;

    invoke-direct {v0, p0}, Landroidx/fragment/app/d0;-><init>(Landroidx/fragment/app/i0;)V

    iput-object v0, p0, Landroidx/fragment/app/i0;->t:Landroidx/fragment/app/d0;

    new-instance v0, Landroidx/fragment/app/b0;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/b0;-><init>(Landroidx/fragment/app/i0;I)V

    iput-object v0, p0, Landroidx/fragment/app/i0;->u:Landroidx/fragment/app/b0;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/i0;->y:Ljava/util/ArrayDeque;

    new-instance v0, Landroidx/fragment/app/v;

    invoke-direct {v0, v1, p0}, Landroidx/fragment/app/v;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/fragment/app/i0;->I:Landroidx/fragment/app/v;

    return-void
.end method

.method public static E(Landroidx/fragment/app/q;)Z
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    iget-object p0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {p0}, Landroidx/fragment/app/o0;->e()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/q;

    if-eqz v2, :cond_1

    invoke-static {v2}, Landroidx/fragment/app/i0;->E(Landroidx/fragment/app/q;)Z

    move-result v1

    :cond_1
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public static F(Landroidx/fragment/app/q;)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Landroidx/fragment/app/q;->C:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    if-eqz v1, :cond_2

    iget-object p0, p0, Landroidx/fragment/app/q;->v:Landroidx/fragment/app/q;

    invoke-static {p0}, Landroidx/fragment/app/i0;->F(Landroidx/fragment/app/q;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return v0
.end method

.method public static G(Landroidx/fragment/app/q;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    iget-object v2, v1, Landroidx/fragment/app/i0;->s:Landroidx/fragment/app/q;

    invoke-virtual {p0, v2}, Landroidx/fragment/app/q;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, v1, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    invoke-static {p0}, Landroidx/fragment/app/i0;->G(Landroidx/fragment/app/q;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static V(Landroidx/fragment/app/q;)V
    .locals 3

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "show: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/q;->z:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/q;->z:Z

    iget-boolean v0, p0, Landroidx/fragment/app/q;->J:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/q;->J:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Landroidx/fragment/app/q;)Landroid/view/ViewGroup;
    .locals 2

    iget-object v0, p1, Landroidx/fragment/app/q;->E:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p1, Landroidx/fragment/app/q;->x:I

    const/4 v1, 0x0

    if-gtz v0, :cond_2

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/i0;->q:Lc3/h;

    invoke-virtual {v0}, Lc3/h;->J1()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/i0;->q:Lc3/h;

    iget p1, p1, Landroidx/fragment/app/q;->x:I

    invoke-virtual {v0, p1}, Lc3/h;->F1(I)Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    :goto_0
    return-object v0
.end method

.method public final B()Landroidx/fragment/app/d0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    invoke-virtual {v0}, Landroidx/fragment/app/i0;->B()Landroidx/fragment/app/d0;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/i0;->t:Landroidx/fragment/app/d0;

    :goto_0
    return-object v0
.end method

.method public final C()Landroidx/fragment/app/b0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    invoke-virtual {v0}, Landroidx/fragment/app/i0;->C()Landroidx/fragment/app/b0;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/i0;->u:Landroidx/fragment/app/b0;

    :goto_0
    return-object v0
.end method

.method public final D(Landroidx/fragment/app/q;)V
    .locals 3

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "hide: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/q;->z:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/fragment/app/q;->z:Z

    iget-boolean v1, p1, Landroidx/fragment/app/q;->J:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Landroidx/fragment/app/q;->J:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/i0;->U(Landroidx/fragment/app/q;)V

    :cond_1
    return-void
.end method

.method public final H(ILandroidx/fragment/app/q;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    iget-object v1, v7, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    iget-object v2, v0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object v3, v2, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/n0;

    iget-object v3, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    const/4 v8, 0x1

    if-nez v1, :cond_0

    new-instance v1, Landroidx/fragment/app/n0;

    invoke-direct {v1, v3, v2, v7}, Landroidx/fragment/app/n0;-><init>(Li/a0;Landroidx/fragment/app/o0;Landroidx/fragment/app/q;)V

    iput v8, v1, Landroidx/fragment/app/n0;->e:I

    :cond_0
    move-object v9, v1

    iget-boolean v1, v7, Landroidx/fragment/app/q;->n:Z

    const/4 v10, 0x2

    if-eqz v1, :cond_1

    iget-boolean v1, v7, Landroidx/fragment/app/q;->o:Z

    if-eqz v1, :cond_1

    iget v1, v7, Landroidx/fragment/app/q;->b:I

    if-ne v1, v10, :cond_1

    move/from16 v1, p1

    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_0

    :cond_1
    move/from16 v1, p1

    :goto_0
    invoke-virtual {v9}, Landroidx/fragment/app/n0;->d()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v11

    iget v1, v7, Landroidx/fragment/app/q;->b:I

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v12, 0x3

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v13, -0x1

    const-string v14, "FragmentManager"

    if-gt v1, v11, :cond_b

    if-ge v1, v11, :cond_3

    iget-object v1, v0, Landroidx/fragment/app/i0;->k:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, v0, Landroidx/fragment/app/i0;->k:Ljava/util/Map;

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/HashSet;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_2

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Le0/e;

    invoke-virtual/range {v16 .. v16}, Le0/e;->a()V

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    invoke-virtual/range {p2 .. p2}, Landroidx/fragment/app/q;->B()V

    invoke-virtual {v3, v4}, Li/a0;->p(Z)V

    iput-object v2, v7, Landroidx/fragment/app/q;->E:Landroid/view/ViewGroup;

    iput-object v2, v7, Landroidx/fragment/app/q;->F:Landroid/view/View;

    iput-object v2, v7, Landroidx/fragment/app/q;->O:Landroidx/fragment/app/z0;

    iget-object v1, v7, Landroidx/fragment/app/q;->P:Landroidx/lifecycle/x;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->e(Ljava/lang/Object;)V

    iput-boolean v4, v7, Landroidx/fragment/app/q;->o:Z

    iget-object v1, v0, Landroidx/fragment/app/i0;->k:Ljava/util/Map;

    invoke-interface {v1, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget v1, v7, Landroidx/fragment/app/q;->b:I

    if-eq v1, v13, :cond_4

    if-eqz v1, :cond_5

    if-eq v1, v8, :cond_6

    if-eq v1, v10, :cond_8

    if-eq v1, v6, :cond_9

    if-eq v1, v5, :cond_a

    goto/16 :goto_6

    :cond_4
    if-le v11, v13, :cond_5

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->c()V

    :cond_5
    if-lez v11, :cond_6

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->e()V

    :cond_6
    if-le v11, v13, :cond_7

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->j()V

    :cond_7
    if-le v11, v8, :cond_8

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->f()V

    :cond_8
    if-le v11, v10, :cond_9

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->a()V

    :cond_9
    if-le v11, v6, :cond_a

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->p()V

    :cond_a
    if-le v11, v5, :cond_1c

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->n()V

    goto/16 :goto_6

    :cond_b
    if-le v1, v11, :cond_1c

    if-eqz v1, :cond_1a

    if-eq v1, v8, :cond_18

    if-eq v1, v10, :cond_10

    if-eq v1, v6, :cond_e

    if-eq v1, v5, :cond_d

    const/4 v3, 0x7

    if-eq v1, v3, :cond_c

    goto/16 :goto_6

    :cond_c
    if-ge v11, v3, :cond_d

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->l()V

    :cond_d
    if-ge v11, v5, :cond_e

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->q()V

    :cond_e
    if-ge v11, v6, :cond_10

    invoke-static {v14, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_f

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "movefrom ACTIVITY_CREATED: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v14, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_f
    iget-object v1, v7, Landroidx/fragment/app/q;->F:Landroid/view/View;

    if-eqz v1, :cond_10

    iget-object v1, v0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iget-object v1, v1, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    xor-int/2addr v1, v8

    if-eqz v1, :cond_10

    iget-object v1, v7, Landroidx/fragment/app/q;->d:Landroid/util/SparseArray;

    if-nez v1, :cond_10

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->o()V

    :cond_10
    if-ge v11, v10, :cond_18

    iget-object v1, v7, Landroidx/fragment/app/q;->F:Landroid/view/View;

    if-eqz v1, :cond_16

    iget-object v3, v7, Landroidx/fragment/app/q;->E:Landroid/view/ViewGroup;

    if-eqz v3, :cond_16

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v1, v7, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    invoke-virtual/range {p2 .. p2}, Landroidx/fragment/app/q;->n()Z

    move-result v1

    if-nez v1, :cond_16

    iget v1, v0, Landroidx/fragment/app/i0;->o:I

    const/4 v3, 0x0

    if-le v1, v13, :cond_12

    iget-boolean v1, v0, Landroidx/fragment/app/i0;->C:Z

    if-nez v1, :cond_12

    iget-object v1, v7, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_12

    iget v1, v7, Landroidx/fragment/app/q;->K:F

    cmpl-float v1, v1, v3

    if-ltz v1, :cond_12

    iget-object v1, v0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iget-object v1, v1, Landroidx/fragment/app/t;->k:Landroid/content/Context;

    iget-object v2, v7, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez v2, :cond_11

    move v2, v4

    goto :goto_2

    :cond_11
    iget-boolean v2, v2, Landroidx/fragment/app/o;->c:Z

    :goto_2
    invoke-static {v1, v7, v4, v2}, Lc3/h;->v1(Landroid/content/Context;Landroidx/fragment/app/q;ZZ)Landroidx/fragment/app/x;

    move-result-object v2

    :cond_12
    iput v3, v7, Landroidx/fragment/app/q;->K:F

    iget-object v13, v7, Landroidx/fragment/app/q;->E:Landroid/view/ViewGroup;

    iget-object v15, v7, Landroidx/fragment/app/q;->F:Landroid/view/View;

    if-eqz v2, :cond_14

    invoke-virtual {v13, v15}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v6, Le0/e;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroidx/fragment/app/k;

    invoke-direct {v1, v8, v7}, Landroidx/fragment/app/k;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v6, v1}, Le0/e;->b(Le0/d;)V

    iget-object v5, v0, Landroidx/fragment/app/i0;->l:Landroidx/fragment/app/b0;

    invoke-virtual {v5, v7, v6}, Landroidx/fragment/app/b0;->d(Landroidx/fragment/app/q;Le0/e;)V

    iget-object v1, v2, Landroidx/fragment/app/x;->a:Landroid/view/animation/Animation;

    if-eqz v1, :cond_13

    new-instance v2, Landroidx/fragment/app/y;

    invoke-direct {v2, v1, v13, v15}, Landroidx/fragment/app/y;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    iget-object v1, v7, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual/range {p2 .. p2}, Landroidx/fragment/app/q;->d()Landroidx/fragment/app/o;

    move-result-object v3

    iput-object v1, v3, Landroidx/fragment/app/o;->a:Landroid/view/View;

    new-instance v1, Landroidx/fragment/app/d;

    invoke-direct {v1, v13, v7, v5, v6}, Landroidx/fragment/app/d;-><init>(Landroid/view/ViewGroup;Landroidx/fragment/app/q;Landroidx/fragment/app/b0;Le0/e;)V

    invoke-virtual {v2, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    iget-object v1, v7, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_3

    :cond_13
    invoke-virtual/range {p2 .. p2}, Landroidx/fragment/app/q;->d()Landroidx/fragment/app/o;

    move-result-object v1

    iget-object v4, v2, Landroidx/fragment/app/x;->b:Landroid/animation/Animator;

    iput-object v4, v1, Landroidx/fragment/app/o;->b:Landroid/animation/Animator;

    new-instance v3, Landroidx/fragment/app/w;

    move-object v1, v3

    move-object v2, v13

    move-object v12, v3

    move-object v3, v15

    move-object v8, v4

    move-object/from16 v4, p2

    invoke-direct/range {v1 .. v6}, Landroidx/fragment/app/w;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/q;Landroidx/fragment/app/b0;Le0/e;)V

    invoke-virtual {v8, v12}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v1, v7, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-virtual {v8, v1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    invoke-virtual {v8}, Landroid/animation/Animator;->start()V

    :cond_14
    :goto_3
    invoke-virtual {v13, v15}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-static {v14, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_15

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Removing view "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " from container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v14, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_15
    iget-object v1, v7, Landroidx/fragment/app/q;->E:Landroid/view/ViewGroup;

    if-eq v13, v1, :cond_16

    goto :goto_7

    :cond_16
    iget-object v1, v0, Landroidx/fragment/app/i0;->k:Ljava/util/Map;

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_17

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->h()V

    :cond_17
    const/4 v1, 0x1

    goto :goto_4

    :cond_18
    move v1, v8

    :goto_4
    if-ge v11, v1, :cond_1a

    iget-object v2, v0, Landroidx/fragment/app/i0;->k:Ljava/util/Map;

    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_19

    move v8, v1

    goto :goto_5

    :cond_19
    invoke-virtual {v9}, Landroidx/fragment/app/n0;->g()V

    :cond_1a
    move v8, v11

    :goto_5
    if-gez v8, :cond_1b

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->i()V

    :cond_1b
    move v11, v8

    :cond_1c
    :goto_6
    iget v1, v7, Landroidx/fragment/app/q;->b:I

    if-eq v1, v11, :cond_1e

    const/4 v1, 0x3

    invoke-static {v14, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1d

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "moveToState: Fragment state for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not updated inline; expected state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " found "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v7, Landroidx/fragment/app/q;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v14, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1d
    iput v11, v7, Landroidx/fragment/app/q;->b:I

    :cond_1e
    :goto_7
    return-void
.end method

.method public final I(IZ)V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No activity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    iget p2, p0, Landroidx/fragment/app/i0;->o:I

    if-ne p1, p2, :cond_2

    goto :goto_3

    :cond_2
    iput p1, p0, Landroidx/fragment/app/i0;->o:I

    iget-object p1, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object p2, p1, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    iget-object v1, p1, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/n0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/fragment/app/n0;->k()V

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/n0;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroidx/fragment/app/n0;->k()V

    iget-object v1, v0, Landroidx/fragment/app/n0;->c:Landroidx/fragment/app/q;

    iget-boolean v2, v1, Landroidx/fragment/app/q;->m:Z

    if-eqz v2, :cond_5

    iget v1, v1, Landroidx/fragment/app/q;->r:I

    if-lez v1, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p1, v0}, Landroidx/fragment/app/o0;->h(Landroidx/fragment/app/n0;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/i0;->W()V

    iget-boolean p1, p0, Landroidx/fragment/app/i0;->z:Z

    if-eqz p1, :cond_8

    iget-object p1, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    if-eqz p1, :cond_8

    iget p2, p0, Landroidx/fragment/app/i0;->o:I

    const/4 v0, 0x7

    if-ne p2, v0, :cond_8

    iget-object p1, p1, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    check-cast p1, Le/m;

    invoke-virtual {p1}, Le/m;->l()Le/r;

    move-result-object p1

    invoke-virtual {p1}, Le/r;->b()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/i0;->z:Z

    :cond_8
    :goto_3
    return-void
.end method

.method public final J()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/i0;->A:Z

    iput-boolean v0, p0, Landroidx/fragment/app/i0;->B:Z

    iget-object v1, p0, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iput-boolean v0, v1, Landroidx/fragment/app/k0;->h:Z

    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v0}, Landroidx/fragment/app/o0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/q;

    if-eqz v1, :cond_1

    iget-object v1, v1, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v1}, Landroidx/fragment/app/i0;->J()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final K()Z
    .locals 7

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/i0;->x(Z)Z

    const/4 v6, 0x1

    invoke-virtual {p0, v6}, Landroidx/fragment/app/i0;->w(Z)V

    iget-object v0, p0, Landroidx/fragment/app/i0;->s:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->f()Landroidx/fragment/app/i0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/i0;->K()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/i0;->E:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/i0;->F:Ljava/util/ArrayList;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroidx/fragment/app/i0;->L(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-boolean v6, p0, Landroidx/fragment/app/i0;->b:Z

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/i0;->E:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/i0;->F:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v2}, Landroidx/fragment/app/i0;->N(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->d()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->d()V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/i0;->Y()V

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->t()V

    iget-object v1, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object v1, v1, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move v6, v0

    :goto_1
    return v6
.end method

.method public final L(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_7

    :cond_0
    const/4 v2, 0x1

    if-nez p3, :cond_2

    if-gez p4, :cond_2

    and-int/lit8 v3, p5, 0x1

    if-nez v3, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v2

    if-gez p3, :cond_1

    goto/16 :goto_7

    :cond_1
    iget-object p4, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :cond_2
    if-nez p3, :cond_4

    if-ltz p4, :cond_3

    goto :goto_0

    :cond_3
    const/4 p3, -0x1

    goto :goto_4

    :cond_4
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v2

    :goto_1
    if-ltz v0, :cond_7

    iget-object v3, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    if-eqz p3, :cond_5

    iget-object v4, v3, Landroidx/fragment/app/a;->h:Ljava/lang/String;

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    if-ltz p4, :cond_6

    iget v3, v3, Landroidx/fragment/app/a;->r:I

    if-ne p4, v3, :cond_6

    goto :goto_2

    :cond_6
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_7
    :goto_2
    if-gez v0, :cond_8

    goto :goto_7

    :cond_8
    and-int/2addr p5, v2

    if-eqz p5, :cond_b

    :cond_9
    :goto_3
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_b

    iget-object p5, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {p5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Landroidx/fragment/app/a;

    if-eqz p3, :cond_a

    iget-object v3, p5, Landroidx/fragment/app/a;->h:Ljava/lang/String;

    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_a
    if-ltz p4, :cond_b

    iget p5, p5, Landroidx/fragment/app/a;->r:I

    if-ne p4, p5, :cond_b

    goto :goto_3

    :cond_b
    move p3, v0

    :goto_4
    iget-object p4, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    sub-int/2addr p4, v2

    if-ne p3, p4, :cond_c

    goto :goto_7

    :cond_c
    iget-object p4, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    sub-int/2addr p4, v2

    :goto_5
    if-le p4, p3, :cond_d

    iget-object p5, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {p5, p4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p4, p4, -0x1

    goto :goto_5

    :cond_d
    :goto_6
    move v1, v2

    :goto_7
    return v1
.end method

.method public final M(Landroidx/fragment/app/q;)V
    .locals 4

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "remove: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " nesting="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Landroidx/fragment/app/q;->r:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget v0, p1, Landroidx/fragment/app/q;->r:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    xor-int/2addr v0, v2

    iget-boolean v3, p1, Landroidx/fragment/app/q;->A:Z

    if-eqz v3, :cond_2

    if-eqz v0, :cond_4

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object v3, v0, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    iget-object v0, v0, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p1, Landroidx/fragment/app/q;->l:Z

    invoke-static {p1}, Landroidx/fragment/app/i0;->E(Landroidx/fragment/app/q;)Z

    move-result v0

    if-eqz v0, :cond_3

    iput-boolean v2, p0, Landroidx/fragment/app/i0;->z:Z

    :cond_3
    iput-boolean v2, p1, Landroidx/fragment/app/q;->m:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/i0;->U(Landroidx/fragment/app/q;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final N(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-boolean v3, v3, Landroidx/fragment/app/a;->o:Z

    if-nez v3, :cond_3

    if-eq v2, v1, :cond_1

    invoke-virtual {p0, p1, p2, v2, v1}, Landroidx/fragment/app/i0;->y(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_1
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-boolean v3, v3, Landroidx/fragment/app/a;->o:Z

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Landroidx/fragment/app/i0;->y(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eq v2, v0, :cond_5

    invoke-virtual {p0, p1, p2, v2, v0}, Landroidx/fragment/app/i0;->y(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_5
    :goto_2
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final O(Landroid/os/Parcelable;)V
    .locals 18

    move-object/from16 v0, p0

    if-nez p1, :cond_0

    goto/16 :goto_b

    :cond_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/fragment/app/j0;

    iget-object v2, v1, Landroidx/fragment/app/j0;->b:Ljava/util/ArrayList;

    if-nez v2, :cond_1

    goto/16 :goto_b

    :cond_1
    iget-object v2, v0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object v3, v2, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    iget-object v3, v1, Landroidx/fragment/app/j0;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x2

    iget-object v6, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    const-string v7, "): "

    const-string v8, "FragmentManager"

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Landroidx/fragment/app/m0;

    if-eqz v14, :cond_2

    iget-object v4, v0, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iget-object v4, v4, Landroidx/fragment/app/k0;->c:Ljava/util/HashMap;

    iget-object v9, v14, Landroidx/fragment/app/m0;->c:Ljava/lang/String;

    invoke-virtual {v4, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/q;

    if-eqz v4, :cond_4

    invoke-static {v8, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_3

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "restoreSaveState: re-attaching retained "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    new-instance v9, Landroidx/fragment/app/n0;

    invoke-direct {v9, v6, v2, v4, v14}, Landroidx/fragment/app/n0;-><init>(Li/a0;Landroidx/fragment/app/o0;Landroidx/fragment/app/q;Landroidx/fragment/app/m0;)V

    goto :goto_1

    :cond_4
    new-instance v4, Landroidx/fragment/app/n0;

    iget-object v10, v0, Landroidx/fragment/app/i0;->m:Li/a0;

    iget-object v11, v0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object v6, v0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iget-object v6, v6, Landroidx/fragment/app/t;->k:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/i0;->B()Landroidx/fragment/app/d0;

    move-result-object v13

    move-object v9, v4

    invoke-direct/range {v9 .. v14}, Landroidx/fragment/app/n0;-><init>(Li/a0;Landroidx/fragment/app/o0;Ljava/lang/ClassLoader;Landroidx/fragment/app/d0;Landroidx/fragment/app/m0;)V

    :goto_1
    iget-object v4, v9, Landroidx/fragment/app/n0;->c:Landroidx/fragment/app/q;

    iput-object v0, v4, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    invoke-static {v8, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_5

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "restoreSaveState: active ("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    iget-object v4, v0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iget-object v4, v4, Landroidx/fragment/app/t;->k:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v9, v4}, Landroidx/fragment/app/n0;->m(Ljava/lang/ClassLoader;)V

    invoke-virtual {v2, v9}, Landroidx/fragment/app/o0;->g(Landroidx/fragment/app/n0;)V

    iget v4, v0, Landroidx/fragment/app/i0;->o:I

    iput v4, v9, Landroidx/fragment/app/n0;->e:I

    goto/16 :goto_0

    :cond_6
    iget-object v3, v0, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ljava/util/ArrayList;

    iget-object v3, v3, Landroidx/fragment/app/k0;->c:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v10, 0x1

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/q;

    iget-object v11, v4, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    iget-object v12, v2, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    invoke-virtual {v12, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_8

    move v9, v10

    goto :goto_3

    :cond_8
    const/4 v9, 0x0

    :goto_3
    if-nez v9, :cond_7

    invoke-static {v8, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_9

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v11, "Discarding retained Fragment "

    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, " that was not found in the set of active Fragments "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Landroidx/fragment/app/j0;->b:Ljava/util/ArrayList;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    iget-object v9, v0, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    invoke-virtual {v9, v4}, Landroidx/fragment/app/k0;->b(Landroidx/fragment/app/q;)V

    iput-object v0, v4, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    new-instance v9, Landroidx/fragment/app/n0;

    invoke-direct {v9, v6, v2, v4}, Landroidx/fragment/app/n0;-><init>(Li/a0;Landroidx/fragment/app/o0;Landroidx/fragment/app/q;)V

    iput v10, v9, Landroidx/fragment/app/n0;->e:I

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->k()V

    iput-boolean v10, v4, Landroidx/fragment/app/q;->m:Z

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->k()V

    goto :goto_2

    :cond_a
    iget-object v3, v1, Landroidx/fragment/app/j0;->c:Ljava/util/ArrayList;

    iget-object v4, v2, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    if-eqz v3, :cond_d

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Landroidx/fragment/app/o0;->b(Ljava/lang/String;)Landroidx/fragment/app/q;

    move-result-object v6

    if-eqz v6, :cond_c

    invoke-static {v8, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v11

    if-eqz v11, :cond_b

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "restoreSaveState: added ("

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    invoke-virtual {v2, v6}, Landroidx/fragment/app/o0;->a(Landroidx/fragment/app/q;)V

    goto :goto_4

    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No instantiated fragment for ("

    const-string v3, ")"

    invoke-static {v2, v4, v3}, La;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    iget-object v3, v1, Landroidx/fragment/app/j0;->d:[Landroidx/fragment/app/b;

    const/4 v4, 0x0

    if-eqz v3, :cond_13

    new-instance v3, Ljava/util/ArrayList;

    iget-object v6, v1, Landroidx/fragment/app/j0;->d:[Landroidx/fragment/app/b;

    array-length v6, v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, v0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    const/4 v3, 0x0

    :goto_5
    iget-object v6, v1, Landroidx/fragment/app/j0;->d:[Landroidx/fragment/app/b;

    array-length v11, v6

    if-ge v3, v11, :cond_12

    aget-object v6, v6, v3

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v11, Landroidx/fragment/app/a;

    invoke-direct {v11, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/i0;)V

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_6
    iget-object v14, v6, Landroidx/fragment/app/b;->b:[I

    array-length v15, v14

    if-ge v12, v15, :cond_10

    new-instance v15, Landroidx/fragment/app/p0;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    add-int/lit8 v16, v12, 0x1

    aget v9, v14, v12

    iput v9, v15, Landroidx/fragment/app/p0;->a:I

    invoke-static {v8, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_e

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v5, "Instantiate "

    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " op #"

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " base fragment #"

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v5, v14, v16

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v8, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_e
    iget-object v5, v6, Landroidx/fragment/app/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_f

    invoke-virtual {v2, v5}, Landroidx/fragment/app/o0;->b(Ljava/lang/String;)Landroidx/fragment/app/q;

    move-result-object v5

    iput-object v5, v15, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    goto :goto_7

    :cond_f
    iput-object v4, v15, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    :goto_7
    invoke-static {}, Landroidx/lifecycle/m;->values()[Landroidx/lifecycle/m;

    move-result-object v5

    iget-object v9, v6, Landroidx/fragment/app/b;->d:[I

    aget v9, v9, v13

    aget-object v5, v5, v9

    iput-object v5, v15, Landroidx/fragment/app/p0;->g:Landroidx/lifecycle/m;

    invoke-static {}, Landroidx/lifecycle/m;->values()[Landroidx/lifecycle/m;

    move-result-object v5

    iget-object v9, v6, Landroidx/fragment/app/b;->e:[I

    aget v9, v9, v13

    aget-object v5, v5, v9

    iput-object v5, v15, Landroidx/fragment/app/p0;->h:Landroidx/lifecycle/m;

    add-int/lit8 v5, v12, 0x2

    aget v9, v14, v16

    iput v9, v15, Landroidx/fragment/app/p0;->c:I

    add-int/lit8 v16, v12, 0x3

    aget v5, v14, v5

    iput v5, v15, Landroidx/fragment/app/p0;->d:I

    add-int/lit8 v17, v12, 0x4

    aget v4, v14, v16

    iput v4, v15, Landroidx/fragment/app/p0;->e:I

    add-int/lit8 v12, v12, 0x5

    aget v14, v14, v17

    iput v14, v15, Landroidx/fragment/app/p0;->f:I

    iput v9, v11, Landroidx/fragment/app/a;->b:I

    iput v5, v11, Landroidx/fragment/app/a;->c:I

    iput v4, v11, Landroidx/fragment/app/a;->d:I

    iput v14, v11, Landroidx/fragment/app/a;->e:I

    invoke-virtual {v11, v15}, Landroidx/fragment/app/a;->b(Landroidx/fragment/app/p0;)V

    add-int/lit8 v13, v13, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    goto/16 :goto_6

    :cond_10
    iget v4, v6, Landroidx/fragment/app/b;->f:I

    iput v4, v11, Landroidx/fragment/app/a;->f:I

    iget-object v4, v6, Landroidx/fragment/app/b;->g:Ljava/lang/String;

    iput-object v4, v11, Landroidx/fragment/app/a;->h:Ljava/lang/String;

    iget v4, v6, Landroidx/fragment/app/b;->h:I

    iput v4, v11, Landroidx/fragment/app/a;->r:I

    iput-boolean v10, v11, Landroidx/fragment/app/a;->g:Z

    iget v4, v6, Landroidx/fragment/app/b;->i:I

    iput v4, v11, Landroidx/fragment/app/a;->i:I

    iget-object v4, v6, Landroidx/fragment/app/b;->j:Ljava/lang/CharSequence;

    iput-object v4, v11, Landroidx/fragment/app/a;->j:Ljava/lang/CharSequence;

    iget v4, v6, Landroidx/fragment/app/b;->k:I

    iput v4, v11, Landroidx/fragment/app/a;->k:I

    iget-object v4, v6, Landroidx/fragment/app/b;->l:Ljava/lang/CharSequence;

    iput-object v4, v11, Landroidx/fragment/app/a;->l:Ljava/lang/CharSequence;

    iget-object v4, v6, Landroidx/fragment/app/b;->m:Ljava/util/ArrayList;

    iput-object v4, v11, Landroidx/fragment/app/a;->m:Ljava/util/ArrayList;

    iget-object v4, v6, Landroidx/fragment/app/b;->n:Ljava/util/ArrayList;

    iput-object v4, v11, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    iget-boolean v4, v6, Landroidx/fragment/app/b;->o:Z

    iput-boolean v4, v11, Landroidx/fragment/app/a;->o:Z

    invoke-virtual {v11, v10}, Landroidx/fragment/app/a;->c(I)V

    const/4 v4, 0x2

    invoke-static {v8, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_11

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "restoreAllState: back stack #"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " (index "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v11, Landroidx/fragment/app/a;->r:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v8, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v5, Landroidx/fragment/app/a1;

    invoke-direct {v5}, Landroidx/fragment/app/a1;-><init>()V

    new-instance v6, Ljava/io/PrintWriter;

    invoke-direct {v6, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v5, "  "

    const/4 v9, 0x0

    invoke-virtual {v11, v5, v6, v9}, Landroidx/fragment/app/a;->e(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    invoke-virtual {v6}, Ljava/io/PrintWriter;->close()V

    goto :goto_8

    :cond_11
    const/4 v9, 0x0

    :goto_8
    iget-object v5, v0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    move v5, v4

    const/4 v4, 0x0

    goto/16 :goto_5

    :cond_12
    const/4 v9, 0x0

    goto :goto_9

    :cond_13
    move-object v3, v4

    const/4 v9, 0x0

    iput-object v3, v0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    :goto_9
    iget-object v3, v0, Landroidx/fragment/app/i0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v4, v1, Landroidx/fragment/app/j0;->e:I

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v3, v1, Landroidx/fragment/app/j0;->f:Ljava/lang/String;

    if-eqz v3, :cond_14

    invoke-virtual {v2, v3}, Landroidx/fragment/app/o0;->b(Ljava/lang/String;)Landroidx/fragment/app/q;

    move-result-object v2

    iput-object v2, v0, Landroidx/fragment/app/i0;->s:Landroidx/fragment/app/q;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/i0;->p(Landroidx/fragment/app/q;)V

    :cond_14
    iget-object v2, v1, Landroidx/fragment/app/j0;->g:Ljava/util/ArrayList;

    if-eqz v2, :cond_15

    :goto_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v9, v3, :cond_15

    iget-object v3, v1, Landroidx/fragment/app/j0;->h:Ljava/util/ArrayList;

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    iget-object v4, v0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iget-object v4, v4, Landroidx/fragment/app/t;->k:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object v4, v0, Landroidx/fragment/app/i0;->j:Ljava/util/Map;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v9, 0x1

    goto :goto_a

    :cond_15
    new-instance v2, Ljava/util/ArrayDeque;

    iget-object v1, v1, Landroidx/fragment/app/j0;->i:Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, Landroidx/fragment/app/i0;->y:Ljava/util/ArrayDeque;

    :goto_b
    return-void
.end method

.method public final P()Landroidx/fragment/app/j0;
    .locals 11

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->e()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d1;

    iget-boolean v3, v1, Landroidx/fragment/app/d1;->e:Z

    if-eqz v3, :cond_0

    iput-boolean v2, v1, Landroidx/fragment/app/d1;->e:Z

    invoke-virtual {v1}, Landroidx/fragment/app/d1;->c()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/i0;->e()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d1;

    invoke-virtual {v1}, Landroidx/fragment/app/d1;->e()V

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/i0;->x(Z)Z

    iput-boolean v0, p0, Landroidx/fragment/app/i0;->A:Z

    iget-object v1, p0, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iput-boolean v0, v1, Landroidx/fragment/app/k0;->h:Z

    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, v0, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v3, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/n0;

    if-eqz v3, :cond_3

    new-instance v6, Landroidx/fragment/app/m0;

    iget-object v7, v3, Landroidx/fragment/app/n0;->c:Landroidx/fragment/app/q;

    invoke-direct {v6, v7}, Landroidx/fragment/app/m0;-><init>(Landroidx/fragment/app/q;)V

    iget v8, v7, Landroidx/fragment/app/q;->b:I

    const/4 v9, -0x1

    if-le v8, v9, :cond_e

    iget-object v8, v6, Landroidx/fragment/app/m0;->n:Landroid/os/Bundle;

    if-nez v8, :cond_e

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v7, v8}, Landroidx/fragment/app/q;->w(Landroid/os/Bundle;)V

    iget-object v9, v7, Landroidx/fragment/app/q;->Q:Lz0/f;

    invoke-virtual {v9, v8}, Lz0/f;->c(Landroid/os/Bundle;)V

    iget-object v9, v7, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v9}, Landroidx/fragment/app/i0;->P()Landroidx/fragment/app/j0;

    move-result-object v9

    if-eqz v9, :cond_4

    const-string v10, "android:support:fragments"

    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_4
    iget-object v9, v3, Landroidx/fragment/app/n0;->a:Li/a0;

    invoke-virtual {v9, v2}, Li/a0;->l(Z)V

    invoke-virtual {v8}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_3

    :cond_5
    move-object v5, v8

    :goto_3
    iget-object v8, v7, Landroidx/fragment/app/q;->F:Landroid/view/View;

    if-eqz v8, :cond_6

    invoke-virtual {v3}, Landroidx/fragment/app/n0;->o()V

    :cond_6
    iget-object v3, v7, Landroidx/fragment/app/q;->d:Landroid/util/SparseArray;

    if-eqz v3, :cond_8

    if-nez v5, :cond_7

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    :cond_7
    const-string v3, "android:view_state"

    iget-object v8, v7, Landroidx/fragment/app/q;->d:Landroid/util/SparseArray;

    invoke-virtual {v5, v3, v8}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_8
    iget-object v3, v7, Landroidx/fragment/app/q;->e:Landroid/os/Bundle;

    if-eqz v3, :cond_a

    if-nez v5, :cond_9

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    :cond_9
    const-string v3, "android:view_registry_state"

    iget-object v8, v7, Landroidx/fragment/app/q;->e:Landroid/os/Bundle;

    invoke-virtual {v5, v3, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_a
    iget-boolean v3, v7, Landroidx/fragment/app/q;->H:Z

    if-nez v3, :cond_c

    if-nez v5, :cond_b

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    :cond_b
    const-string v3, "android:user_visible_hint"

    iget-boolean v8, v7, Landroidx/fragment/app/q;->H:Z

    invoke-virtual {v5, v3, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_c
    iput-object v5, v6, Landroidx/fragment/app/m0;->n:Landroid/os/Bundle;

    iget-object v3, v7, Landroidx/fragment/app/q;->i:Ljava/lang/String;

    if-eqz v3, :cond_f

    if-nez v5, :cond_d

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    iput-object v3, v6, Landroidx/fragment/app/m0;->n:Landroid/os/Bundle;

    :cond_d
    iget-object v3, v6, Landroidx/fragment/app/m0;->n:Landroid/os/Bundle;

    const-string v5, "android:target_state"

    iget-object v8, v7, Landroidx/fragment/app/q;->i:Ljava/lang/String;

    invoke-virtual {v3, v5, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget v3, v7, Landroidx/fragment/app/q;->j:I

    if-eqz v3, :cond_f

    iget-object v5, v6, Landroidx/fragment/app/m0;->n:Landroid/os/Bundle;

    const-string v8, "android:target_req_state"

    invoke-virtual {v5, v8, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_4

    :cond_e
    iget-object v3, v7, Landroidx/fragment/app/q;->c:Landroid/os/Bundle;

    iput-object v3, v6, Landroidx/fragment/app/m0;->n:Landroid/os/Bundle;

    :cond_f
    :goto_4
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v3, "FragmentManager"

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Saved state of "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v6, Landroidx/fragment/app/m0;->n:Landroid/os/Bundle;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_2

    :cond_10
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    const-string v0, "FragmentManager"

    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_19

    const-string v0, "FragmentManager"

    const-string v1, "saveAllState: no fragments!"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_8

    :cond_11
    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object v3, v0, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    iget-object v6, v0, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_12

    monitor-exit v3

    move-object v6, v5

    goto :goto_6

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_12
    new-instance v6, Ljava/util/ArrayList;

    iget-object v7, v0, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, v0, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_13
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/q;

    iget-object v8, v7, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v8, "FragmentManager"

    invoke-static {v8, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_13

    const-string v8, "FragmentManager"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "saveAllState: adding fragment ("

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v7, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "): "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v8, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_14
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_6
    iget-object v0, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_16

    new-array v3, v0, [Landroidx/fragment/app/b;

    :goto_7
    if-ge v2, v0, :cond_17

    new-instance v7, Landroidx/fragment/app/b;

    iget-object v8, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/a;

    invoke-direct {v7, v8}, Landroidx/fragment/app/b;-><init>(Landroidx/fragment/app/a;)V

    aput-object v7, v3, v2

    const-string v7, "FragmentManager"

    invoke-static {v7, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_15

    const-string v7, "FragmentManager"

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "saveAllState: adding back stack #"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ": "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_15
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_16
    move-object v3, v5

    :cond_17
    new-instance v0, Landroidx/fragment/app/j0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v5, v0, Landroidx/fragment/app/j0;->f:Ljava/lang/String;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Landroidx/fragment/app/j0;->g:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Landroidx/fragment/app/j0;->h:Ljava/util/ArrayList;

    iput-object v1, v0, Landroidx/fragment/app/j0;->b:Ljava/util/ArrayList;

    iput-object v6, v0, Landroidx/fragment/app/j0;->c:Ljava/util/ArrayList;

    iput-object v3, v0, Landroidx/fragment/app/j0;->d:[Landroidx/fragment/app/b;

    iget-object v1, p0, Landroidx/fragment/app/i0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iput v1, v0, Landroidx/fragment/app/j0;->e:I

    iget-object v1, p0, Landroidx/fragment/app/i0;->s:Landroidx/fragment/app/q;

    if-eqz v1, :cond_18

    iget-object v1, v1, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    iput-object v1, v0, Landroidx/fragment/app/j0;->f:Ljava/lang/String;

    :cond_18
    iget-object v1, p0, Landroidx/fragment/app/i0;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Landroidx/fragment/app/i0;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/i0;->y:Ljava/util/ArrayDeque;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Landroidx/fragment/app/j0;->i:Ljava/util/ArrayList;

    move-object v5, v0

    :cond_19
    :goto_8
    return-object v5

    :goto_9
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final Q()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iget-object v1, v1, Landroidx/fragment/app/t;->l:Landroid/os/Handler;

    iget-object v2, p0, Landroidx/fragment/app/i0;->I:Landroidx/fragment/app/v;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iget-object v1, v1, Landroidx/fragment/app/t;->l:Landroid/os/Handler;

    iget-object v2, p0, Landroidx/fragment/app/i0;->I:Landroidx/fragment/app/v;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->Y()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final R(Landroidx/fragment/app/q;Z)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/i0;->A(Landroidx/fragment/app/q;)Landroid/view/ViewGroup;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/fragment/app/FragmentContainerView;

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    :cond_0
    return-void
.end method

.method public final S(Landroidx/fragment/app/q;Landroidx/lifecycle/m;)V
    .locals 2

    iget-object v0, p1, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    iget-object v1, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/o0;->b(Ljava/lang/String;)Landroidx/fragment/app/q;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/q;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    if-ne v0, p0, :cond_1

    :cond_0
    iput-object p2, p1, Landroidx/fragment/app/q;->M:Landroidx/lifecycle/m;

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final T(Landroidx/fragment/app/q;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    iget-object v1, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/o0;->b(Ljava/lang/String;)Landroidx/fragment/app/q;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/q;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/q;->t:Landroidx/fragment/app/t;

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/i0;->s:Landroidx/fragment/app/q;

    iput-object p1, p0, Landroidx/fragment/app/i0;->s:Landroidx/fragment/app/q;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/i0;->p(Landroidx/fragment/app/q;)V

    iget-object p1, p0, Landroidx/fragment/app/i0;->s:Landroidx/fragment/app/q;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/i0;->p(Landroidx/fragment/app/q;)V

    return-void
.end method

.method public final U(Landroidx/fragment/app/q;)V
    .locals 5

    invoke-virtual {p0, p1}, Landroidx/fragment/app/i0;->A(Landroidx/fragment/app/q;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p1, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    iget v3, v1, Landroidx/fragment/app/o;->d:I

    :goto_0
    if-nez v1, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    iget v4, v1, Landroidx/fragment/app/o;->e:I

    :goto_1
    add-int/2addr v4, v3

    if-nez v1, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    iget v3, v1, Landroidx/fragment/app/o;->f:I

    :goto_2
    add-int/2addr v3, v4

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    iget v1, v1, Landroidx/fragment/app/o;->g:I

    :goto_3
    add-int/2addr v1, v3

    if-lez v1, :cond_7

    const v1, 0x7f0801f4

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_4

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/q;

    iget-object p1, p1, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    iget-boolean v2, p1, Landroidx/fragment/app/o;->c:Z

    :goto_4
    iget-object p1, v0, Landroidx/fragment/app/q;->I:Landroidx/fragment/app/o;

    if-nez p1, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v0}, Landroidx/fragment/app/q;->d()Landroidx/fragment/app/o;

    move-result-object p1

    iput-boolean v2, p1, Landroidx/fragment/app/o;->c:Z

    :cond_7
    :goto_5
    return-void
.end method

.method public final W()V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v0}, Landroidx/fragment/app/o0;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/n0;

    iget-object v2, v1, Landroidx/fragment/app/n0;->c:Landroidx/fragment/app/q;

    iget-boolean v3, v2, Landroidx/fragment/app/q;->G:Z

    if-eqz v3, :cond_0

    iget-boolean v3, p0, Landroidx/fragment/app/i0;->b:Z

    if-eqz v3, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/fragment/app/i0;->D:Z

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    iput-boolean v3, v2, Landroidx/fragment/app/q;->G:Z

    invoke-virtual {v1}, Landroidx/fragment/app/n0;->k()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final X()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    const-string v2, "}"

    const-string v3, "{"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Y()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/i0;->h:Landroidx/fragment/app/c0;

    iput-boolean v2, v1, Landroidx/fragment/app/c0;->a:Z

    iget-object v1, v1, Landroidx/fragment/app/c0;->c:Lj3/a;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lj3/a;->a()Ljava/lang/Object;

    :cond_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroidx/fragment/app/i0;->h:Landroidx/fragment/app/c0;

    iget-object v1, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    invoke-static {v1}, Landroidx/fragment/app/i0;->G(Landroidx/fragment/app/q;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, v0, Landroidx/fragment/app/c0;->a:Z

    iget-object v0, v0, Landroidx/fragment/app/c0;->c:Lj3/a;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lj3/a;->a()Ljava/lang/Object;

    :cond_3
    :goto_1
    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final a(Landroidx/fragment/app/q;)Landroidx/fragment/app/n0;
    .locals 3

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "add: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/fragment/app/i0;->f(Landroidx/fragment/app/q;)Landroidx/fragment/app/n0;

    move-result-object v0

    iput-object p0, p1, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    iget-object v1, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/o0;->g(Landroidx/fragment/app/n0;)V

    iget-boolean v2, p1, Landroidx/fragment/app/q;->A:Z

    if-nez v2, :cond_2

    invoke-virtual {v1, p1}, Landroidx/fragment/app/o0;->a(Landroidx/fragment/app/q;)V

    const/4 v1, 0x0

    iput-boolean v1, p1, Landroidx/fragment/app/q;->m:Z

    iget-object v2, p1, Landroidx/fragment/app/q;->F:Landroid/view/View;

    if-nez v2, :cond_1

    iput-boolean v1, p1, Landroidx/fragment/app/q;->J:Z

    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/i0;->E(Landroidx/fragment/app/q;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/i0;->z:Z

    :cond_2
    return-object v0
.end method

.method public final b(Landroidx/fragment/app/t;Lc3/h;Landroidx/fragment/app/q;)V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    if-nez v0, :cond_d

    iput-object p1, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iput-object p2, p0, Landroidx/fragment/app/i0;->q:Lc3/h;

    iput-object p3, p0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    iget-object p2, p0, Landroidx/fragment/app/i0;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz p3, :cond_0

    new-instance v0, Landroidx/fragment/app/e0;

    invoke-direct {v0, p3}, Landroidx/fragment/app/e0;-><init>(Landroidx/fragment/app/q;)V

    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v0, p1, Landroidx/fragment/app/l0;

    if-eqz v0, :cond_1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    iget-object p2, p0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->Y()V

    :cond_2
    instance-of p2, p1, Landroidx/activity/a0;

    if-eqz p2, :cond_4

    iget-object p2, p1, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    invoke-virtual {p2}, Landroidx/activity/n;->j()Landroidx/activity/z;

    move-result-object p2

    iput-object p2, p0, Landroidx/fragment/app/i0;->g:Landroidx/activity/z;

    if-eqz p3, :cond_3

    move-object v0, p3

    goto :goto_1

    :cond_3
    move-object v0, p1

    :goto_1
    iget-object v1, p0, Landroidx/fragment/app/i0;->h:Landroidx/fragment/app/c0;

    invoke-virtual {p2, v0, v1}, Landroidx/activity/z;->a(Landroidx/lifecycle/r;Landroidx/fragment/app/c0;)V

    :cond_4
    const/4 p2, 0x0

    if-eqz p3, :cond_6

    iget-object p1, p3, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    iget-object p1, p1, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iget-object v0, p1, Landroidx/fragment/app/k0;->d:Ljava/util/HashMap;

    iget-object v1, p3, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/k0;

    if-nez v1, :cond_5

    new-instance v1, Landroidx/fragment/app/k0;

    iget-boolean p1, p1, Landroidx/fragment/app/k0;->f:Z

    invoke-direct {v1, p1}, Landroidx/fragment/app/k0;-><init>(Z)V

    iget-object p1, p3, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iput-object v1, p0, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    goto :goto_2

    :cond_6
    instance-of v0, p1, Landroidx/lifecycle/r0;

    if-eqz v0, :cond_8

    iget-object p1, p1, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    invoke-virtual {p1}, Landroidx/activity/n;->h()Landroidx/lifecycle/q0;

    move-result-object p1

    new-instance v0, Le/c;

    sget-object v1, Landroidx/fragment/app/k0;->i:La4/x;

    invoke-direct {v0, p1, v1, p2}, Le/c;-><init>(Landroidx/lifecycle/q0;La4/x;I)V

    const-class p1, Landroidx/fragment/app/k0;

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Le/c;->a(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/n0;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/k0;

    iput-object p1, p0, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Landroidx/fragment/app/k0;

    invoke-direct {p1, p2}, Landroidx/fragment/app/k0;-><init>(Z)V

    iput-object p1, p0, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    :goto_2
    iget-object p1, p0, Landroidx/fragment/app/i0;->H:Landroidx/fragment/app/k0;

    iget-boolean v0, p0, Landroidx/fragment/app/i0;->A:Z

    const/4 v1, 0x1

    if-nez v0, :cond_a

    iget-boolean v0, p0, Landroidx/fragment/app/i0;->B:Z

    if-eqz v0, :cond_9

    goto :goto_3

    :cond_9
    move v0, p2

    goto :goto_4

    :cond_a
    :goto_3
    move v0, v1

    :goto_4
    iput-boolean v0, p1, Landroidx/fragment/app/k0;->h:Z

    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iput-object p1, v0, Landroidx/fragment/app/o0;->c:Landroidx/fragment/app/k0;

    iget-object p1, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    instance-of v0, p1, Landroidx/activity/result/h;

    if-eqz v0, :cond_c

    iget-object p1, p1, Landroidx/fragment/app/t;->n:Landroidx/fragment/app/u;

    iget-object p1, p1, Landroidx/activity/n;->l:Landroidx/activity/i;

    if-eqz p3, :cond_b

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p3, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    const-string v2, ":"

    invoke-static {v0, p3, v2}, La;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_5

    :cond_b
    const-string p3, ""

    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "FragmentManager:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "StartActivityForResult"

    invoke-static {p3, v0}, La;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lc/d;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, Landroidx/fragment/app/b0;

    const/4 v4, 0x4

    invoke-direct {v3, p0, v4}, Landroidx/fragment/app/b0;-><init>(Landroidx/fragment/app/i0;I)V

    invoke-virtual {p1, v0, v2, v3}, Landroidx/activity/result/g;->d(Ljava/lang/String;Lc3/h;Landroidx/fragment/app/b0;)Landroidx/activity/result/d;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/i0;->v:Landroidx/activity/result/d;

    const-string v0, "StartIntentSenderForResult"

    invoke-static {p3, v0}, La;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lc/c;

    invoke-direct {v2, v1}, Lc/c;-><init>(I)V

    new-instance v3, Landroidx/fragment/app/b0;

    invoke-direct {v3, p0, p2}, Landroidx/fragment/app/b0;-><init>(Landroidx/fragment/app/i0;I)V

    invoke-virtual {p1, v0, v2, v3}, Landroidx/activity/result/g;->d(Ljava/lang/String;Lc3/h;Landroidx/fragment/app/b0;)Landroidx/activity/result/d;

    move-result-object p2

    iput-object p2, p0, Landroidx/fragment/app/i0;->w:Landroidx/activity/result/d;

    const-string p2, "RequestPermissions"

    invoke-static {p3, p2}, La;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lc/b;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/fragment/app/b0;

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/b0;-><init>(Landroidx/fragment/app/i0;I)V

    invoke-virtual {p1, p2, p3, v0}, Landroidx/activity/result/g;->d(Ljava/lang/String;Lc3/h;Landroidx/fragment/app/b0;)Landroidx/activity/result/d;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/i0;->x:Landroidx/activity/result/d;

    :cond_c
    return-void

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Landroidx/fragment/app/q;)V
    .locals 4

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "attach: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v2, p1, Landroidx/fragment/app/q;->A:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    iput-boolean v2, p1, Landroidx/fragment/app/q;->A:Z

    iget-boolean v2, p1, Landroidx/fragment/app/q;->l:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v2, p1}, Landroidx/fragment/app/o0;->a(Landroidx/fragment/app/q;)V

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "add from attach: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/i0;->E(Landroidx/fragment/app/q;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/i0;->z:Z

    :cond_2
    return-void
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/i0;->b:Z

    iget-object v0, p0, Landroidx/fragment/app/i0;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroidx/fragment/app/i0;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v1}, Landroidx/fragment/app/o0;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/n0;

    iget-object v2, v2, Landroidx/fragment/app/n0;->c:Landroidx/fragment/app/q;

    iget-object v2, v2, Landroidx/fragment/app/q;->E:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->C()Landroidx/fragment/app/b0;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/fragment/app/d1;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/b0;)Landroidx/fragment/app/d1;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final f(Landroidx/fragment/app/q;)Landroidx/fragment/app/n0;
    .locals 3

    iget-object v0, p1, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    iget-object v1, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object v2, v1, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/n0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/fragment/app/n0;

    iget-object v2, p0, Landroidx/fragment/app/i0;->m:Li/a0;

    invoke-direct {v0, v2, v1, p1}, Landroidx/fragment/app/n0;-><init>(Li/a0;Landroidx/fragment/app/o0;Landroidx/fragment/app/q;)V

    iget-object p1, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iget-object p1, p1, Landroidx/fragment/app/t;->k:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n0;->m(Ljava/lang/ClassLoader;)V

    iget p1, p0, Landroidx/fragment/app/i0;->o:I

    iput p1, v0, Landroidx/fragment/app/n0;->e:I

    :goto_0
    return-object v0
.end method

.method public final g(Landroidx/fragment/app/q;)V
    .locals 4

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "detach: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v2, p1, Landroidx/fragment/app/q;->A:Z

    if-nez v2, :cond_3

    const/4 v2, 0x1

    iput-boolean v2, p1, Landroidx/fragment/app/q;->A:Z

    iget-boolean v3, p1, Landroidx/fragment/app/q;->l:Z

    if-eqz v3, :cond_3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "remove from detach: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object v1, v0, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/q;->l:Z

    invoke-static {p1}, Landroidx/fragment/app/i0;->E(Landroidx/fragment/app/q;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v2, p0, Landroidx/fragment/app/i0;->z:Z

    :cond_2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/i0;->U(Landroidx/fragment/app/q;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    :goto_0
    return-void
.end method

.method public final h(Landroid/content/res/Configuration;)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v0}, Landroidx/fragment/app/o0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/q;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroidx/fragment/app/q;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v1, v1, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/i0;->h(Landroid/content/res/Configuration;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final i()Z
    .locals 5

    iget v0, p0, Landroidx/fragment/app/i0;->o:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v0}, Landroidx/fragment/app/o0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/q;

    if-eqz v3, :cond_1

    iget-boolean v4, v3, Landroidx/fragment/app/q;->z:Z

    if-nez v4, :cond_1

    iget-object v3, v3, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v3}, Landroidx/fragment/app/i0;->i()Z

    move-result v3

    if-eqz v3, :cond_1

    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method public final j()Z
    .locals 7

    iget v0, p0, Landroidx/fragment/app/i0;->o:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v0}, Landroidx/fragment/app/o0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    move v4, v2

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/q;

    if-eqz v5, :cond_1

    invoke-static {v5}, Landroidx/fragment/app/i0;->F(Landroidx/fragment/app/q;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-boolean v6, v5, Landroidx/fragment/app/q;->z:Z

    if-nez v6, :cond_1

    iget-object v6, v5, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v6}, Landroidx/fragment/app/i0;->j()Z

    move-result v6

    if-eqz v6, :cond_1

    if-nez v3, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/i0;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    :goto_1
    iget-object v0, p0, Landroidx/fragment/app/i0;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_6

    iget-object v0, p0, Landroidx/fragment/app/i0;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/q;

    if-eqz v3, :cond_4

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    iput-object v3, p0, Landroidx/fragment/app/i0;->e:Ljava/util/ArrayList;

    move v2, v4

    :goto_2
    return v2
.end method

.method public final k()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/i0;->C:Z

    invoke-virtual {p0, v0}, Landroidx/fragment/app/i0;->x(Z)Z

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->e()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d1;

    invoke-virtual {v1}, Landroidx/fragment/app/d1;->e()V

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/i0;->s(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iput-object v0, p0, Landroidx/fragment/app/i0;->q:Lc3/h;

    iput-object v0, p0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    iget-object v1, p0, Landroidx/fragment/app/i0;->g:Landroidx/activity/z;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/i0;->h:Landroidx/fragment/app/c0;

    iget-object v1, v1, Landroidx/fragment/app/c0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/activity/c;

    invoke-interface {v2}, Landroidx/activity/c;->cancel()V

    goto :goto_1

    :cond_1
    iput-object v0, p0, Landroidx/fragment/app/i0;->g:Landroidx/activity/z;

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/i0;->v:Landroidx/activity/result/d;

    if-eqz v0, :cond_3

    iget v1, v0, Landroidx/activity/result/d;->j:I

    iget-object v2, v0, Landroidx/activity/result/d;->k:Ljava/lang/String;

    iget-object v0, v0, Landroidx/activity/result/d;->m:Landroidx/activity/result/g;

    packed-switch v1, :pswitch_data_0

    invoke-virtual {v0, v2}, Landroidx/activity/result/g;->f(Ljava/lang/String;)V

    goto :goto_2

    :pswitch_0
    invoke-virtual {v0, v2}, Landroidx/activity/result/g;->f(Ljava/lang/String;)V

    :goto_2
    iget-object v0, p0, Landroidx/fragment/app/i0;->w:Landroidx/activity/result/d;

    iget v1, v0, Landroidx/activity/result/d;->j:I

    iget-object v2, v0, Landroidx/activity/result/d;->k:Ljava/lang/String;

    iget-object v0, v0, Landroidx/activity/result/d;->m:Landroidx/activity/result/g;

    packed-switch v1, :pswitch_data_1

    invoke-virtual {v0, v2}, Landroidx/activity/result/g;->f(Ljava/lang/String;)V

    goto :goto_3

    :pswitch_1
    invoke-virtual {v0, v2}, Landroidx/activity/result/g;->f(Ljava/lang/String;)V

    :goto_3
    iget-object v0, p0, Landroidx/fragment/app/i0;->x:Landroidx/activity/result/d;

    iget v1, v0, Landroidx/activity/result/d;->j:I

    iget-object v2, v0, Landroidx/activity/result/d;->k:Ljava/lang/String;

    iget-object v0, v0, Landroidx/activity/result/d;->m:Landroidx/activity/result/g;

    packed-switch v1, :pswitch_data_2

    invoke-virtual {v0, v2}, Landroidx/activity/result/g;->f(Ljava/lang/String;)V

    goto :goto_4

    :pswitch_2
    invoke-virtual {v0, v2}, Landroidx/activity/result/g;->f(Ljava/lang/String;)V

    :cond_3
    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v0}, Landroidx/fragment/app/o0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/q;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/q;->onLowMemory()V

    iget-object v1, v1, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v1}, Landroidx/fragment/app/i0;->l()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final m(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v0}, Landroidx/fragment/app/o0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/q;

    if-eqz v1, :cond_0

    iget-object v1, v1, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/i0;->m(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final n()Z
    .locals 5

    iget v0, p0, Landroidx/fragment/app/i0;->o:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v0}, Landroidx/fragment/app/o0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/q;

    if-eqz v3, :cond_1

    iget-boolean v4, v3, Landroidx/fragment/app/q;->z:Z

    if-nez v4, :cond_1

    iget-object v3, v3, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v3}, Landroidx/fragment/app/i0;->n()Z

    move-result v3

    if-eqz v3, :cond_1

    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method public final o()V
    .locals 3

    iget v0, p0, Landroidx/fragment/app/i0;->o:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v0}, Landroidx/fragment/app/o0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/q;

    if-eqz v1, :cond_1

    iget-boolean v2, v1, Landroidx/fragment/app/q;->z:Z

    if-nez v2, :cond_1

    iget-object v1, v1, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v1}, Landroidx/fragment/app/i0;->o()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final p(Landroidx/fragment/app/q;)V
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/q;->f:Ljava/lang/String;

    iget-object v1, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/o0;->b(Ljava/lang/String;)Landroidx/fragment/app/q;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/q;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/fragment/app/i0;->G(Landroidx/fragment/app/q;)Z

    move-result v0

    iget-object v1, p1, Landroidx/fragment/app/q;->k:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, v0, :cond_1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Landroidx/fragment/app/q;->k:Ljava/lang/Boolean;

    iget-object p1, p1, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {p1}, Landroidx/fragment/app/i0;->Y()V

    iget-object v0, p1, Landroidx/fragment/app/i0;->s:Landroidx/fragment/app/q;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/i0;->p(Landroidx/fragment/app/q;)V

    :cond_1
    return-void
.end method

.method public final q(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v0}, Landroidx/fragment/app/o0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/q;

    if-eqz v1, :cond_0

    iget-object v1, v1, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/i0;->q(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final r()Z
    .locals 5

    iget v0, p0, Landroidx/fragment/app/i0;->o:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v0}, Landroidx/fragment/app/o0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/q;

    if-eqz v3, :cond_1

    invoke-static {v3}, Landroidx/fragment/app/i0;->F(Landroidx/fragment/app/q;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-boolean v4, v3, Landroidx/fragment/app/q;->z:Z

    if-nez v4, :cond_1

    iget-object v3, v3, Landroidx/fragment/app/q;->u:Landroidx/fragment/app/i0;

    invoke-virtual {v3}, Landroidx/fragment/app/i0;->r()Z

    move-result v3

    if-eqz v3, :cond_1

    move v1, v2

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method public final s(I)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/i0;->b:Z

    iget-object v2, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object v2, v2, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/n0;

    if-eqz v3, :cond_0

    iput p1, v3, Landroidx/fragment/app/n0;->e:I

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/i0;->I(IZ)V

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->e()Ljava/util/HashSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/d1;

    invoke-virtual {v2}, Landroidx/fragment/app/d1;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    iput-boolean v1, p0, Landroidx/fragment/app/i0;->b:Z

    invoke-virtual {p0, v0}, Landroidx/fragment/app/i0;->x(Z)Z

    return-void

    :goto_2
    iput-boolean v1, p0, Landroidx/fragment/app/i0;->b:Z

    throw p1
.end method

.method public final t()V
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/i0;->D:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/i0;->D:Z

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->W()V

    :cond_0
    return-void
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->X()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 5

    const-string v0, "    "

    invoke-static {p1, v0}, La;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "    "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "Active Fragments:"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/n0;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    if-eqz v4, :cond_0

    iget-object v4, v4, Landroidx/fragment/app/n0;->c:Landroidx/fragment/app/q;

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {v4, v2, p2, p3, p4}, Landroidx/fragment/app/q;->c(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v4, "null"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p2, v1, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p4

    const/4 v1, 0x0

    if-lez p4, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "Added Fragments:"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    :goto_1
    if-ge v2, p4, :cond_2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/q;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "  #"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    const-string v4, ": "

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/fragment/app/q;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    iget-object p2, p0, Landroidx/fragment/app/i0;->e:Ljava/util/ArrayList;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Fragments Created Menus:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v1

    :goto_2
    if-ge p4, p2, :cond_3

    iget-object v2, p0, Landroidx/fragment/app/i0;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/q;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/fragment/app/q;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_2

    :cond_3
    iget-object p2, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_4

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Back Stack:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v1

    :goto_3
    if-ge p4, p2, :cond_4

    iget-object v2, p0, Landroidx/fragment/app/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v0, p3, v3}, Landroidx/fragment/app/a;->e(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Back Stack Index: "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p0, Landroidx/fragment/app/i0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    monitor-enter p2

    :try_start_0
    iget-object p4, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-lez p4, :cond_5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Pending Actions:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_4
    if-ge v1, p4, :cond_5

    iget-object v0, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/g0;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "  #"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v2, ": "

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_5
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "FragmentManager misc state:"

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mHost="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mContainer="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/i0;->q:Lc3/h;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    if-eqz p2, :cond_6

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mParent="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/i0;->r:Landroidx/fragment/app/q;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mCurState="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget p2, p0, Landroidx/fragment/app/i0;->o:I

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    const-string p2, " mStateSaved="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/i0;->A:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mStopped="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/i0;->B:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mDestroyed="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/i0;->C:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    iget-boolean p2, p0, Landroidx/fragment/app/i0;->z:Z

    if-eqz p2, :cond_7

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  mNeedMenuInvalidate="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p1, p0, Landroidx/fragment/app/i0;->z:Z

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    :cond_7
    return-void

    :goto_5
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final v(Landroidx/fragment/app/g0;Z)V
    .locals 2

    if-nez p2, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    if-nez v0, :cond_1

    iget-boolean p1, p0, Landroidx/fragment/app/i0;->C:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has not been attached to a host."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v0, p0, Landroidx/fragment/app/i0;->A:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Landroidx/fragment/app/i0;->B:Z

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    if-nez v1, :cond_5

    if-eqz p2, :cond_4

    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Activity has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object p2, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->Q()V

    monitor-exit v0

    :goto_1
    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final w(Z)V
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/i0;->b:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    if-nez v0, :cond_1

    iget-boolean p1, p0, Landroidx/fragment/app/i0;->C:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has been destroyed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has not been attached to a host."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iget-object v1, v1, Landroidx/fragment/app/t;->l:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_5

    if-nez p1, :cond_3

    iget-boolean p1, p0, Landroidx/fragment/app/i0;->A:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Landroidx/fragment/app/i0;->B:Z

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/i0;->E:Ljava/util/ArrayList;

    if-nez p1, :cond_4

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/i0;->E:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/i0;->F:Ljava/util/ArrayList;

    :cond_4
    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/i0;->b:Z

    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Must be called from main thread of fragment host"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager is already executing transactions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x(Z)Z
    .locals 8

    invoke-virtual {p0, p1}, Landroidx/fragment/app/i0;->w(Z)V

    const/4 p1, 0x0

    move v0, p1

    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/i0;->E:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/i0;->F:Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    iget-object v4, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    monitor-exit v3

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    iget-object v4, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v5, p1

    move v6, v5

    :goto_1
    if-ge v5, v4, :cond_1

    iget-object v7, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/g0;

    invoke-interface {v7, v1, v2}, Landroidx/fragment/app/g0;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v7

    or-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Landroidx/fragment/app/i0;->p:Landroidx/fragment/app/t;

    iget-object v1, v1, Landroidx/fragment/app/t;->l:Landroid/os/Handler;

    iget-object v2, p0, Landroidx/fragment/app/i0;->I:Landroidx/fragment/app/v;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/i0;->b:Z

    :try_start_1
    iget-object v1, p0, Landroidx/fragment/app/i0;->E:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/i0;->F:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v2}, Landroidx/fragment/app/i0;->N(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->d()V

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->d()V

    throw p1

    :cond_2
    :goto_2
    invoke-virtual {p0}, Landroidx/fragment/app/i0;->Y()V

    invoke-virtual {p0}, Landroidx/fragment/app/i0;->t()V

    iget-object p1, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object p1, p1, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    return v0

    :goto_3
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final y(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    move/from16 v4, p3

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    iget-boolean v5, v5, Landroidx/fragment/app/a;->o:Z

    iget-object v6, v0, Landroidx/fragment/app/i0;->G:Ljava/util/ArrayList;

    if-nez v6, :cond_0

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v0, Landroidx/fragment/app/i0;->G:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget-object v6, v0, Landroidx/fragment/app/i0;->G:Ljava/util/ArrayList;

    iget-object v7, v0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    invoke-virtual {v7}, Landroidx/fragment/app/o0;->f()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v6, v0, Landroidx/fragment/app/i0;->s:Landroidx/fragment/app/q;

    move v9, v4

    const/4 v10, 0x0

    :goto_1
    const/4 v11, 0x1

    if-ge v9, v3, :cond_13

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/fragment/app/a;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-nez v13, :cond_d

    iget-object v13, v0, Landroidx/fragment/app/i0;->G:Ljava/util/ArrayList;

    const/4 v8, 0x0

    :goto_2
    iget-object v15, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-ge v8, v15, :cond_c

    iget-object v15, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/fragment/app/p0;

    iget v14, v15, Landroidx/fragment/app/p0;->a:I

    if-eq v14, v11, :cond_b

    const/4 v11, 0x2

    const/16 v4, 0x9

    if-eq v14, v11, :cond_5

    const/4 v11, 0x3

    if-eq v14, v11, :cond_4

    const/4 v11, 0x6

    if-eq v14, v11, :cond_4

    const/4 v11, 0x7

    if-eq v14, v11, :cond_3

    const/16 v11, 0x8

    if-eq v14, v11, :cond_1

    goto :goto_3

    :cond_1
    iget-object v11, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    new-instance v14, Landroidx/fragment/app/p0;

    invoke-direct {v14, v4, v6}, Landroidx/fragment/app/p0;-><init>(ILandroidx/fragment/app/q;)V

    invoke-virtual {v11, v8, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    iget-object v4, v15, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    move-object v6, v4

    :cond_2
    :goto_3
    move-object/from16 v18, v7

    :goto_4
    const/4 v2, 0x1

    goto/16 :goto_9

    :cond_3
    move-object/from16 v18, v7

    const/4 v2, 0x1

    goto/16 :goto_8

    :cond_4
    iget-object v11, v15, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v11, v15, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    if-ne v11, v6, :cond_2

    iget-object v6, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    new-instance v14, Landroidx/fragment/app/p0;

    invoke-direct {v14, v4, v11}, Landroidx/fragment/app/p0;-><init>(ILandroidx/fragment/app/q;)V

    invoke-virtual {v6, v8, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v18, v7

    const/4 v2, 0x1

    const/4 v6, 0x0

    goto/16 :goto_9

    :cond_5
    iget-object v11, v15, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    iget v14, v11, Landroidx/fragment/app/q;->x:I

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v17

    const/16 v16, 0x1

    add-int/lit8 v17, v17, -0x1

    move/from16 v4, v17

    const/16 v17, 0x0

    :goto_5
    if-ltz v4, :cond_9

    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v2, v18

    check-cast v2, Landroidx/fragment/app/q;

    move-object/from16 v18, v7

    iget v7, v2, Landroidx/fragment/app/q;->x:I

    if-ne v7, v14, :cond_8

    if-ne v2, v11, :cond_6

    move/from16 v19, v14

    const/16 v17, 0x1

    goto :goto_7

    :cond_6
    if-ne v2, v6, :cond_7

    iget-object v6, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    new-instance v7, Landroidx/fragment/app/p0;

    move/from16 v19, v14

    const/16 v14, 0x9

    invoke-direct {v7, v14, v2}, Landroidx/fragment/app/p0;-><init>(ILandroidx/fragment/app/q;)V

    invoke-virtual {v6, v8, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    const/4 v6, 0x0

    goto :goto_6

    :cond_7
    move/from16 v19, v14

    const/16 v14, 0x9

    :goto_6
    new-instance v7, Landroidx/fragment/app/p0;

    const/4 v14, 0x3

    invoke-direct {v7, v14, v2}, Landroidx/fragment/app/p0;-><init>(ILandroidx/fragment/app/q;)V

    iget v14, v15, Landroidx/fragment/app/p0;->c:I

    iput v14, v7, Landroidx/fragment/app/p0;->c:I

    iget v14, v15, Landroidx/fragment/app/p0;->e:I

    iput v14, v7, Landroidx/fragment/app/p0;->e:I

    iget v14, v15, Landroidx/fragment/app/p0;->d:I

    iput v14, v7, Landroidx/fragment/app/p0;->d:I

    iget v14, v15, Landroidx/fragment/app/p0;->f:I

    iput v14, v7, Landroidx/fragment/app/p0;->f:I

    iget-object v14, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v14, v8, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    add-int/2addr v8, v2

    goto :goto_7

    :cond_8
    move/from16 v19, v14

    :goto_7
    add-int/lit8 v4, v4, -0x1

    move-object/from16 v2, p2

    move-object/from16 v7, v18

    move/from16 v14, v19

    goto :goto_5

    :cond_9
    move-object/from16 v18, v7

    if-eqz v17, :cond_a

    iget-object v2, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v8, v8, -0x1

    goto/16 :goto_4

    :cond_a
    const/4 v2, 0x1

    iput v2, v15, Landroidx/fragment/app/p0;->a:I

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_b
    move-object/from16 v18, v7

    move v2, v11

    :goto_8
    iget-object v4, v15, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_9
    add-int/2addr v8, v2

    move/from16 v4, p3

    move v11, v2

    move-object/from16 v7, v18

    move-object/from16 v2, p2

    goto/16 :goto_2

    :cond_c
    move-object/from16 v18, v7

    goto :goto_c

    :cond_d
    move-object/from16 v18, v7

    move v2, v11

    iget-object v4, v0, Landroidx/fragment/app/i0;->G:Ljava/util/ArrayList;

    iget-object v7, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    sub-int/2addr v7, v2

    :goto_a
    if-ltz v7, :cond_10

    iget-object v8, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/p0;

    iget v11, v8, Landroidx/fragment/app/p0;->a:I

    if-eq v11, v2, :cond_f

    const/4 v2, 0x3

    if-eq v11, v2, :cond_e

    packed-switch v11, :pswitch_data_0

    goto :goto_b

    :pswitch_0
    iget-object v11, v8, Landroidx/fragment/app/p0;->g:Landroidx/lifecycle/m;

    iput-object v11, v8, Landroidx/fragment/app/p0;->h:Landroidx/lifecycle/m;

    goto :goto_b

    :pswitch_1
    iget-object v6, v8, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    goto :goto_b

    :pswitch_2
    const/4 v6, 0x0

    goto :goto_b

    :cond_e
    :pswitch_3
    iget-object v8, v8, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_f
    const/4 v2, 0x3

    :pswitch_4
    iget-object v8, v8, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_b
    add-int/lit8 v7, v7, -0x1

    const/4 v2, 0x1

    goto :goto_a

    :cond_10
    :goto_c
    if-nez v10, :cond_12

    iget-boolean v2, v12, Landroidx/fragment/app/a;->g:Z

    if-eqz v2, :cond_11

    goto :goto_d

    :cond_11
    const/4 v10, 0x0

    goto :goto_e

    :cond_12
    :goto_d
    const/4 v10, 0x1

    :goto_e
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, p2

    move/from16 v4, p3

    move-object/from16 v7, v18

    goto/16 :goto_1

    :cond_13
    move-object/from16 v18, v7

    iget-object v2, v0, Landroidx/fragment/app/i0;->G:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    if-nez v5, :cond_16

    iget v2, v0, Landroidx/fragment/app/i0;->o:I

    const/4 v4, 0x1

    if-lt v2, v4, :cond_16

    move/from16 v2, p3

    :goto_f
    if-ge v2, v3, :cond_16

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/a;

    iget-object v4, v4, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/p0;

    iget-object v5, v5, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    if-eqz v5, :cond_14

    iget-object v6, v5, Landroidx/fragment/app/q;->s:Landroidx/fragment/app/i0;

    if-eqz v6, :cond_14

    invoke-virtual {v0, v5}, Landroidx/fragment/app/i0;->f(Landroidx/fragment/app/q;)Landroidx/fragment/app/n0;

    move-result-object v5

    move-object/from16 v6, v18

    invoke-virtual {v6, v5}, Landroidx/fragment/app/o0;->g(Landroidx/fragment/app/n0;)V

    goto :goto_11

    :cond_14
    move-object/from16 v6, v18

    :goto_11
    move-object/from16 v18, v6

    goto :goto_10

    :cond_15
    move-object/from16 v6, v18

    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    :cond_16
    move/from16 v2, p3

    :goto_12
    const/4 v4, -0x1

    if-ge v2, v3, :cond_18

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    move-object/from16 v6, p2

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-virtual {v5, v4}, Landroidx/fragment/app/a;->c(I)V

    invoke-virtual {v5}, Landroidx/fragment/app/a;->g()V

    goto :goto_13

    :cond_17
    const/4 v4, 0x1

    invoke-virtual {v5, v4}, Landroidx/fragment/app/a;->c(I)V

    invoke-virtual {v5}, Landroidx/fragment/app/a;->f()V

    :goto_13
    add-int/lit8 v2, v2, 0x1

    goto :goto_12

    :cond_18
    move-object/from16 v6, p2

    add-int/lit8 v2, v3, -0x1

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move/from16 v5, p3

    :goto_14
    if-ge v5, v3, :cond_1d

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/a;

    if-eqz v2, :cond_1a

    iget-object v8, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    :goto_15
    if-ltz v8, :cond_1c

    iget-object v9, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/p0;

    iget-object v9, v9, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    if-eqz v9, :cond_19

    invoke-virtual {v0, v9}, Landroidx/fragment/app/i0;->f(Landroidx/fragment/app/q;)Landroidx/fragment/app/n0;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/fragment/app/n0;->k()V

    :cond_19
    add-int/lit8 v8, v8, -0x1

    goto :goto_15

    :cond_1a
    iget-object v7, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1b
    :goto_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/p0;

    iget-object v8, v8, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    if-eqz v8, :cond_1b

    invoke-virtual {v0, v8}, Landroidx/fragment/app/i0;->f(Landroidx/fragment/app/q;)Landroidx/fragment/app/n0;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/fragment/app/n0;->k()V

    goto :goto_16

    :cond_1c
    add-int/lit8 v5, v5, 0x1

    goto :goto_14

    :cond_1d
    iget v5, v0, Landroidx/fragment/app/i0;->o:I

    const/4 v7, 0x1

    invoke-virtual {v0, v5, v7}, Landroidx/fragment/app/i0;->I(IZ)V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    move/from16 v7, p3

    :goto_17
    if-ge v7, v3, :cond_20

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/a;

    iget-object v8, v8, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1e
    :goto_18
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1f

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/p0;

    iget-object v9, v9, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/q;

    if-eqz v9, :cond_1e

    iget-object v9, v9, Landroidx/fragment/app/q;->E:Landroid/view/ViewGroup;

    if-eqz v9, :cond_1e

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/i0;->C()Landroidx/fragment/app/b0;

    move-result-object v10

    invoke-static {v9, v10}, Landroidx/fragment/app/d1;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/b0;)Landroidx/fragment/app/d1;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_1f
    add-int/lit8 v7, v7, 0x1

    goto :goto_17

    :cond_20
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_21

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/d1;

    iput-boolean v2, v7, Landroidx/fragment/app/d1;->d:Z

    invoke-virtual {v7}, Landroidx/fragment/app/d1;->g()V

    invoke-virtual {v7}, Landroidx/fragment/app/d1;->c()V

    goto :goto_19

    :cond_21
    move/from16 v2, p3

    :goto_1a
    if-ge v2, v3, :cond_23

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_22

    iget v7, v5, Landroidx/fragment/app/a;->r:I

    if-ltz v7, :cond_22

    iput v4, v5, Landroidx/fragment/app/a;->r:I

    :cond_22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1a

    :cond_23
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final z(I)Landroidx/fragment/app/q;
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/i0;->c:Landroidx/fragment/app/o0;

    iget-object v1, v0, Landroidx/fragment/app/o0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/q;

    if-eqz v3, :cond_0

    iget v4, v3, Landroidx/fragment/app/q;->w:I

    if-ne v4, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/o0;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/n0;

    if-eqz v1, :cond_2

    iget-object v3, v1, Landroidx/fragment/app/n0;->c:Landroidx/fragment/app/q;

    iget v1, v3, Landroidx/fragment/app/q;->w:I

    if-ne v1, p1, :cond_2

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    return-object v3
.end method
