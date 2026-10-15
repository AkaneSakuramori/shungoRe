.class public final Lf4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/w;


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf4/v;Lf4/d;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lf4/d;->b:I

    iput-object p1, p0, Lf4/d;->c:Ljava/lang/Object;

    iput-object p2, p0, Lf4/d;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lf4/y;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lf4/d;->b:I

    iput-object p1, p0, Lf4/d;->c:Ljava/lang/Object;

    iput-object p2, p0, Lf4/d;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Lf4/y;
    .locals 1

    iget v0, p0, Lf4/d;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf4/d;->d:Ljava/lang/Object;

    check-cast v0, Lf4/y;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf4/d;->c:Ljava/lang/Object;

    check-cast v0, Lf4/e;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 3

    iget v0, p0, Lf4/d;->b:I

    iget-object v1, p0, Lf4/d;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-void

    :pswitch_0
    check-cast v1, Lf4/e;

    iget-object v0, p0, Lf4/d;->d:Ljava/lang/Object;

    check-cast v0, Lf4/w;

    invoke-virtual {v1}, Lf4/e;->h()V

    :try_start_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lf4/e;->i()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lf4/e;->j(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {v1}, Lf4/e;->i()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v0}, Lf4/e;->j(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    :goto_0
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v1}, Lf4/e;->i()Z

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lf4/g;J)J
    .locals 5

    iget v0, p0, Lf4/d;->b:I

    iget-object v1, p0, Lf4/d;->c:Ljava/lang/Object;

    iget-object v2, p0, Lf4/d;->d:Ljava/lang/Object;

    const-string v3, "sink"

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v3, 0x0

    cmp-long v0, p2, v3

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-ltz v0, :cond_4

    :try_start_0
    check-cast v2, Lf4/y;

    invoke-virtual {v2}, Lf4/y;->f()V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lf4/g;->G(I)Lf4/r;

    move-result-object v0

    iget v2, v0, Lf4/r;->c:I

    rsub-int v2, v2, 0x2000

    int-to-long v2, v2

    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int p2, p2

    check-cast v1, Ljava/io/InputStream;

    iget-object p3, v0, Lf4/r;->a:[B

    iget v2, v0, Lf4/r;->c:I

    invoke-virtual {v1, p3, v2, p2}, Ljava/io/InputStream;->read([BII)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_2

    iget p2, v0, Lf4/r;->b:I

    iget p3, v0, Lf4/r;->c:I

    if-ne p2, p3, :cond_1

    invoke-virtual {v0}, Lf4/r;->a()Lf4/r;

    move-result-object p2

    iput-object p2, p1, Lf4/g;->b:Lf4/r;

    invoke-static {v0}, Lf4/s;->a(Lf4/r;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    const-wide/16 v3, -0x1

    goto :goto_1

    :cond_2
    iget p3, v0, Lf4/r;->c:I

    add-int/2addr p3, p2

    iput p3, v0, Lf4/r;->c:I

    iget-wide v0, p1, Lf4/g;->c:J

    int-to-long v3, p2

    add-long/2addr v0, v3

    iput-wide v0, p1, Lf4/g;->c:J
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-wide v3

    :goto_2
    invoke-static {p1}, Lr3/q;->m(Ljava/lang/AssertionError;)Z

    move-result p2

    if-eqz p2, :cond_3

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_3
    throw p1

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "byteCount < 0: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    invoke-static {p1, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf4/e;

    check-cast v2, Lf4/w;

    invoke-virtual {v1}, Lf4/e;->h()V

    :try_start_1
    invoke-interface {v2, p1, p2, p3}, Lf4/w;->f(Lf4/g;J)J

    move-result-wide p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1}, Lf4/e;->i()Z

    move-result p3

    if-nez p3, :cond_5

    return-wide p1

    :cond_5
    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lf4/e;->j(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    :try_start_2
    invoke-virtual {v1}, Lf4/e;->i()Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v1, p1}, Lf4/e;->j(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :goto_3
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    invoke-virtual {v1}, Lf4/e;->i()Z

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lf4/d;->b:I

    const/16 v1, 0x29

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "source("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lf4/d;->c:Ljava/lang/Object;

    check-cast v2, Ljava/io/InputStream;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "AsyncTimeout.source("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lf4/d;->d:Ljava/lang/Object;

    check-cast v2, Lf4/w;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
