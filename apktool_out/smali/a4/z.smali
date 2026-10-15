.class public final La4/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/w;


# instance fields
.field public final b:J

.field public c:Z

.field public final d:Lf4/g;

.field public final e:Lf4/g;

.field public f:Z

.field public final synthetic g:La4/b0;


# direct methods
.method public constructor <init>(La4/b0;JZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/z;->g:La4/b0;

    iput-wide p2, p0, La4/z;->b:J

    iput-boolean p4, p0, La4/z;->c:Z

    new-instance p1, Lf4/g;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/z;->d:Lf4/g;

    new-instance p1, Lf4/g;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/z;->e:Lf4/g;

    return-void
.end method


# virtual methods
.method public final b()Lf4/y;
    .locals 1

    iget-object v0, p0, La4/z;->g:La4/b0;

    iget-object v0, v0, La4/b0;->k:La4/a0;

    return-object v0
.end method

.method public final close()V
    .locals 4

    iget-object v0, p0, La4/z;->g:La4/b0;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, La4/z;->f:Z

    iget-object v1, p0, La4/z;->e:Lf4/g;

    iget-wide v2, v1, Lf4/g;->c:J

    invoke-virtual {v1, v2, v3}, Lf4/g;->q(J)V

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    sget-object v0, Lu3/b;->a:[B

    iget-object v0, p0, La4/z;->g:La4/b0;

    iget-object v0, v0, La4/b0;->b:La4/t;

    invoke-virtual {v0, v2, v3}, La4/t;->z(J)V

    :cond_0
    iget-object v0, p0, La4/z;->g:La4/b0;

    invoke-virtual {v0}, La4/b0;->a()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final f(Lf4/g;J)J
    .locals 15

    move-object v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    const-string v4, "sink"

    invoke-static {v0, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_9

    :goto_0
    iget-object v6, v1, La4/z;->g:La4/b0;

    monitor-enter v6

    :try_start_0
    iget-object v7, v6, La4/b0;->k:La4/a0;

    invoke-virtual {v7}, Lf4/e;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v7, v6, La4/b0;->m:La4/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    monitor-exit v6

    if-eqz v7, :cond_0

    iget-boolean v7, v1, La4/z;->c:Z

    if-nez v7, :cond_0

    iget-object v7, v6, La4/b0;->n:Ljava/io/IOException;

    if-nez v7, :cond_1

    new-instance v7, La4/h0;

    monitor-enter v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v8, v6, La4/b0;->m:La4/b;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    monitor-exit v6

    invoke-static {v8}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-direct {v7, v8}, La4/h0;-><init>(La4/b;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v0

    monitor-exit v6

    throw v2

    :cond_0
    const/4 v7, 0x0

    :cond_1
    :goto_1
    iget-boolean v8, v1, La4/z;->f:Z

    if-nez v8, :cond_8

    iget-object v8, v1, La4/z;->e:Lf4/g;

    iget-wide v9, v8, Lf4/g;->c:J

    cmp-long v11, v9, v4

    const-wide/16 v12, -0x1

    const/4 v14, 0x0

    if-lez v11, :cond_2

    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    invoke-virtual {v8, v0, v9, v10}, Lf4/g;->f(Lf4/g;J)J

    move-result-wide v8

    iget-wide v10, v6, La4/b0;->c:J

    add-long/2addr v10, v8

    iput-wide v10, v6, La4/b0;->c:J

    iget-wide v4, v6, La4/b0;->d:J

    sub-long/2addr v10, v4

    if-nez v7, :cond_4

    iget-object v4, v6, La4/b0;->b:La4/t;

    iget-object v4, v4, La4/t;->s:La4/g0;

    invoke-virtual {v4}, La4/g0;->a()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-long v4, v4

    cmp-long v4, v10, v4

    if-ltz v4, :cond_4

    iget-object v4, v6, La4/b0;->b:La4/t;

    iget v5, v6, La4/b0;->a:I

    invoke-virtual {v4, v5, v10, v11}, La4/t;->G(IJ)V

    iget-wide v4, v6, La4/b0;->c:J

    iput-wide v4, v6, La4/b0;->d:J

    goto :goto_2

    :cond_2
    iget-boolean v4, v1, La4/z;->c:Z

    if-nez v4, :cond_3

    if-nez v7, :cond_3

    invoke-virtual {v6}, La4/b0;->k()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const/4 v14, 0x1

    :cond_3
    move-wide v8, v12

    :cond_4
    :goto_2
    :try_start_6
    iget-object v4, v6, La4/b0;->k:La4/a0;

    invoke-virtual {v4}, La4/a0;->l()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    monitor-exit v6

    if-eqz v14, :cond_5

    const-wide/16 v4, 0x0

    goto :goto_0

    :cond_5
    cmp-long v0, v8, v12

    if-eqz v0, :cond_6

    return-wide v8

    :cond_6
    if-nez v7, :cond_7

    return-wide v12

    :cond_7
    throw v7

    :catchall_2
    move-exception v0

    goto :goto_4

    :cond_8
    :try_start_7
    new-instance v0, Ljava/io/IOException;

    const-string v2, "stream closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_3
    move-exception v0

    move-object v2, v0

    monitor-exit v6

    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_3
    :try_start_8
    iget-object v2, v6, La4/b0;->k:La4/a0;

    invoke-virtual {v2}, La4/a0;->l()V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_4
    monitor-exit v6

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "byteCount < 0: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
