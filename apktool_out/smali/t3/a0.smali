.class public final Lt3/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Li/w;

.field public b:Lt3/x;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Lt3/o;

.field public f:Lt3/p;

.field public g:Lt3/d0;

.field public h:Lt3/b0;

.field public i:Lt3/b0;

.field public j:Lt3/b0;

.field public k:J

.field public l:J

.field public m:Lx3/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lt3/a0;->c:I

    new-instance v0, Lt3/p;

    invoke-direct {v0}, Lt3/p;-><init>()V

    iput-object v0, p0, Lt3/a0;->f:Lt3/p;

    return-void
.end method

.method public static b(Ljava/lang/String;Lt3/b0;)V
    .locals 1

    if-eqz p1, :cond_4

    iget-object v0, p1, Lt3/b0;->h:Lt3/d0;

    if-nez v0, :cond_3

    iget-object v0, p1, Lt3/b0;->i:Lt3/b0;

    if-nez v0, :cond_2

    iget-object v0, p1, Lt3/b0;->j:Lt3/b0;

    if-nez v0, :cond_1

    iget-object p1, p1, Lt3/b0;->k:Lt3/b0;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ".priorResponse != null"

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string p1, ".cacheResponse != null"

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const-string p1, ".networkResponse != null"

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const-string p1, ".body != null"

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final a()Lt3/b0;
    .locals 18

    move-object/from16 v0, p0

    iget v5, v0, Lt3/a0;->c:I

    if-ltz v5, :cond_3

    iget-object v2, v0, Lt3/a0;->a:Li/w;

    if-eqz v2, :cond_2

    iget-object v3, v0, Lt3/a0;->b:Lt3/x;

    if-eqz v3, :cond_1

    iget-object v4, v0, Lt3/a0;->d:Ljava/lang/String;

    if-eqz v4, :cond_0

    iget-object v6, v0, Lt3/a0;->e:Lt3/o;

    iget-object v1, v0, Lt3/a0;->f:Lt3/p;

    invoke-virtual {v1}, Lt3/p;->b()Lt3/q;

    move-result-object v7

    iget-object v8, v0, Lt3/a0;->g:Lt3/d0;

    iget-object v9, v0, Lt3/a0;->h:Lt3/b0;

    iget-object v10, v0, Lt3/a0;->i:Lt3/b0;

    iget-object v11, v0, Lt3/a0;->j:Lt3/b0;

    iget-wide v12, v0, Lt3/a0;->k:J

    iget-wide v14, v0, Lt3/a0;->l:J

    iget-object v1, v0, Lt3/a0;->m:Lx3/e;

    new-instance v17, Lt3/b0;

    move-object/from16 v16, v1

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v16}, Lt3/b0;-><init>(Li/w;Lt3/x;Ljava/lang/String;ILt3/o;Lt3/q;Lt3/d0;Lt3/b0;Lt3/b0;Lt3/b0;JJLx3/e;)V

    return-object v17

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "message == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "protocol == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "request == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "code < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v0, Lt3/a0;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
