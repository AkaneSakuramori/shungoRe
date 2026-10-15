.class public final Lv3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt3/t;


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a(Ly3/f;)Lt3/b0;
    .locals 17

    move-object/from16 v0, p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    new-instance v3, Lv3/b;

    iget-object v4, v0, Ly3/f;->e:Li/w;

    invoke-direct {v3, v1, v2, v4}, Lv3/b;-><init>(JLi/w;)V

    new-instance v1, Lv3/c;

    iget-object v2, v3, Lv3/b;->a:Li/w;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lv3/c;-><init>(Li/w;Lt3/b0;)V

    iget-object v5, v1, Lv3/c;->a:Li/w;

    if-eqz v5, :cond_0

    invoke-virtual {v2}, Li/w;->b()Lt3/c;

    move-result-object v2

    iget-boolean v2, v2, Lt3/c;->j:Z

    if-eqz v2, :cond_0

    new-instance v1, Lv3/c;

    invoke-direct {v1, v3, v3}, Lv3/c;-><init>(Li/w;Lt3/b0;)V

    :cond_0
    iget-object v2, v0, Ly3/f;->a:Lx3/j;

    instance-of v5, v2, Lx3/j;

    if-eqz v5, :cond_1

    move-object v5, v2

    goto :goto_0

    :cond_1
    move-object v5, v3

    :goto_0
    if-eqz v5, :cond_2

    iget-object v5, v5, Lx3/j;->f:Lt3/n;

    :cond_2
    const-string v5, "call"

    iget-object v6, v1, Lv3/c;->a:Li/w;

    iget-object v1, v1, Lv3/c;->b:Lt3/b0;

    if-nez v6, :cond_3

    if-nez v1, :cond_3

    new-instance v0, Lt3/a0;

    invoke-direct {v0}, Lt3/a0;-><init>()V

    iput-object v4, v0, Lt3/a0;->a:Li/w;

    sget-object v1, Lt3/x;->d:Lt3/x;

    iput-object v1, v0, Lt3/a0;->b:Lt3/x;

    const/16 v1, 0x1f8

    iput v1, v0, Lt3/a0;->c:I

    const-string v1, "Unsatisfiable Request (only-if-cached)"

    iput-object v1, v0, Lt3/a0;->d:Ljava/lang/String;

    sget-object v1, Lu3/b;->c:Lt3/c0;

    iput-object v1, v0, Lt3/a0;->g:Lt3/d0;

    const-wide/16 v3, -0x1

    iput-wide v3, v0, Lt3/a0;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, v0, Lt3/a0;->l:J

    invoke-virtual {v0}, Lt3/a0;->a()Lt3/b0;

    move-result-object v0

    invoke-static {v2, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_3
    const-string v4, "cacheResponse"

    if-nez v6, :cond_4

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lt3/b0;->e()Lt3/a0;

    move-result-object v0

    invoke-static {v1}, Lf2/e;->d(Lt3/b0;)Lt3/b0;

    move-result-object v1

    invoke-static {v4, v1}, Lt3/a0;->b(Ljava/lang/String;Lt3/b0;)V

    iput-object v1, v0, Lt3/a0;->i:Lt3/b0;

    invoke-virtual {v0}, Lt3/a0;->a()Lt3/b0;

    move-result-object v0

    invoke-static {v2, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_4
    if-eqz v1, :cond_5

    invoke-static {v2, v5}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v0, v6}, Ly3/f;->b(Li/w;)Lt3/b0;

    move-result-object v0

    const-string v2, "networkResponse"

    if-eqz v1, :cond_10

    const/16 v5, 0x130

    iget v6, v0, Lt3/b0;->e:I

    if-ne v6, v5, :cond_f

    invoke-virtual {v1}, Lt3/b0;->e()Lt3/a0;

    move-result-object v5

    new-instance v6, Lt3/p;

    invoke-direct {v6}, Lt3/p;-><init>()V

    iget-object v7, v1, Lt3/b0;->g:Lt3/q;

    invoke-virtual {v7}, Lt3/q;->size()I

    move-result v8

    const/4 v10, 0x0

    :goto_1
    const-string v11, "Content-Type"

    const-string v12, "Content-Encoding"

    const-string v13, "Content-Length"

    iget-object v14, v0, Lt3/b0;->g:Lt3/q;

    if-ge v10, v8, :cond_b

    invoke-virtual {v7, v10}, Lt3/q;->b(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v7, v10}, Lt3/q;->d(I)Ljava/lang/String;

    move-result-object v3

    const-string v9, "Warning"

    invoke-static {v9, v15}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    const-string v9, "1"

    move-object/from16 v16, v7

    const/4 v7, 0x0

    invoke-static {v3, v9, v7}, Lq3/l;->o3(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_7

    goto :goto_3

    :cond_6
    move-object/from16 v16, v7

    const/4 v7, 0x0

    :cond_7
    invoke-static {v13, v15}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_9

    invoke-static {v12, v15}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_9

    invoke-static {v11, v15}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_2

    :cond_8
    invoke-static {v15}, Lf2/e;->B(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-virtual {v14, v15}, Lt3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_a

    :cond_9
    :goto_2
    invoke-virtual {v6, v15, v3}, Lt3/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    :goto_3
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v7, v16

    const/4 v3, 0x0

    goto :goto_1

    :cond_b
    const/4 v7, 0x0

    invoke-virtual {v14}, Lt3/q;->size()I

    move-result v3

    move v9, v7

    :goto_4
    if-ge v9, v3, :cond_e

    invoke-virtual {v14, v9}, Lt3/q;->b(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v13, v7}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_d

    invoke-static {v12, v7}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_d

    invoke-static {v11, v7}, Lq3/l;->U2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_c

    goto :goto_5

    :cond_c
    invoke-static {v7}, Lf2/e;->B(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-virtual {v14, v9}, Lt3/q;->d(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lt3/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_d
    :goto_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_e
    invoke-virtual {v6}, Lt3/p;->b()Lt3/q;

    move-result-object v3

    invoke-virtual {v3}, Lt3/q;->c()Lt3/p;

    move-result-object v3

    iput-object v3, v5, Lt3/a0;->f:Lt3/p;

    iget-wide v6, v0, Lt3/b0;->l:J

    iput-wide v6, v5, Lt3/a0;->k:J

    iget-wide v6, v0, Lt3/b0;->m:J

    iput-wide v6, v5, Lt3/a0;->l:J

    invoke-static {v1}, Lf2/e;->d(Lt3/b0;)Lt3/b0;

    move-result-object v1

    invoke-static {v4, v1}, Lt3/a0;->b(Ljava/lang/String;Lt3/b0;)V

    iput-object v1, v5, Lt3/a0;->i:Lt3/b0;

    invoke-static {v0}, Lf2/e;->d(Lt3/b0;)Lt3/b0;

    move-result-object v1

    invoke-static {v2, v1}, Lt3/a0;->b(Ljava/lang/String;Lt3/b0;)V

    iput-object v1, v5, Lt3/a0;->h:Lt3/b0;

    invoke-virtual {v5}, Lt3/a0;->a()Lt3/b0;

    iget-object v0, v0, Lt3/b0;->h:Lt3/d0;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt3/d0;->close()V

    const/4 v0, 0x0

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    throw v0

    :cond_f
    iget-object v3, v1, Lt3/b0;->h:Lt3/d0;

    if-eqz v3, :cond_10

    invoke-static {v3}, Lu3/b;->c(Ljava/io/Closeable;)V

    :cond_10
    invoke-virtual {v0}, Lt3/b0;->e()Lt3/a0;

    move-result-object v3

    invoke-static {v1}, Lf2/e;->d(Lt3/b0;)Lt3/b0;

    move-result-object v1

    invoke-static {v4, v1}, Lt3/a0;->b(Ljava/lang/String;Lt3/b0;)V

    iput-object v1, v3, Lt3/a0;->i:Lt3/b0;

    invoke-static {v0}, Lf2/e;->d(Lt3/b0;)Lt3/b0;

    move-result-object v0

    invoke-static {v2, v0}, Lt3/a0;->b(Ljava/lang/String;Lt3/b0;)V

    iput-object v0, v3, Lt3/a0;->h:Lt3/b0;

    invoke-virtual {v3}, Lt3/a0;->a()Lt3/b0;

    move-result-object v0

    return-object v0
.end method
