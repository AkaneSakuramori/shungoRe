.class public final Lm2/l;
.super Lm2/b0;
.source "SourceFile"


# instance fields
.field public a:Lm2/b0;


# virtual methods
.method public final b(Lt2/b;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm2/l;->a:Lm2/b0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lm2/b0;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final c(Lt2/c;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lm2/l;->a:Lm2/b0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lm2/b0;->c(Lt2/c;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
