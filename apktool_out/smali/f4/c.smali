.class public final Lf4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/u;


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf4/v;Lf4/c;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lf4/c;->b:I

    iput-object p1, p0, Lf4/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Lf4/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Lf4/v;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lf4/c;->b:I

    iput-object p1, p0, Lf4/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Lf4/c;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final D(Lf4/g;J)V
    .locals 12

    iget v0, p0, Lf4/c;->b:I

    iget-object v1, p0, Lf4/c;->c:Ljava/lang/Object;

    iget-object v2, p0, Lf4/c;->d:Ljava/lang/Object;

    const-wide/16 v3, 0x0

    const-string v5, "source"

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v6, p1, Lf4/g;->c:J

    const-wide/16 v8, 0x0

    move-wide v10, p2

    invoke-static/range {v6 .. v11}, Lc3/h;->c0(JJJ)V

    :cond_0
    :goto_0
    cmp-long v0, p2, v3

    if-lez v0, :cond_1

    move-object v0, v2

    check-cast v0, Lf4/y;

    invoke-virtual {v0}, Lf4/y;->f()V

    iget-object v0, p1, Lf4/g;->b:Lf4/r;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    iget v5, v0, Lf4/r;->c:I

    iget v6, v0, Lf4/r;->b:I

    sub-int/2addr v5, v6

    int-to-long v5, v5

    invoke-static {p2, p3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v5, v5

    move-object v6, v1

    check-cast v6, Ljava/io/OutputStream;

    iget-object v7, v0, Lf4/r;->a:[B

    iget v8, v0, Lf4/r;->b:I

    invoke-virtual {v6, v7, v8, v5}, Ljava/io/OutputStream;->write([BII)V

    iget v6, v0, Lf4/r;->b:I

    add-int/2addr v6, v5

    iput v6, v0, Lf4/r;->b:I

    int-to-long v7, v5

    sub-long/2addr p2, v7

    iget-wide v9, p1, Lf4/g;->c:J

    sub-long/2addr v9, v7

    iput-wide v9, p1, Lf4/g;->c:J

    iget v5, v0, Lf4/r;->c:I

    if-ne v6, v5, :cond_0

    invoke-virtual {v0}, Lf4/r;->a()Lf4/r;

    move-result-object v5

    iput-object v5, p1, Lf4/g;->b:Lf4/r;

    invoke-static {v0}, Lf4/s;->a(Lf4/r;)V

    goto :goto_0

    :cond_1
    return-void

    :pswitch_0
    invoke-static {p1, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v6, p1, Lf4/g;->c:J

    const-wide/16 v8, 0x0

    move-wide v10, p2

    invoke-static/range {v6 .. v11}, Lc3/h;->c0(JJJ)V

    :goto_1
    cmp-long v0, p2, v3

    if-lez v0, :cond_6

    iget-object v0, p1, Lf4/g;->b:Lf4/r;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    move-wide v5, v3

    :goto_2
    const-wide/32 v7, 0x10000

    cmp-long v7, v5, v7

    if-gez v7, :cond_3

    iget v7, v0, Lf4/r;->c:I

    iget v8, v0, Lf4/r;->b:I

    sub-int/2addr v7, v8

    int-to-long v7, v7

    add-long/2addr v5, v7

    cmp-long v7, v5, p2

    if-ltz v7, :cond_2

    move-wide v5, p2

    goto :goto_3

    :cond_2
    iget-object v0, v0, Lf4/r;->f:Lf4/r;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    :goto_3
    move-object v0, v1

    check-cast v0, Lf4/e;

    move-object v7, v2

    check-cast v7, Lf4/u;

    invoke-virtual {v0}, Lf4/e;->h()V

    :try_start_0
    invoke-interface {v7, p1, v5, v6}, Lf4/u;->D(Lf4/g;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lf4/e;->i()Z

    move-result v7

    if-nez v7, :cond_4

    sub-long/2addr p2, v5

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lf4/e;->j(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_5

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lf4/e;->i()Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v0, p1}, Lf4/e;->j(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :goto_4
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    invoke-virtual {v0}, Lf4/e;->i()Z

    throw p1

    :cond_6
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Lf4/y;
    .locals 1

    iget v0, p0, Lf4/c;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf4/c;->d:Ljava/lang/Object;

    check-cast v0, Lf4/y;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf4/c;->c:Ljava/lang/Object;

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

    iget v0, p0, Lf4/c;->b:I

    iget-object v1, p0, Lf4/c;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    return-void

    :pswitch_0
    check-cast v1, Lf4/e;

    iget-object v0, p0, Lf4/c;->d:Ljava/lang/Object;

    check-cast v0, Lf4/u;

    invoke-virtual {v1}, Lf4/e;->h()V

    :try_start_0
    invoke-interface {v0}, Lf4/u;->close()V
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

.method public final flush()V
    .locals 3

    iget v0, p0, Lf4/c;->b:I

    iget-object v1, p0, Lf4/c;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    return-void

    :pswitch_0
    check-cast v1, Lf4/e;

    iget-object v0, p0, Lf4/c;->d:Ljava/lang/Object;

    check-cast v0, Lf4/u;

    invoke-virtual {v1}, Lf4/e;->h()V

    :try_start_0
    invoke-interface {v0}, Lf4/u;->flush()V
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

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lf4/c;->b:I

    const/16 v1, 0x29

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "sink("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lf4/c;->c:Ljava/lang/Object;

    check-cast v2, Ljava/io/OutputStream;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "AsyncTimeout.sink("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lf4/c;->d:Ljava/lang/Object;

    check-cast v2, Lf4/u;

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
