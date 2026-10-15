.class public final Lp2/j;
.super Lm2/b0;
.source "SourceFile"


# instance fields
.field public final a:Lp2/t;

.field public final b:Lp2/t;

.field public final c:Lo2/n;

.field public final synthetic d:Lp2/k;


# direct methods
.method public constructor <init>(Lp2/k;Lm2/m;Ljava/lang/reflect/Type;Lm2/b0;Ljava/lang/reflect/Type;Lm2/b0;Lo2/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/j;->d:Lp2/k;

    new-instance p1, Lp2/t;

    invoke-direct {p1, p2, p4, p3}, Lp2/t;-><init>(Lm2/m;Lm2/b0;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Lp2/j;->a:Lp2/t;

    new-instance p1, Lp2/t;

    invoke-direct {p1, p2, p6, p5}, Lp2/t;-><init>(Lm2/m;Lm2/b0;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Lp2/j;->b:Lp2/t;

    iput-object p7, p0, Lp2/j;->c:Lo2/n;

    return-void
.end method


# virtual methods
.method public final b(Lt2/b;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p1}, Lt2/b;->T()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lt2/b;->P()V

    const/4 p1, 0x0

    goto/16 :goto_3

    :cond_0
    iget-object v1, p0, Lp2/j;->c:Lo2/n;

    invoke-interface {v1}, Lo2/n;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    const/4 v2, 0x1

    iget-object v3, p0, Lp2/j;->b:Lp2/t;

    iget-object v4, p0, Lp2/j;->a:Lp2/t;

    const-string v5, "duplicate key: "

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Lt2/b;->a()V

    :goto_0
    invoke-virtual {p1}, Lt2/b;->G()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lt2/b;->a()V

    iget-object v0, v4, Lp2/t;->b:Lm2/b0;

    invoke-virtual {v0, p1}, Lm2/b0;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, v3, Lp2/t;->b:Lm2/b0;

    invoke-virtual {v2, p1}, Lm2/b0;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Lt2/b;->x()V

    goto :goto_0

    :cond_1
    new-instance p1, Lm2/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Lt2/b;->x()V

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lt2/b;->e()V

    :goto_1
    invoke-virtual {p1}, Lt2/b;->G()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lt2/a;->a:Lt2/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lt2/a;->a(Lt2/b;)V

    iget-object v0, v4, Lp2/t;->b:Lm2/b0;

    invoke-virtual {v0, p1}, Lm2/b0;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, v3, Lp2/t;->b:Lm2/b0;

    invoke-virtual {v2, p1}, Lm2/b0;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Lm2/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-virtual {p1}, Lt2/b;->z()V

    :goto_2
    move-object p1, v1

    :goto_3
    return-object p1
.end method

.method public final c(Lt2/c;Ljava/lang/Object;)V
    .locals 9

    check-cast p2, Ljava/util/Map;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lt2/c;->G()Lt2/c;

    goto/16 :goto_7

    :cond_0
    iget-object v0, p0, Lp2/j;->d:Lp2/k;

    iget-boolean v0, v0, Lp2/k;->c:Z

    iget-object v1, p0, Lp2/j;->b:Lp2/t;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lt2/c;->h()V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lt2/c;->C(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lp2/t;->c(Lt2/c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lt2/c;->z()V

    goto/16 :goto_7

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    iget-object v7, p0, Lp2/j;->a:Lp2/t;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    new-instance v8, Lp2/i;

    invoke-direct {v8}, Lp2/i;-><init>()V

    invoke-virtual {v7, v8, v6}, Lp2/t;->c(Lt2/c;Ljava/lang/Object;)V

    iget-object v6, v8, Lp2/i;->m:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v6, v8, Lp2/i;->o:Lm2/q;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v5, v6, Lm2/o;

    if-nez v5, :cond_4

    instance-of v5, v6, Lm2/t;

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    move v5, v3

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v5, 0x1

    :goto_3
    or-int/2addr v4, v5

    goto :goto_1

    :cond_5
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Expected one JSON element but was "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    new-instance p2, Lm2/r;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_6
    if-eqz v4, :cond_8

    invoke-virtual {p1}, Lt2/c;->e()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    :goto_4
    if-ge v3, p2, :cond_7

    invoke-virtual {p1}, Lt2/c;->e()V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm2/q;

    invoke-static {v4, p1}, Lc3/h;->N2(Lm2/q;Lt2/c;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p1, v4}, Lp2/t;->c(Lt2/c;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lt2/c;->x()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Lt2/c;->x()V

    goto/16 :goto_7

    :cond_8
    invoke-virtual {p1}, Lt2/c;->h()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    :goto_5
    if-ge v3, p2, :cond_f

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm2/q;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v5, v4, Lm2/u;

    if-eqz v5, :cond_d

    if-eqz v5, :cond_c

    check-cast v4, Lm2/u;

    iget-object v5, v4, Lm2/u;->b:Ljava/io/Serializable;

    instance-of v6, v5, Ljava/lang/Number;

    if-eqz v6, :cond_9

    invoke-virtual {v4}, Lm2/u;->c()Ljava/lang/Number;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :cond_9
    instance-of v6, v5, Ljava/lang/Boolean;

    if-eqz v6, :cond_a

    invoke-virtual {v4}, Lm2/u;->b()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :cond_a
    instance-of v5, v5, Ljava/lang/String;

    if-eqz v5, :cond_b

    invoke-virtual {v4}, Lm2/u;->d()Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :cond_b
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Not a JSON Primitive: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    instance-of v4, v4, Lm2/s;

    if-eqz v4, :cond_e

    const-string v4, "null"

    :goto_6
    invoke-virtual {p1, v4}, Lt2/c;->C(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p1, v4}, Lp2/t;->c(Lt2/c;Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_e
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_f
    invoke-virtual {p1}, Lt2/c;->z()V

    :goto_7
    return-void
.end method
