.class public abstract Lo2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:Lo2/l;

.field public b:Lo2/l;

.field public c:I

.field public final synthetic d:Lo2/m;


# direct methods
.method public constructor <init>(Lo2/m;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/k;->d:Lo2/m;

    iget-object v0, p1, Lo2/m;->f:Lo2/l;

    iget-object v0, v0, Lo2/l;->d:Lo2/l;

    iput-object v0, p0, Lo2/k;->a:Lo2/l;

    const/4 v0, 0x0

    iput-object v0, p0, Lo2/k;->b:Lo2/l;

    iget p1, p1, Lo2/m;->e:I

    iput p1, p0, Lo2/k;->c:I

    return-void
.end method


# virtual methods
.method public final a()Lo2/l;
    .locals 3

    iget-object v0, p0, Lo2/k;->a:Lo2/l;

    iget-object v1, p0, Lo2/k;->d:Lo2/m;

    iget-object v2, v1, Lo2/m;->f:Lo2/l;

    if-eq v0, v2, :cond_1

    iget v1, v1, Lo2/m;->e:I

    iget v2, p0, Lo2/k;->c:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lo2/l;->d:Lo2/l;

    iput-object v1, p0, Lo2/k;->a:Lo2/l;

    iput-object v0, p0, Lo2/k;->b:Lo2/l;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Lo2/k;->a:Lo2/l;

    iget-object v1, p0, Lo2/k;->d:Lo2/m;

    iget-object v1, v1, Lo2/m;->f:Lo2/l;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lo2/k;->b:Lo2/l;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iget-object v2, p0, Lo2/k;->d:Lo2/m;

    invoke-virtual {v2, v0, v1}, Lo2/m;->c(Lo2/l;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lo2/k;->b:Lo2/l;

    iget v0, v2, Lo2/m;->e:I

    iput v0, p0, Lo2/k;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
