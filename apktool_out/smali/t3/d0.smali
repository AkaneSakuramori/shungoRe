.class public abstract Lt3/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public final close()V
    .locals 1

    move-object v0, p0

    check-cast v0, Lt3/c0;

    iget-object v0, v0, Lt3/c0;->d:Lf4/i;

    invoke-static {v0}, Lu3/b;->c(Ljava/io/Closeable;)V

    return-void
.end method
