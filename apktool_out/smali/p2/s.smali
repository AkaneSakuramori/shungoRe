.class public final Lp2/s;
.super Lm2/b0;
.source "SourceFile"


# instance fields
.field public final a:Lm2/p;

.field public final b:Lm2/m;

.field public final c:Lcom/google/gson/reflect/TypeToken;

.field public final d:Lm2/c0;

.field public final e:Lc/a;

.field public f:Lm2/b0;


# direct methods
.method public constructor <init>(Lm2/p;Lm2/m;Lcom/google/gson/reflect/TypeToken;Lm2/c0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lc/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, Lc/a;->a:Ljava/lang/Object;

    iput-object v0, p0, Lp2/s;->e:Lc/a;

    iput-object p1, p0, Lp2/s;->a:Lm2/p;

    iput-object p2, p0, Lp2/s;->b:Lm2/m;

    iput-object p3, p0, Lp2/s;->c:Lcom/google/gson/reflect/TypeToken;

    iput-object p4, p0, Lp2/s;->d:Lm2/c0;

    return-void
.end method


# virtual methods
.method public final b(Lt2/b;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lp2/s;->c:Lcom/google/gson/reflect/TypeToken;

    iget-object v1, p0, Lp2/s;->a:Lm2/p;

    if-nez v1, :cond_1

    iget-object v1, p0, Lp2/s;->f:Lm2/b0;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lp2/s;->d:Lm2/c0;

    iget-object v2, p0, Lp2/s;->b:Lm2/m;

    invoke-virtual {v2, v1, v0}, Lm2/m;->d(Lm2/c0;Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v1

    iput-object v1, p0, Lp2/s;->f:Lm2/b0;

    :goto_0
    invoke-virtual {v1, p1}, Lm2/b0;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Lt2/b;->T()I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lt2/d; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x0

    :try_start_1
    sget-object v3, Lp2/x;->y:Lm2/j;

    invoke-virtual {v3, p1}, Lm2/j;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm2/q;
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lt2/d; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    move-exception p1

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
    new-instance v0, Lm2/r;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_2
    new-instance v0, Lm2/r;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_3
    new-instance v0, Lm2/r;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_4
    move-exception p1

    const/4 v2, 0x1

    :goto_4
    if-eqz v2, :cond_3

    sget-object p1, Lm2/s;->b:Lm2/s;

    :goto_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v2, p1, Lm2/s;

    if-eqz v2, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    iget-object v2, p0, Lp2/s;->e:Lc/a;

    invoke-interface {v1, p1, v0, v2}, Lm2/p;->a(Lm2/q;Ljava/lang/reflect/Type;Lc/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance v0, Lm2/r;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final c(Lt2/c;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lp2/s;->f:Lm2/b0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp2/s;->c:Lcom/google/gson/reflect/TypeToken;

    iget-object v1, p0, Lp2/s;->b:Lm2/m;

    iget-object v2, p0, Lp2/s;->d:Lm2/c0;

    invoke-virtual {v1, v2, v0}, Lm2/m;->d(Lm2/c0;Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v0

    iput-object v0, p0, Lp2/s;->f:Lm2/b0;

    :goto_0
    invoke-virtual {v0, p1, p2}, Lm2/b0;->c(Lt2/c;Ljava/lang/Object;)V

    return-void
.end method
