.class public final Lt3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final b:Li/w;

.field public final c:Lt3/x;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Lt3/o;

.field public final g:Lt3/q;

.field public final h:Lt3/d0;

.field public final i:Lt3/b0;

.field public final j:Lt3/b0;

.field public final k:Lt3/b0;

.field public final l:J

.field public final m:J

.field public final n:Lx3/e;


# direct methods
.method public constructor <init>(Li/w;Lt3/x;Ljava/lang/String;ILt3/o;Lt3/q;Lt3/d0;Lt3/b0;Lt3/b0;Lt3/b0;JJLx3/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/b0;->b:Li/w;

    iput-object p2, p0, Lt3/b0;->c:Lt3/x;

    iput-object p3, p0, Lt3/b0;->d:Ljava/lang/String;

    iput p4, p0, Lt3/b0;->e:I

    iput-object p5, p0, Lt3/b0;->f:Lt3/o;

    iput-object p6, p0, Lt3/b0;->g:Lt3/q;

    iput-object p7, p0, Lt3/b0;->h:Lt3/d0;

    iput-object p8, p0, Lt3/b0;->i:Lt3/b0;

    iput-object p9, p0, Lt3/b0;->j:Lt3/b0;

    iput-object p10, p0, Lt3/b0;->k:Lt3/b0;

    iput-wide p11, p0, Lt3/b0;->l:J

    iput-wide p13, p0, Lt3/b0;->m:J

    iput-object p15, p0, Lt3/b0;->n:Lx3/e;

    return-void
.end method

.method public static a(Lt3/b0;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Lt3/b0;->g:Lt3/q;

    invoke-virtual {p0, p1}, Lt3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-object v0, p0, Lt3/b0;->h:Lt3/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lt3/d0;->close()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Lt3/a0;
    .locals 3

    new-instance v0, Lt3/a0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lt3/b0;->b:Li/w;

    iput-object v1, v0, Lt3/a0;->a:Li/w;

    iget-object v1, p0, Lt3/b0;->c:Lt3/x;

    iput-object v1, v0, Lt3/a0;->b:Lt3/x;

    iget v1, p0, Lt3/b0;->e:I

    iput v1, v0, Lt3/a0;->c:I

    iget-object v1, p0, Lt3/b0;->d:Ljava/lang/String;

    iput-object v1, v0, Lt3/a0;->d:Ljava/lang/String;

    iget-object v1, p0, Lt3/b0;->f:Lt3/o;

    iput-object v1, v0, Lt3/a0;->e:Lt3/o;

    iget-object v1, p0, Lt3/b0;->g:Lt3/q;

    invoke-virtual {v1}, Lt3/q;->c()Lt3/p;

    move-result-object v1

    iput-object v1, v0, Lt3/a0;->f:Lt3/p;

    iget-object v1, p0, Lt3/b0;->h:Lt3/d0;

    iput-object v1, v0, Lt3/a0;->g:Lt3/d0;

    iget-object v1, p0, Lt3/b0;->i:Lt3/b0;

    iput-object v1, v0, Lt3/a0;->h:Lt3/b0;

    iget-object v1, p0, Lt3/b0;->j:Lt3/b0;

    iput-object v1, v0, Lt3/a0;->i:Lt3/b0;

    iget-object v1, p0, Lt3/b0;->k:Lt3/b0;

    iput-object v1, v0, Lt3/a0;->j:Lt3/b0;

    iget-wide v1, p0, Lt3/b0;->l:J

    iput-wide v1, v0, Lt3/a0;->k:J

    iget-wide v1, p0, Lt3/b0;->m:J

    iput-wide v1, v0, Lt3/a0;->l:J

    iget-object v1, p0, Lt3/b0;->n:Lx3/e;

    iput-object v1, v0, Lt3/a0;->m:Lx3/e;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Response{protocol="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lt3/b0;->c:Lt3/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lt3/b0;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt3/b0;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt3/b0;->b:Li/w;

    iget-object v1, v1, Li/w;->b:Ljava/lang/Object;

    check-cast v1, Lt3/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
