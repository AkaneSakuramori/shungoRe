.class public final Lm2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:Lcom/google/gson/reflect/TypeToken;


# instance fields
.field public final a:Ljava/lang/ThreadLocal;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public final c:Li/a0;

.field public final d:Lp2/b;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    sput-object v0, Lm2/m;->j:Lcom/google/gson/reflect/TypeToken;

    return-void
.end method

.method public constructor <init>(Lo2/f;Lm2/a;Ljava/util/Map;ZILjava/util/List;Lm2/v;Lm2/w;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lm2/m;->a:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lm2/m;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Li/a0;

    invoke-direct {v0, p3}, Li/a0;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lm2/m;->c:Li/a0;

    const/4 p3, 0x0

    iput-boolean p3, p0, Lm2/m;->f:Z

    iput-boolean p3, p0, Lm2/m;->g:Z

    iput-boolean p4, p0, Lm2/m;->h:Z

    iput-boolean p3, p0, Lm2/m;->i:Z

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lp2/x;->z:Lp2/u;

    invoke-virtual {p4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lm2/z;->b:Lm2/v;

    const/4 v2, 0x1

    if-ne p7, v1, :cond_0

    sget-object p7, Lp2/n;->c:Lp2/l;

    goto :goto_0

    :cond_0
    new-instance v1, Lp2/l;

    invoke-direct {v1, v2, p7}, Lp2/l;-><init>(ILjava/lang/Object;)V

    move-object p7, v1

    :goto_0
    invoke-virtual {p4, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object p6, Lp2/x;->o:Lp2/u;

    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p6, Lp2/x;->g:Lp2/v;

    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p6, Lp2/x;->d:Lp2/v;

    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p6, Lp2/x;->e:Lp2/v;

    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p6, Lp2/x;->f:Lp2/v;

    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-ne p5, v2, :cond_1

    sget-object p5, Lp2/x;->k:Lm2/j;

    goto :goto_1

    :cond_1
    new-instance p5, Lm2/j;

    invoke-direct {p5, p3}, Lm2/j;-><init>(I)V

    :goto_1
    sget-object p6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class p7, Ljava/lang/Long;

    invoke-static {p6, p7, p5}, Lp2/x;->b(Ljava/lang/Class;Ljava/lang/Class;Lm2/b0;)Lp2/v;

    move-result-object p6

    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    new-instance p7, Lm2/i;

    invoke-direct {p7, p3}, Lm2/i;-><init>(I)V

    const-class v1, Ljava/lang/Double;

    invoke-static {p6, v1, p7}, Lp2/x;->b(Ljava/lang/Class;Ljava/lang/Class;Lm2/b0;)Lp2/v;

    move-result-object p6

    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    new-instance p7, Lm2/i;

    invoke-direct {p7, v2}, Lm2/i;-><init>(I)V

    const-class v1, Ljava/lang/Float;

    invoke-static {p6, v1, p7}, Lp2/x;->b(Ljava/lang/Class;Ljava/lang/Class;Lm2/b0;)Lp2/v;

    move-result-object p6

    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p6, Lm2/z;->c:Lm2/w;

    if-ne p8, p6, :cond_2

    sget-object p6, Lp2/m;->b:Lp2/l;

    goto :goto_2

    :cond_2
    new-instance p6, Lp2/m;

    invoke-direct {p6, p8}, Lp2/m;-><init>(Lm2/w;)V

    new-instance p7, Lp2/l;

    invoke-direct {p7, p3, p6}, Lp2/l;-><init>(ILjava/lang/Object;)V

    move-object p6, p7

    :goto_2
    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p6, Lp2/x;->h:Lp2/u;

    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p6, Lp2/x;->i:Lp2/u;

    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p6, Lm2/k;

    invoke-direct {p6, p5, p3}, Lm2/k;-><init>(Lm2/b0;I)V

    invoke-virtual {p6}, Lm2/b0;->a()Lm2/k;

    move-result-object p6

    const-class p7, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {p7, p6}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object p6

    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p6, Lm2/k;

    invoke-direct {p6, p5, v2}, Lm2/k;-><init>(Lm2/b0;I)V

    invoke-virtual {p6}, Lm2/b0;->a()Lm2/k;

    move-result-object p5

    const-class p6, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-static {p6, p5}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object p5

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->j:Lp2/u;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->l:Lp2/v;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->p:Lp2/u;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->q:Lp2/u;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->m:Lm2/j;

    const-class p6, Ljava/math/BigDecimal;

    invoke-static {p6, p5}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object p5

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->n:Lm2/j;

    const-class p6, Ljava/math/BigInteger;

    invoke-static {p6, p5}, Lp2/x;->a(Ljava/lang/Class;Lm2/b0;)Lp2/u;

    move-result-object p5

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->r:Lp2/u;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->s:Lp2/u;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->u:Lp2/u;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->v:Lp2/u;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->x:Lp2/u;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->t:Lp2/u;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->b:Lp2/u;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/c;->b:Lcom/auth0/android/request/internal/i;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->w:Lp2/v;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-boolean p5, Ls2/e;->a:Z

    if-eqz p5, :cond_3

    sget-object p5, Ls2/e;->e:Lcom/auth0/android/request/internal/i;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Ls2/e;->d:Lcom/auth0/android/request/internal/i;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Ls2/e;->f:Lcom/auth0/android/request/internal/i;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    sget-object p5, Lp2/a;->c:Lcom/auth0/android/request/internal/i;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->a:Lp2/u;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p5, Lp2/b;

    invoke-direct {p5, v0, p3}, Lp2/b;-><init>(Li/a0;I)V

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p3, Lp2/k;

    invoke-direct {p3, v0}, Lp2/k;-><init>(Li/a0;)V

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p3, Lp2/b;

    invoke-direct {p3, v0, v2}, Lp2/b;-><init>(Li/a0;I)V

    iput-object p3, p0, Lm2/m;->d:Lp2/b;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Lp2/x;->A:Lcom/auth0/android/request/internal/i;

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p5, Lp2/q;

    invoke-direct {p5, v0, p2, p1, p3}, Lp2/q;-><init>(Li/a0;Lm2/a;Lo2/f;Lp2/b;)V

    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lm2/m;->e:Ljava/util/List;

    return-void
.end method

.method public static a(D)V
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b(Lm2/q;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lp2/g;

    sget-object v2, Lp2/g;->u:Lp2/f;

    invoke-direct {v1, v2}, Lt2/b;-><init>(Ljava/io/Reader;)V

    const/16 v2, 0x20

    new-array v3, v2, [Ljava/lang/Object;

    iput-object v3, v1, Lp2/g;->q:[Ljava/lang/Object;

    const/4 v3, 0x0

    iput v3, v1, Lp2/g;->r:I

    new-array v4, v2, [Ljava/lang/String;

    iput-object v4, v1, Lp2/g;->s:[Ljava/lang/String;

    new-array v2, v2, [I

    iput-object v2, v1, Lp2/g;->t:[I

    invoke-virtual {v1, p1}, Lp2/g;->e0(Ljava/lang/Object;)V

    const-string p1, "AssertionError (GSON 2.8.9): "

    iget-boolean v2, v1, Lt2/b;->c:Z

    const/4 v4, 0x1

    iput-boolean v4, v1, Lt2/b;->c:Z

    :try_start_0
    invoke-virtual {v1}, Lp2/g;->T()I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    invoke-virtual {p0, p2}, Lm2/m;->c(Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object p2

    invoke-virtual {p2, v1}, Lm2/b0;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-boolean v2, v1, Lt2/b;->c:Z

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_6

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    goto :goto_3

    :catch_3
    move-exception p1

    goto :goto_4

    :goto_1
    :try_start_2
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :goto_2
    new-instance p2, Lm2/r;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :goto_3
    new-instance p2, Lm2/r;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_4
    move-exception p1

    move v3, v4

    :goto_4
    if-eqz v3, :cond_1

    goto :goto_0

    :goto_5
    return-object v0

    :cond_1
    new-instance p2, Lm2/r;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_6
    iput-boolean v2, v1, Lt2/b;->c:Z

    throw p1
.end method

.method public final c(Lcom/google/gson/reflect/TypeToken;)Lm2/b0;
    .locals 7

    iget-object v0, p0, Lm2/m;->b:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez p1, :cond_0

    sget-object v1, Lm2/m;->j:Lcom/google/gson/reflect/TypeToken;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm2/b0;

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    iget-object v1, p0, Lm2/m;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_2

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm2/l;

    if-eqz v4, :cond_3

    return-object v4

    :cond_3
    :try_start_0
    new-instance v4, Lm2/l;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, p0, Lm2/m;->e:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm2/c0;

    invoke-interface {v6, p0, p1}, Lm2/c0;->a(Lm2/m;Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v6

    if-eqz v6, :cond_4

    iget-object v5, v4, Lm2/l;->a:Lm2/b0;

    if-nez v5, :cond_6

    iput-object v6, v4, Lm2/l;->a:Lm2/b0;

    invoke-virtual {v0, p1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_5

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_5
    return-object v6

    :cond_6
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "GSON (2.8.9) cannot handle "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_8

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_8
    throw v0
.end method

.method public final d(Lm2/c0;Lcom/google/gson/reflect/TypeToken;)Lm2/b0;
    .locals 3

    iget-object v0, p0, Lm2/m;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object p1, p0, Lm2/m;->d:Lp2/b;

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm2/c0;

    if-nez v1, :cond_2

    if-ne v2, p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v2, p0, p2}, Lm2/c0;->a(Lm2/m;Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GSON cannot serialize "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Ljava/io/Writer;)Lt2/c;
    .locals 1

    iget-boolean v0, p0, Lm2/m;->g:Z

    if-eqz v0, :cond_0

    const-string v0, ")]}\'\n"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lt2/c;

    invoke-direct {v0, p1}, Lt2/c;-><init>(Ljava/io/Writer;)V

    iget-boolean p1, p0, Lm2/m;->i:Z

    if-eqz p1, :cond_1

    const-string p1, "  "

    iput-object p1, v0, Lt2/c;->e:Ljava/lang/String;

    const-string p1, ": "

    iput-object p1, v0, Lt2/c;->f:Ljava/lang/String;

    :cond_1
    iget-boolean p1, p0, Lm2/m;->f:Z

    iput-boolean p1, v0, Lt2/c;->j:Z

    return-object v0
.end method

.method public final f(Ljava/util/Map;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    new-instance p1, Ljava/io/StringWriter;

    invoke-direct {p1}, Ljava/io/StringWriter;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1}, Lm2/m;->e(Ljava/io/Writer;)Lt2/c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm2/m;->h(Lt2/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lm2/r;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/io/StringWriter;

    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    :try_start_1
    invoke-virtual {p0, v1}, Lm2/m;->e(Ljava/io/Writer;)Lt2/c;

    move-result-object v2

    invoke-virtual {p0, p1, v0, v2}, Lm2/m;->g(Ljava/util/Map;Ljava/lang/Class;Lt2/c;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p1

    new-instance v0, Lm2/r;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final g(Ljava/util/Map;Ljava/lang/Class;Lt2/c;)V
    .locals 5

    const-string v0, "AssertionError (GSON 2.8.9): "

    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    invoke-virtual {p0, p2}, Lm2/m;->c(Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object p2

    iget-boolean v1, p3, Lt2/c;->g:Z

    const/4 v2, 0x1

    iput-boolean v2, p3, Lt2/c;->g:Z

    iget-boolean v2, p3, Lt2/c;->h:Z

    iget-boolean v3, p0, Lm2/m;->h:Z

    iput-boolean v3, p3, Lt2/c;->h:Z

    iget-boolean v3, p3, Lt2/c;->j:Z

    iget-boolean v4, p0, Lm2/m;->f:Z

    iput-boolean v4, p3, Lt2/c;->j:Z

    :try_start_0
    invoke-virtual {p2, p3, p1}, Lm2/b0;->c(Lt2/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p3, Lt2/c;->g:Z

    iput-boolean v2, p3, Lt2/c;->h:Z

    iput-boolean v3, p3, Lt2/c;->j:Z

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Lm2/r;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-boolean v1, p3, Lt2/c;->g:Z

    iput-boolean v2, p3, Lt2/c;->h:Z

    iput-boolean v3, p3, Lt2/c;->j:Z

    throw p1
.end method

.method public final h(Lt2/c;)V
    .locals 7

    sget-object v0, Lm2/s;->b:Lm2/s;

    const-string v1, "AssertionError (GSON 2.8.9): "

    iget-boolean v2, p1, Lt2/c;->g:Z

    const/4 v3, 0x1

    iput-boolean v3, p1, Lt2/c;->g:Z

    iget-boolean v3, p1, Lt2/c;->h:Z

    iget-boolean v4, p0, Lm2/m;->h:Z

    iput-boolean v4, p1, Lt2/c;->h:Z

    iget-boolean v4, p1, Lt2/c;->j:Z

    iget-boolean v5, p0, Lm2/m;->f:Z

    iput-boolean v5, p1, Lt2/c;->j:Z

    :try_start_0
    invoke-static {v0, p1}, Lc3/h;->N2(Lm2/q;Lt2/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v2, p1, Lt2/c;->g:Z

    iput-boolean v3, p1, Lt2/c;->h:Z

    iput-boolean v4, p1, Lt2/c;->j:Z

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v5, Ljava/lang/AssertionError;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v5

    :catch_1
    move-exception v0

    new-instance v1, Lm2/r;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-boolean v2, p1, Lt2/c;->g:Z

    iput-boolean v3, p1, Lt2/c;->h:Z

    iput-boolean v4, p1, Lt2/c;->j:Z

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{serializeNulls:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lm2/m;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",factories:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm2/m;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm2/m;->c:Li/a0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
