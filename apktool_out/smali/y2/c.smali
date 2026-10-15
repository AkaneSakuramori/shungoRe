.class public abstract Ly2/c;
.super Lc3/h;
.source "SourceFile"

# interfaces
.implements Lx2/c;
.implements Ljava/io/Closeable;


# static fields
.field public static final o:Ljava/util/ArrayList;

.field public static final p:Ljava/lang/String;

.field public static final q:[B


# instance fields
.field public final j:Ljava/util/ArrayList;

.field public final k:Ly2/h;

.field public l:Ljava/util/List;

.field public final m:Ljava/util/ArrayList;

.field public n:Ly2/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Ly2/c;->o:Ljava/util/ArrayList;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ly2/c;->p:Ljava/lang/String;

    const-string v1, "__RET=$?;echo %1$s;echo %1$s >&2;echo $__RET;unset __RET\n"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Ly2/c;->q:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ly2/c;->j:Ljava/util/ArrayList;

    new-instance v0, Ly2/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ly2/c;->k:Ly2/h;

    sget-object v0, Ly2/c;->o:Ljava/util/ArrayList;

    iput-object v0, p0, Ly2/c;->m:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final Q2()Ly2/h;
    .locals 7

    iget-object v0, p0, Ly2/c;->m:Ljava/util/ArrayList;

    sget-object v1, Ly2/c;->o:Ljava/util/ArrayList;

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Ly2/c;->l:Ljava/util/List;

    iget-object v3, p0, Ly2/c;->k:Ly2/h;

    iput-object v2, v3, Ly2/h;->j:Ljava/util/List;

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    move-object v5, v4

    goto :goto_1

    :cond_1
    move-object v5, v0

    :goto_1
    iput-object v5, v3, Ly2/h;->k:Ljava/util/List;

    if-eqz v1, :cond_2

    iget-object v5, p0, Ly2/c;->n:Ly2/m;

    iget-boolean v5, v5, Ly2/m;->e:Z

    if-eqz v5, :cond_2

    iput-object v2, v3, Ly2/h;->k:Ljava/util/List;

    :cond_2
    if-eqz v2, :cond_4

    iget-object v5, v3, Ly2/h;->k:Ljava/util/List;

    if-ne v2, v5, :cond_4

    sget-object v5, Ly2/r;->a:Ljava/lang/Class;

    if-nez v5, :cond_3

    invoke-static {}, Ly2/e;->a()Ly2/e;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Collections;->synchronizedCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    sput-object v5, Ly2/r;->a:Ljava/lang/Class;

    :cond_3
    sget-object v5, Ly2/r;->a:Ljava/lang/Class;

    invoke-virtual {v5, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v3, Ly2/h;->j:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v3, Ly2/h;->j:Ljava/util/List;

    iput-object v2, v3, Ly2/h;->k:Ljava/util/List;

    :cond_4
    :try_start_0
    iget-object v2, p0, Ly2/c;->n:Ly2/m;

    invoke-virtual {v2, p0}, Ly2/m;->h(Lx2/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ly2/c;->close()V

    iget-object v2, p0, Ly2/c;->l:Ljava/util/List;

    iput-object v2, v3, Ly2/h;->j:Ljava/util/List;

    if-eqz v1, :cond_5

    move-object v0, v4

    :cond_5
    iput-object v0, v3, Ly2/h;->k:Ljava/util/List;

    return-object v3

    :catchall_0
    move-exception v2

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_1
    instance-of v5, v2, Ly2/n;

    if-eqz v5, :cond_7

    sget-object v2, Ly2/h;->m:Ly2/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0}, Ly2/c;->close()V

    iget-object v5, p0, Ly2/c;->l:Ljava/util/List;

    iput-object v5, v3, Ly2/h;->j:Ljava/util/List;

    if-eqz v1, :cond_6

    move-object v0, v4

    :cond_6
    iput-object v0, v3, Ly2/h;->k:Ljava/util/List;

    return-object v2

    :cond_7
    :try_start_2
    const-string v5, ""

    const-string v6, "LIBSU"

    invoke-static {v6, v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object v2, Ly2/h;->l:Ly2/h;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p0}, Ly2/c;->close()V

    iget-object v5, p0, Ly2/c;->l:Ljava/util/List;

    iput-object v5, v3, Ly2/h;->j:Ljava/util/List;

    if-eqz v1, :cond_8

    move-object v0, v4

    :cond_8
    iput-object v0, v3, Ly2/h;->k:Ljava/util/List;

    return-object v2

    :goto_2
    invoke-virtual {p0}, Ly2/c;->close()V

    iget-object v5, p0, Ly2/c;->l:Ljava/util/List;

    iput-object v5, v3, Ly2/h;->j:Ljava/util/List;

    if-eqz v1, :cond_9

    move-object v0, v4

    :cond_9
    iput-object v0, v3, Ly2/h;->k:Ljava/util/List;

    throw v2
.end method

.method public final R2(Ly2/l;Ly2/k;Ly2/k;)V
    .locals 7

    sget-object v0, Lx2/d;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ly2/o;

    iget-object v2, p0, Ly2/c;->k:Ly2/h;

    iget-object v3, v2, Ly2/h;->j:Ljava/util/List;

    const/4 v4, 0x1

    invoke-direct {v1, p2, v3, v4}, Ly2/o;-><init>(Ly2/k;Ljava/util/List;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p2

    new-instance v1, Ly2/o;

    iget-object v2, v2, Ly2/h;->k:Ljava/util/List;

    const/4 v3, 0x0

    invoke-direct {v1, p3, v2, v3}, Ly2/o;-><init>(Ly2/k;Ljava/util/List;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p3

    iget-object v0, p0, Ly2/c;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/b;

    iget-object v1, v1, Ly2/b;->b:[Ljava/lang/String;

    array-length v2, v1

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v1, v4

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/io/OutputStream;->write([B)V

    const/16 v5, 0xa

    invoke-virtual {p1, v5}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, Ly2/c;->q:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    invoke-interface {p3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :goto_1
    new-instance p2, Ljava/io/InterruptedIOException;

    invoke-direct {p2}, Ljava/io/InterruptedIOException;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/io/InterruptedIOException;

    throw p1
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Ly2/c;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    return-void
.end method
