.class public final Landroidx/lifecycle/t;
.super Landroidx/lifecycle/j0;
.source "SourceFile"


# instance fields
.field public final d:Z

.field public e:Lk/a;

.field public f:Landroidx/lifecycle/m;

.field public final g:Ljava/lang/ref/WeakReference;

.field public h:I

.field public i:Z

.field public j:Z

.field public final k:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/r;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/t;->d:Z

    new-instance v0, Lk/a;

    invoke-direct {v0}, Lk/a;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/t;->e:Lk/a;

    sget-object v0, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    iput-object v0, p0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/t;->k:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/t;->g:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/q;)V
    .locals 8

    const-string v0, "observer"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addObserver"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/t;->d(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/m;->b:Landroidx/lifecycle/m;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    :goto_0
    new-instance v0, Landroidx/lifecycle/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v2, Landroidx/lifecycle/u;->a:Ljava/util/HashMap;

    instance-of v2, p1, Landroidx/lifecycle/p;

    instance-of v3, p1, Landroidx/lifecycle/d;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    new-instance v2, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;

    move-object v3, p1

    check-cast v3, Landroidx/lifecycle/d;

    move-object v6, p1

    check-cast v6, Landroidx/lifecycle/p;

    invoke-direct {v2, v3, v6}, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;-><init>(Landroidx/lifecycle/d;Landroidx/lifecycle/p;)V

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    if-eqz v3, :cond_2

    new-instance v2, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;

    move-object v3, p1

    check-cast v3, Landroidx/lifecycle/d;

    invoke-direct {v2, v3, v6}, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;-><init>(Landroidx/lifecycle/d;Landroidx/lifecycle/p;)V

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Landroidx/lifecycle/p;

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Landroidx/lifecycle/u;->b(Ljava/lang/Class;)I

    move-result v3

    const/4 v7, 0x2

    if-ne v3, v7, :cond_6

    sget-object v3, Landroidx/lifecycle/u;->b:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lc3/h;->X(Ljava/lang/Object;)V

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-eq v3, v4, :cond_5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-array v7, v3, [Landroidx/lifecycle/g;

    if-gtz v3, :cond_4

    new-instance v2, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;

    invoke-direct {v2, v7}, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;-><init>([Landroidx/lifecycle/g;)V

    goto :goto_1

    :cond_4
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, Landroidx/lifecycle/u;->a(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    throw v6

    :cond_5
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, Landroidx/lifecycle/u;->a(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    throw v6

    :cond_6
    new-instance v2, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;

    invoke-direct {v2, p1}, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;-><init>(Ljava/lang/Object;)V

    :goto_1
    iput-object v2, v0, Landroidx/lifecycle/s;->b:Landroidx/lifecycle/p;

    iput-object v1, v0, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v1, p0, Landroidx/lifecycle/t;->e:Lk/a;

    invoke-virtual {v1, p1, v0}, Lk/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/s;

    if-eqz v1, :cond_7

    return-void

    :cond_7
    iget-object v1, p0, Landroidx/lifecycle/t;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/r;

    if-nez v1, :cond_8

    return-void

    :cond_8
    iget v2, p0, Landroidx/lifecycle/t;->h:I

    if-nez v2, :cond_9

    iget-boolean v2, p0, Landroidx/lifecycle/t;->i:Z

    if-eqz v2, :cond_a

    :cond_9
    move v5, v4

    :cond_a
    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->c(Landroidx/lifecycle/q;)Landroidx/lifecycle/m;

    move-result-object v2

    iget v3, p0, Landroidx/lifecycle/t;->h:I

    add-int/2addr v3, v4

    iput v3, p0, Landroidx/lifecycle/t;->h:I

    :goto_2
    iget-object v3, v0, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v3, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_c

    iget-object v2, p0, Landroidx/lifecycle/t;->e:Lk/a;

    iget-object v2, v2, Lk/a;->f:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, v0, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v3, p0, Landroidx/lifecycle/t;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Landroidx/lifecycle/l;->Companion:Landroidx/lifecycle/j;

    iget-object v3, v0, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Landroidx/lifecycle/j;->a(Landroidx/lifecycle/m;)Landroidx/lifecycle/l;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V

    iget-object v2, p0, Landroidx/lifecycle/t;->k:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->c(Landroidx/lifecycle/q;)Landroidx/lifecycle/m;

    move-result-object v2

    goto :goto_2

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no event up from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    if-nez v5, :cond_d

    invoke-virtual {p0}, Landroidx/lifecycle/t;->h()V

    :cond_d
    iget p1, p0, Landroidx/lifecycle/t;->h:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Landroidx/lifecycle/t;->h:I

    return-void
.end method

.method public final b(Landroidx/lifecycle/q;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeObserver"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/t;->d(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/t;->e:Lk/a;

    invoke-virtual {v0, p1}, Lk/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c(Landroidx/lifecycle/q;)Landroidx/lifecycle/m;
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/t;->e:Lk/a;

    iget-object v0, v0, Lk/a;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk/c;

    iget-object p1, p1, Lk/c;->d:Lk/c;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Lk/c;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/s;

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/t;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/m;

    :cond_2
    iget-object v0, p0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    const-string v1, "state1"

    invoke-static {v0, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object p1, v0

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, p1

    :goto_3
    return-object v2
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Landroidx/lifecycle/t;->d:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lj/b;->Q2()Lj/b;

    move-result-object v0

    iget-object v0, v0, Lj/b;->j:Lj/e;

    invoke-virtual {v0}, Lj/e;->Q2()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Method "

    const-string v1, " must be called on the main thread"

    invoke-static {v0, p1, v1}, La;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final e(Landroidx/lifecycle/l;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleLifecycleEvent"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/t;->d(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/lifecycle/l;->a()Landroidx/lifecycle/m;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->f(Landroidx/lifecycle/m;)V

    return-void
.end method

.method public final f(Landroidx/lifecycle/m;)V
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    sget-object v1, Landroidx/lifecycle/m;->c:Landroidx/lifecycle/m;

    sget-object v2, Landroidx/lifecycle/m;->b:Landroidx/lifecycle/m;

    if-ne v0, v1, :cond_2

    if-eq p1, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "no event down from "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " in component "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/lifecycle/t;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    iget-boolean p1, p0, Landroidx/lifecycle/t;->i:Z

    const/4 v0, 0x1

    if-nez p1, :cond_5

    iget p1, p0, Landroidx/lifecycle/t;->h:I

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iput-boolean v0, p0, Landroidx/lifecycle/t;->i:Z

    invoke-virtual {p0}, Landroidx/lifecycle/t;->h()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/lifecycle/t;->i:Z

    iget-object p1, p0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    if-ne p1, v2, :cond_4

    new-instance p1, Lk/a;

    invoke-direct {p1}, Lk/a;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/t;->e:Lk/a;

    :cond_4
    return-void

    :cond_5
    :goto_1
    iput-boolean v0, p0, Landroidx/lifecycle/t;->j:Z

    return-void
.end method

.method public final g()V
    .locals 2

    sget-object v0, Landroidx/lifecycle/m;->d:Landroidx/lifecycle/m;

    const-string v1, "setCurrentState"

    invoke-virtual {p0, v1}, Landroidx/lifecycle/t;->d(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroidx/lifecycle/t;->f(Landroidx/lifecycle/m;)V

    return-void
.end method

.method public final h()V
    .locals 8

    iget-object v0, p0, Landroidx/lifecycle/t;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/r;

    if-eqz v0, :cond_b

    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/t;->e:Lk/a;

    iget v2, v1, Lk/g;->e:I

    const/4 v3, 0x0

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lk/g;->b:Lk/c;

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v1, v1, Lk/c;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/s;

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v2, p0, Landroidx/lifecycle/t;->e:Lk/a;

    iget-object v2, v2, Lk/g;->c:Lk/c;

    invoke-static {v2}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v2, v2, Lk/c;->b:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/s;

    iget-object v2, v2, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    if-ne v1, v2, :cond_2

    :goto_0
    iput-boolean v3, p0, Landroidx/lifecycle/t;->j:Z

    return-void

    :cond_2
    iput-boolean v3, p0, Landroidx/lifecycle/t;->j:Z

    iget-object v1, p0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    iget-object v2, p0, Landroidx/lifecycle/t;->e:Lk/a;

    iget-object v2, v2, Lk/g;->b:Lk/c;

    invoke-static {v2}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v2, v2, Lk/c;->b:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/s;

    iget-object v2, v2, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    const/4 v2, 0x1

    if-gez v1, :cond_8

    iget-object v1, p0, Landroidx/lifecycle/t;->e:Lk/a;

    new-instance v3, Lk/b;

    iget-object v4, v1, Lk/g;->c:Lk/c;

    iget-object v5, v1, Lk/g;->b:Lk/c;

    invoke-direct {v3, v4, v5, v2}, Lk/b;-><init>(Lk/c;Lk/c;I)V

    iget-object v1, v1, Lk/g;->d:Ljava/util/WeakHashMap;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v3, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v3}, Lk/e;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-boolean v1, p0, Landroidx/lifecycle/t;->j:Z

    if-nez v1, :cond_8

    invoke-virtual {v3}, Lk/e;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    const-string v4, "next()"

    invoke-static {v1, v4}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/q;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/s;

    :goto_1
    iget-object v5, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v6, p0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-lez v5, :cond_3

    iget-boolean v5, p0, Landroidx/lifecycle/t;->j:Z

    if-nez v5, :cond_3

    iget-object v5, p0, Landroidx/lifecycle/t;->e:Lk/a;

    iget-object v5, v5, Lk/a;->f:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object v5, Landroidx/lifecycle/l;->Companion:Landroidx/lifecycle/j;

    iget-object v6, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "state"

    invoke-static {v6, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_6

    const/4 v6, 0x3

    if-eq v5, v6, :cond_5

    const/4 v6, 0x4

    if-eq v5, v6, :cond_4

    const/4 v5, 0x0

    goto :goto_2

    :cond_4
    sget-object v5, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    goto :goto_2

    :cond_5
    sget-object v5, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    goto :goto_2

    :cond_6
    sget-object v5, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    :goto_2
    if-eqz v5, :cond_7

    invoke-virtual {v5}, Landroidx/lifecycle/l;->a()Landroidx/lifecycle/m;

    move-result-object v6

    iget-object v7, p0, Landroidx/lifecycle/t;->k:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v0, v5}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V

    iget-object v5, p0, Landroidx/lifecycle/t;->k:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v2

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event down from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    iget-object v1, p0, Landroidx/lifecycle/t;->e:Lk/a;

    iget-object v1, v1, Lk/g;->c:Lk/c;

    iget-boolean v3, p0, Landroidx/lifecycle/t;->j:Z

    if-nez v3, :cond_0

    if-eqz v1, :cond_0

    iget-object v3, p0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    iget-object v1, v1, Lk/c;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/s;

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v3, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Landroidx/lifecycle/t;->e:Lk/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lk/d;

    invoke-direct {v3, v1}, Lk/d;-><init>(Lk/g;)V

    iget-object v1, v1, Lk/g;->d:Ljava/util/WeakHashMap;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v3, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    invoke-virtual {v3}, Lk/d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Landroidx/lifecycle/t;->j:Z

    if-nez v1, :cond_0

    invoke-virtual {v3}, Lk/d;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/q;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/s;

    :goto_3
    iget-object v5, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v6, p0, Landroidx/lifecycle/t;->f:Landroidx/lifecycle/m;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-gez v5, :cond_9

    iget-boolean v5, p0, Landroidx/lifecycle/t;->j:Z

    if-nez v5, :cond_9

    iget-object v5, p0, Landroidx/lifecycle/t;->e:Lk/a;

    iget-object v5, v5, Lk/a;->f:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    iget-object v5, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v6, p0, Landroidx/lifecycle/t;->k:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Landroidx/lifecycle/l;->Companion:Landroidx/lifecycle/j;

    iget-object v6, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Landroidx/lifecycle/j;->a(Landroidx/lifecycle/m;)Landroidx/lifecycle/l;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v1, v0, v5}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V

    iget-object v5, p0, Landroidx/lifecycle/t;->k:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v2

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event up from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
